package com.codes.vinis.vLogger.logLevels;

import com.codes.vinis.vLogger.interfaces.Color;
import com.codes.vinis.vLogger.interfaces.LogLevel;
import com.codes.vinis.vLogger.logLevels.defaultLevels.Info;
import org.jetbrains.annotations.NotNull;

import java.util.StringJoiner;

public class LogLevelAbstract implements LogLevel {

    private @NotNull String message;

    private @NotNull Color color;

    public LogLevelAbstract (@NotNull String message, @NotNull Color color) {

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

        @NotNull LogLevelAbstract logLevel = (LogLevelAbstract) o;
        return getMessage().equals(logLevel.getMessage()) && getColor().equals(logLevel.getColor());
    }

    @Override
    public int hashCode() {

        int result = getMessage().hashCode();
        result = 31 * result + getColor().hashCode();
        return result;
    }

    @Override
    public String toString() {

        return new StringJoiner(", ", LogLevelAbstract.class.getSimpleName() + "[", "]")
                .add("message='" + message + "'")
                .add("color=" + color)
                .toString();
    }
}
