package com.codes.vinis;

import com.codes.vinis.vLogger.Logger;
import com.codes.vinis.vLogger.formatter.JsonFormatter;
import com.codes.vinis.vLogger.formatter.SimpleFormatter;
import com.codes.vinis.vLogger.handler.ConsoleHandler;
import com.codes.vinis.vLogger.handler.FileHandler;
import com.codes.vinis.vLogger.utils.factories.FormatterFactory;
import org.jetbrains.annotations.NotNull;

public class Main {

    public static void main(String[] args) {

        // Initialize Console Logger
        @NotNull Logger<Main> consoleLogger = new Logger<>(Main.class, new ConsoleHandler(FormatterFactory.FormatterType.SIMPLE));

        // Log messages to console
        consoleLogger.info("This is an info message.");
        consoleLogger.debug("This is a debug message.");
        consoleLogger.warn("This is a warning message.");
        consoleLogger.error("This is an error message.");

        // Initialize File Logger
        @NotNull Logger<Main> fileLogger = new Logger<>(Main.class, new FileHandler(FormatterFactory.FormatterType.JSON, "src/main/java/com/codes/vinis/vLogger/logs.txt"));

        // Log messages to a file
        fileLogger.info("Info logged to file.");
        fileLogger.error("Error logged to file.");
    }
}