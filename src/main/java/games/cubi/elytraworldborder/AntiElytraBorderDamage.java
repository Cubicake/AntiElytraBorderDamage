package games.cubi.elytraworldborder;

import org.bukkit.WorldBorder;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

public final class AntiElytraBorderDamage extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(this,this);

        int pluginID = 33283;
        Metrics metrics = new Metrics(this, pluginID);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onHitWall(EntityDamageEvent event) {
        if (event.getCause() != EntityDamageEvent.DamageCause.FLY_INTO_WALL) return;
        if (event.getEntity() instanceof Player player) {
            WorldBorder worldBorder = player.getWorld().getWorldBorder();
            Vector playerUnitVector = player.getLocation().subtract(worldBorder.getCenter()).toVector().normalize().multiply(0.1);
            boolean atWall = !player.getWorld().getWorldBorder().isInside(player.getLocation().add(playerUnitVector));
            if (atWall) {
                event.setCancelled(true);
            }
        }
    }
}
