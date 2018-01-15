package com.vodafone.contentenabler;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.vodafone.contentenabler.client.ContentEnablerInitialiser;
import com.vodafone.contentenabler.exception.ContentEnablerClientException;

@SpringBootApplication
public class ContentEnablerDemoApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ContentEnablerDemoApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ContentEnablerDemoApplication.class, args);
		try {
			ContentEnablerInitialiser.init();
		} catch (ContentEnablerClientException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}