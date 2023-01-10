package net.rudahee.metallics_arts.modules.custom_items.metal_minds.bands;


import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.rudahee.metallics_arts.data.enums.implementations.MetalTagEnum;
import net.rudahee.metallics_arts.data.players.IInvestedPlayerData;
import net.rudahee.metallics_arts.modules.custom_items.metal_minds.BandMindAbstract;
import net.rudahee.metallics_arts.modules.logic.server.powers.feruchemy.AtiumFecuchemicHelper;
import net.rudahee.metallics_arts.modules.logic.server.powers.feruchemy.EttmetalFecuchemicHelper;
import net.rudahee.metallics_arts.modules.logic.server.powers.feruchemy.LerasiumFecuchemicHelper;
import net.rudahee.metallics_arts.modules.logic.server.powers.feruchemy.MalatiumFecuchemicHelper;
import net.rudahee.metallics_arts.setup.network.ModNetwork;
import net.rudahee.metallics_arts.setup.registries.ModBlocksRegister;
import top.theillusivec4.curios.api.SlotContext;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BandLerasiumEttmetal extends BandMindAbstract <LerasiumFecuchemicHelper, EttmetalFecuchemicHelper> {

    public BandLerasiumEttmetal (Item.Properties properties){
        super(properties, MetalTagEnum.LERASIUM, MetalTagEnum.ETTMETAL, LerasiumFecuchemicHelper.getInstance(), EttmetalFecuchemicHelper.getInstance());
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> toolTips, TooltipFlag flagIn) {
        if (stack.hasTag()) {
            if (stack.getTag().getInt(getMetals(0).getNameLower()+"_feruchemic_reserve")>0) {
                toolTips.add(Component.translatable("metallics_arts.metal_translate."+getMetals(0).getNameLower()).append(": ").append(Component.translatable("metallics_arts.mental_mind_translate.has_reserve")));
            } else {
                toolTips.add(Component.translatable("metallics_arts.metal_translate."+getMetals(0).getNameLower()).append(": ").append(Component.translatable("metallics_arts.mental_mind_translate.not_has_reserve")));
            }
            if (!Screen.hasShiftDown()){
                toolTips.add(Component.translatable("metallics_arts.metal_translate."+getMetals(1).getNameLower()).append(": "+(stack.getTag().getInt(getMetals(1).getNameLower()+"_feruchemic_reserve")/41)));
                if (world != null) {
                    toolTips.add(Component.translatable("metallics_arts.mental_mind.owner").append(": "+ ((stack.getTag().getString("key").equals("Nobody")) ? Component.translatable("metallics_arts.mental_mind.nobody").getString() : (world.getPlayerByUUID(UUID.fromString((stack.getTag().getString("key")))) == null) ? Component.translatable("metallics_arts.mental_mind.owner_someone") : world.getPlayerByUUID(UUID.fromString((stack.getTag().getString("key")))).getName().getString())));
                }
                toolTips.add(Component.translatable(" "));
                toolTips.add(Component.translatable("metallics_arts.mental_mind_translate.shift_info").withStyle(ChatFormatting.BLUE));

            } else {
                toolTips.add(Component.translatable("metallics_arts.metal_translate."+getMetals(1).getNameLower()).append(": "+ ((stack.getTag().getInt(getMetals(1).getNameLower()+"_feruchemic_reserve") * 100)/stack.getTag().getInt(getMetals(1).getNameLower()+"_feruchemic_max_capacity"))+"%"));
                if (world != null) {
                    toolTips.add(Component.translatable("metallics_arts.mental_mind.owner").append(": "+ ((stack.getTag().getString("key").equals("Nobody")) ? Component.translatable("metallics_arts.mental_mind.nobody").getString() : (world.getPlayerByUUID(UUID.fromString((stack.getTag().getString("key")))) == null) ? Component.translatable("metallics_arts.mental_mind.owner_someone") : world.getPlayerByUUID(UUID.fromString((stack.getTag().getString("key")))).getName().getString())));
                }
                toolTips.add(Component.translatable("-------------------"));
                for (MetalTagEnum metal : MetalTagEnum.values()){
                    if(stack.getTag().getInt(metal.getNameLower()+"inLerasiumBand")>0){
                        toolTips.add(Component.translatable(" * ").append(Component.translatable("metallics_arts.metal_translate."+metal.getNameLower())).append(": "+stack.getTag().getInt(metal.getNameLower()+"inLerasiumBand")));
                    }
                }
            }

        }
        super.appendHoverText(stack, world, toolTips, flagIn);
    }
}