package com.psp.array;

public class ArrayMulDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { {1,2,3,4,5},
				    {6,7,8,9,10},
				    {11,12,13,14,15} 
				    };
		for (int i = 0;i < 3;i++) {
			for (int j = 0;j < 5; j++) {
		
			System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
		System.out.println("My Array First ROW and Second Column = "+ a[0][1]);

}
}