package net.rudahee.metallics_arts.modules.items.metalminds.bands;

import net.minecraft.item.Item;
import net.minecraft.nbt.CompoundNBT;
import net.rudahee.metallics_arts.MetallicsArts;
import net.rudahee.metallics_arts.setup.enums.extras.MetalsNBTData;

public class BandCopperBronze extends BandMindAbstract {
    CompoundNBT nbt = new CompoundNBT();
    public BandCopperBronze(Item.Properties properties){
        super(properties, MetalsNBTData.COPPER,MetalsNBTData.BRONZE);
        nbt.putInt(MetallicsArts.MOD_ID+".BandCopperBronze.copper",0);
        nbt.putInt(MetallicsArts.MOD_ID+".BandCopperBronze.bronze",0);
        nbt.putInt(MetallicsArts.MOD_ID+".BandCopperBronze.capacityCopper",100);
        nbt.putInt(MetallicsArts.MOD_ID+".BandCopperBronze.capacityBronze",100);
        setNbt(nbt);
    }
}