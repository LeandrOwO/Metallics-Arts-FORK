package net.rudahee.metallics_arts.modules.items.metalminds.bands;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;

import top.theillusivec4.curios.api.type.capability.ICurioItem;

public abstract class BandMindAbstract extends Item implements ICurioItem {

    private CompoundNBT nbt;
    private int maxCapacity;

    public BandMindAbstract(Properties properties) {
        super(properties);
    }

    public void storing(String metal, int qty){
        this.nbt.putInt(metal,this.nbt.getInt(metal)+qty);
    }
    public void decanting(String metal, int qty){
        this.nbt.putInt(metal,this.nbt.getInt(metal)-qty);
    }

    public CompoundNBT getNbt() {
        return nbt;
    }

    public void setNbt(CompoundNBT nbt) {
        this.nbt = nbt;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }


}