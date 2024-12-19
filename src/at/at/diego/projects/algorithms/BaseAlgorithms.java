package at.at.diego.projects.algorithms;

public class BaseAlgorithms {
    public static int[] revert(int[] data) {
        int[] dataReversed = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            dataReversed[i] = data[data.length - 1 - i];
        }
        return dataReversed;
    }
}
