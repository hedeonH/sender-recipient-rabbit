package mentoring.microsender.configuration;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    private final RabbitConfigurationProperties rabbitConfigurationProperties;

    public RabbitMQConfig(RabbitConfigurationProperties rabbitConfigurationProperties) {
        this.rabbitConfigurationProperties = rabbitConfigurationProperties;
    }

    @Bean
    Queue queue() {
        return new Queue(rabbitConfigurationProperties.getQueue());
    }

    @Bean
    TopicExchange exchange() {
        return new TopicExchange(rabbitConfigurationProperties.getTopic());
    }

    @Bean
    Binding binding(Queue queue, TopicExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(rabbitConfigurationProperties.getRoutingKey());
    }
}
