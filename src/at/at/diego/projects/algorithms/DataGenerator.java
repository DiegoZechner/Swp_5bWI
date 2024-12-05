package at.at.diego.projects.algorithms;

import java.util.Random;

public class DataGenerator {
    public static int[] generateDataArray(int size) {
        Random random = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt();
        }
        return data;
    }
}
