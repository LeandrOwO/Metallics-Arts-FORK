package net.rudahee.metallics_arts.block.alloyfurnace;

import com.google.common.graph.Network;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.DirectionalBlock;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

import javax.annotation.Nullable;


public class ModAlloyFurnaceBlock extends Block {
    public static final DirectionProperty FACING = HorizontalBlock.FACING;

    public ModAlloyFurnaceBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean hasTileEntity (BlockState state){
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new ModAlloyFurnaceTileEntity();
    }

    @SuppressWarnings("deprecation")
    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult rayTrace) {
        if (world.isClientSide){
            return ActionResultType.SUCCESS;
        }
        this.interactiveWith(world, pos, player);
        return ActionResultType.CONSUME;
    }

    private void interactiveWith(World world, BlockPos pos, PlayerEntity player) {
        TileEntity tileEntity = world.getBlockEntity(pos);
        if (tileEntity instanceof ModAlloyFurnaceTileEntity && player instanceof ServerPlayerEntity){
            ModAlloyFurnaceTileEntity te = (ModAlloyFurnaceTileEntity) tileEntity;
            NetworkHooks.openGui((ServerPlayerEntity) player, te, te::encodeExtraData);
        }
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @SuppressWarnings("deprecation")
    @Override
    public void onRemove(BlockState state, World world, BlockPos pos, BlockState newState, boolean isMoving) {
        if (!state.is(newState.getBlock())){
            TileEntity tileEntity = world.getBlockEntity(pos);
            if (tileEntity instanceof IInventory){
                InventoryHelper.dropContents(world, pos, (IInventory) tileEntity);
                world.updateNeighbourForOutputSignal(pos, this);
            }
            super.onRemove(state, world, pos, newState, isMoving);
        }
    }

    @SuppressWarnings("deprecation")
    @Override
    public BlockState rotate (BlockState state, Rotation rot){
        return state.setValue(FACING,rot.rotate(state.getValue(FACING)));
    }



    @SuppressWarnings("deprecation")
    @Override
    public BlockState mirror (BlockState state, Mirror mirrorIn){
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }

    @SuppressWarnings("deprecation")
    @Override
    protected void fillStateConteiner (StateContainer.Builder<Block, BlockState> bluilder){
        bluilder.add(FACING);
    }


}
