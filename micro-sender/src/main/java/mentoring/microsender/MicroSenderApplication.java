package mentoring.microsender;

import mentoring.microsender.configuration.RabbitConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableConfigurationProperties(RabbitConfigurationProperties.class)
public class MicroSenderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroSenderApplication.class, args);
    }

}
