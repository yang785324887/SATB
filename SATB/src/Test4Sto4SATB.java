import java.util.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//////////////////////////////////////////////����4�����ɵĹ���4��SATB test
public class Test4Sto4SATB {	

	@SuppressWarnings("null")
	static int N = 35; // 31���׼���Ŀ
	static int M = 3; // 3������Ŀ
		
	public static void main(String[] args) {
		
		System.out.println("���ִ��������C1��ʼ�����������еĺ�������������29��ʾC5 7*4+1=C5������32��ʾF5 7*4+4=F5��������С��41��");	
		
		Add1 add1 =new Add1();
		Add2 add2 =new Add2();
		Add3 add3 =new Add3();
		
		CFinput2s c = new CFinput2s();//��1��2������satb����
		c.C();		
		String ct=c.cr;	//�����������е����ƴ�ӳ��ַ���1
		String ft=c.fr;	//�����������е����ƴ�ӳ��ַ���2		
		add1.A(ct, ft);
		
		CFinput2s c2 = new CFinput2s(); //��3��4������satb����
		c2.C();		
		String t3=c2.cr;	//�����������е����ƴ�ӳ��ַ���1
		String t4=c2.fr;	//�����������е����ƴ�ӳ��ַ���2
		
		add2.A(add1.As,t3);
		
		add3.A(add2.As,t4);

	}// main

}// class
