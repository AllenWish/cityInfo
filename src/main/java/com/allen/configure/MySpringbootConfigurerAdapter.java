package com.allen.configure;

import com.allen.intercepter.LoginInterceptor;
import com.allen.intercepter.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by AllenWish on 2017-11-29.
 */
@Configuration
public class MySpringbootConfigurerAdapter extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        registry.addInterceptor(new MyInterceptor());
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/user","/user/*");
    }
}
