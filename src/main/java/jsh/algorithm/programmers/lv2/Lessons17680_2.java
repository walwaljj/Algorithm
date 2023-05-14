package jsh.algorithm.programmers.lv2;

import java.util.Arrays;

public class Lessons17680_2 {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        String[] cacheArr = new String[cacheSize];

        for (int i = 0; i < cities.length; i++) {
            boolean isCacheHit = false;
            for (int j = 0; j < cacheArr.length; j++) {
                if(cities[i].equalsIgnoreCase(cacheArr[j])) {
                    for (int k = j; k > 0; k--) {
                        cacheArr[k] = cacheArr[k - 1];
                    }
                    cacheArr[0] = cities[i];
                    answer += 1;
                    isCacheHit = true;
                    break;
                }
            }
            if(isCacheHit == false) {
                for (int k = cacheArr.length -1; k > 0; k--) {
                    cacheArr[k] = cacheArr[k-1];
                }
                answer += 5;
                cacheArr[0] = cities[i];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
//        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        String[] cities = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
//        String[] cities = {"Jeju", "Jeju", "NewYork", "newyork"};
//        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
//        String[] cities = {	"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
        int cacheSize = 3;
        System.out.println(new Lessons17680_2().solution(cacheSize,cities));
    }
}

