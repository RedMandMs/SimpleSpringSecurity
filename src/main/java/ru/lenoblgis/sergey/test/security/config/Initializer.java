package ru.lenoblgis.sergey.test.security.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	 // ”казываем им¤ нашему Servlet Dispatcher дл¤ мапинга
   //private static final String DISPATCHER_SERVLET_NAME = "dispatcherAgrocultural";

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[]{AppConfig.class};
	}


	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

}