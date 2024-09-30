package com.codes.vinis;

import com.codes.vinis.vLogger.color.defaultColors.DarkRed;
import com.codes.vinis.vLogger.color.defaultColors.Gray;
import com.codes.vinis.vLogger.color.defaultColors.Green;
import com.codes.vinis.vLogger.color.defaultColors.Orange;
import com.codes.vinis.vLogger.logLevels.Debug;
import com.codes.vinis.vLogger.logLevels.Error;
import com.codes.vinis.vLogger.logLevels.Info;
import com.codes.vinis.vLogger.logLevels.Warn;
import org.jetbrains.annotations.NotNull;

public class Main {

    public static void main(String[] args) {

        @NotNull Info info = new Info("this method isn't finalized, use the 'otherMethod()'.", new Gray());

        System.out.println(info.getColor().getColor() + info.getMessage());

        @NotNull Debug debug = new Debug("success in this operation.", new Green());

        System.out.println(debug.getColor().getColor() + debug.getMessage());

        @NotNull Warn warn = new Warn("this process is generating an unwanted bottleneck.", new Orange());

        System.out.println(warn.getColor().getColor() + warn.getMessage());

        @NotNull Error error = new Error("invalid operation.", new DarkRed());

        System.out.println(error.getColor().getColor() + error.getMessage());
    }
}