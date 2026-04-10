package se.iths.christoffer.springmessenger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.iths.christoffer.springmessenger.messaging.EmailSender;

@Configuration
public class MessengerConfig {

    @Bean
    public EmailSender emailSender() {
        return new EmailSender();
    }
}
