package com.oldbarom.systempunk.mod.tree;

import com.oldbarom.systempunk.mod.Systempunk;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModTrunkPlacerTypes {
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACER =
            DeferredRegister.create(Registries.TRUNK_PLACER_TYPE, Systempunk.MODID);

    public static void register(IEventBus eventBus) {
        TRUNK_PLACER.register(eventBus);
    }
}
