package com.example.demo;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;



@Service
public class emailService {

	@Autowired
	private JavaMailSender sender;

	public boolean send(email mensaje) {

		MimeMessage email = sender.createMimeMessage();

		try {

			MimeMessageHelper helper = new MimeMessageHelper(email,true);

			//Campos necesarios para mandar el correo
			helper.setFrom("MADCLOTHESemail@gmail.com"); // dirección origen
			helper.setTo(mensaje.getDestinatario()); // dirección destino
			helper.setSubject(mensaje.getAsunto()); // asunto del correo
			helper.setText(mensaje.getTexto(), true); // cuerpo del mensaje

			sender.send(email);

			return true;

		} catch (MessagingException e) {
			e.printStackTrace();
			return false;
		}

	}
}
