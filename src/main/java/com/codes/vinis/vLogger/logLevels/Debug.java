package com.codes.vinis.vLogger.logLevels;

import org.jetbrains.annotations.NotNull;

import java.util.StringJoiner;

public class Debug {

    private @NotNull String message;

    public Debug(@NotNull String message) {

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

        @NotNull Debug debug = (Debug) o;
        return message.equals(debug.message);
    }

    @Override
    public int hashCode() {

        return message.hashCode();
    }

    @Override
    public String toString() {

        return new StringJoiner(", ", Debug.class.getSimpleName() + "[", "]")
                .add("message='" + message + "'")
                .toString();
    }
}
