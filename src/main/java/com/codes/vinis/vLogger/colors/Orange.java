package com.codes.vinis.vLogger.colors;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Orange {

    private final @NotNull String name;

    private final @NotNull String color;

    public Orange() {

        this.name = "Orange";
        this.color = "\u001B[38;5;208m"; ;
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

        @NotNull Orange gray = (Orange) o;
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
