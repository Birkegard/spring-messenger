package se.iths.christoffer.springmessenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "se.iths.christoffer")
public class SpringMessengerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMessengerApplication.class, args);
    }

}
