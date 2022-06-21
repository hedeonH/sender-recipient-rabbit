package mentoring.microsender;

import mentoring.microsender.configuration.RabbitConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RabbitConfigurationProperties.class)
public class MicroSenderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroSenderApplication.class, args);
    }

}
