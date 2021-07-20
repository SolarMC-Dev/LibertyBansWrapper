/*
 * libertybansplugin
 * Copyright © 2021 SolarMC Developers
 *
 * libertybansplugin is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * libertybansplugin is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with libertybansplugin. If not, see <https://www.gnu.org/licenses/>
 * and navigate to version 3 of the GNU Affero General Public License.
 */

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
