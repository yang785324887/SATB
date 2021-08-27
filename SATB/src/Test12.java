import java.util.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//////////////////////////////////////////////4个已知旋律的SATB构造（所有可能）test
public class Test12 {	

	@SuppressWarnings("null")
	static int N = 35; // 31个白键数目
	static int M = 3; // 3个音数目
		
	public static void main(String[] args) {
		
		Add add1 =new Add();
		Add2 add2 =new Add2();
		Add3 add3 =new Add3();
		
		CF c = new CF();//第1第2个旋律satb构造
		c.C();		
		String ct=c.cr;	//所有声部排列的情况拼接成字符串1
		String ft=c.fr;	//所有声部排列的情况拼接成字符串2		
		add1.A(ct, ft);
		
		CF2 c2 = new CF2(); //第3第4个旋律satb构造
		c2.C(N, M);		
		String t3=c2.cr;	//所有声部排列的情况拼接成字符串1
		String t4=c2.fr;	//所有声部排列的情况拼接成字符串2
		
		add2.A(add1.As,t3);
		
		add3.A(add2.As,t4);

	}// main

}// class
