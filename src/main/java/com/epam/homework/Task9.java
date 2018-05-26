package com.epam.homework;

import java.math.BigDecimal;
import java.util.Scanner;

public class Task9 {

    /**
     * С консоли вводятся три целых числа A, B, C.
     * Числа являются коэффициентами, задающими квадратное уравнение в общем виде: A*x^2 + B*x + C = 0
     * Необходимо найти корни этого уравнения.
     *
     * Формат входных данных:
     * Строка, содержащая 3 целых числа, разделенных пробелами
     *
     * Формат выходных данных:
     * В результате решения уравнения может быть получено три варианта ответа:
     *
     * NO ROOTS
     * корень уравнения
     * первый корень уравнения, второй корень уравнения
     *
     * В результате выполнения в выходной поток посылается строка, соответствующая найденному решению.
     * Значения корней округляются до 2 знаков после запятой.
     * В качестве десятичного разделителя используется точка.
     *
     * ---------------------------------------------------------------------------------------------------
     * Примеры выполнения задания:
     *
     * Входные данные:
     * 2 7 0
     *
     * Выходные данные:
     * -3.50, 0.00
     *
     *
     * ---------------------------------------------------------------------------------------------------
     * Входные данные:
     * 4 4 1
     *
     * Выходные данные:
     * -0.50
     *
     *
     * ---------------------------------------------------------------------------------------------------
     * Входные данные:
     * 7 0 35
     *
     * Выходные данные:
     * NO ROOTS
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        double D = (b * b) - (4 * a * c);

        if (D < 0) {
            System.out.println("NO ROOTS");
        } else if (D == 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            BigDecimal bigDc1 = new BigDecimal(x1);
            BigDecimal bigX1 = bigDc1.setScale(2, BigDecimal.ROUND_HALF_UP);
            System.out.println(bigX1);
        } else if (D > 0) {
            double x1 = (-b - Math.sqrt(D)) / (2 * a);
            double x2 = (-b + Math.sqrt(D)) / (2 * a);
            BigDecimal bigDc1 = new BigDecimal(x1);
            BigDecimal bigDc2 = new BigDecimal(x2);
            BigDecimal bigX1 = bigDc1.setScale(2, BigDecimal.ROUND_HALF_UP);
            BigDecimal bigX2 = bigDc2.setScale(2, BigDecimal.ROUND_HALF_UP);
            System.out.println(bigX1 + ", " + bigX2);
        }
    }
}