package com.codes.vinis.vLogger.utils.factories;

import com.codes.vinis.vLogger.formatter.JsonFormatter;
import com.codes.vinis.vLogger.formatter.SimpleFormatter;
import com.codes.vinis.vLogger.utils.interfaces.Formatter;
import org.jetbrains.annotations.NotNull;

public class FormatterFactory {

    public enum FormatterType {

        SIMPLE,
        JSON;
    }

    public static @NotNull Formatter createFormatter(@NotNull FormatterType type) {

        if (type == FormatterType.JSON) {

            return new JsonFormatter();
        } else if (type == FormatterType.SIMPLE) {

            return new SimpleFormatter();
        }

        throw new IllegalArgumentException("the type: " + type + " is not available.");
    }
}
