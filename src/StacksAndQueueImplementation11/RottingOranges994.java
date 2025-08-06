package StacksAndQueueImplementation11;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges994 {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0;i< grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
                if(grid[i][j]==2)
                    queue.offer(new int[]{i,j});

        int time = 0;
        int[][] d = new int[][]{{0,-1},{-1,0},{0,1},{1,0}};

        while(!queue.isEmpty()){
            int l = queue.size();
            while(l-->0){
                System.out.println("At time l="+time+" "+l+" Grid is ");
                printGrid(grid);

                int[] t = queue.poll();
                for(int i=0;i<d.length;i++) {
                    if (inBounds(t[0] + d[i][0], t[1] + d[i][1], grid)) {
                        if (grid[t[0] + d[i][0]][t[1] + d[i][1]] == 1) {
                            grid[t[0] + d[i][0]][t[1] + d[i][1]]++;
                            queue.offer(new int[]{t[0] + d[i][0], t[1] + d[i][1]});
                        }
                    }
                }

            }
            if(!queue.isEmpty())
                time++;
        }
        if(checkAllRot(grid))
            return time;
        return -1;
    }

    private void printGrid(int[][] grid) {
        for(int i=0;i<grid.length;i++) {
            for (int j = 0; j < grid[0].length; j++)
                System.out.print(grid[i][j]+"\t");
            System.out.println();
        }

    }

    private boolean checkAllRot(int[][] grid) {
        for(int i=0;i<grid.length;i++)
            for (int j=0;j<grid[0].length;j++)
                if(grid[i][j]==1)
                    return false;

        return true;
    }


    private boolean inBounds(int i, int i1, int[][] grid) {
        if (i < 0 || i1 < 0 || i == grid.length || i1 == grid[0].length)
            return false;
        return true;
    }
}
