package com.codes.vinis.vLogger.handler;

import com.codes.vinis.vLogger.utils.factories.FormatterFactory;
import com.codes.vinis.vLogger.utils.interfaces.Formatter;
import com.codes.vinis.vLogger.utils.interfaces.Handler;
import com.codes.vinis.vLogger.utils.interfaces.LogLevel;
import org.jetbrains.annotations.NotNull;

public class ConsoleHandler implements Handler {

    public final @NotNull String name;

    private final @NotNull Formatter formatter;

    public ConsoleHandler(@NotNull FormatterFactory.FormatterType formatterType) {

        this.name = "ConsoleHandler";

        this.formatter = FormatterFactory.createFormatter(formatterType);
    }

    @Override
    public void handle(@NotNull LogLevel logLevel, @NotNull String message, @NotNull Class<?> aClass) {

        String formattedMessage = getFormatter().format(logLevel, message, aClass);

        System.out.println(formattedMessage);
    }

    public @NotNull Formatter getFormatter() {

        return formatter;
    }

    @Override
    public @NotNull String getName() {

        return name;
    }
}