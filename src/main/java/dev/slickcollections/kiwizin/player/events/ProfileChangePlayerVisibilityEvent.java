package dev.slickcollections.kiwizin.player.events;

import dev.slickcollections.kiwizin.player.enums.PlayerVisibility;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import dev.slickcollections.kiwizin.player.Profile;

public class ProfileChangePlayerVisibilityEvent extends Event {

  private Profile profile;
  private PlayerVisibility playerVisibility;
  
  public ProfileChangePlayerVisibilityEvent(Profile profile) {
    this.profile = profile;
    this.playerVisibility = profile.getPreferencesContainer().getPlayerVisibility();
  }
  
  public Player getPlayer() {
    return this.profile.getPlayer();
  }
  
  public Profile getProfile() {
    return this.profile;
  }
  
  public PlayerVisibility getPlayerVisibility() {
    return this.playerVisibility;
  }
  
  @Override
  public HandlerList getHandlers() {
    return HANDLER_LIST;
  }
  
  private static final HandlerList HANDLER_LIST = new HandlerList();

  public static HandlerList getHandlerList() {
    return HANDLER_LIST;
  }
}
