package cl.praxis.HospitalPostPandemia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HospitalPostPandemiaApplication {

	public static final Logger logger = LoggerFactory.getLogger(HospitalPostPandemiaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HospitalPostPandemiaApplication.class, args);
		logger.info("Iniciando Proyecto Hospital Post Pandemia");
	}

}
