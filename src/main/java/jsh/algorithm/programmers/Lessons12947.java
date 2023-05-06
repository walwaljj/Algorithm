package jsh.algorithm.programmers;

public class Lessons12947 {
    public boolean solution(int x) {

        int div = 0;
        int numSum = 0;
        int y = x;
        while (x > 0){
            div = x % 10;
            numSum += div;
            x /= 10;
        }

        if(y % numSum != 0){
            return false;
        }else{
            return true;
        }
    }

}
