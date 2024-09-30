package com.codes.vinis.vLogger.logLevels;

import com.codes.vinis.vLogger.color.Color;
import org.jetbrains.annotations.NotNull;

public interface LogLevel {

    @NotNull String getMessage();
    void setMessage(@NotNull String message);

    @NotNull Color getColor();
    void setColor(@NotNull Color color);
}
