package com.roundtrees.roundtreescompanion;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import com.roundtrees.roundtreescompanion.config.CompanionConfig;

public class CompanionMod implements ClientModInitializer {
    public static CompanionConfig CONFIG;
    
    @Override
    public void onInitializeClient() {
        // Initialize configuration
        AutoConfig.register(CompanionConfig.class, JanksonConfigSerializer::new);
        CONFIG = AutoConfig.getConfigHolder(CompanionConfig.class).getConfig();
        
        // Register resource pack
        FabricLoader.getInstance().getModContainer("roundtreescompanion").ifPresent(modContainer -> {
            ResourceManagerHelper.registerBuiltinResourcePack(
                new Identifier("roundtreescompanion", "shifted_ladders"),
                modContainer,
                ResourcePackActivationType.DEFAULT_ENABLED
            );
        });
    }
}
