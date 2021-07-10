package dev.slickcollections.kiwizin.libraries.npclib.trait;

import org.bukkit.Location;
import dev.slickcollections.kiwizin.libraries.npclib.api.npc.NPC;

public class CurrentLocation extends NPCTrait {

  private Location location = new Location(null, 0, 0, 0);

  public CurrentLocation(NPC npc) {
    super(npc);
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public Location getLocation() {
    return location;
  }
}
