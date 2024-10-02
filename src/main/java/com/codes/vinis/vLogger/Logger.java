package com.codes.vinis.vLogger;

import com.codes.vinis.vLogger.formatter.SimpleFormatter;
import com.codes.vinis.vLogger.handler.ConsoleHandler;
import com.codes.vinis.vLogger.logLevels.defaultLevels.Debug;
import com.codes.vinis.vLogger.logLevels.defaultLevels.Error;
import com.codes.vinis.vLogger.logLevels.defaultLevels.Info;
import com.codes.vinis.vLogger.logLevels.defaultLevels.Warn;
import com.codes.vinis.vLogger.utils.interfaces.Handler;
import org.jetbrains.annotations.NotNull;

public class Logger<T> {

    private final @NotNull Class<T> aClass;

    private @NotNull Handler handler;

    public Logger(@NotNull Class<T> aClass, @NotNull Handler handler) {

        this.aClass = aClass;

        this.handler = handler;
    }

    public void info(@NotNull String message) {

        getHandler().handle(new Info(), message, getaClass());
    }

    public void debug(@NotNull String message) {

        getHandler().handle(new Debug(), message, getaClass());
    }

    public void warn(@NotNull String message) {

        getHandler().handle(new Warn(), message, getaClass());
    }

    public void error(@NotNull String message) {

        getHandler().handle(new Error(), message, getaClass());
    }

    public @NotNull Class<T> getaClass() {

        return aClass;
    }

    public @NotNull Handler getHandler() {

        return handler;
    }

    public void setHandler(@NotNull Handler handler) {

        this.handler = handler;
    }
}