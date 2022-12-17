package com.yourname.examplemod.facade;

import me.xtrm.atlas.annotations.facade.Facade;
import me.xtrm.atlas.annotations.facade.Modifiers;

import java.lang.reflect.Modifier;

/**
 * Work in progress
 *
 * @see Facade
 */
@Facade("net/minecraft/client/Minecraft")
public interface Minecraft {
	@Facade("getMinecraft")
	@Modifiers(Modifier.STATIC)
	Minecraft getMinecraft();

	@Facade("runTask(Ljava/lang/Runnable;)V")
	void runTask(Runnable runnable);
}
