package com.hutech.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 *
 * @author Hiệp Phan
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.hutech.controllers")
public class WebApplicationContextConfig implements WebMvcConfigurer {

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver() {
        InternalResourceViewResolver resource = new InternalResourceViewResolver();

        resource.setViewClass(JstlView.class);
        resource.setPrefix("/WEB-INF/jsp/");
        resource.setSuffix(".jsp");

        return resource;
    }
    @Override
    public void addResourceHandlers (ResourceHandlerRegistry registry){
        registry.addResourceHandler("/css/**").addResourceLocations("/resource/css/");
        registry.addResourceHandler("/img/**").addResourceLocations("/resource/img/");
        registry.addResourceHandler("/js/**").addResourceLocations("/resource/js/");
        registry.addResourceHandler("/vendor/**").addResourceLocations("/resource/vendor/");
        registry.addResourceHandler("/admincontent/**").addResourceLocations("/resource/admincontent");
    }
}
