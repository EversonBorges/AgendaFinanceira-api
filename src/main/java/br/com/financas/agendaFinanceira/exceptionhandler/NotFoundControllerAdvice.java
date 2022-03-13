package br.com.financas.agendaFinanceira.exceptionhandler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice(basePackages = "br.com.financas.agendaFinanceira.resources")
public class NotFoundControllerAdvice {
	
	@ResponseBody
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<MessageExceptionHandler> InstituicaoNotFound(NotFoundException notFound){
		MessageExceptionHandler error = new MessageExceptionHandler(
				new Date(), HttpStatus.NOT_FOUND.value(), "Não foi encontrado resultado com os dados informados");
		
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}

}


