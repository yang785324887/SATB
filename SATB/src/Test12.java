import java.util.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//////////////////////////////////////////////4����֪���ɵ�SATB���죨���п��ܣ�test
public class Test12 {	

	@SuppressWarnings("null")
	static int N = 35; // 31���׼���Ŀ
	static int M = 3; // 3������Ŀ
		
	public static void main(String[] args) {
		
		Add add1 =new Add();
		Add2 add2 =new Add2();
		Add3 add3 =new Add3();
		
		CF c = new CF();//��1��2������satb����
		c.C();		
		String ct=c.cr;	//�����������е����ƴ�ӳ��ַ���1
		String ft=c.fr;	//�����������е����ƴ�ӳ��ַ���2		
		add1.A(ct, ft);
		
		CF2 c2 = new CF2(); //��3��4������satb����
		c2.C(N, M);		
		String t3=c2.cr;	//�����������е����ƴ�ӳ��ַ���1
		String t4=c2.fr;	//�����������е����ƴ�ӳ��ַ���2
		
		add2.A(add1.As,t3);
		
		add3.A(add2.As,t4);

	}// main

}// class
