import java.util.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/////////////////////////////����һ��satb����һ�����ɣ���������satb���ӡ�test
public class TestSATBaddSto2SATB {	
	@SuppressWarnings("null")		
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
		
//		System.out.println("��������һ�����ӵ�����");
//		Scanner sc2 = new Scanner(System.in); // ��������
//		String str2 = sc2.next().toString();
//		int str2i=0;
//		str2i = Integer.parseInt(str2);
//		CF.bn2=str2i;
//		System.out.println("str2i:"+str2i);
//		System.out.println("c.bn2:"+CF.bn2);
		
		CFinput c = new CFinput();//satb������ʵ���� ����������һ������

		c.C();		
		String ct=c.cr;	//�����������е����ƴ�ӳ��ַ���1
		String ft=c.fr;	//�����������е����ƴ�ӳ��ַ���2		
		add0.A(ct, ft);		
	}// main

}// class
