package com.codes.vinis.vLogger.config;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

public class ConfigLoader {

    private static @Nullable ConfigLoader instance;

    private @NotNull Map<@NotNull String, @NotNull String> colorConfig;

    private @NotNull Map<@NotNull String, Object> fullConfig;

    private ConfigLoader(@NotNull String configFilePath) throws IOException {

        this.fullConfig = loadConfig(configFilePath);
        this.colorConfig = extractColorsConfig(fullConfig);
    }

    /**
     * Returns the singleton instance, initializing it if necessary.
     *
     * @param configFilePath the path to the configuration file
     * @return the ConfigLoader instance
     * @throws IOException if the file cannot be read
     */
    public static @Nullable ConfigLoader getInstance(@NotNull String configFilePath) throws IOException {

        if (getInstance() == null) {

            setInstance(new ConfigLoader(configFilePath));
        }

        return getInstance();
    }

    private @NotNull Map<@NotNull String, Object> loadConfig(@NotNull String configFilePath) throws IOException {

        @NotNull Gson gson = new Gson();

        @NotNull Type configMapType = new TypeToken<@NotNull Map<@NotNull String, Object>>() {}.getType();

        return gson.fromJson(new FileReader(configFilePath), configMapType);
    }

    private @NotNull Map<@NotNull String, @NotNull String> extractColorsConfig(@NotNull Map<@NotNull String, Object> fullConfig) {

        @SuppressWarnings("unchecked")
        @NotNull Map<@NotNull String, @NotNull String> colorsConfig = (Map<@NotNull String, @NotNull String>) fullConfig.get("ColorsConfig");

        return colorsConfig;
    }


    /**
     * Returns the color code for a given log level.
     *
     * @param logLevel the log level (e.g., "INFO")
     * @return the corresponding color code
     */
    public @NotNull String getColorForLogLevel(@NotNull String logLevel) {

        return colorConfig.get(logLevel);
    }

    public static @Nullable ConfigLoader getInstance() {
        return instance;
    }

    public static void setInstance(@NotNull ConfigLoader instance) {

        ConfigLoader.instance = instance;
    }

    public @NotNull Map<@NotNull String, Object> getFullConfig() {

        return fullConfig;
    }

    public void setFullConfig(@NotNull Map<@NotNull String, Object> config) {

        this.fullConfig = config;

        this.colorConfig = extractColorsConfig(fullConfig);
    }
}
