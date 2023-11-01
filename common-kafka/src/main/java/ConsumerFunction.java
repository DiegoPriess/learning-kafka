import org.apache.kafka.clients.consumer.ConsumerRecord;

import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.ExecutionException;

public interface ConsumerFunction<T> {
    void consume(ConsumerRecord<String, T> record) throws InterruptedException, ExecutionException, SQLException, IOException;
}
