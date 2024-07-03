package com.oldbarom.systempunk.mod;

import com.mojang.logging.LogUtils;
import com.oldbarom.systempunk.mod.block.ModBlocks;
import com.oldbarom.systempunk.mod.block.entity.ModBlockEntities;
import com.oldbarom.systempunk.mod.entity.ModEntities;
import com.oldbarom.systempunk.mod.item.ModCreativeModTabs;
import com.oldbarom.systempunk.mod.item.ModItems;
import com.oldbarom.systempunk.mod.loot.ModLootModifiers;
import com.oldbarom.systempunk.mod.recipe.ModRecipes;
import com.oldbarom.systempunk.mod.screen.ModMenuTypes;
import com.oldbarom.systempunk.mod.sound.ModSounds;
import com.oldbarom.systempunk.mod.tree.ModFoliagePlacers;
import com.oldbarom.systempunk.mod.tree.ModTrunkPlacerTypes;
import com.oldbarom.systempunk.mod.villager.ModVillagers;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Systempunk.MODID)
public class Systempunk {
        public static final String MODID = "systempunk";
        public static final Logger LOGGER = LogUtils.getLogger();

        public Systempunk(){
            IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

            ModCreativeModTabs.register(modEventBus);

            ModItems.register(modEventBus);
            ModBlocks.register(modEventBus);
            ModLootModifiers.register(modEventBus);
            ModVillagers.register(modEventBus);
            ModSounds.register(modEventBus);
            ModEntities.register(modEventBus);
            ModBlockEntities.register(modEventBus);
            ModMenuTypes.register(modEventBus);
            ModRecipes.register(modEventBus);
            ModTrunkPlacerTypes.register(modEventBus);
            ModFoliagePlacers.register(modEventBus);

            modEventBus.addListener(this::commonSetup);
            MinecraftForge.EVENT_BUS.register(this);
            modEventBus.addListener(this::addCreative);


        }

        private void commonSetup(final FMLCommonSetupEvent event){
            LOGGER.info("COMMON SETUP");
        }

        private void addCreative(final BuildCreativeModeTabContentsEvent event){
            LOGGER.info("CREATIVE SETUP");
        }
}
