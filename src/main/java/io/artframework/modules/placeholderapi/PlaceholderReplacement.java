package io.artframework.modules.placeholderapi;

import io.artframework.Replacement;
import io.artframework.impl.ReplacementContext;
import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.entity.Player;

public class PlaceholderReplacement implements Replacement {

    @Override
    public String replace(String input, ReplacementContext replacementContext) {

        return replacementContext.target()
                .filter(target -> target.isTargetType(Player.class))
                .map(target -> (Player) target.source())
                .map(player -> PlaceholderAPI.setPlaceholders(player, input))
                .orElse(input);
    }
}
