package com.generalPrograms;

public class Javaarray {

	public static void main(String[] args) {
		
		 int [][] a={{1,2,3,4},
				 	 {5,6,7,8},
				 	 {9,10,11,12},
				 	 {13,14,15,16}};
		 int [][]b = new int[4][4];
		 
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=0;j<a[i].length;j++)
			 {
				 System.out.print(a[i][j]+",");
				 b[j][i]=a[i][j];
			 }
			 System.out.println();
		 }
		 System.out.println("reverse of above array");
		 for(int i=0;i<b.length;i++)
		 {
			 for(int j=0;j<b[i].length;j++)
			 {
				 System.out.print(b[i][j]+",");
			 }
			 System.out.println();
		 }
		 
		 System.out.println("another way of loop");
		 for(int i[]:b)
		 {
			 for(int j:i)
			 {
				 System.out.print(j+",");
			 }
			 System.out.println();
		 }
		
		// TODO Auto-generated method stub

	}

}
