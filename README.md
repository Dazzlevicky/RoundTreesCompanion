# Round Trees Companion

A Minecraft Fabric mod that prevents z-fighting between wall signs, ladders, and round tree texture packs by subtly shifting them forward when placed on logs.

## Features

- **Wall Sign Compatibility**: Automatically shifts wall signs forward by 1/16 block when placed on any log block
- **Ladder Compatibility**: Shifts ladder models forward to prevent visual clipping with round tree textures
- **Seamless Integration**: Works automatically without configuration - just install and play
- **Texture Pack Agnostic**: Compatible with any round tree texture pack

## Compatibility

- **Minecraft**: 1.20.0 - 1.21.4
- **Mod Loader**: Fabric Loader 0.14.0+
- **Dependencies**: Fabric API 0.83.0+

## Installation

1. Install [Fabric Loader](https://fabricmc.net/use/installer/) for your Minecraft version
2. Download [Fabric API](https://modrinth.com/mod/fabric-api) and place it in your mods folder
3. Download Round Trees Companion from [Modrinth](https://modrinth.com/mod/round-trees-companion) and place it in your mods folder
4. Launch Minecraft with the Fabric profile

## How It Works

### Wall Signs
The mod uses a client-side mixin to detect when wall signs are placed on log blocks and automatically translates their rendering position forward by 1/16 block (1 pixel). This prevents the sign from appearing to "sink into" round tree textures.

### Ladders
The mod includes a resource pack that overrides the default ladder model, shifting it from z=15.2 to z=13.8. This subtle change prevents ladders from z-fighting with round tree bark textures.

## Technical Details

- **Wall Signs**: Implemented via `SignBlockEntityRendererMixin` that checks for log blocks behind wall signs
- **Ladders**: Uses built-in resource pack with modified `ladder.json` model
- **Performance**: Minimal performance impact - only processes wall signs and uses vanilla model overrides for ladders

## Supported Blocks

### Logs (Auto-detected via BlockTags.LOGS)
- Oak Log
- Spruce Log  
- Birch Log
- Jungle Log
- Acacia Log
- Dark Oak Log
- Mangrove Log
- Cherry Log
- Crimson Stem
- Warped Stem
- And any modded logs that use the `#minecraft:logs` tag

### Signs
- All vanilla wall sign variants (oak, spruce, birch, jungle, acacia, dark oak, mangrove, cherry, crimson, warped)
- Compatible with modded wall signs that extend `WallSignBlock`

## FAQ

**Q: Will this affect signs placed on other blocks?**  
A: No, the mod only shifts signs when they're placed specifically on log blocks.

**Q: Is this compatible with other sign mods?**  
A: Yes, as long as they extend the vanilla `WallSignBlock` class.

**Q: Does this work in multiplayer?**  
A: Yes, this is a client-side only mod that works on any server.

**Q: Will this break my existing signs?**  
A: No, existing signs will automatically benefit from the fix without any changes needed.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Issues & Support

Found a bug or have a suggestion? Please open an issue on the [GitHub repository](https://github.com/james23943/RoundTreesCompanion).
