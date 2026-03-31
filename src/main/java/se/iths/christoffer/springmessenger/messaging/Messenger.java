package se.iths.christoffer.springmessenger.messaging;

import se.iths.christoffer.springmessenger.model.Message;

public interface Messenger {
    void send(Message message);
}
