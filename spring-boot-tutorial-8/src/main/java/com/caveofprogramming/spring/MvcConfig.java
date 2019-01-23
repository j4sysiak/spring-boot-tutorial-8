package com.caveofprogramming.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
	
    public MvcConfig() {
        super();
    }

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
    	registry.addViewController("/").setViewName("forward:/home");
//    	registry.addViewController("/").setViewName("home");     orginalnie tak było
    	registry.addViewController("/hello").setViewName("hello");
        registry.addViewController("/login").setViewName("login");
        
        registry.addViewController("/about").setViewName("about");
        registry.addViewController("/admin").setViewName("admin");
        registry.addViewController("/error").setViewName("error");
        registry.addViewController("/greeting").setViewName("greeting");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/index2").setViewName("index2");
        registry.addViewController("/info").setViewName("info");
    }
    
    @Override
    public void configureDefaultServletHandling(final DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/", "/resources/");
    }

    @Override
    public void addInterceptors(final InterceptorRegistry registry) {
        final LocaleChangeInterceptor localeChangeInterceptor = new LocaleChangeInterceptor();
        localeChangeInterceptor.setParamName("lang");
        registry.addInterceptor(localeChangeInterceptor);
    }

}
