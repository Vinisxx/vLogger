package com.codes.vinis;

import com.codes.vinis.vLogger.colors.DarkRed;
import com.codes.vinis.vLogger.colors.Gray;
import com.codes.vinis.vLogger.colors.Green;
import com.codes.vinis.vLogger.colors.Orange;
import org.jetbrains.annotations.NotNull;

public class Main {

    public static void main(String[] args) {

        @NotNull Gray gray = new Gray();

        System.out.println(gray);

        @NotNull Green green = new Green();

        System.out.println(green);

        @NotNull Orange orange = new Orange();

        System.out.println(orange);

        @NotNull DarkRed darkRed = new DarkRed();

        System.out.println(darkRed);
        /*
        @NotNull Info info = new Info("This is a info");

        System.out.println(info.getMessage());

        @NotNull Debug debug = new Debug("This is a debug");

        System.out.println(debug.getMessage());

        @NotNull Warn warn = new Warn("This is a warn");

        System.out.println(warn.getMessage());

        @NotNull Error error = new Error("This is a error");

        System.out.println(error.getMessage());

         */
    }
}