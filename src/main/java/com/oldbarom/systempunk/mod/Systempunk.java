package com.oldbarom.systempunk.mod;

import com.oldbarom.systempunk.mod.Config;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

@Mod(Systempunk.MODID)
public class Systempunk {
        public static final String MODID = "systempunk";
        private static final Logger LOGGER = LogUtils.getLogger();
        public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
        public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

        public Systempunk(){
            IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
            modEventBus.addListener(this::commonSetup);

            BLOCKS.register(modEventBus);
            ITEMS.register(modEventBus);
            CREATIVE_MODE_TABS.register(modEventBus);

            MinecraftForge.EVENT_BUS.register(this);

            modEventBus.addListener(this::addCreative);
            ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
        }

        private void commonSetup(final FMLCommonSetupEvent event){
            LOGGER.info("COMMON SETUP");

            Config.items.forEach(item -> LOGGER.info("Found item: {}", item.toString()));
        }

        private void addCreative(final BuildCreativeModeTabContentsEvent event){
            LOGGER.info("CREATIVE SETUP");
        }
}
