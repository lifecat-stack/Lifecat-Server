package com.ten.jms;

/**
 * activemq message queue service
 *
 * @author Administrator
 */
public interface MessageQueueService {
    /**
     * send login notice to queue
     */
    void sendLoginNotice(Message message);

    /**
     * send register notice to queue
     */
    void sendRegisterNotice(Message message);

    /**
     * send info notice to queue
     */
    void sendInfoNotice(Message message);

    /**
     * send alert notice to queue
     */
    void sendAlertNotice(Message message);
}
