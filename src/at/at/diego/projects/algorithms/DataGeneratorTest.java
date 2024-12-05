package at.at.diego.projects.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataGeneratorTest {
    @Test
    public void testGenerateDataArray() {
        int[] randomNumbers = DataGenerator.generateDataArray(5);
        Assertions.assertEquals(randomNumbers.length, 5);
        System.out.println("Debuggerd");

    }
}
