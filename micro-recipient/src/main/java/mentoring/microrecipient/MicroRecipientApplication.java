package mentoring.microrecipient;

import mentoring.microrecipient.config.RabbitConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableConfigurationProperties(RabbitConfigurationProperties.class)
public class MicroRecipientApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroRecipientApplication.class, args);
    }
}
