package com.geekbrains.lesson4.homework4;

public class AreaTriangle {
    public static double areaCalculation(double sideA, double sideB, double sideC) throws Exception {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new Exception("Некорректное значение длины стороны треугольника!");
        }
        double halfmeterP  = (sideA + sideB + sideC) / 2;
        double square = (halfmeterP * (halfmeterP - sideA) * (halfmeterP - sideB) * (halfmeterP - sideC));
        return Math.sqrt(square);

    }
}
