package com.wildrimak.treinamento.dominio;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.wildrimak.treinamento.GerenciandoJpaComJavaApplication;
import com.wildrimak.treinamento.dominio.jpa.ClienteJPA;

public class MainDominio {

	public static void main(String[] args) {

		ApplicationContext context = new SpringApplicationBuilder(GerenciandoJpaComJavaApplication.class)
				.web(WebApplicationType.NONE).profiles("prod").run(args);

		
		ClienteJPA clienteJPA = context.getBean(ClienteJPA.class);
		clienteJPA.getClientes().forEach(cliente -> System.out.println(cliente));

	}

}
