package com.codes.vinis.vLogger.utils.interfaces;

import org.jetbrains.annotations.NotNull;

public interface Formatter<T> {

    @NotNull String format(@NotNull LogLevel logLevel, @NotNull String message, @NotNull Class<T> tClass);
}
