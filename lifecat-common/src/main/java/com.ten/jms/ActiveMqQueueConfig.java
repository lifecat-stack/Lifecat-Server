//package com.ten.jms;
//
//import org.apache.activemq.ActiveMQConnectionFactory;
//import org.apache.activemq.command.ActiveMQQueue;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jms.annotation.EnableJms;
//import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
//import org.springframework.jms.config.JmsListenerContainerFactory;
//import org.springframework.jms.core.JmsTemplate;
//
//import javax.jms.ConnectionFactory;
//import javax.jms.Queue;
//
//@Configuration
//@EnableJms
//public class ActiveMqQueueConfig {
//
//    // topic模式的ListenerContainer
//    @Bean
//    public JmsListenerContainerFactory<?> jmsListenerContainerTopic(ConnectionFactory activeMQConnectionFactory) {
//        DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
//        bean.setPubSubDomain(true);
//        bean.setConnectionFactory(activeMQConnectionFactory);
//        return bean;
//    }
//
//    // queue模式的ListenerContainer
//    @Bean
//    public JmsListenerContainerFactory<?> jmsListenerContainerQueue(ConnectionFactory activeMQConnectionFactory) {
//        DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
//        bean.setConnectionFactory(activeMQConnectionFactory);
//        return bean;
//    }
//
//    @Bean
//    public Queue loginQueue() {
//        return new ActiveMQQueue("queue.login.notice");
//    }
//
//    @Bean
//    public Queue registerQueue() {
//        return new ActiveMQQueue("queue.register.notice");
//    }
//
//    @Bean
//    public Queue infoQueue() {
//        return new ActiveMQQueue("queue.info.notice");
//    }
//
//    @Bean
//    public Queue alertQueue() {
//        return new ActiveMQQueue("queue.alert.notice");
//    }
//
//}