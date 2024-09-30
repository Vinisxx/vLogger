package com.codes.vinis.vLogger.colors;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class DarkRed {

    private final @NotNull String name;

    private final @NotNull String color;

    public DarkRed() {

        this.name = "DarkRed";
        this.color = "\u001B[38;5;88m"; ;
    }

    public @NotNull String getName() {

        return name;
    }

    public @NotNull String getColor() {

        return color;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        @NotNull DarkRed gray = (DarkRed) o;
        return name.equals(gray.name) && color.equals(gray.color);
    }

    @Override
    public int hashCode() {

        int result = name.hashCode();
        result = 31 * result + color.hashCode();

        return result;
    }

    @Contract(pure = true)
    @Override
    public @NotNull String toString() {

        return "{ \"Color\": \"" + color + name + "\u001B[0m\" }";
    }
}
