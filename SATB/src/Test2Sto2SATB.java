import java.util.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/////////////////////////////����2�����ɣ���������satb���ӡ�test
public class Test2Sto2SATB {	

	@SuppressWarnings("null")
	static int N = 35; // 31���׼���Ŀ
	static int M = 3; // 3������Ŀ
		
	public static void main(String[] args) {
		
		System.out.println("���ִ��������C1��ʼ�����������еĺ�������������29��ʾC5 7*4+1=C5������32��ʾF5 7*4+4=F5��������С��41��");
		
		Add add =new Add(); //����һ����֪��satb��������һ����֪���ɵ�satb��ʵ����
		
		CFinput2s c = new CFinput2s();//satb������ʵ���� ����������һ������

		c.C();		
		String ct=c.cr;	//�����������е����ƴ�ӳ��ַ���1
		String ft=c.fr;	//�����������е����ƴ�ӳ��ַ���2		
		add.A(ct, ft);		
	}// main

}// class
