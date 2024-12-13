package me.albusthepenguin.puppetMaster;

import org.bukkit.plugin.java.JavaPlugin;

import me.albusthepenguin.api.APIExample;

@SuppressWarnings("unused")
public final class PuppetMaster extends JavaPlugin {

    @Override
    public void onEnable() {
        String x = APIExample.exampleMessage;

        // Plugin startup logic
        throw new IllegalArgumentException(x);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
