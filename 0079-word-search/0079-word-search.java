class Solution {

    public boolean exist(char[][] board, String word) {
        boolean wordFound = false;
        boolean visited[][] = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0) && dfs(board, i, j, visited, 0, word)) {
                    wordFound = true;
                }
            }
        }
        System.out.println("Word Found: " + wordFound);
        return wordFound;
    }

    public boolean dfs(char[][] board, int i, int j, boolean[][] visited, int count, String word) {
        if (count == word.length()) {
            return true;
        }
        if (i < 0 || j < 0 || i >= board.length || j >= board[i].length || visited[i][j] == true || board[i][j] != word.charAt(count)) {
            return false;
        }
        visited[i][j] = true;
        boolean found =
            dfs(board, i + 1, j, visited, count + 1, word) ||
            dfs(board, i, j + 1, visited, count + 1, word) ||
            dfs(board, i - 1, j, visited, count + 1, word) ||
            dfs(board, i, j - 1, visited, count + 1, word);
        visited[i][j] = false;
        return found;
    }
}
