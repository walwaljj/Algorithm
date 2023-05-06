package jsh.algorithm.programmers;

public class Lessons120866 {
    public static void main(String[] args) {

        Lessons120866 result = new Lessons120866();
//        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},{0, 0, 0, 0, 0},{0, 0, 1, 0, 1}, {0, 0, 0, 0, 0}};
        int[][] board = {{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1},{1, 1, 1, 1, 1, 1}};

        result.solution(board);
    }

    public int solution(int[][] board) {
        int answer = board.length * board.length;

        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board[i].length; j++) {
                // 1찾기
                if( board[i][j] == 1 ){
                    for ( int k = -1 ; k < 2 ; k++ ) {
                        for ( int l = -1 ; l < 2; l++ ) {
                            if( ( i + k ) >= 0 && (i + k) < board.length && ( j + l ) >= 0 && (j + l) < board.length){
                                // 0 을 2로 변경하기
                                board[i+k][j+l] = board[i+k][j+l] == 0 && board[i+k][j+l] != 1 ? 2 : board[i+k][j+l] ;
                            }
                        }
                    }
                }
            }
        }

        // 0값만 카운트하기
        for (int[] ints : board) {
            for (int anInt : ints) {
                if( anInt != 0){
                    answer--;
                }
            }
        }
        return answer;
    }
}
