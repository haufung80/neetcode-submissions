class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<Set<Integer>> row = new ArrayList<>(9);
        List<Set<Integer>> col = new ArrayList<>(9);
        List<Set<Integer>> grid = new ArrayList<>(9);
        for (int i = 0; i < 9; i++) {
            row.add(new HashSet<>());
            col.add(new HashSet<>());
            grid.add(new HashSet<>());
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                if (!row.get(i).add(Integer.valueOf(board[i][j]))) return false;
                if (!col.get(j).add(Integer.valueOf(board[i][j]))) return false;
                if (!grid.get(((i / 3) * 3 + (j / 3))).add(Integer.valueOf(board[i][j]))) return false;
            }
        }
        return true;
    }
}
