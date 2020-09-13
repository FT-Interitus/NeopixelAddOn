package de.ft.neopxiel.NeopixelBlocks.InitBlock;

import com.badlogic.gdx.graphics.Texture;
import de.ft.interitus.Block.Parameter;
import de.ft.interitus.loading.AssetLoader;
import de.ft.interitus.projecttypes.BlockTypes.BlockModi;
import de.ft.interitus.projecttypes.BlockTypes.BlockSettings;
import de.ft.interitus.projecttypes.BlockTypes.Interitus.Arduino.ArduinoBlock;
import de.ft.interitus.utils.ArrayList;


public class InitBlockModi implements BlockModi, ArduinoBlock {
    ArrayList<Parameter>parameters=new ArrayList<>();
    Parameter pin;
    Parameter Numpixel;
    Parameter Name;
    public InitBlockModi(){
        parameters.add(pin);
        parameters.add(Numpixel);
        parameters.add(Name);
    }
    @Override
    public ArrayList<Parameter> getBlockParameter() {

        return parameters;
    }

    @Override
    public BlockSettings getblocksettings() {
        return null;
    }

    @Override
    public int getWidth() {
        return 100;
    }

    @Override
    public String getname() {
        return "InitModi";
    }

    @Override
    public Texture getModiImage() {
        return AssetLoader.img_startbutton_mouseover;
    }

    @Override
    public String getCode() {
        return "";
    }
}
