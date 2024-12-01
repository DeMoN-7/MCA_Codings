interface ClickListener {
    void onClick();
}

class Button {
    void setClickListener(ClickListener listener) {
        listener.onClick();
    }
}

class Config {
    static class Helper {
        static void printConfig() {
            System.out.println("Static Nested Class: Helper is processing configuration.");
        }
    }

    void execute() {
        // Helper works independently
        Helper.printConfig();
    }
}

class TransactionProcessor {
    void processTransaction() {
        class TransactionLogger {
            void log(String message) {
                System.out.println("Transaction Log: " + message);
            }
        }
        TransactionLogger logger = new TransactionLogger();
        logger.log("Transaction started.");
        logger.log("Transaction completed.");
    }
}

public class q1 {
    public static void main(String[] args) {
        // (i) Static Nested Class
        Config config = new Config();
        config.execute();

        // (ii) Local Inner Class
        TransactionProcessor processor = new TransactionProcessor();
        processor.processTransaction();

        // (iii) Anonymous Inner Class
        Button button = new Button();
        button.setClickListener(new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("Button clicked!");
            }
        });
    }
}
