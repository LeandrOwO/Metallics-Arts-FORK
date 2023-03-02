package net.rudahee.metallics_arts.modules.logic.server.server_events;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.rudahee.metallics_arts.data.player.IInvestedPlayerData;
import net.rudahee.metallics_arts.modules.logic.server.server_events.on_world_tick.AllomaticTick;
import net.rudahee.metallics_arts.modules.logic.server.server_events.on_world_tick.OnTickUtils;
import net.rudahee.metallics_arts.utils.MathUtils;


public class OnWorldTickEvent {
    public static int tick = 0;
    public static void onWorldTick(IInvestedPlayerData capability, ServerPlayer player, ServerLevel level)  {

        if (capability.isBurningAnything()) {
            if (MathUtils.isDivisibleBy3(tick)) {
                OnTickUtils.equipKolossBlade(player, capability);
                AllomaticTick.allomanticTick(capability, player, level);
            }
            capability.tickAllomancyBurningMetals(player);
        }

        tick++;
        if (tick == 4800) {
            tick = 0;
        }
    }

    public static int getActualTick() {
        return tick;
    }
}
