package com.codes.vinis.vLogger.utils.interfaces;

import org.jetbrains.annotations.NotNull;

public interface Handler {

    void handle(@NotNull LogLevel logLevel, @NotNull String message, @NotNull Class<?> aClass);
}
