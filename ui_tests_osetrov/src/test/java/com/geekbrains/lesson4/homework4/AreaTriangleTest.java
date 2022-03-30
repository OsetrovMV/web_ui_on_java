package com.geekbrains.lesson4.homework4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AreaTriangleTest {
    @Test
    void successCalculationTest() throws Exception {
        Assertions.assertEquals(AreaTriangle.areaCalculation(2, 4, 4), 4);
    }
}
