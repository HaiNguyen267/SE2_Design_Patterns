package singleton;

public class Logger {
    private static Logger instance;

    public void logMessage(String message) {
        System.out.println(message);
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}

