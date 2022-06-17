package mentoring.microcollector.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Slf4j
public class LoggingService {

    @Value("${receiver.url}")
    private String receiverEndpoint;

    @Scheduled(cron = "5 * * * * *")
    public void getNotifications(){

        RestTemplate restTemplate = new RestTemplate();
        var result = restTemplate.getForObject(receiverEndpoint, List.class);

        log.info(String.valueOf(result));
    }
}
