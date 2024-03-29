package com.codeinspring.githubactionswar;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(GithubActionsWarApplication.class);
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

	}
}
