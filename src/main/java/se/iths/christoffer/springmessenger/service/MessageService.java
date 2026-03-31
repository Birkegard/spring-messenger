package se.iths.christoffer.springmessenger.service;

import org.springframework.stereotype.Service;
import se.iths.christoffer.mytextformatter.TextFormatter;
import se.iths.christoffer.springmessenger.messaging.Messenger;
import se.iths.christoffer.springmessenger.model.Message;

import java.util.Map;

@Service
public class MessageService {
    private final Map<String, Messenger> messengers;

    private final TextFormatter textFormatter;

    public MessageService(Map<String, Messenger> messengers, TextFormatter textFormatter) {
        this.messengers = messengers;
        this.textFormatter = textFormatter;
    }

    public void send(Message message) {
        for (String type : messengers.keySet()) {
            if (message.getType().equals(type)) {
                Messenger messenger = messengers.get(type);
                message.setMessage(textFormatter.toUpperCase(message.getMessage()));
                messenger.send(message);
                break;
            }
        }
    }
}
