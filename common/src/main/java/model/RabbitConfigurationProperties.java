package model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationProperties(prefix = "rabbitmq")
@ConfigurationPropertiesScan
@Data
public class RabbitConfigurationProperties {

    private String queue;

    private String topic;

    private String routingKey;
}