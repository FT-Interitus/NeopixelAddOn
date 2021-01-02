package de.ft.neopxiel.NeopixelBlocks.InitBlock;

import com.badlogic.gdx.graphics.Texture;
import de.ft.interitus.loading.AssetLoader;
import de.ft.interitus.projecttypes.Addons.Addon;
import de.ft.interitus.projecttypes.BlockTypes.BlockCategories;
import de.ft.interitus.projecttypes.BlockTypes.PlatformSpecificBlock;
import de.ft.interitus.projecttypes.ProjectType;

import java.awt.*;

public class InitBlock extends PlatformSpecificBlock {
    public InitBlock(ProjectType projectType, Addon addon) {
        super(projectType, addon);

        super.blockModis.add(new InitBlockModi());
        super.actBlockModiIndex=0;
    }

    @Override
    public String getName() {
        return "NeopixelInitBlock";
    }

    @Override
    public String getDescription() {
        return "Dieser Block initialisiert neopixel";
    }



    @Override
    public BlockCategories getBlockCategory() {
        return BlockCategories.ActionBlocks;
    }


    @Override
    public Texture getDescriptionImage() {
        return AssetLoader.arduinonanoimage;
    }

    @Override
    public boolean isDeletable() {
        return true;
    }

    @Override
    public boolean canHasRightConnector() {
        return true;
    }

    @Override
    public boolean canHasLeftConnector() {
        return true;
    }


}
