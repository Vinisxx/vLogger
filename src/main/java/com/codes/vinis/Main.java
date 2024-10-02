package com.codes.vinis;

import com.codes.vinis.vLogger.Logger;
import com.codes.vinis.vLogger.formatter.SimpleFormatter;
import com.codes.vinis.vLogger.handler.ConsoleHandler;
import org.jetbrains.annotations.NotNull;

public class Main {

    public static void main(String[] args) {

        @NotNull Logger logger = new Logger(Main.class, new ConsoleHandler(new SimpleFormatter()));

        logger.error("hello world");
    }
}