package mentoring.microrecipient.controller;

import lombok.extern.slf4j.Slf4j;
import mentoring.microrecipient.service.StorageService;
import model.Notification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/notifications")
public class RecipientController {

    private final StorageService storageService;

    public RecipientController(StorageService storageService) {
        this.storageService = storageService;
    }

    @GetMapping
    public ResponseEntity<List<Notification>> getNotifications() {
        log.info("Message controller");
        return new ResponseEntity<>(storageService.getNotifications(), HttpStatus.OK);
    }
}
