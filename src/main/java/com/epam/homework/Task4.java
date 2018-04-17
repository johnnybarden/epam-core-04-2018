package com.epam.homework;

import java.util.*;

public class Task4 {

    private static List<String> array;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = Integer.valueOf(scanner.nextLine());
        String s = scanner.nextLine();
        array = new ArrayList<>(Arrays.asList(s.split(" ")));
        String result = "";
        Collections.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return getDifferences(o1) - getDifferences(o2);
            }
        });
        System.out.println(array.get(0));
    }

    private static int getDifferences(String input) {
        int result = 0;
        for (int i = 0; i < input.length()-1; i++) {
            for (int y = i+1; y < input.length(); y++) {
                if (input.charAt(i) != input.charAt(y) ||
                        (input.charAt(i) == input.charAt(y) &&
                                (Character.isLowerCase(input.charAt(i)) && Character.isUpperCase(input.charAt(y)) ||
                                        Character.isLowerCase(input.charAt(y)) && Character.isUpperCase(input.charAt(i))))) {
                    result++;
                }
            }
        }
        return result;
    }
}
