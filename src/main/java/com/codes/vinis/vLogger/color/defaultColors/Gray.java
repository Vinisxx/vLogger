package com.codes.vinis.vLogger.color.defaultColors;

import com.codes.vinis.vLogger.color.Color;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class Gray implements Color {

    private final @NotNull String name;

    private final @NotNull String color;

    public Gray() {

        this.name = "Gray";
        this.color = "\u001B[90m";
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

        @NotNull Gray gray = (Gray) o;
        return getName().equals(gray.getName()) && getColor().equals(gray.getColor());
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
