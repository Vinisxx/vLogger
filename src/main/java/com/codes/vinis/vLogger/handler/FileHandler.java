package com.codes.vinis.vLogger.handler;

import com.codes.vinis.vLogger.utils.factories.FormatterFactory;
import com.codes.vinis.vLogger.utils.interfaces.Formatter;
import com.codes.vinis.vLogger.utils.interfaces.Handler;
import com.codes.vinis.vLogger.utils.interfaces.LogLevel;
import org.jetbrains.annotations.NotNull;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandler implements Handler {

    public final @NotNull String name;

    private final @NotNull Formatter formatter;

    private final @NotNull String filePath;

    public FileHandler(@NotNull FormatterFactory.FormatterType formatterType, @NotNull String filePath) {

        this.name = "FileHandler";

        this.formatter = FormatterFactory.createFormatter(formatterType);

        this.filePath = filePath;
    }

    @Override
    public void handle(@NotNull LogLevel logLevel, @NotNull String message, @NotNull Class<?> aClass) {

        @NotNull String formattedMessage = getFormatter().format(logLevel, message, aClass);

        try (@NotNull PrintWriter out = new PrintWriter(new FileWriter(filePath, true))) {

            out.println(formattedMessage);
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public @NotNull Formatter getFormatter() {

        return formatter;
    }

    @Override
    public @NotNull String getName() {

        return name;
    }

    public @NotNull String getFilePath() {

        return filePath;
    }
}