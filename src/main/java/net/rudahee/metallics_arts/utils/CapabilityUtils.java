package net.rudahee.metallics_arts.utils;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.AABB;
import net.rudahee.metallics_arts.data.enums.implementations.MetalTagEnum;
import net.rudahee.metallics_arts.data.player.IInvestedPlayerData;
import net.rudahee.metallics_arts.modules.error_handling.exceptions.PlayerException;
import net.rudahee.metallics_arts.modules.error_handling.messages.ErrorTypes;
import net.rudahee.metallics_arts.setup.registries.ModBlocksRegister;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Collection of useful statics methods to manage our player capabilities.
 *
 * @author SteelCode Team
 * @since 1.5.1
 */
public class CapabilityUtils<T> {

    private static IInvestedPlayerData playerData;

    /**
     * Useful method to extract capabilities (data) from target ServerPlayer passed by parameter.
     *
     * @param player ServerPlayer from whom we are going to extract the capabilities.
     *
     * @return IInvestedPlayerData data extracted from target ServerPlayer
     *
     * @see IInvestedPlayerData
     */
    public static IInvestedPlayerData getCapability(@Nullable ServerPlayer player) throws PlayerException {

        playerData = null;

        if (player == null) {
            throw new PlayerException(ErrorTypes.PLAYER_ERROR);
        }

        // if player is present and has capabilities, we return capabilities, else, return null.
        player.getCapability(ModBlocksRegister.InvestedCapabilityRegister.PLAYER_CAP).ifPresent(playerCapability -> playerData = playerCapability);

        return playerData;
    }

    /**
     * Useful method to extract capabilities (data) from target local Player passed by parameter.
     *
     * @param player local from whom we are going to extract the capabilities.
     *
     * @return IInvestedPlayerData data extracted from target Player.
     *
     * @see IInvestedPlayerData
     */
    public static IInvestedPlayerData getCapability(@Nullable Player player) throws PlayerException {
        playerData = null;
        if (player == null) {
            throw new PlayerException(ErrorTypes.PLAYER_ERROR);
        }
        // if player is present and has capabilities, we return capabilities, else, return null.
        player.getCapability(ModBlocksRegister.InvestedCapabilityRegister.PLAYER_CAP).ifPresent(playerCapability -> playerData = playerCapability);
        return playerData;
    }

    public static IInvestedPlayerData getCapability(@Nullable Entity entity) throws PlayerException {
        playerData = null;
        if (entity == null) {
            throw new PlayerException(ErrorTypes.PLAYER_ERROR);
        }

        entity.getCapability(ModBlocksRegister.InvestedCapabilityRegister.PLAYER_CAP).ifPresent(playerCapability -> playerData = playerCapability);
        return playerData;
    }


    public static AABB getBubble (Player player, int radius) {
        return new AABB(
                new BlockPos(player.position()).offset(-radius, -radius, -radius),
                new BlockPos(player.position()).offset(radius, radius, radius));
    }

    public HashMap<MetalTagEnum, T> fillMetalTagMap(T defaultValue) {
        HashMap<MetalTagEnum, T> map = new HashMap<>();

        for (MetalTagEnum metal: MetalTagEnum.values()) {
            map.put(metal, defaultValue);
        }

        return map;
    }

    public ArrayList<T> fillListWithDefaultValue(T defaultValue, int qty) {
        ArrayList<T> list = new ArrayList<>();
        for (int i = 0; i<qty; i++) {
            list.add(defaultValue);
        }

        return list;
    }
}
