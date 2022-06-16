package mentoring.microrecipient.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import model.Notification;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Arrays;


@Component
@Slf4j
public class NotificationReceiver implements MessageListener {

    private final ObjectMapper objectMapper;

    private final StorageService storageService;

    public NotificationReceiver(ObjectMapper objectMapper, StorageService storageService) {
        this.objectMapper = objectMapper;
        this.storageService = storageService;
    }

    @Override
    public void onMessage(Message message) {
        log.info("Received <" + Arrays.toString(message.getBody()) + ">");
        try {
            storageService.addNotification(objectMapper.readValue(message.getBody(), Notification.class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

