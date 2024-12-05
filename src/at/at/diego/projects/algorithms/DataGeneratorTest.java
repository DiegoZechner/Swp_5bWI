package at.at.diego.projects.algorithms;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DataGeneratorTest {
    @Test
    void testGenerateDataArray() {
        int[] data = DataGenerator.generateDataArray(10);
        assertEquals(data.length, 5);
    }

    @Test
    void testGenerateDataArray2() {
        int[] data = DataGenerator.generateDataArrayWithMinMax(5, 3, 10);
        for (int i : data) {
            assertTrue(i >= 3 && i <= 10);
        }
    }
}