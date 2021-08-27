import java.util.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//////////////////////////////////////////////输入4个旋律的构造4个SATB test
public class TestSATBadd3Sto4SATB {	

	@SuppressWarnings("null")
	static int N = 35; // 31个白键数目
	static int M = 3; // 3个音数目
		
	public static void main(String[] args) {
		
		Add0 add0 =new Add0(); //根据一个已知的satb，构造下一个已知旋律的satb，实例化
		System.out.println("数字代表钢琴帘C1开始从左往右排列的号数，例如输入 29,26,24,15 表示C5，G4，E4，C3  其中26=7*3+5=G4，24=7*3+3=E3，输入需小于41）");
		System.out.println("请在下一空行输入四个数构成四部和声，并用英文格式的逗号隔开：");
		
		Scanner sc = new Scanner(System.in); // 接收数据
		String str = sc.next().toString();
		String[] arr = str.split(",");
		int[] b = new int[arr.length]; // 创建旋律数组
		int i;

		if (b != null && b.length > 1) { // 3输入至少2个数

			for (i = 0; i < b.length; i++) { // 4循环接收旋律数组
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
		
		
		CFinput c = new CFinput();//第1第2个旋律satb构造
		c.C();		
		String ct=c.cr;	//所有声部排列的情况拼接成字符串1
		String ft=c.fr;	//所有声部排列的情况拼接成字符串2		
		add0.A(ct, ft);
		
		Add2 add2 =new Add2();
		Add3 add3 =new Add3();
		
		CFinput2s c2 = new CFinput2s(); //第3第4个旋律satb构造
		c2.C();		
		String t3=c2.cr;	//所有声部排列的情况拼接成字符串1
		String t4=c2.fr;	//所有声部排列的情况拼接成字符串2
		
		add2.A(add0.As,t3);
		
		add3.A(add2.As,t4);

	}// main

}// class
