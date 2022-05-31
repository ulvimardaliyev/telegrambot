package az.telegrambot.app.telegrambot;

import az.telegrambot.app.telegrambot.model.MyBot;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
@RequiredArgsConstructor
public class TelegrambotApplication /*implements CommandLineRunner*/ {
//    private final MyBot myBot;
    public static void main(String[] args) {
        SpringApplication.run(TelegrambotApplication.class, args);
    }

    /*@Override
    public void run(String... args) throws Exception {

        try {
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(myBot);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }*/
}
