package de.ft.neopxiel.NeopixelBlocks.InitBlock;

import com.badlogic.gdx.graphics.Texture;
import de.ft.interitus.loading.AssetLoader;
import de.ft.interitus.projecttypes.Addons.Addon;
import de.ft.interitus.projecttypes.BlockTypes.BlockCategories;
import de.ft.interitus.projecttypes.BlockTypes.PlatformSpecificBlock;
import de.ft.interitus.projecttypes.ProjectType;

public class SetPixelColor extends PlatformSpecificBlock {
    public SetPixelColor(ProjectType projectType, Addon addon) {
        super(projectType, addon);

        super.blockModis.add(new SetPixelColorModi());
        super.blockModis.add(new ShowPixel());
        super.actBlockModiIndex=0;
    }

    @Override
    public String getName() {
        return "NeoPixelControll";
    }

    @Override
    public String getdescription() {
        return "";
    }

    @Override
    public BlockCategories getBlockCategorie() {
        return BlockCategories.ActionBlocks;
    }


    @Override
    public Texture getDescriptionImage() {
        return AssetLoader.setup_description;
    }

    @Override
    public boolean canbedeleted() {
        return true;
    }

    @Override
    public boolean canhasrightconnector() {
        return true;
    }

    @Override
    public boolean canhasleftconnector() {
        return true;
    }
}
