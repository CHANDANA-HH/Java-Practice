class FloodFill {

    static int[] dr = {-1,1,0,0};
    static int[] dc = {0,0,-1,1};

    public static void floodFill(int[][] mat, int r, int c, int oldVal, int newVal) {
        int n = mat.length, m = mat[0].length;
        if(r<0 || c<0 || r>=n || c>=m || mat[r][c] != oldVal) return;

        mat[r][c] = newVal;

        for(int d=0; d<4; d++) {
            floodFill(mat, r+dr[d], c+dc[d], oldVal, newVal);
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1,1,0,0},
            {1,0,0,1},
            {0,1,1,1},
            {0,0,0,0}
        };

        floodFill(mat, 0,0,1,2); // replace connected 1s at (0,0) with 2s

        for(int[] row : mat) {
            for(int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
