package com.allen.intercepter;

import com.allen.base.ContextSession;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by AllenWish on 2017-11-29.
 */
public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {

        HttpSession session = request.getSession();
        Object infotypeList = session.getAttribute(ContextSession.INFOTYPELIST);
        Object current = session.getAttribute(ContextSession.CURRENT_DAY);
        if(current==null){
            time(session);
        }
        //String url = request.getRequestURL().toString();
        //String uri = request.getRequestURI();
        String servletPath = request.getServletPath();

        if(servletPath==null){
            response.sendRedirect(request.getContextPath()+"/index");
            return false;
        }
        //首页请求不拦截
        if("/index".equals(servletPath)||"/".equals(servletPath)){
            return true;
        }

        //请求进入后台不拦截
        if(servletPath.startsWith("/admin")||servletPath.startsWith("/user")){
            return true;
        }
        //登录请求不拦截
        if("/dologin".equals(servletPath)){
            return true;
        }

        if(infotypeList==null){
            response.sendRedirect(request.getContextPath()+"/index");
            return false;
        }

        return true;

    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
    }


    public static void time(HttpSession session){
        String[] weekdays={"","日","一","二","三","四","五","六"};

        String[] days=new String[42];

        for(int i=0;i<42;i++)
            days[i]="";

        GregorianCalendar currentDay = new GregorianCalendar();

        int year= currentDay.get(Calendar.YEAR);

        int month=currentDay.get(Calendar.MONTH);

        int today=currentDay.get(Calendar.DAY_OF_MONTH);

        int weekday=currentDay.get(Calendar.DAY_OF_WEEK);

        String now=year+"年"+(month+1)+"月"+today+"日"+" 星期"+weekdays[weekday];

        Calendar thisMonth=Calendar.getInstance();

        thisMonth.set(Calendar.MONTH, month );

        thisMonth.set(Calendar.YEAR, year );

        thisMonth.setFirstDayOfWeek(Calendar.SUNDAY);

        thisMonth.set(Calendar.DAY_OF_MONTH,1);

        int firstIndex=thisMonth.get(Calendar.DAY_OF_WEEK)-1;

        int maxIndex=thisMonth.getActualMaximum(Calendar.DAY_OF_MONTH);

        for(int i=0;i<maxIndex;i++){

            days[firstIndex+i]=String.valueOf(i+1);

        }

        Map<String,Object> dayMap = new HashMap<>();
        dayMap.put("weekdays",weekdays);
        dayMap.put("days",days);
        dayMap.put("firstIndex",firstIndex);
        dayMap.put("now",now);
        dayMap.put("today",today);

        session.setAttribute(ContextSession.CURRENT_DAY,dayMap);
    }
}
