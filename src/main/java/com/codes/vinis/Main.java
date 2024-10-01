package com.codes.vinis;

import com.codes.vinis.vLogger.logLevels.defaultLevels.Debug;
import com.codes.vinis.vLogger.logLevels.defaultLevels.Error;
import com.codes.vinis.vLogger.logLevels.defaultLevels.Info;
import com.codes.vinis.vLogger.logLevels.defaultLevels.Warn;
import org.jetbrains.annotations.NotNull;

public class Main {

    public static void main(String[] args) {

        @NotNull Info info = new Info("this method isn't finalized, use the 'otherMethod()'.");

        System.out.println(info.getColor().getColor() + info.getMessage());

        @NotNull Debug debug = new Debug("success in this operation.");

        System.out.println(debug.getColor().getColor() + debug.getMessage());

        @NotNull Warn warn = new Warn("this process is generating an unwanted bottleneck.");

        System.out.println(warn.getColor().getColor() + warn.getMessage());

        @NotNull Error error = new Error("invalid operation.");

        System.out.println(error.getColor().getColor() + error.getMessage());
    }
}