package com.codes.vinis.vLogger.logLevels;

import com.codes.vinis.vLogger.utils.interfaces.Color;
import com.codes.vinis.vLogger.utils.interfaces.LogLevel;
import org.jetbrains.annotations.NotNull;

import java.util.StringJoiner;

public class LogLevelAbstract implements LogLevel {

    private final @NotNull String name;


    private @NotNull Color color;

    public LogLevelAbstract (@NotNull String name, @NotNull Color color) {

        this.name = name;
        this.color = color;
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
    public @NotNull String getName() {

        return name;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        @NotNull LogLevelAbstract logLevel = (LogLevelAbstract) o;
        return getName().equals(logLevel.getName()) && getColor().equals(logLevel.getColor());
    }

    @Override
    public int hashCode() {

        int result = getName().hashCode();
        result = 31 * result + getColor().hashCode();
        return result;
    }

    @Override
    public @NotNull String toString() {

        return new StringJoiner(", ", LogLevelAbstract.class.getSimpleName() + "[", "]")
                .add("message='" + getName() + "'")
                .add("color=" + getColor())
                .toString();
    }
}
