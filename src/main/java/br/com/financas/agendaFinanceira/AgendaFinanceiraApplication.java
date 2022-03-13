package br.com.financas.agendaFinanceira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class AgendaFinanceiraApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendaFinanceiraApplication.class, args);
	}

}
