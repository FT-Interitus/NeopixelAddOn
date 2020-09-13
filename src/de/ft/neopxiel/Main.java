package de.ft.neopxiel;

import de.ft.interitus.plugin.Plugin;
import de.ft.interitus.plugin.PluginAssetManager;
import de.ft.interitus.plugin.ProgramRegistry;

public class Main implements Plugin {

    @Override
    public boolean register(ProgramRegistry programRegistry) {
        programRegistry.registerAddon(new Addon(this),this);
        return false;

    }

    @Override
    public boolean init(PluginAssetManager pluginAssetManager) {
        return false;
    }

    @Override
    public boolean run() {
        return false;
    }
}
