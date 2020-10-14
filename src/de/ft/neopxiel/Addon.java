package de.ft.neopxiel;

import com.kotcrab.vis.ui.widget.VisLabel;
import com.kotcrab.vis.ui.widget.VisTable;
import de.ft.interitus.compiler.Compiler;
import de.ft.interitus.compiler.Interitus.Arduino.ArduinoCompiler;
import de.ft.interitus.events.EventVar;
import de.ft.interitus.events.global.GlobalCompilingStartEvent;
import de.ft.interitus.events.global.GlobalEventAdapter;
import de.ft.interitus.plugin.Plugin;
import de.ft.interitus.projecttypes.BlockTypes.Interitus.Arduino.InitArduino;
import de.ft.interitus.projecttypes.BlockTypes.PlatformSpecificBlock;
import de.ft.interitus.projecttypes.ProjectManager;
import de.ft.interitus.projecttypes.Tool;
import de.ft.neopxiel.NeopixelBlocks.InitBlock.InitBlock;
import de.ft.neopxiel.NeopixelBlocks.InitBlock.SetPixelColor;

import java.io.Serializable;
import de.ft.interitus.utils.ArrayList;

public class Addon implements de.ft.interitus.projecttypes.Addons.Addon {

    ArrayList<PlatformSpecificBlock> blocks = new ArrayList<>();
    Plugin plugin;
    public Addon(Plugin plugin) {
        this.plugin = plugin;
        blocks.add(new InitBlock(InitArduino.arduino,this));
        blocks.add(new SetPixelColor(InitArduino.arduino,this));
        EventVar.globalEventManager.addListener(new GlobalEventAdapter() {
            @Override
            public void compilingstarted(GlobalCompilingStartEvent e, Compiler compiler) {

            System.out.println("Event");

                if(ProjectManager.getActProjectVar().enabledAddons.contains(((Main) plugin).addon)) {
                    Main.included = false;

                    ArduinoCompiler.installlibery.add("Adafruit Neopixel");
                }


            }
        });


    }
    @Override
    public String getProjectTypebyName() {
        return "Arduino-Projekt";
    }

    @Override
    public de.ft.interitus.utils.ArrayList<PlatformSpecificBlock> getaddBlocks() {
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
