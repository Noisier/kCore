package dev.slickcollections.kiwizin.libraries.npclib.npc.skin;

import org.bukkit.entity.Player;
import dev.slickcollections.kiwizin.libraries.npclib.api.npc.NPC;

public interface SkinnableEntity {

  public NPC getNPC();

  public Player getEntity();

  public SkinPacketTracker getSkinTracker();

  public void setSkin(Skin skin);

  public Skin getSkin();

  public void setSkinFlags(byte flags);
}
