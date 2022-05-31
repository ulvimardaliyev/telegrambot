package az.telegrambot.app.telegrambot.service.impl;

import az.telegrambot.app.telegrambot.dto.MessageSendRequestDto;
import az.telegrambot.app.telegrambot.model.MyBot;
import az.telegrambot.app.telegrambot.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Chat;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;

@RequiredArgsConstructor
@Service
public class MessageServiceImpl implements MessageService {
    private final MyBot myBot;
    @Override
    public void send(MessageSendRequestDto messageSendRequestDto) {
        Update update = new Update();
        Message message = new Message();
        message.setText(messageSendRequestDto.getMessage());

        Chat chat = new Chat();
        chat.setTitle("This is title");
        chat.setId(-1111111111L);
        message.setChat(chat);
        update.setMessage(message);
        myBot.onUpdateReceived(update);
    }
}
