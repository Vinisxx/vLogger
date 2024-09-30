package com.codes.vinis.vLogger.color;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public abstract class Color {

    private final @NotNull String name;

    private final @NotNull String color;

    public Color(@NotNull String name, @NotNull String codeANSI) {

        this.name = name;
        this.color = codeANSI;
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

        @NotNull Color color = (Color) o;
        return name.equals(color.name) && color.equals(color.color);
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
