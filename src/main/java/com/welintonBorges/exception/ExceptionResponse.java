package com.welintonBorges.exception;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ExceptionResponse {
	private Date timestamp;
	private String mensagem;
	private String detalhes;


   public ExceptionResponse(Date timestamp, String mensagem, String detalhes) {
		super();
		this.timestamp = timestamp;
		this.mensagem = mensagem;
		this.detalhes = detalhes;
	}


}
