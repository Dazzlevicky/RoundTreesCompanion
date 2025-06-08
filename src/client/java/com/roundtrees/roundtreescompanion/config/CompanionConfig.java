package com.roundtrees.roundtreescompanion.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
// TODO: Use BaseConfig when Libra is available
// import com.roundtrees.shared.config.BaseConfig;

@Config(name = "roundtreescompanion")
public class CompanionConfig implements ConfigData {
    
    @ConfigEntry.Gui.CollapsibleObject
    public SignConfig signs = new SignConfig();
    
    @ConfigEntry.Gui.CollapsibleObject  
    public LadderConfig ladders = new LadderConfig();
    
    @ConfigEntry.Gui.CollapsibleObject
    public AdvancedConfig advanced = new AdvancedConfig();
    
    public static class SignConfig {
        @ConfigEntry.Gui.Tooltip(count = 2)
        public boolean enableSignShifting = true;
        
        @ConfigEntry.BoundedDiscrete(min = 1, max = 16)
        @ConfigEntry.Gui.Tooltip(count = 2)
        public int shiftDistancePixels = 1; // 1/16 blocks
        
        @ConfigEntry.Gui.Tooltip(count = 2)
        public boolean onlyOnLogs = true;
        
        @ConfigEntry.Gui.Tooltip(count = 1)
        public boolean enableDebugLogging = false;
        
        @ConfigEntry.Gui.Tooltip(count = 2)
        public boolean enableForAllWoodTypes = true;
        
        @ConfigEntry.Gui.Tooltip(count = 2)
        public boolean enableForStrippedLogs = true;
        
        @ConfigEntry.Gui.Tooltip(count = 2)
        public boolean enableForCustomLogs = true;
        
        /**
         * Get the shift distance in block units
         * @return The shift distance (0.0625 - 1.0)
         */
        public double getShiftDistance() {
            return shiftDistancePixels / 16.0;
        }
    }
    
    public static class LadderConfig {
        @ConfigEntry.Gui.Tooltip(count = 2)
        public boolean enableLadderShifting = true;
        
        @ConfigEntry.BoundedDiscrete(min = 120, max = 152)
        @ConfigEntry.Gui.Tooltip(count = 2)
        public int ladderZPosition = 138; // 13.8 * 10 for precision
        
        @ConfigEntry.Gui.Tooltip(count = 2)
        public boolean dynamicLadderAdjustment = false;
        
        @ConfigEntry.BoundedDiscrete(min = 1, max = 10)
        @ConfigEntry.Gui.Tooltip(count = 2)
        public int ladderDepthSensitivity = 5;
        
        /**
         * Get the ladder Z position as a double
         * @return The Z position (12.0 - 15.2)
         */
        public double getLadderZPosition() {
            return ladderZPosition / 10.0;
        }
    }
    
    public static class AdvancedConfig {
        @ConfigEntry.Gui.Tooltip(count = 2)
        public boolean enablePerformanceOptimizations = true;
        
        @ConfigEntry.Gui.Tooltip(count = 2)
        public boolean enableBiomeSpecificSettings = false;
        
        @ConfigEntry.BoundedDiscrete(min = 1, max = 100)
        @ConfigEntry.Gui.Tooltip(count = 2)
        public int updateFrequency = 10; // Ticks between updates
        
        @ConfigEntry.Gui.Tooltip(count = 2)
        public boolean enableCompatibilityMode = false;
        
        @ConfigEntry.Gui.Tooltip(count = 1)
        public boolean enableTelemetry = false;
    }
}
