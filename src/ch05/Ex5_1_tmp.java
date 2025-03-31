package ch05;

import java.util.Arrays;		//ctrl + shift + o

public class Ex5_1_tmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] score;	// 1. �迭 score ����(��������)
//		score = new int[5];		// 2. �迭�� ����(int ������� * 5)
		
		int[] score = new int[5];		// �迭�� ����� ������ ���ÿ�
		score[3] = 100;
		
		System.out.println("score[0] = " + score[0]);
		System.out.println("score[1] = " + score[1]);
		System.out.println("score[2] = " + score[2]);
		System.out.println("score[3] = " + score[3]);
		System.out.println("score[4] = " + score[4]);
		
		int[] arr = { 100, 90, 80, 70 ,60 };

		
		for(int i=0; i < arr.length; i++)
			System.out.println("arr[" +i+ "] = " + arr[i]);
		
		System.out.println(Arrays.toString(arr));
		
	}

}
