package classes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Logger {

    private List<String> messageStack;
    private String fileName;
    private static Logger instance = null;

    private Logger() {
        this.fileName = "logs.txt";
        this.messageStack = new ArrayList<>();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public List<String> getMessageStack() {
        return messageStack;
    }

    public void setMessageStack(List<String> messageStack) {
        this.messageStack = messageStack;
    }

    // synchronized → thread safe
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public static void info(String message) {
        String formattedMessage = String.format("[INFO] - %s", message);
        System.out.println(formattedMessage);
        getInstance().getMessageStack().add(formattedMessage);
    }
    public static void warn(String message) {
        String formattedMessage = String.format("[WARNING] - %s", message);
        System.out.println(formattedMessage);
        getInstance().getMessageStack().add(formattedMessage);
    }
    public static void error(String message) {
        String formattedMessage = String.format("[ERROR] - %s", message);
        System.out.println(formattedMessage);
        getInstance().getMessageStack().add(formattedMessage);

    }

    public static void saveToFile() {
        try (FileWriter fileWriter = new FileWriter(getInstance().getFileName())) {
            for (String message : getInstance().getMessageStack()) {
                fileWriter.write(message + "\n");
            }
        } catch (IOException e) {
            Logger.error(e.getMessage());
        }
    }
}
