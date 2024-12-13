package ru.joraly.service.impl;

import ru.joraly.service.DemoService;

import java.util.Arrays;
import java.util.Comparator;

public class DemoServiceImpl implements DemoService {
    @Override
    public String findMaxI(String str) {
        return Arrays.stream(str.split(" "))
                .max(Comparator.comparingInt(word -> (int) word.chars()
                        .filter(c -> c == 'и' || c == 'И')
                        .count()))
                .orElse("");

    }

    @Override
    public int findDiagonalSum(int[][] matrix) {
        int length = matrix.length;
        int diagonalSum = 0;
        int minusDiagonalSum = 0;
        for (int i = 0; i < length; i++) {
            diagonalSum += matrix[i][i];
            minusDiagonalSum += matrix[i][length - i - 1];
        }
        return Math.max(diagonalSum, minusDiagonalSum);
    }

    @Override
    public String generateAcronym(String str) {
        String[] words = str.split(" ");
        StringBuffer sb = new StringBuffer();
        for (var word : words) {
            if(!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0)));
            }
        }
        return sb.toString();
    }
}
