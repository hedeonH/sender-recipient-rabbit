package mentoring.microsender.controller;

import lombok.extern.slf4j.Slf4j;
import mentoring.microsender.model.Notification;
import mentoring.microsender.service.NotificationService;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/notifications")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public void postNotification(@RequestBody Notification notification) {
        log.info("Receiving a notification" + notification);
        notificationService.sendMessage(notification);
    }
}
