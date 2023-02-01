package Example_Topics;

import java.util.Scanner;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Array_Scanner {
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[][]=new int [2][3];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			System.out.println(arr[i][j]+"");

		}
		System.out.println();
	}	
}

}

