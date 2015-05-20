package logging;

import logging.implementations.SysoutLogger;

public class Logger {

    private final SysoutLogger logger;

    public Logger() {
        this.logger = new SysoutLogger();
    }

    public void log(String message) {
        logger.log("LOG: " + message);
    }
}
