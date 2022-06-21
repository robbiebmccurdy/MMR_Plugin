package com.github.robbiebmccurdy.mmr_plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class MMR_Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("Welcome to Fenworks Competitive. This plugin is version 0.1");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("Thank you for using Fenworks competitive.");
    }
}
