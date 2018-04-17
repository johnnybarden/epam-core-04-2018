package com.epam.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task2 {

    /**
     * Ввести N строк с консоли.
     * Упорядочить и вывести строки в порядке возрастания значений их длины.
     * В случае, если длины строк совпадают - упорядочить их в лексикографическом порядке.
     * <p>
     * Формат входных данных:
     * N (целое число, 0 < N < 100) - количество доступных для чтения строк
     * Строка_1
     * Строка_2
     * ...
     * Строка_N
     * <p>
     * Формат выходных данных:
     * В результате выполнения в выходной поток должны быть выведены N строк следующего вида:
     * (длина строки): строка наименьшей длины
     * (длина строки): строка большей длины
     * (длина строки): строка большей длины
     * ...
     * (длина строки): строка наибольшей длины
     * <p>
     * ----------------------------------------------------------------------------------------------
     * Пример выполнения задания:
     * <p>
     * Входные данные:
     * 4
     * Тихо струится река серебристая
     * В царстве вечернем зеленой весны.
     * Солнце садится за горы лесистые.
     * Рог золотой выплывает луны.
     * <p>
     * Выходные данные:
     * (27): Рог золотой выплывает луны.
     * (30): Тихо струится река серебристая
     * (32): Солнце садится за горы лесистые.
     * (33): В царстве вечернем зеленой весны.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numStrings = Integer.parseInt( reader.readLine() );
        ArrayList<String> arrayList = new ArrayList<>( numStrings );
        String inputString;

        for (int i = 0; i < numStrings; i++) {
            inputString = reader.readLine();
            arrayList.add( inputString );
        }

        arrayList.sort( (o1, o2) -> ((o1.length() == o2.length())) ? o1.compareTo( o2 ) : Integer.compare( o1.length(), o2.length() ) );

        for (String cur : arrayList) {
            System.out.println( "(" + cur.length() + "): " + cur );
        }
    }
}