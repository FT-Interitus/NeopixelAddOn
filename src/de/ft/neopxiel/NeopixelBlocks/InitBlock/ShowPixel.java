package de.ft.neopxiel.NeopixelBlocks.InitBlock;

import com.badlogic.gdx.graphics.Texture;
import de.ft.interitus.Block.Parameter;
import de.ft.interitus.loading.AssetLoader;
import de.ft.interitus.projecttypes.BlockTypes.BlockSettings;
import de.ft.interitus.projecttypes.BlockTypes.Interitus.Arduino.ArduinoBlock;
import de.ft.interitus.utils.ArrayList;


public class ShowPixel extends ArduinoBlock {
    ArrayList<Parameter> parameters = new ArrayList<>();


   // Parameter Name; //todo multiple instances

    public ShowPixel() {


        //parameters.add(Name); todo multiple instances
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
        return 75;
    }

    @Override
    public String getname() {
        return "ShowPixel";
    }

    @Override
    public Texture getModiImage() {
        return AssetLoader.Parameter_IO;
    }

    @Override
    public String getCode() {

        return "pixels.show();";

    }

    @Override
    public String getHeaderCode(boolean inserted) {
     return null;
    }
}
