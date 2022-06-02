package mentoring.microrecipient.controller;

import lombok.extern.slf4j.Slf4j;
import mentoring.microrecipient.model.Storage;
import mentoring.microrecipient.model.Notification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/notifications")
public class RecipientController {

    @GetMapping
    public List<Notification> getNotifications() {
        log.info("Message controller");
        return Storage.getNotifications();
    }
}
