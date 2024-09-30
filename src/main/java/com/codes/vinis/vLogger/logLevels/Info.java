package com.codes.vinis.vLogger.logLevels;

import org.jetbrains.annotations.NotNull;

import java.util.StringJoiner;

public class Info {

    private @NotNull String message;

    public Info (@NotNull String message) {

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

        @NotNull Info info = (Info) o;
        return message.equals(info.message);
    }

    @Override
    public int hashCode() {

        return message.hashCode();
    }

    @Override
    public String toString() {

        return new StringJoiner(", ", Info.class.getSimpleName() + "[", "]")
                .add("message='" + message + "'")
                .toString();
    }
}
