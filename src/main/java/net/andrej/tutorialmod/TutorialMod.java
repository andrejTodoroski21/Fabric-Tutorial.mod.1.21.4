package net.andrej.tutorialmod;

import net.andrej.tutorialmod.Item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String Mod_ID = "tutorial-mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(Mod_ID);

	@Override
	public void onInitialize() {
		ModItems.registeredModItems();

	}
}