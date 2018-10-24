package com.felipegriep.cursomc.services;

import com.felipegriep.cursomc.domain.Pedido;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;

import java.util.Date;

public abstract class AbstractEmailService implements EmailService {

    @Value("${default.sender}")
    private String sender;

    @Override
    public void sendOrderConfirmationEmail(Pedido obj) {
        SimpleMailMessage smm = prepareSimpleMailMessage(obj);
        sendEmail(smm);
    }

    protected SimpleMailMessage prepareSimpleMailMessage(Pedido obj) {
        SimpleMailMessage smm = new SimpleMailMessage();
        smm.setTo(obj.getCliente().getEmail());
        smm.setFrom(sender);
        smm.setSubject("Pedido Confirmado! Código: " + obj.getId());
        smm.setSentDate(new Date(System.currentTimeMillis()));
        smm.setText(obj.toString());
        return smm;
    }
}
