package fluff.fluffsstuff.block.custom;

import fluff.fluffsstuff.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;

public class CannabisCropBlock extends CropBlock
{
    public static final int MAX_AGE = 5;
    public static final IntProperty AGE = Properties.AGE_5;

    public CannabisCropBlock(Settings settings) {
        super(settings);
    }


    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.CANNABIS_SEEDS;
    }

    @Override
    protected IntProperty getAgeProperty() {
        return AGE;
    }
    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder)
    {
        builder.add(AGE);
    }
}
