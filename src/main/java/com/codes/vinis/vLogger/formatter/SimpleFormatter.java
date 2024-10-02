package com.codes.vinis.vLogger.formatter;

import com.codes.vinis.vLogger.utils.interfaces.Formatter;
import com.codes.vinis.vLogger.utils.interfaces.LogLevel;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SimpleFormatter implements Formatter {


    public SimpleFormatter() {

    }

    @Override
    public @NotNull String format(@NotNull LogLevel logLevel, @NotNull String message, @NotNull Class aClass) {

        @NotNull LocalDateTime now = LocalDateTime.now();

        @NotNull String timestamp = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        return String.format(
                "[%s] %s%s%s %s %s - %s",
                timestamp,
                logLevel.getColor().getColor(),
                logLevel.getName(),
                ": ",
                message,
                "\u001B[0m",
                aClass.getSimpleName()
        );
    }
}