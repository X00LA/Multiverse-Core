package com.mvplugin.integration.bukkit;

import com.dumptruckman.minecraft.pluginbase.properties.YamlProperties;
import com.mvplugin.impl.CoreConfig;

import java.io.File;
import java.io.IOException;

/**
 * A yaml implementation of Multiverse-Core's primary configuration file.
 */
class YamlCoreConfig extends YamlProperties implements CoreConfig {

    public YamlCoreConfig(MVCoreBukkitIntegration plugin) throws IOException {
        super(plugin, true, true, new File(plugin.getDataFolder(), "config.yml"), CoreConfig.class);
    }
}
