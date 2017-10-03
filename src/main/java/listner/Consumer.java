package listner;

/**
 * Created by Keshav on 10/2/2017.
 */
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @JmsListener(destination = "standalone.queue")
    public void consume(String message) {
        System.out.println("Received Message: " + message);
    }
}