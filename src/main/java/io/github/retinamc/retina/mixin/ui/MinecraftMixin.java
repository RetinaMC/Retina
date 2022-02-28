package io.github.retinamc.retina.mixin.ui;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(Minecraft.class)
public class MinecraftMixin {

	/*
	 * This mixin is for changing the window title prefix from "Minecraft* <version>" to "Retina Client * <version>"
	 */
	@ModifyArg(method = "createTitle", at = @At(value = "INVOKE", target = "Ljava/lang/StringBuilder;<init>(Ljava/lang/String;)V"))
	public String retina$createTitle(String str) {
		return "Retina Client ";
	}
}