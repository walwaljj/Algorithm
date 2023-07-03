package jsh.algorithm.programmers.lv0;

public class Lessons120956 {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};

        for(String str : babbling){
            for (int i = 0; i < words.length; i++) {
                if (str.contains(words[i])) {
                    str = str.replaceAll(words[i], "_");
                }
            }
            if(str.replaceAll("_","").length() == 0){
                answer++;
            }
        }
        return answer;
    }

}
