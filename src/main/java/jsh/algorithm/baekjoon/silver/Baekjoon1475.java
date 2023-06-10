package jsh.algorithm.baekjoon.silver;

import java.util.Arrays;
import java.util.Scanner;

/**https://www.acmicpc.net/problem/1475
 * 방 번호
 */
public class Baekjoon1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[10];
        while (num != 0){
            int i = num % 10;
            if(i == 6 || i == 9){
                arr[9] += 1;
            }else {
                arr[i] += 1;
            }
            num /= 10;
        }

        arr[9] = arr[9] % 2 == 0 ? arr[9] / 2 : arr[9] / 2 + 1 ;
        int result = Arrays.stream(arr).max().getAsInt();
        System.out.println(result);
    }
}
