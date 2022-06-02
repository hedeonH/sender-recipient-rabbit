package mentoring.microrecipient.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import mentoring.microrecipient.model.Storage;
import mentoring.microrecipient.model.Notification;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class NotificationReceiver {

    public void receiveMessage(String message) throws JsonProcessingException {
        log.info("Received <" + message + ">");
        ObjectMapper objectMapper = new ObjectMapper();
        Storage.addNotification(objectMapper.readValue(message, Notification.class));
    }
}

