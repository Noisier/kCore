package dev.slickcollections.kiwizin.party;

public enum PartyRole {
  MEMBER("Membro"),
  LEADER("Líder");

  private String name;

  PartyRole(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }
}
