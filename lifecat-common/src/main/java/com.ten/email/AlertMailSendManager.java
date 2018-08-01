package com.ten.email;

import javax.mail.MessagingException;

public interface AlertMailSendManager {
    /**
     * send simple email
     *
     * @param simpleEmail 简单邮件详情
     * @throws MessagingException send error
     */
    void sendEmail(SimpleEmail simpleEmail) throws MessagingException;
}
