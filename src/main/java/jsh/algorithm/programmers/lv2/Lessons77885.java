package jsh.algorithm.programmers.lv2;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/77885
 * 2개 이하로 다른 비트
 */
public class Lessons77885 {
    public static long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        //number를 비트로 변환
        String binaryString = "";
        //2개 이하로 다른 비트를 저장
        String format = "";
        //'0' 의 idx
        int idxOf0 = 0;
        //'1' 의 idx;
        int idxOf1 = 0;
        for (int i = 0; i < numbers.length; i++) {
            binaryString = "0" + Long.toBinaryString(numbers[i]);
            idxOf0 = binaryString.lastIndexOf('0');
            // idxOf0 보다 뒤에있는 1을 찾기
            String substring = binaryString.substring(idxOf0+1);
            idxOf1 = substring.indexOf("1");
            
            format = String.format("%s%s%s", binaryString.substring(0, idxOf0), "1", binaryString.substring(idxOf0 + 1, binaryString.length()));

            if(idxOf1 != -1){
                format = String.format("%s%s%s", format.substring(0, idxOf0+1), "0", substring.substring(idxOf1 + 1, substring.length()));
            }
            answer[i] = Long.parseLong(format,2);
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println();
        solution(new long[]{2,1});
//        solution(new long[]{333});


    }
}
