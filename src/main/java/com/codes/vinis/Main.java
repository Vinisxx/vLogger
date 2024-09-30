package com.codes.vinis;

import com.codes.vinis.vLogger.logLevels.Debug;
import com.codes.vinis.vLogger.logLevels.Error;
import com.codes.vinis.vLogger.logLevels.Info;
import com.codes.vinis.vLogger.logLevels.Warn;
import org.jetbrains.annotations.NotNull;

public class Main {

    public static void main(String[] args) {

        @NotNull Info info = new Info("This is a info");

        System.out.println(info.getMessage());

        @NotNull Debug debug = new Debug("This is a debug");

        System.out.println(debug.getMessage());

        @NotNull Warn warn = new Warn("This is a warn");

        System.out.println(warn.getMessage());

        @NotNull Error error = new Error("This is a error");

        System.out.println(error.getMessage());
    }
}