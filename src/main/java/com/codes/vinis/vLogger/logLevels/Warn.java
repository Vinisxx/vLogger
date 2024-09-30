package com.codes.vinis.vLogger.logLevels;

import org.jetbrains.annotations.NotNull;

import java.util.StringJoiner;

public class Warn {

    private @NotNull String Message;

    public Warn(@NotNull String message) {

        this.Message = message;
    }

    public @NotNull String getMessage() {

        return Message;
    }

    public void setMessage(@NotNull String message) {

        Message = message;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        @NotNull Warn warn = (Warn) o;
        return Message.equals(warn.Message);
    }

    @Override
    public int hashCode() {

        return Message.hashCode();
    }

    @Override
    public String toString() {

        return new StringJoiner(", ", Warn.class.getSimpleName() + "[", "]")
                .add("Message='" + Message + "'")
                .toString();
    }
}
