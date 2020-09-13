package de.ft.neopxiel;

import com.kotcrab.vis.ui.widget.VisLabel;
import com.kotcrab.vis.ui.widget.VisTable;
import de.ft.interitus.plugin.Plugin;
import de.ft.interitus.projecttypes.BlockTypes.Interitus.Arduino.InitArduino;
import de.ft.interitus.projecttypes.BlockTypes.PlatformSpecificBlock;
import de.ft.interitus.projecttypes.Tool;
import de.ft.neopxiel.NeopixelBlocks.InitBlock.InitBlock;

import java.io.Serializable;
import java.util.ArrayList;

public class Addon implements de.ft.interitus.projecttypes.Addons.Addon {

    ArrayList<PlatformSpecificBlock> blocks = new ArrayList<>();
    Plugin plugin;
    public Addon(Plugin plugin) {
        this.plugin = plugin;
        blocks.add(new InitBlock(InitArduino.arduino,this));

    }
    @Override
    public String getProjectTypebyName() {
        return "Arduino-Projekt";
    }

    @Override
    public ArrayList<PlatformSpecificBlock> getaddBlocks() {
        return blocks;
    }

    @Override
    public ArrayList<Tool> getTools() {
        return null;
    }

    @Override
    public String getName() {
        return "Neopixel";
    }

    @Override
    public Plugin getPlugin() {
        return plugin;
    }

    @Override
    public void getAddonSettings(VisTable visTable) {

        visTable.add(new VisLabel("Hallo vom Plugin"));

    }

    @Override
    public Serializable getAddonSettings() {
        return null;
    }

    @Override
    public void setAddonSettings(Object o) {

    }
}
