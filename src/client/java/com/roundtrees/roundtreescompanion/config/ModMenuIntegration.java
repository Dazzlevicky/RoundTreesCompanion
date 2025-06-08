package com.roundtrees.roundtreescompanion.config;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import me.shedaniel.autoconfig.AutoConfig;
// TODO: Extend BaseModMenuIntegration when Libra is available
// import com.roundtrees.shared.integration.BaseModMenuIntegration;

public class ModMenuIntegration implements ModMenuApi {
    
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return parent -> AutoConfig.getConfigScreen(CompanionConfig.class, parent).get();
    }
    
    // TODO: When Libra is available, use this instead:
    // @Override
    // protected Class<? extends ConfigData> getConfigClass() {
    //     return CompanionConfig.class;
    // }
}
