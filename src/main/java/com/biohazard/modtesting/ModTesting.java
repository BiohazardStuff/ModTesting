package com.biohazard.modtesting;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Biohazard on 7/08/2015.
 */

@Mod(modid = "ModTesting", name = "Mod Testing", version = "1.7.10-1.0")
public class ModTesting {

    @Mod.Instance("ModTesting")
    public static ModTesting instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}