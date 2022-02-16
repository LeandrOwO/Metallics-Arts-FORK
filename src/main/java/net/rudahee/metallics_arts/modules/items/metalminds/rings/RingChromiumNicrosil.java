package net.rudahee.metallics_arts.modules.items.metalminds.rings;

import net.minecraft.nbt.CompoundNBT;
import net.rudahee.metallics_arts.MetallicsArts;

public class RingChromiumNicrosil extends RingsMindAbstract{
    CompoundNBT nbt = new CompoundNBT();
    public RingChromiumNicrosil(Properties properties){
        super(properties);
        nbt.putInt(MetallicsArts.MOD_ID+".RingChromiumNicrosil.chromium",0);
        nbt.putInt(MetallicsArts.MOD_ID+".RingChromiumNicrosil.nicrosil",0);
        nbt.putInt(MetallicsArts.MOD_ID+".RingChromiumNicrosil.capacityChromium",100);
        nbt.putInt(MetallicsArts.MOD_ID+".RingChromiumNicrosil.capacityNicrosil",100);
        setNbt(nbt);
    }
}