package com.ten.jms.impl;

import com.ten.jms.AlertMessage;
import com.ten.jms.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsOperations;
import org.springframework.stereotype.Component;

@Component
public class AlertServiceImpl implements AlertService {

    private final JmsOperations jmsOperations;

    @Autowired
    public AlertServiceImpl(JmsOperations jmsOperations) {
        this.jmsOperations = jmsOperations;
    }

    @Override
    public void sendLoginAlert(final AlertMessage message) {
        jmsOperations.convertAndSend(message);
    }
}
