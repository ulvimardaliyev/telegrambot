package az.telegrambot.app.telegrambot.service;

import az.telegrambot.app.telegrambot.dto.MessageSendRequestDto;

public interface MessageService {
    void send(MessageSendRequestDto messageSendRequestDto);

}
