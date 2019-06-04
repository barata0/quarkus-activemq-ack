package my;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * DummyWorker
 */
public class DummyWorker implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(DummyWorker.class);

    private String payload;

    public DummyWorker(String payload) {
        this.payload = payload;
    }

    @Override
    public void run() {
        logger.info("starting long task " + payload);
        logger.info("long task finished " + payload);
    }
}