package com.grupo11.aps.deskconnectservicoocorrencia.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

  private String exchange = "LoginExchange";
  private String sendKey = "LoginKey";
  private String sendQueue = "LoginQueue";

  @Bean
  public TopicExchange topicExchange() {
    return new TopicExchange(exchange);
  }

  @Bean
  public Queue senderQueue() {
    return new Queue(sendQueue, true);
  }

  @Bean
  public Binding sendBinding(TopicExchange exchange) {
    return BindingBuilder
        .bind(senderQueue())
        .to(exchange)
        .with(sendKey);
  }

  @Bean
  public MessageConverter jsonMessageConverter() {
    return new Jackson2JsonMessageConverter();
  }
}
