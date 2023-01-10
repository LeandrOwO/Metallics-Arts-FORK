package net.rudahee.metallics_arts.utils.event_utils;

import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.rudahee.metallics_arts.data.enums.implementations.MetalTagEnum;
import net.rudahee.metallics_arts.data.players.IInvestedPlayerData;
import net.rudahee.metallics_arts.utils.CapabilityUtils;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class OnLivingEntityDrop {
    public static void livingEntityDrop(LivingDropsEvent event) {
        /**
            ZINC FERUQUIMICO
         */
        if (event.getSource().getEntity() instanceof Player && !(event.getEntity() instanceof Player)) {

            IInvestedPlayerData capability = CapabilityUtils.getCapability(event.getSource().getEntity());

            if (capability.isDecanting(MetalTagEnum.ZINC)) {
                Collection<ItemEntity> drops = event.getDrops();
                List<ItemEntity> filteredDrops = drops.stream().filter(e -> e.getItem().getItem()!= Items.NETHER_STAR).collect(Collectors.toList());
                event.getDrops().addAll(filteredDrops);

            } else if (capability.isStoring(MetalTagEnum.ZINC)) {
                event.setCanceled(true);
            }
        }
    }
}