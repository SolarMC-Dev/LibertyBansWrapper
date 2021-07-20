import gg.solarmc.libertybans.LibertyBansWrapper;
import org.bukkit.plugin.LaunchablePlugin;

module gg.solarmc.libertybans {
    requires org.bukkit;
    requires space.arim.libertybans.env.spigot;
    // Specify these explicitly as they're automatic modules
    requires space.arim.libertybans.api;
    requires space.arim.libertybans.core;
    requires space.arim.libertybans.bootstrap;

    exports gg.solarmc.libertybans;
    provides LaunchablePlugin with LibertyBansWrapper;
}