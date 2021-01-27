package io.artframework.modules.placeholderapi;

import io.artframework.Scope;
import io.artframework.annotations.ArtModule;
import io.artframework.annotations.OnDisable;
import io.artframework.annotations.OnLoad;
import kr.entree.spigradle.annotations.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

@Plugin
@ArtModule("art-placeholderapi")
public class ArtPlaceholderApiPlugin extends JavaPlugin {
    
    private PlaceholderReplacement replacement;

    @OnLoad
    public void onLoad(Scope scope) {

        replacement = new PlaceholderReplacement();
        scope.configuration().replacements().add(replacement);
    }

    @OnDisable
    public void onDisable(Scope scope) {

        scope.configuration().replacements().remove(replacement);
    }
}
