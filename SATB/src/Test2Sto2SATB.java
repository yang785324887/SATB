import java.util.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/////////////////////////////输入2个旋律，构造两个satb链接。test
public class Test2Sto2SATB {	

	@SuppressWarnings("null")
	static int N = 35; // 31个白键数目
	static int M = 3; // 3个音数目
		
	public static void main(String[] args) {
		
		System.out.println("数字代表钢琴帘C1开始从左往右排列的号数，例如输入29表示C5 7*4+1=C5，输入32表示F5 7*4+4=F5，输入需小于41）");
		
		Add add =new Add(); //根据一个已知的satb，构造下一个已知旋律的satb，实例化
		
		CFinput2s c = new CFinput2s();//satb构造器实例化 里面输入下一个旋律

		c.C();		
		String ct=c.cr;	//所有声部排列的情况拼接成字符串1
		String ft=c.fr;	//所有声部排列的情况拼接成字符串2		
		add.A(ct, ft);		
	}// main

}// class
