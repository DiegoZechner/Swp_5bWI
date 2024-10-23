package at.diego;

import java.util.ArrayList;

public class SDCard {
    private float capacity;
    private ArrayList<Foto> fotos;

    public SDCard(float capacity) {
        this.capacity = capacity;
        this.fotos = new ArrayList<>();
    }

    public float getFreeSpace() {
        float usedSpace = 0;
        for (Foto foto : fotos) {
            usedSpace += foto.getSize();
        }
        return capacity - usedSpace;
    }

}
