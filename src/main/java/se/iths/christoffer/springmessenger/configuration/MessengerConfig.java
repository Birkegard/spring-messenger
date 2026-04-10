package se.iths.christoffer.springmessenger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.iths.christoffer.springmessenger.messaging.EmailSender;
import se.iths.christoffer.springmessenger.messaging.Messenger;
import se.iths.christoffer.springmessenger.service.MessageService;

import java.util.Map;

@Configuration
public class MessengerConfig {

    @Bean("email")
    public EmailSender emailSender() {
        return new EmailSender();
    }

    @Bean
    public MessageService messageService(Map<String, Messenger> messengers) {
        return new MessageService(messengers);
    }
}
