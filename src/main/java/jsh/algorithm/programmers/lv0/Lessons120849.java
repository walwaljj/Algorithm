package jsh.algorithm.programmers.lv0;

/**
 * 모음 제거
 */
public class Lessons120849 {


    public String solution(String my_string, String alp) {
        return my_string.replaceAll(alp,alp.toUpperCase());

    }
    public static void main(String[] args) {
        String my_string ="AbCdEfG"	;
        String pat = "aBc";
        System.out.println( my_string.toLowerCase().indexOf(pat.toLowerCase()));

        Lessons120849 ls = new Lessons120849();
        System.out.println(ls.solution("wsdawsdassw","w"));
    }
}
