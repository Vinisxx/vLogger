package com.codes.vinis.vLogger.logLevels.defaultLevels;

import com.codes.vinis.vLogger.config.ConfigLoader;
import com.codes.vinis.vLogger.utils.factories.ColorFactory;
import com.codes.vinis.vLogger.utils.interfaces.Color;
import com.codes.vinis.vLogger.logLevels.LogLevelAbstract;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;


public class Info extends LogLevelAbstract {

    public Info () {

        super("Info", getDefaultColor());
    }

    private static @NotNull Color getDefaultColor() {

        try {

            @NotNull String colorName = ConfigLoader.getInstance("src/main/java/com/codes/vinis/vLogger/config/Config.json").getColorForLogLevel("ColorInfo");

            return ColorFactory.getColor(colorName);
        } catch (IOException e) {

            throw new RuntimeException("failed to load config", e);
        }
    }
}