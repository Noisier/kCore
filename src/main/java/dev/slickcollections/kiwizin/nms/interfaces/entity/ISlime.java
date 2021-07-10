package dev.slickcollections.kiwizin.nms.interfaces.entity;

import dev.slickcollections.kiwizin.libraries.holograms.api.HologramLine;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Slime;

public interface ISlime {

  public void setPassengerOf(Entity entity);

  public void setLocation(double x, double y, double z);

  public boolean isDead();

  public void killEntity();

  public Slime getEntity();

  public HologramLine getLine();
}
