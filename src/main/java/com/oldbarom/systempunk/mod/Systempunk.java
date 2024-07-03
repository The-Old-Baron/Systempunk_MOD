package com.oldbarom.systempunk.mod;

import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

@Mod(Systempunk.MODID)
public class Systempunk {
        public static final String MODID = "systempunk";
        public static final Logger LOGGER = LogUtils.getLogger();

        public Systempunk(){
            IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

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
