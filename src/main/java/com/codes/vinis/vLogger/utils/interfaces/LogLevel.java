package com.codes.vinis.vLogger.utils.interfaces;

import org.jetbrains.annotations.NotNull;

public interface LogLevel {

    @NotNull String getName();

    @NotNull Color getColor();
    void setColor(@NotNull Color color);
}
