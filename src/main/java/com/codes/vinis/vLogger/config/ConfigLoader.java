package com.codes.vinis.vLogger.config;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class ConfigLoader {

    private static @Nullable ConfigLoader instance;
    private @NotNull Map<@NotNull String, @NotNull String> config;

    private ConfigLoader(@NotNull String configFilePath) throws IOException {

        this.config = loadConfig(configFilePath);
    }

    public static @Nullable ConfigLoader getInstance(@NotNull String configFilePath) throws IOException {

        if (getInstance() == null) {

            setInstance(new ConfigLoader(configFilePath));
        }

        return getInstance();
    }

    private @NotNull Map<@NotNull String, @NotNull String> loadConfig(@NotNull String configFilePath) throws IOException {

        @NotNull Gson gson = new Gson();

        @NotNull Type configMapType = new TypeToken<@NotNull Map<@NotNull String, @NotNull String>>() {}.getType();

        @NotNull Map<@NotNull String, @NotNull String> configMap = gson.fromJson(new FileReader(configFilePath), configMapType);

        return configMap;
    }

    public @NotNull String getColorForLogLevel(@NotNull String logLevel) {

        return getConfig().get(logLevel);
    }

    public static @Nullable ConfigLoader getInstance() {

        return instance;
    }

    public static void setInstance(@NotNull ConfigLoader instance) {

        ConfigLoader.instance = instance;
    }

    public @NotNull Map<@NotNull String, @NotNull String> getConfig() {

        return config;
    }

    public void setConfig(@NotNull Map<@NotNull String, @NotNull String> config) {

        this.config = config;
    }
}
