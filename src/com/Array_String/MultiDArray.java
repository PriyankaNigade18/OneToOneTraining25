package com.Array_String;

public class MultiDArray {

	public static void main(String[] args) 
	{

		//using new keyword
		
		int data[][]=new int[2][3];
		data[0][0]=10;
		data[0][1]=20;
		data[0][2]=30;
		
		data[1][0]=40;
		data[1][1]=50;
		data[1][2]=60;
		
		System.out.println("Number of rows are: "+data.length);//2
		
		//row-->cell--->value
		System.out.println("Number of columns are:  "+data[0].length);//3
		
		//single value
		System.out.println(data[0][2]);//30
		
		//wrong index
		//System.out.println(data[0][3]);//Exception
		
		
		//iterate all values of array
		
		for(int r=0;r<data.length;r++)
		{
						
			for(int c=0;c<data[r].length;c++)
			{
				System.out.print(data[r][c]+" ");
			}
			
			//next row
			System.out.println();
			
		}
		
		
		System.out.println("**********for each loop******************");
		
		
		for(int i[]:data)//int[] to int    i<==[10,20,30]
		{
			
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
		System.out.println("********************************");
		
		//using literal way
		int id[][]= {{101,10},{102,20},{103,30},{104,40}};
		
		System.out.println("Number of Rows: "+id.length);//4
		System.out.println("Number of columns: "+id[0].length);//2
		
		System.out.println(id[2][0]);//103
		
		//iterate
		for(int i=0;i<id.length;i++)
		{
			for(int j=0;j<id[i].length;j++)
			{
				System.out.print(id[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("*************for each**************");
		
		
		for(int i[]:id)//{}row data
		{
		for(int j:i)//cells
		{
			System.out.print(j+" ");
		}
		System.out.println();
		}
		
		
		
		System.out.println("************Jagged array******************");
		//size of columns are not equal for every row
		
		double marks[][]= {{48.77},{77.55,45.66},{88.33,37.44,66.44}};
		for(double i[]:marks)
		{
			for(double j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
		
		
//		int arr[][]= {{10,20,30},{40,30,200}};
//		
//		System.out.println(arr[0][1]);//20
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
