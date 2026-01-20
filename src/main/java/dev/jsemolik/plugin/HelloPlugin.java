package dev.jsemolik.plugin;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

public class HelloPlugin extends JavaPlugin {

    public HelloPlugin(@NonNullDecl JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setip() {
        super.setup();
    }
}
