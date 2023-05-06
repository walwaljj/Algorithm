package jsh.algorithm.programmers;

public class Lessons86051 {

    public int solution(int [] numbers) {
        int answer = 45;
        for(int i = 0 ; i < numbers.length ; i ++){
            answer -= numbers[i];
        }


        return answer;
    }
    public static void main(String[] args) {
        Lessons86051 lessons = new Lessons86051();
        int[] numbers = {1,2,3,4,6,7,8,0};
        lessons.solution(numbers);
    }
}
