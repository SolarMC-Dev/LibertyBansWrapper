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

import org.bukkit.Server;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginLoader;
import org.bukkit.plugin.java.JavaPlugin;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.io.TempDir;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.nio.file.Path;

@ExtendWith(MockitoExtension.class)
public class LibertyBansWrapperTest {

    @Test
    public void launch(@Mock PluginLoader loader, @Mock Server server, @TempDir Path dataFolder) {
        JavaPlugin plugin = new JavaPlugin(loader, server, new PluginDescriptionFile("Name", "A248", "1.0.0"),
                dataFolder, dataFolder) {};
        try (var wrapper = new LibertyBansWrapper()) {
            wrapper.onLaunch(plugin, dataFolder);
        }
    }
}
