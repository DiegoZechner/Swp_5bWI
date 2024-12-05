package at.at.diego.projects.algorithms;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DataGeneratorTest {
    @Test
    void testGenerateDataArray() {
        int[] data = DataGenerator.generateDataArray(10);
        Assert.assertEquals(data.length, 10);
    }

    @Test
    void testGenerateDataArray2() {
        int[] data = DataGenerator.generateDataArray(5, 5, 10);
        for (int i = 0; i == data.length; i++) {
            Assert.assertEquals(3, data.length);
        }
    }
}