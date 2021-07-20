package gg.solarmc.libertybans;

import org.bukkit.plugin.LaunchablePlugin;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import space.arim.libertybans.bootstrap.BaseFoundation;
import space.arim.libertybans.env.spigot.SpigotLauncher;

import java.nio.file.Path;

public final class LibertyBansWrapper implements LaunchablePlugin {

    private BaseFoundation baseFoundation;

    @Override
    public void onLaunch(Plugin plugin, Path path) {
        baseFoundation = new SpigotLauncher((JavaPlugin) plugin, path).launch();
    }

    @Override
    public void onEnable() {
        baseFoundation.startup();
    }

    @Override
    public void close() {
        baseFoundation.shutdown();
    }
}
