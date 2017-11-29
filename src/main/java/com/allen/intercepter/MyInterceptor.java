package com.allen.intercepter;

import com.allen.base.ContextSession;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by AllenWish on 2017-11-29.
 */
public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {

        HttpSession session = request.getSession();
        Object infotypeList = session.getAttribute(ContextSession.INFOTYPELIST);
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
}
