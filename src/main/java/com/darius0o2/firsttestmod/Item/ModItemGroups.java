package com.darius0o2.firsttestmod.Item;

import com.darius0o2.firsttestmod.FirstTestMod;
import com.darius0o2.firsttestmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    //Create a custom Item Group
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FirstTestMod.MOD_ID,"ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);
                        entries.add(ModBlocks.END_STONE_RUBY_ORE);

                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);

                        entries.add(ModItems.RUBY);
                        entries.add(ModBlocks.RUBY_BLOCK);

                        entries.add(ModItems.METAL_DETECTOR);
                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.COAL_BRIQUETTE);

                        entries.add((ModBlocks.SOUND_BLOCK));
                    }).build());

    public static void registerItemGroups(){
        FirstTestMod.LOGGER.info("Registering Item Groups for "+ FirstTestMod.MOD_ID);
    }
}
