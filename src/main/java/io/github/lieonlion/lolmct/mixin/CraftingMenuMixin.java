package io.github.lieonlion.lolmct.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.CraftingMenu;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CraftingTableBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(CraftingMenu.class)
public abstract class CraftingMenuMixin {
    @WrapOperation(method = "stillValid", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/inventory/CraftingMenu;stillValid(Lnet/minecraft/world/inventory/ContainerLevelAccess;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/world/level/block/Block;)Z"))
    private boolean applyMctBlocks(ContainerLevelAccess containerLevelAccess, Player player, Block block, Operation<Boolean> original) {
        return original.call(containerLevelAccess, player, block)
                || containerLevelAccess.evaluate((world, pos) -> world.getBlockState(pos).getBlock() instanceof CraftingTableBlock, true);
    }
}