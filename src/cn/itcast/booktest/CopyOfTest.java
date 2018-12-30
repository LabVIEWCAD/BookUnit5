package cn.itcast.booktest;

import java.util.Arrays;

public class CopyOfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3};
		a = (int[])goodCopyOf(a,10);
		System.out.println(Arrays.toString(a));
		
		String[] b = {"Tom","Dick",""}
	}

}
