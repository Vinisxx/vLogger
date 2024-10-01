package com.codes.vinis.vLogger.factories;

import com.codes.vinis.vLogger.color.AbstractColor;
import org.jetbrains.annotations.NotNull;

public class ColorFactory {

    public static @NotNull AbstractColor getColor(String name) {

        try {

            @NotNull String className = "com.codes.vinis.vLogger.color.defaultColors." + name;

            @NotNull Class<?> colorClass = Class.forName(className);

            if (AbstractColor.class.isAssignableFrom(colorClass)) {

                return (AbstractColor) colorClass.getDeclaredConstructor().newInstance();
            } else {

                throw new IllegalArgumentException("class " + className + " does not implement Color.");
            }
        } catch (ClassNotFoundException e) {

            throw new IllegalArgumentException("color class not found for: " + name, e);
        } catch (Exception e) {

            throw new RuntimeException("failed to instantiate color: " + name, e);
        }
    }
}
