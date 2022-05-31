package az.telegrambot.app.telegrambot;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class TelegrambotApplication /*implements CommandLineRunner*/ {
    public static void main(String[] args) {
        SpringApplication.run(TelegrambotApplication.class, args);
    }
}
