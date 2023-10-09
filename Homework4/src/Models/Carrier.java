package Models;

import java.util.ArrayList;

/**
 * Модель перевозчика
 */
public class Carrier {
    private int id;
    private long cardNumber;
    private ArrayList<Integer> zones;

    public Carrier(int id, long cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
    }

    public int getId() {
        return id;
    }

    public long getCardNumber() {
        return cardNumber;
    }
}
