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



public class InitBlockModi extends ArduinoBlock {
    ArrayList<Parameter> parameters = new ArrayList<>();
    Parameter pin;
    Parameter Numpixel;
   // Parameter Name; //todo multiple instances

    public InitBlockModi() {

        pin = new Parameter("",AssetLoader.Parameter_Pin,"Pin","","",new ParameterType(InitArduino.floatvar,false),true);
        Numpixel = new Parameter("",AssetLoader.Parameter_IO,"Anzahl","","",new ParameterType(InitArduino.floatvar,false),true);


        parameters.add(pin);
        parameters.add(Numpixel);
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
        return "InitModi";
    }

    @Override
    public Texture getModiImage() {
        return AssetLoader.img_startbutton_mouseover;
    }

    @Override
    public String getCode() {
        return "pixels.begin();";
    }

    @Override
    public String getHeaderCode(boolean inserted) {
        System.out.println("Included: "+ Main.included);
        System.out.println("Inserted: "+inserted);
        if (!Main.included||!inserted) {
            if(inserted) {
                Main.included = true;
            }
            return "#include <Adafruit_NeoPixel.h>\n"+ "#ifdef __AVR__\n"+ "#include <avr/power.h>\n" + "#endif\n"+ " #define PIN    " + pin.getParameter() + "\n#define NUMPIXELS " + Numpixel.getParameter() + "\nAdafruit_NeoPixel pixels(NUMPIXELS, PIN, NEO_GRB + NEO_KHZ800);";
        } else {
            return null;
        }
    }
}
