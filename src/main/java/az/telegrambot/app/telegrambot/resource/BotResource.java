package az.telegrambot.app.telegrambot.resource;

import az.telegrambot.app.telegrambot.dto.MessageSendRequestDto;
import az.telegrambot.app.telegrambot.service.MessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("/api/bot")
public class BotResource {
    private final MessageService messageService;

    @PostMapping("/send")
    public String sendText(@RequestBody MessageSendRequestDto messageSendRequestDto) {
        messageService.send(messageSendRequestDto);
        return "Sent";
    }
}
