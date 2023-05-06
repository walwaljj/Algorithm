package jsh.algorithm.programmers;

public class Lessons70129 {
    public static void main(String[] args) {
        Lessons70129 lessons = new Lessons70129();
        lessons.solution("110010101001");

    }
    public int[] solution(String s) {

        int loopCount = 0;
        int zeroCount = 0;

        while ( !s.equals("1") ){ // s 가 "1" 이 되기 전 까지 반복
            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(j) =='0'){
                    zeroCount++; // s의 "0" 을 count 함
                }
            }
            if (s.length() != 1){ // s의 길이가 1인 경우를 제외함
                s = Integer.toBinaryString( s.replace("0", "").length());
                                        // "0"을 제외한 이후 s의 길이를 2진수로 변환, s에 값 대입
            }
            loopCount++; // s 가 "1" 이 되기 전 반복 횟수를 count
        }
        return new int[]{loopCount,zeroCount};
    }

}
