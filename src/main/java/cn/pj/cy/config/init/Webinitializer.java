package cn.pj.cy.config.init;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import cn.pj.cy.config.dao.SpringdaoConfig;
import cn.pj.cy.config.service.SpringServiceConfig;
import cn.pj.cy.config.web.SpringWebConfig;


public class Webinitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		System.out.println("sdhjhdjashdla");
		return new Class[]{SpringServiceConfig.class,SpringdaoConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class[] {SpringWebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		return new String[] {"/"};
	}

}