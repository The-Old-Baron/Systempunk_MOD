package com.oldbarom.systempunk.mod.item;

import com.oldbarom.systempunk.mod.Systempunk;
import com.oldbarom.systempunk.mod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Systempunk.MODID);

    public static final RegistryObject<CreativeModeTab> SYSTEMPUNK_TAB = CREATIVE_MODE_TABS.register("systempunk_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.systempunk"))
                    .displayItems((pParameters, pOutput) -> {
                        //Items
                        //Ores - Cast - Overword
                        pOutput.accept(new ItemStack(ModItems.SAPPHIRE.get()));

                        //Ores - Raw - Overworld
                        pOutput.accept(new ItemStack(ModItems.RAW_SAPPHIRE.get()));

                        //Blocks
                        //Ores - Blocks - Overworld
                        pOutput.accept(new ItemStack(ModBlocks.SAPPHIRE_BLOCK.get()));

                        //Ores - Blocks - Raw - Overworld
                        pOutput.accept(new ItemStack(ModBlocks.RAW_SAPPHIRE_BLOCK.get()));

                                            })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
