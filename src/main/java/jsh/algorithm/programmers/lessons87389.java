package jsh.algorithm.programmers;

public class lessons87389 {

    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if(n % i == 1){
                answer = i;
                break;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        lessons87389 lessons = new lessons87389();
        lessons.solution(10);
    }
}
