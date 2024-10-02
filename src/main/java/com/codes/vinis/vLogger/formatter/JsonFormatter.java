package com.codes.vinis.vLogger.formatter;

import com.codes.vinis.vLogger.utils.interfaces.Formatter;
import com.codes.vinis.vLogger.utils.interfaces.LogLevel;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JsonFormatter implements Formatter {

    private final @NotNull String name;

    public JsonFormatter() {

        this.name = "JsonFormatter";
    }

    @Override
    public @NotNull String format(@NotNull LogLevel logLevel, @NotNull String message, @NotNull Class aClass) {

        @NotNull LocalDateTime now = LocalDateTime.now();

        @NotNull String timestamp = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        return String.format(
                "{ \"timestamp\": \"%s\", \"logLevel\": \"%s\", \"className\": \"%s\", \"message\": \"%s\" }",
                timestamp,
                logLevel.getName(),
                aClass.getSimpleName(),
                message
        );
    }

    @Override
    public @NotNull String getName() {

        return name;
    }
}