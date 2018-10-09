package com.sapient.metalZuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import com.sapient.metalZuul.filters.ErrorFilter;
import com.sapient.metalZuul.filters.PostFilter;
import com.sapient.metalZuul.filters.PreFilter;
import com.sapient.metalZuul.filters.RouteFilter;

@EnableZuulProxy
@SpringBootApplication
public class MetalZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetalZuulApplication.class, args);
	}
	@Bean
	public PreFilter preFilter() {
	    return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
	    return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
	    return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
	    return new RouteFilter();
	}
}
