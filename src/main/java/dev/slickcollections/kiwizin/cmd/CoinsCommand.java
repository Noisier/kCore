package dev.slickcollections.kiwizin.cmd;

import dev.slickcollections.kiwizin.player.Profile;
import dev.slickcollections.kiwizin.utils.StringUtils;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CoinsCommand extends Commands {

    public CoinsCommand() {
        super("coins");
    }

    @Override
    public void perform(CommandSender sender, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Profile profile = Profile.getProfile(player.getName());
            player.sendMessage("\n§eSeus coins:");

            for (String table : new String[] {"kCoreBed Wars", "kCoreMurder", "kCoreThe Bridge", "kCoreSky Wars"}) {
                String name = table.replace("kCore", "");
                player.sendMessage(" §e" + name + "§f: " + StringUtils.formatNumber(profile.getCoins(table.replace(" ", ""))));
            }

            player.sendMessage("\n");
        } else {
            sender.sendMessage("§cApenas jogadores podem utilizar este comando.");
        }
    }
}
