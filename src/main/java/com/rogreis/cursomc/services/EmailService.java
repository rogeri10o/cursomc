package com.rogreis.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.rogreis.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}