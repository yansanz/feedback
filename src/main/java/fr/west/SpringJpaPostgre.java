package fr.west;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;


@EntityScan(
	      basePackageClasses = {SpringJpaPostgre.class, Jsr310JpaConverters.class}
	)
@SpringBootApplication
public class SpringJpaPostgre extends SpringBootServletInitializer {
 
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		 return application.sources( SpringJpaPostgre.class);
	 }
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaPostgre.class, args);
	}
}

 
	

