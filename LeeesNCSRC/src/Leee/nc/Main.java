package Leee.nc;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(this, this);
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.YELLOW + "LeeesNC " + ChatColor.DARK_AQUA + "You must join the server to use this command");
            return false;
        } else {
            Player player = (Player)sender;
            if (cmd.getName().equalsIgnoreCase("nc") && args.length != 0) {
                if (player.hasPermission("Leee.nc")) {
                    if (args[0].equals("red")) {
                        player.setDisplayName(ChatColor.RED + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), ChatColor.RED + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage(ChatColor.RED + "Your name is now red");
                        return true;
                    } else if (args[0].equals("dark-red")) {
                        player.setDisplayName(ChatColor.DARK_RED + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), ChatColor.DARK_RED + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage(ChatColor.DARK_RED + "Your name is now dark red");
                        return true;
                    } else if (args[0].equals("green")) {
                        player.setDisplayName(ChatColor.GREEN + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), ChatColor.GREEN + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage(ChatColor.GREEN + "Your name is now green");
                        return true;
                    } else if (args[0].equals("dark-green")) {
                        player.setDisplayName(ChatColor.DARK_GREEN + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), ChatColor.DARK_GREEN + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage(ChatColor.DARK_GREEN + "Your name is now dark green");
                        return true;
                    } else if (args[0].equals("blue")) {
                        player.setDisplayName(ChatColor.BLUE + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), ChatColor.BLUE + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage(ChatColor.BLUE + "Your name is now blue");
                        return true;
                    } else if (args[0].equals("dark-blue")) {
                        player.setDisplayName(ChatColor.DARK_BLUE + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), ChatColor.DARK_BLUE + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage(ChatColor.DARK_BLUE + "Your name is now dark blue");
                        return true;
                    } else if (args[0].equals("pink")) {
                        player.setDisplayName(ChatColor.LIGHT_PURPLE + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), ChatColor.LIGHT_PURPLE + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage(ChatColor.LIGHT_PURPLE + "Your name is now pink");
                        return true;
                    } else if (args[0].equals("white")) {
                        player.setDisplayName(ChatColor.WHITE + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), ChatColor.WHITE + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage(ChatColor.WHITE + "Your name is now white");
                        return true;
                    } else if (args[0].equals("gray")) {
                        player.setDisplayName(ChatColor.DARK_GRAY + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), ChatColor.DARK_GRAY + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage(ChatColor.DARK_GRAY + "Your name is now gray");
                        return true;
                    } else if (args[0].equals("gold")) {
                        player.setDisplayName(ChatColor.GOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), ChatColor.GOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage(ChatColor.GOLD + "Your name is now gold");
                        return true;
                    } else if (args[0].equals("purple")) {
                        player.setDisplayName(ChatColor.DARK_PURPLE + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), ChatColor.DARK_PURPLE + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage(ChatColor.DARK_PURPLE + "Your name is now purple");
                        return true;
                    } else if (args[0].equals("aqua")) {
                        player.setDisplayName(ChatColor.AQUA + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), ChatColor.AQUA + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage(ChatColor.AQUA + "Your name is now aqua");
                        return true;
                    } else if (args[0].equals("yellow")) {
                        player.setDisplayName(ChatColor.YELLOW + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), ChatColor.YELLOW + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage(ChatColor.YELLOW + "Your name is now yellow");
                        return true;
                    } else if (args[0].equals("bold-white")) {
                        player.setDisplayName(ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage(ChatColor.BOLD + "Your name is now bold white");
                        return true;
                    } else if (args[0].equals("dark-aqua")) {
                        player.setDisplayName(ChatColor.DARK_AQUA + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), ChatColor.DARK_AQUA + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage(ChatColor.DARK_AQUA + "Your name is now dark aqua");
                        return true;
                    } else if (args[0].equals("black")) {
                        player.setDisplayName(ChatColor.BLACK + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), ChatColor.BLACK + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage(ChatColor.BLACK + "Your name is now black");
                        return true;
                    } else if (args[0].equals("bold-red")) {
                        player.setDisplayName("" + ChatColor.RED + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.RED + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.RED + ChatColor.BOLD + "Your name is now bold red");
                        return true;
                    } else if (args[0].equals("bold-dark-red")) {
                        player.setDisplayName("" + ChatColor.DARK_RED + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_RED + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.DARK_RED + ChatColor.BOLD + "Your name is now bold dark red");
                        return true;
                    } else if (args[0].equals("bold-green")) {
                        player.setDisplayName("" + ChatColor.GREEN + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.GREEN + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.GREEN + ChatColor.BOLD + "Your name is now bold green");
                        return true;
                    } else if (args[0].equals("bold-dark-green")) {
                        player.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_GREEN + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.BOLD + "Your name is now bold dark green");
                        return true;
                    } else if (args[0].equals("bold-blue")) {
                        player.setDisplayName("" + ChatColor.BLUE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.BLUE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.BLUE + ChatColor.BOLD + "Your name is now bold blue");
                        return true;
                    } else if (args[0].equals("bold-dark-blue")) {
                        player.setDisplayName("" + ChatColor.DARK_BLUE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_BLUE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.DARK_BLUE + ChatColor.BOLD + "Your name is now  bold dark blue");
                        return true;
                    } else if (args[0].equals("bold-pink")) {
                        player.setDisplayName("" + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.BOLD + "Your name is now bold pink");
                        return true;
                    } else if (args[0].equals("bold-gray")) {
                        player.setDisplayName("" + ChatColor.DARK_GRAY + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_GRAY + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.DARK_GRAY + ChatColor.BOLD + "Your name is now bold gray");
                        return true;
                    } else if (args[0].equals("bold-gold")) {
                        player.setDisplayName("" + ChatColor.GOLD + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.GOLD + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.GOLD + ChatColor.BOLD + "Your name is now bold gold");
                        return true;
                    } else if (args[0].equals("bold-purple")) {
                        player.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_PURPLE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.DARK_PURPLE + ChatColor.BOLD + "Your name is now bold purple");
                        return true;
                    } else if (args[0].equals("bold-aqua")) {
                        player.setDisplayName("" + ChatColor.AQUA + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.AQUA + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.AQUA + ChatColor.BOLD + "Your name is now bold aqua");
                        return true;
                    } else if (args[0].equals("bold-yellow")) {
                        player.setDisplayName("" + ChatColor.YELLOW + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.YELLOW + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.YELLOW + ChatColor.BOLD + "Your name is now bold yellow");
                        return true;
                    } else if (args[0].equals("bold-dark-aqua")) {
                        player.setDisplayName("" + ChatColor.DARK_AQUA + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_AQUA + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.DARK_AQUA + ChatColor.BOLD + "Your name is now bold dark aqua");
                        return true;
                    } else if (args[0].equals("bold-black")) {
                        player.setDisplayName("" + ChatColor.BLACK + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.BLACK + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.BLACK + ChatColor.BOLD + "Your name is now bold black");
                        return true;
                    } else if (args[0].equals("italic-black")) {
                        player.setDisplayName("" + ChatColor.BLACK + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.BLACK + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.BLACK + ChatColor.ITALIC + "Your name is now italic black");
                        return true;
                    } else if (args[0].equals("italic-red")) {
                        player.setDisplayName("" + ChatColor.RED + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.RED + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.RED + ChatColor.ITALIC + "Your name is now italic red");
                        return true;
                    } else if (args[0].equals("italic-dark-red")) {
                        player.setDisplayName("" + ChatColor.DARK_RED + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_RED + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.BLACK + ChatColor.ITALIC + "Your name is now italic dark red");
                        return true;
                    } else if (args[0].equals("italic-aqua")) {
                        player.setDisplayName("" + ChatColor.AQUA + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.AQUA + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.AQUA + ChatColor.ITALIC + "Your name is now italic aqua");
                        return true;
                    } else if (args[0].equals("italic-dark-aqua")) {
                        player.setDisplayName("" + ChatColor.DARK_AQUA + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_AQUA + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.DARK_AQUA + ChatColor.ITALIC + "Your name is now italic dark aqua");
                        return true;
                    } else if (args[0].equals("italic-blue")) {
                        player.setDisplayName("" + ChatColor.BLUE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.BLUE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.BLUE + ChatColor.ITALIC + "Your name is now italic blue");
                        return true;
                    } else if (args[0].equals("italic-dark-blue")) {
                        player.setDisplayName("" + ChatColor.DARK_BLUE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_BLUE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.DARK_BLUE + ChatColor.ITALIC + "Your name is now italic dark blue");
                        return true;
                    } else if (args[0].equals("italic-green")) {
                        player.setDisplayName("" + ChatColor.GREEN + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.GREEN + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.GREEN + ChatColor.ITALIC + "Your name is now italic green");
                        return true;
                    } else if (args[0].equals("italic-dark-green")) {
                        player.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_GREEN + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.ITALIC + "Your name is now italic dark green");
                        return true;
                    } else if (args[0].equals("italic-pink")) {
                        player.setDisplayName("" + ChatColor.LIGHT_PURPLE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.LIGHT_PURPLE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.ITALIC + "Your name is now italic pink");
                        return true;
                    } else if (args[0].equals("italic-purple")) {
                        player.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_PURPLE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.DARK_PURPLE + ChatColor.ITALIC + "Your name is now italic purple");
                        return true;
                    } else if (args[0].equals("italic-gray")) {
                        player.setDisplayName("" + ChatColor.DARK_GRAY + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_GRAY + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.DARK_GRAY + ChatColor.ITALIC + "Your name is now italic gray");
                        return true;
                    } else if (args[0].equals("italic-gold")) {
                        player.setDisplayName("" + ChatColor.GOLD + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.GOLD + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.GOLD + ChatColor.ITALIC + "Your name is now italic gold");
                        return true;
                    } else if (args[0].equals("italic-yellow")) {
                        player.setDisplayName("" + ChatColor.YELLOW + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.YELLOW + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.YELLOW + ChatColor.ITALIC + "Your name is now italic yellow");
                        return true;
                    } else if (args[0].equals("italic-white")) {
                        player.setDisplayName("" + ChatColor.WHITE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.WHITE + ChatColor.ITALIC + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.WHITE + ChatColor.ITALIC + "Your name is now italic white");
                        return true;
                    } else if (args[0].equals("italic-bold-white")) {
                        player.setDisplayName("" + ChatColor.WHITE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.WHITE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.WHITE + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold white");
                        return true;
                    } else if (args[0].equals("italic-bold-blue")) {
                        player.setDisplayName("" + ChatColor.BLUE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.BLUE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.BLUE + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold blue");
                        return true;
                    } else if (args[0].equals("italic-bold-dark-blue")) {
                        player.setDisplayName("" + ChatColor.DARK_BLUE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_BLUE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.DARK_BLUE + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold dark blue");
                        return true;
                    } else if (args[0].equals("italic-bold-green")) {
                        player.setDisplayName("" + ChatColor.GREEN + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.GREEN + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.GREEN + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold green");
                        return true;
                    } else if (args[0].equals("italic-bold-dark-green")) {
                        player.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_GREEN + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold dark green");
                        return true;
                    } else if (args[0].equals("italic-bold-aqua")) {
                        player.setDisplayName("" + ChatColor.AQUA + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.AQUA + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.AQUA + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold aqua");
                        return true;
                    } else if (args[0].equals("italic-bold-dark-aqua")) {
                        player.setDisplayName("" + ChatColor.DARK_AQUA + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_AQUA + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.DARK_AQUA + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold dark aqua");
                        return true;
                    } else if (args[0].equals("italic-bold-pink")) {
                        player.setDisplayName("" + ChatColor.LIGHT_PURPLE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.LIGHT_PURPLE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold pink");
                        return true;
                    } else if (args[0].equals("italic-bold-purple")) {
                        player.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_PURPLE + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.DARK_PURPLE + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold purple");
                        return true;
                    } else if (args[0].equals("italic-bold-black")) {
                        player.setDisplayName("" + ChatColor.BLACK + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.BLACK + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.BLACK + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold black");
                        return true;
                    } else if (args[0].equals("italic-bold-gold")) {
                        player.setDisplayName("" + ChatColor.GOLD + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.GOLD + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.GOLD + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold gold");
                        return true;
                    } else if (args[0].equals("italic-bold-yellow")) {
                        player.setDisplayName("" + ChatColor.YELLOW + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.YELLOW + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.YELLOW + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold yellow");
                        return true;
                    } else if (args[0].equals("italic-bold-gray")) {
                        player.setDisplayName("" + ChatColor.GRAY + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.GRAY + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.GRAY + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold gray");
                        return true;
                    } else if (args[0].equals("italic-bold-red")) {
                        player.setDisplayName("" + ChatColor.RED + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.RED + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.RED + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold red");
                        return true;
                    } else if (args[0].equals("italic-bold-dark-red")) {
                        player.setDisplayName("" + ChatColor.DARK_RED + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_RED + ChatColor.ITALIC + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.DARK_RED + ChatColor.ITALIC + ChatColor.BOLD + "Your name is now italic bold dark red");
                        return true;
                    } else if (args[0].equals("underline-dark-red")) {
                        player.setDisplayName("" + ChatColor.DARK_RED + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_RED + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.DARK_RED + ChatColor.UNDERLINE + "Your name is now underline dark red");
                        return true;
                    } else if (args[0].equals("underline-red")) {
                        player.setDisplayName("" + ChatColor.RED + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.RED + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.RED + ChatColor.UNDERLINE + "Your name is now underline red");
                        return true;
                    } else if (args[0].equals("underline-dark-blue")) {
                        player.setDisplayName("" + ChatColor.DARK_BLUE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_BLUE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.DARK_BLUE + ChatColor.UNDERLINE + "Your name is now underline dark blue");
                        return true;
                    } else if (args[0].equals("underline-blue")) {
                        player.setDisplayName("" + ChatColor.BLUE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.BLUE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.BLUE + ChatColor.UNDERLINE + "Your name is now underline blue");
                        return true;
                    } else if (args[0].equals("underline-dark-aqua")) {
                        player.setDisplayName("" + ChatColor.DARK_AQUA + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_AQUA + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.DARK_AQUA + ChatColor.UNDERLINE + "Your name is now underline dark aqua");
                        return true;
                    } else if (args[0].equals("underline-aqua")) {
                        player.setDisplayName("" + ChatColor.AQUA + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.AQUA + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.AQUA + ChatColor.UNDERLINE + "Your name is now underline aqua");
                        return true;
                    } else if (args[0].equals("underline-yellow")) {
                        player.setDisplayName("" + ChatColor.YELLOW + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.YELLOW + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.YELLOW + ChatColor.UNDERLINE + "Your name is now underline yellow");
                        return true;
                    } else if (args[0].equals("underline-gold")) {
                        player.setDisplayName("" + ChatColor.GOLD + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.GOLD + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.GOLD + ChatColor.UNDERLINE + "Your name is now underline gold");
                        return true;
                    } else if (args[0].equals("underline-pink")) {
                        player.setDisplayName("" + ChatColor.LIGHT_PURPLE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.LIGHT_PURPLE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.UNDERLINE + "Your name is now underline pink");
                        return true;
                    } else if (args[0].equals("underline-purple")) {
                        player.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_PURPLE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.DARK_PURPLE + ChatColor.UNDERLINE + "Your name is now underline purple");
                        return true;
                    } else if (args[0].equals("underline-black")) {
                        player.setDisplayName("" + ChatColor.BLACK + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.BLACK + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.BLACK + ChatColor.UNDERLINE + "Your name is now underline black");
                        return true;
                    } else if (args[0].equals("underline-light-gray")) {
                        player.setDisplayName("" + ChatColor.GRAY + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.GRAY + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.GRAY + ChatColor.UNDERLINE + "Your name is now underline light gray");
                        return true;
                    } else if (args[0].equals("underline-dark-gray")) {
                        player.setDisplayName("" + ChatColor.DARK_GRAY + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_GRAY + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.DARK_GRAY + ChatColor.UNDERLINE + "Your name is now underline dark gray");
                        return true;
                    } else if (args[0].equals("underline-dark-green")) {
                        player.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_GREEN + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.UNDERLINE + "Your name is now underline dark green");
                        return true;
                    } else if (args[0].equals("underline-green")) {
                        player.setDisplayName("" + ChatColor.GREEN + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.GREEN + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.GREEN + ChatColor.UNDERLINE + "Your name is now underline green");
                        return true;
                    } else if (args[0].equals("underline-white")) {
                        player.setDisplayName("" + ChatColor.WHITE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.WHITE + ChatColor.UNDERLINE + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.WHITE + ChatColor.UNDERLINE + "Your name is now underline white");
                        return true;
                    } else if (args[0].equals("underline-bold-dark-red")) {
                        player.setDisplayName("" + ChatColor.DARK_RED + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_RED + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.DARK_RED + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold dark red");
                        return true;
                    } else if (args[0].equals("underline-bold-red")) {
                        player.setDisplayName("" + ChatColor.RED + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.RED + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.RED + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold red");
                        return true;
                    } else if (args[0].equals("underline-bold-dark-blue")) {
                        player.setDisplayName("" + ChatColor.DARK_BLUE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_BLUE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.DARK_BLUE + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold dark blue");
                        return true;
                    } else if (args[0].equals("underline-bold-blue")) {
                        player.setDisplayName("" + ChatColor.BLUE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.BLUE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.BLUE + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold blue");
                        return true;
                    } else if (args[0].equals("underline-bold-dark-aqua")) {
                        player.setDisplayName("" + ChatColor.DARK_AQUA + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_AQUA + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.DARK_AQUA + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold dark aqua");
                        return true;
                    } else if (args[0].equals("underline-bold-aqua")) {
                        player.setDisplayName("" + ChatColor.AQUA + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.AQUA + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.AQUA + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold aqua");
                        return true;
                    } else if (args[0].equals("underline-bold-yellow")) {
                        player.setDisplayName("" + ChatColor.YELLOW + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.YELLOW + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.YELLOW + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold yellow");
                        return true;
                    } else if (args[0].equals("underline-bold-gold")) {
                        player.setDisplayName("" + ChatColor.GOLD + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.GOLD + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.GOLD + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold gold");
                        return true;
                    } else if (args[0].equals("underline-bold-pink")) {
                        player.setDisplayName("" + ChatColor.LIGHT_PURPLE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.LIGHT_PURPLE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.LIGHT_PURPLE + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold pink");
                        return true;
                    } else if (args[0].equals("underline-bold-purple")) {
                        player.setDisplayName("" + ChatColor.DARK_PURPLE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_PURPLE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.DARK_PURPLE + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold purple");
                        return true;
                    } else if (args[0].equals("underline-bold-black")) {
                        player.setDisplayName("" + ChatColor.BLACK + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.BLACK + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.BLACK + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold black");
                        return true;
                    } else if (args[0].equals("underline-bold-light-gray")) {
                        player.setDisplayName("" + ChatColor.GRAY + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.GRAY + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.GRAY + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold light gray");
                        return true;
                    } else if (args[0].equals("underline-bold-dark-gray")) {
                        player.setDisplayName("" + ChatColor.DARK_GRAY + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_GRAY + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.DARK_GRAY + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold dark gray");
                        return true;
                    } else if (args[0].equals("underline-bold-dark-green")) {
                        player.setDisplayName("" + ChatColor.DARK_GREEN + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.DARK_GREEN + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.DARK_GREEN + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold dark green");
                        return true;
                    } else if (args[0].equals("underline-bold-green")) {
                        player.setDisplayName("" + ChatColor.GREEN + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.GREEN + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.GREEN + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold green");
                        return true;
                    } else if (args[0].equals("underline-bold-white")) {
                        player.setDisplayName("" + ChatColor.WHITE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.getConfig().set(player.getName(), "" + ChatColor.WHITE + ChatColor.UNDERLINE + ChatColor.BOLD + player.getName() + ChatColor.RESET);
                        this.saveConfig();
                        player.sendMessage("" + ChatColor.WHITE + ChatColor.UNDERLINE + ChatColor.BOLD + "Your name is now underline bold white");
                        return true;
                    } else {
                        player.sendMessage(ChatColor.YELLOW + "LeeesNC " + ChatColor.DARK_AQUA + "Incorrect colour specification Type '/nc' for help");
                        return true;
                    }
                } else {
                    player.sendMessage(ChatColor.YELLOW + "LeeesNC " + ChatColor.DARK_AQUA + "You must donate to the server to use this command. Type /donate to donate.");
                    return true;
                }
            } else {
                player.sendMessage(ChatColor.YELLOW + "LeeesNC ");
                player.sendMessage(ChatColor.DARK_AQUA + "[ /nc <colour> or <type-colour> ]");
                player.sendMessage(ChatColor.BLUE + "[Types]");
                player.sendMessage(ChatColor.DARK_AQUA + "(( underline  underline-bold");
                player.sendMessage(ChatColor.DARK_AQUA + "bold  italic  italic-bold ))");
                player.sendMessage(ChatColor.BLUE + "[Colours]");
                player.sendMessage(ChatColor.DARK_AQUA + "(( red  dark-red  green  dark-green");
                player.sendMessage(ChatColor.DARK_AQUA + "blue  dark-blue  gold  yellow  black");
                player.sendMessage(ChatColor.DARK_AQUA + "purple  pink  gray  aqua  dark-aqua  white ))");
                return true;
            }
        }
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        if (this.getConfig().getString(e.getPlayer().getName()) != null) {
            player.setDisplayName(this.getConfig().getString(player.getName()));
        }

    }
}
