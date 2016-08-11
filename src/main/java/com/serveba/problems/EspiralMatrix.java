package com.serveba.problems;

public class EspiralMatrix {
	
	public String solve(int [][] grid) {
		
		StringBuilder output = new StringBuilder("");
		int height = grid.length;
		int width = grid[0].length;
		int depth = 0;
		int iterations = height/2;
		
//		String s = String.format("width: %d, height: %d, depth: %d", width, height, depth);
//		System.out.println(s);
		
		while (depth < iterations) {
			int i = depth;
			int j;
			for (j = depth; j < width - depth - 1; j++) {
				output.append(grid[i][j]);
			}
			
			j = width - depth - 1;
			for (i = depth; i < height - depth - 1; i++) {
				output.append(grid[i][j]);
			}
			i = height - depth - 1;
			for(j = width - depth - 1; j > depth; j--) {
				output.append(grid[i][j]);
			}
			j = depth;
			for(i = height - depth - 1; i > depth; i--) {
				output.append(grid[i][j]);
			}
			depth++;
		}
		
		return output.toString();
	}
	
	public static void printMatrix(int [][] grid) {
		String s = String.format("%dx%d matrix:", grid.length, grid[0].length);
		System.out.println(s);
		
		for(int i=0; i < grid.length; i++) {
			for(int j=0; j< grid[i].length; j++) {
				System.out.print(" " + grid[i][j]);
			}
			System.out.println();
		}
	}

}
