package com.te.e_comSpringRest.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import com.te.e_comSpringRest.bean.EcomResponce;
import com.te.e_comSpringRest.custExcep.EcomException;




@RestControllerAdvice
public class EcomControllerAdvice {

	

		@ExceptionHandler(EcomException.class)
		public EcomResponce handlingExce(EcomException exception) {
			EcomResponce response=new EcomResponce();
			response.setStatusCode(500);
			response.setMsg(exception.getMessage());
			return response;
		}
		

}
