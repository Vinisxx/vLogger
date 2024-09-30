package com.codes.vinis.vLogger.logLevels;

import com.codes.vinis.vLogger.color.Color;
import org.jetbrains.annotations.NotNull;

import java.util.StringJoiner;


public class Error implements LogLevel{


    private @NotNull String message;

    private @NotNull Color color;

    public Error(@NotNull String message, @NotNull Color color) {

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

        @NotNull Error error = (Error) o;
        return getMessage().equals(error.getMessage()) && getColor().equals(error.getColor());
    }

    @Override
    public int hashCode() {

        int result = getMessage().hashCode();
        result = 31 * result + getColor().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Error.class.getSimpleName() + "[", "]")
                .add("message='" + message + "'")
                .add("color=" + color)
                .toString();
    }
}