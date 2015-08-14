package com.biohazard.modtesting.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {

    public static void init(File configFile) {
        //Create configuration object from configuration file
        Configuration configuration = new Configuration(configFile);
        boolean configValue = false;

        try {
            //Load the configuration file
            configuration.load();

            //Read in properties from configuration file
            configValue = configuration.get(Configuration.CATEGORY_GENERAL, "ConfigValue", true, "This is an example boolean config value").getBoolean();

        } catch (Exception e) {
            //Log the exception

        } finally {
            //Save the config
            configuration.save();
        }
    }
}
