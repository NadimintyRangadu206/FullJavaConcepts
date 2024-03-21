package com.java.basic.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinimumLoss {

    static int minimumLoss(int[] price) {
        int n = price.length;
        int[] sortedPrices = Arrays.copyOf(price, n);
        Arrays.sort(sortedPrices);

        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(sortedPrices[i], i);
        }

        int minLoss = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            int currentLoss = sortedPrices[i] - sortedPrices[i - 1];
            if (currentLoss < minLoss && indexMap.get(price[i - 1]) > indexMap.get(price[i])) {
                minLoss = currentLoss;
            }
        }

        return minLoss;
    }

    public static void main(String[] args) {
        int[] price = {20,15,8,2,12};
        int result = minimumLoss(price);
        System.out.println("Minimum Loss: " + result);
    }
}

