package de.mamede.baltika.config.init;

import javax.servlet.Filter;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import de.mamede.baltika.config.config.WebConfig;

/*
 * Classe que vai iniciar as configurações para a aplicação.
 * A classe AbstractAnnotation... utiliza o servlet 3.0 para a missão
 */
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return null;
	}
	
	/*
	 * Este método informa ao Spring como encontrar os Controllers
	 * para o DispatcherServlet
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {		
		return new Class<?>[] { WebConfig.class };
	}
	
	/*
	 * Este método informa ao Spring o padrão da url a ser delegada ao DispatcherServlet.
	 * "/" diz que qualquer coisa debaixo da raiz vai pro DispatcherServlet. É o urlMappings do web.xml
	 */
	@Override
	protected String[] getServletMappings() {		
		return new String[] { "/" };
	}
	
	 @Override
	protected Filter[] getServletFilters() {
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding( "UTF-8" );
		characterEncodingFilter.setForceEncoding( true );
		return new Filter[] { characterEncodingFilter };
	}

}
