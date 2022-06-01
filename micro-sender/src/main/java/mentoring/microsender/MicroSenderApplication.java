package mentoring.microsender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MicroSenderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroSenderApplication.class, args);
    }

}
