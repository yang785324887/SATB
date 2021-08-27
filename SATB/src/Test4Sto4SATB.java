import java.util.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//////////////////////////////////////////////输入4个旋律的构造4个SATB test
public class Test4Sto4SATB {	

	@SuppressWarnings("null")
	static int N = 35; // 31个白键数目
	static int M = 3; // 3个音数目
		
	public static void main(String[] args) {
		
		System.out.println("数字代表钢琴帘C1开始从左往右排列的号数，例如输入29表示C5 7*4+1=C5，输入32表示F5 7*4+4=F5，输入需小于41）");	
		
		Add1 add1 =new Add1();
		Add2 add2 =new Add2();
		Add3 add3 =new Add3();
		
		CFinput2s c = new CFinput2s();//第1第2个旋律satb构造
		c.C();		
		String ct=c.cr;	//所有声部排列的情况拼接成字符串1
		String ft=c.fr;	//所有声部排列的情况拼接成字符串2		
		add1.A(ct, ft);
		
		CFinput2s c2 = new CFinput2s(); //第3第4个旋律satb构造
		c2.C();		
		String t3=c2.cr;	//所有声部排列的情况拼接成字符串1
		String t4=c2.fr;	//所有声部排列的情况拼接成字符串2
		
		add2.A(add1.As,t3);
		
		add3.A(add2.As,t4);

	}// main

}// class
