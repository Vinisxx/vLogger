package com.codes.vinis.vLogger.color;

import com.codes.vinis.vLogger.utils.interfaces.Color;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class AbstractColor implements Color {

    private final @NotNull String name;

    private final @NotNull String color;

    public AbstractColor(@NotNull String name, @NotNull String color) {

        this.name = name;
        this.color = color;
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

        @NotNull AbstractColor color = (AbstractColor) o;
        return getName().equals(color.getName()) && getColor().equals(color.getColor());
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
