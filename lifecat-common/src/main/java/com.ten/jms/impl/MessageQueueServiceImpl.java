//package com.ten.jms.impl;
//
//import com.ten.jms.Message;
//import com.ten.jms.MessageQueueService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jms.core.JmsMessagingTemplate;
//import org.springframework.jms.core.JmsOperations;
//import org.springframework.jms.core.JmsTemplate;
//import org.springframework.stereotype.Component;
//
//@Component
//public class MessageQueueServiceImpl implements MessageQueueService {
//
//    private final JmsTemplate jmsTemplate;
//
//    @Autowired
//    public MessageQueueServiceImpl(JmsTemplate jmsTemplate) {
//        this.jmsTemplate = jmsTemplate;
//    }
//
//    @Override
//    public void sendLoginNotice(final Message message) {
//        jmsTemplate.convertAndSend(message);
//    }
//
//    @Override
//    public void sendRegisterNotice(final Message message) {
//        jmsTemplate.convertAndSend(message);
//    }
//
//    @Override
//    public void sendInfoNotice(final Message message) {
//        jmsTemplate.convertAndSend(message);
//    }
//
//    @Override
//    public void sendAlertNotice(final Message message) {
//        jmsTemplate.convertAndSend(message);
//    }
//}
