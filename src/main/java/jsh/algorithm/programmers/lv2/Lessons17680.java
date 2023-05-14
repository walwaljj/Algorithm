package jsh.algorithm.programmers.lv2;

public class Lessons17680 {
    public static void moveValues(String[] cacheArr, int cacheIdx, String[] cities, int i ){
        for (int k = cacheIdx; k > 0; k--) {
            cacheArr[k] = cacheArr[k - 1];
        }
        cacheArr[0] = cities[i];
    }
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        String[] cacheArr = new String[cacheSize];

        // cacheSize가 0인 경우 처리
        if(cacheSize == 0 ){
            return cities.length * 5;
        }

        for (int i = 0; i < cities.length; i++) {
            // 캐시가 있는지 확인, 있으면 true, 없으면 false
            boolean isCacheHit = false;

            // 캐시 데이터 찾기
            for (int j = 0; j < cacheArr.length; j++) {
                // 데이터 있을 경우
                if (cities[i].equalsIgnoreCase(cacheArr[j])) {
                    moveValues( cacheArr , j , cities, i);
                    answer += 1;
                    isCacheHit = true;
                    break;
                }
            }
            // 데이터 없을 경우
            if(!isCacheHit) {
                moveValues( cacheArr , cacheArr.length -1 , cities, i);
                answer += 5;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
//        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
//        String[] cities = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
        String[] cities = {"Jeju", "Pangyo", "NewYork", "newyork"};
//        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
//        String[] cities = {	"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
        int cacheSize = 5;
        System.out.println(new Lessons17680().solution(cacheSize,cities));
    }
}
