package com.codes.vinis.vLogger.logLevels;

import org.jetbrains.annotations.NotNull;

import java.util.StringJoiner;

public class Error {

    private @NotNull String message;

    public Error(@NotNull String message) {

        this.message = message;
    }

    public @NotNull String getMessage() {

        return message;
    }

    public void setMessage(@NotNull String message) {

        this.message = message;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        @NotNull Error error = (Error) o;
        return message.equals(error.message);
    }

    @Override
    public int hashCode() {

        return message.hashCode();
    }

    @Override
    public String toString() {

        return new StringJoiner(", ", Error.class.getSimpleName() + "[", "]")
                .add("message='" + message + "'")
                .toString();
    }
}
