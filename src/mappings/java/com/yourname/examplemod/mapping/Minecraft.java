package com.yourname.examplemod.mapping;

import me.xtrm.atlas.annotations.mapping.Map;
import me.xtrm.atlas.annotations.mapping.Modifiers;

import java.lang.reflect.Modifier;

/**
 * Work in progress
 *
 * @see Map
 */
@Map("net/minecraft/client/Minecraft")
public interface Minecraft {
	@Map("getMinecraft")
	@Modifiers(Modifier.STATIC)
	Minecraft getMinecraft();

	@Map("runTask(Ljava/lang/Runnable;)V")
	void runTask(Runnable runnable);
}
