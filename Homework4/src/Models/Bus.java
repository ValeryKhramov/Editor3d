package Models;

public class Bus {
    private String gosNumber;
    private int id;
    private int placesCap;
    private boolean isReady;

    public String getGosNumber() {
        return gosNumber;
    }

    public int getId() {
        return id;
    }

    public int getPlacesCap() {
        return placesCap;
    }

    public boolean isReady() {
        return isReady;
    }

    public void setReady(boolean ready) {
        isReady = ready;
    }

    public Bus(String gosNumber, int id, int placesCap, boolean isReady) {
        this.gosNumber = gosNumber;
        this.id = id;
        this.placesCap = placesCap;
        this.isReady = isReady;
    }
}
