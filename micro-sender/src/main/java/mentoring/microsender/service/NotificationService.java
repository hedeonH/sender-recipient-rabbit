package mentoring.microsender.service;

import lombok.extern.slf4j.Slf4j;
import mentoring.microsender.model.Notification;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationService {

    @Value("${rabbitmq.queue}")
    private String queueName;

    @Value("${rabbitmq.topic}")
    private String topic;

    private final RabbitTemplate rabbitTemplate;

    public NotificationService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(Notification notification) {
        log.info("Sending a message {} to topic {} and queue {}", notification, topic, queueName);
        rabbitTemplate.convertAndSend(topic, "notification.sender", notification);
    }
}
