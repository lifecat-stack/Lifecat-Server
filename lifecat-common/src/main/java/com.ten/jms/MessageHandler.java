package com.ten.jms;

import com.ten.email.AlertMailSendManager;
import com.ten.email.SimpleEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import java.util.HashSet;
import java.util.Set;

/**
 * asyn message for activemq queue
 *
 * @author Administrator
 */
@Component
public class MessageHandler {

//    private final AlertMailSendManager mailSendManager;
//    private final JmsTemplate jmsTemplate;
//
//    @Autowired
//    public MessageHandler(JmsTemplate jmsTemplate, AlertMailSendManager mailSendManager) {
//        this.jmsTemplate = jmsTemplate;
//        this.mailSendManager = mailSendManager;
//    }

    @JmsListener(destination = "queue.login.notice")
    public void handleLoginAlert(Message message) throws MessagingException {
        System.out.println("message receive:" + message.getMessage());

        SimpleEmail simpleEmail = new SimpleEmail();
        simpleEmail.setSubject(message.getMessage());

        Set<String> receivers = new HashSet<>();
        receivers.add("email@163.com");
        simpleEmail.setAccepter(receivers);

        simpleEmail.setHtml(false);
        simpleEmail.setContent(message.getMessage());

        simpleEmail.setAttachment(false);

//        mailSendManager.sendEmail(simpleEmail);
    }
}
