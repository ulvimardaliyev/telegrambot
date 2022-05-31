package az.telegrambot.app.telegrambot.model;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
@Slf4j
public class MyBot extends TelegramLongPollingBot {
    @Value("${bot.token}")
    private String botToken;
    @Value("${bot.name}")
    private String botName;

    @Override
    public String getBotUsername() {
        return botName;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }

    @Override
    public void onUpdateReceived(Update update) {
        log.info("Update is {} ", update);
        long chatId = update.getMessage().getChatId();
        String message = "update.getMessage().getText();";
        log.info("message is {} {}", message, chatId);
        SendMessage sendThisMessage = SendMessage.builder()
                .chatId(String.valueOf(update.getMessage().getChatId()))
                .text(update.getMessage().getText())
                .build();
        try {
            execute(sendThisMessage);
        } catch (TelegramApiException exception) {
            exception.printStackTrace();
        }
    }


}
