package mentoring.microsender.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Notification{

    private String user;

    private String message;
}
