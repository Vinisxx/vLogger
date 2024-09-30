package com.codes.vinis.vLogger.color.defaultColors;

import com.codes.vinis.vLogger.color.Color;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class DarkRed implements Color {

    private final @NotNull String name;

    private final @NotNull String color;

    public DarkRed() {

        this.name = "DarkRed";
        this.color = "\u001B[38;5;88m";
    }

    @Override
    public @NotNull String getName() {

        return name;
    }

    @Override
    public @NotNull String getColor() {

        return color;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        @NotNull DarkRed darkRed = (DarkRed) o;
        return getName().equals(darkRed.getName()) && getColor().equals(darkRed.getColor());
    }

    @Override
    public int hashCode() {

        int result = getName().hashCode();
        result = 31 * result + getColor().hashCode();

        return result;
    }

    @Contract(pure = true)
    @Override
    public @NotNull String toString() {

        return "{ \"Color\": \"" + getColor() + getName() + "\u001B[0m\" }";
    }
}