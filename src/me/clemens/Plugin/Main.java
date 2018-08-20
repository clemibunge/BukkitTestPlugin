package me.clemens.Plugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	public void onEnable(){
		getLogger().info("Disabled!");
		}
		// These To well logged in the Console Saying "Disabled!" and "Enabled!"
		public void onDisable(){
		getLogger().info("Enabled!");
		}
		
		public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
			Player player = (Player) sender;
			if(cmd.getName().equalsIgnoreCase("test")){
			player.sendMessage(ChatColor.AQUA + "Hello World!");
			//ChatColor.AQUA well make the Hello World! Have Aqua In it.
			}
			return false;
			}
			
	
}
