package cl.praxis.HospitalPostPandemia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	public static final Logger logger = LoggerFactory.getLogger(HospitalPostPandemiaApplication.class);
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		logger.info("Iniciando Servlet..");

		return application.sources(HospitalPostPandemiaApplication.class);
	}

}

