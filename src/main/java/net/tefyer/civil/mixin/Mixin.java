package net.tefyer.civil.mixin;


import net.minecraft.client.gui.screen.TitleScreen;
import net.tefyer.civil.MainMod;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@org.spongepowered.asm.mixin.Mixin(TitleScreen.class)
public class Mixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		MainMod.LOGGER.info("This line is printed by an Tefyer mod mixin!");
	}
}
