package org.fenixteam.fenix.paper.plugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.fenixteam.fenix.inject.binder.ProtectedBinder;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
public class InjectedPlugin extends JavaPlugin {
  public void configure(final @NotNull ProtectedBinder binder) {
    // Override this method to configure the plugin
  }
}
