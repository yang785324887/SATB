import java.util.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//////////////////////////////////////////////����4�����ɵĹ���4��SATB test
public class TestSATBadd3Sto4SATB {	

	@SuppressWarnings("null")
	static int N = 35; // 31���׼���Ŀ
	static int M = 3; // 3������Ŀ
		
	public static void main(String[] args) {
		
		Add0 add0 =new Add0(); //����һ����֪��satb��������һ����֪���ɵ�satb��ʵ����
		System.out.println("���ִ��������C1��ʼ�����������еĺ������������� 29,26,24,15 ��ʾC5��G4��E4��C3  ����26=7*3+5=G4��24=7*3+3=E3��������С��41��");
		System.out.println("������һ���������ĸ��������Ĳ�����������Ӣ�ĸ�ʽ�Ķ��Ÿ�����");
		
		Scanner sc = new Scanner(System.in); // ��������
		String str = sc.next().toString();
		String[] arr = str.split(",");
		int[] b = new int[arr.length]; // ������������
		int i;

		if (b != null && b.length > 1) { // 3��������2����

			for (i = 0; i < b.length; i++) { // 4ѭ��������������
				if(i==0){
					add0.cfa = Integer.parseInt(arr[i]);
				}
				if(i==1){
					add0.cfb = Integer.parseInt(arr[i]);
				}
				if(i==2){
					add0.cfc = Integer.parseInt(arr[i]);
				}
				if(i==3){
					add0.cfd = Integer.parseInt(arr[i]);
				}
			}
		}
		
		
		CFinput c = new CFinput();//��1��2������satb����
		c.C();		
		String ct=c.cr;	//�����������е����ƴ�ӳ��ַ���1
		String ft=c.fr;	//�����������е����ƴ�ӳ��ַ���2		
		add0.A(ct, ft);
		
		Add2 add2 =new Add2();
		Add3 add3 =new Add3();
		
		CFinput2s c2 = new CFinput2s(); //��3��4������satb����
		c2.C();		
		String t3=c2.cr;	//�����������е����ƴ�ӳ��ַ���1
		String t4=c2.fr;	//�����������е����ƴ�ӳ��ַ���2
		
		add2.A(add0.As,t3);
		
		add3.A(add2.As,t4);

	}// main

}// class
