package net.rudahee.metallics_arts.setup.vial;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.rudahee.metallics_arts.MetallicsArts;

public interface IVialRecipe extends IRecipe<IInventory>{
    ResourceLocation TYPE_ID = new ResourceLocation(MetallicsArts.MOD_ID, "vial");

    @Override
    default IRecipeType<?> getType(){
        return Registry.RECIPE_TYPE.get(TYPE_ID);
    }

    @Override
    default boolean canCraftInDimensions(int width, int height) {
        return true;
    }

    @Override
    default boolean isSpecial(){
        return true;
    }
}