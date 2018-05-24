package enums;

public enum TreasureType {

    GEMS(30),
    GOLD(40),
    ALE(10);

    private final int value;

    TreasureType(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

}
