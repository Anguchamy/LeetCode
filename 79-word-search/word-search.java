class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[i].length;j++) {
                if(board[i][j] == word.charAt(0)) {
                    if(dfs(i, j, board, word, 0)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean dfs(int i, int j, char board[][], String word, int index) {
        if(word.length() == index) {
            return true;
        }
        if(i<0 || i>=board.length || j<0 || j>=board[i].length) {
            return false;
        }

        if(word.charAt(index) != board[i][j]) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '*';
        if(dfs(i+1, j, board, word, index + 1) ||
            dfs(i-1, j, board, word, index + 1) ||
            dfs(i, j+1, board, word, index + 1) ||
            dfs(i, j-1, board, word, index + 1)) {
                board[i][j] = temp;
                return true;
            }
        
        board[i][j] = temp;
        return false;
    }
}