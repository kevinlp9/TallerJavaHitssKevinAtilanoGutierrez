package Enums;

public enum OrderPriority {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    public final int level;

  OrderPriority(int level){
      this.level=level;
  }

    public int getLevel() {
        return level;
    }
}
