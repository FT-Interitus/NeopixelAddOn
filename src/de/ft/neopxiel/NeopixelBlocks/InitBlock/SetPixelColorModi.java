package de.ft.neopxiel.NeopixelBlocks.InitBlock;

import com.badlogic.gdx.graphics.Texture;
import de.ft.interitus.Block.Parameter;
import de.ft.interitus.Block.ParameterType;
import de.ft.interitus.loading.AssetLoader;

import de.ft.interitus.projecttypes.BlockTypes.BlockSettings;
import de.ft.interitus.projecttypes.BlockTypes.Interitus.Arduino.ArduinoBlock;
import de.ft.interitus.projecttypes.BlockTypes.Interitus.Arduino.InitArduino;
import de.ft.interitus.utils.ArrayList;
import de.ft.neopxiel.Main;


public class SetPixelColorModi extends ArduinoBlock {
    ArrayList<Parameter> parameters = new ArrayList<>();
    Parameter pixel;
    Parameter color_r;
    Parameter color_g;
    Parameter color_b;

   // Parameter Name; //todo multiple instances

    public SetPixelColorModi() {

        pixel = new Parameter("",AssetLoader.Parameter_Pin,"Pixel","","",new ParameterType(InitArduino.floatvar,false,false),true);
        color_r = new Parameter("",AssetLoader.Parameter_Pin,"Rot","","",new ParameterType(InitArduino.floatvar,false,false),true);
        color_g = new Parameter("",AssetLoader.Parameter_Pin,"Grün","","",new ParameterType(InitArduino.floatvar,false,false),true);
        color_b = new Parameter("",AssetLoader.Parameter_Pin,"Blau","","",new ParameterType(InitArduino.floatvar,false,false),true);


        parameters.add(pixel);
        parameters.add(color_r);
        parameters.add(color_g);
        parameters.add(color_b);
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
        return 175;
    }

    @Override
    public String getname() {
        return "SetPixelColor";
    }

    @Override
    public Texture getModiImage() {
        return AssetLoader.Parameter_IO;
    }

    @Override
    public String getCode() {
        return " pixels.setPixelColor("+pixel.getParameter()+", pixels.Color("+color_r.getParameter()+", "+color_g.getParameter()+", "+color_b.getParameter()+"));";
    }

    @Override
    public String getHeaderCode(boolean inserted) {
     return null;
    }
}
