package com.allen.intercepter;

import com.allen.base.ContextSession;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by AllenWish on 2017-11-29.
 * 登录拦截器
 */

public class LoginInterceptor implements HandlerInterceptor {

    private static final Logger logger = Logger.getLogger(LoginInterceptor.class);
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        logger.info("[preHandle]"+o);
        HttpSession session = request.getSession();
        Object loginUser = session.getAttribute(ContextSession.LOGINUSER);
        if(loginUser==null){
            response.sendRedirect(request.getContextPath()+"/admin/login");
            return false;
        }
        //response.sendRedirect("index");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {
        logger.info("[postHandle]"+o);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) throws Exception {
        logger.info("[afterCompletion]"+o);
        logger.error("[afterCompletion]"+(e==null?"":e.getMessage()));
    }
}
