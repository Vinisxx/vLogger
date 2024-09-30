package com.codes.vinis.vLogger.logLevels;

import com.codes.vinis.vLogger.color.Color;
import org.jetbrains.annotations.NotNull;


public class Info implements LogLevel {

    private @NotNull String message;

    private @NotNull Color color;

    public Info (@NotNull String message, @NotNull Color color) {

        this.message = message;
        this.color = color;
    }

    @Override
    public @NotNull String getMessage() {

        return message;
    }

    @Override
    public void setMessage(@NotNull String message) {

        this.message = message;
    }

    @Override
    public @NotNull Color getColor() {

        return color;
    }

    @Override
    public void setColor(@NotNull Color color) {

        this.color = color;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        @NotNull Info info = (Info) o;
        return getMessage().equals(info.getMessage()) && getColor().equals(info.getColor());
    }

    @Override
    public int hashCode() {

        int result = getMessage().hashCode();
        result = 31 * result + getColor().hashCode();
        return result;
    }
}