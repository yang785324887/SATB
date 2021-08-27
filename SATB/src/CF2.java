import java.util.ArrayList;
import java.util.List;

////////////////////////////////////////////////////有4个旋律的进行的后两个旋律的SATB构造（未优化很多之前写的没用的代码）
public class CF2 {
	
	private static int chord1;
	private static int chord3;
	private static int chord5;

	private static int chord11;
	private static int chord13;
	private static int chord15;


	// static int parallel8 = 0; // 8度次数
	// static int parallel5 = 0; // 5度次数
	// static int second = 0; // 2度次数

	static int N = 41; // 35个白键数目
	static int M = 3; // 3个音数目
	static int C = 9999; // 防空指针
	static int D = 9999; // 防空指针
	static int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
			15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31,
			32, 33, 34, 35, 36, 37, 38, 39, 40, 41 };// 46,47,48,49,50//,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80
	// 钢琴键盘上对应的白键
	static int[] bb = new int[41];
	static int[] c = new int[99999]; // 从白键中抽3个进行排列的组合
	static int[] d = new int[99999]; // 符合条件的三个数的排列及和弦

	static int[] b = new int[] { 34, 32 }; // 创建旋律数组

	static int[] af = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
			14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
			31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41 };// 46,47,48,49,50//,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80
	static int[] bbf = new int[41];
	static int[] cf = new int[99999]; // 从白键中抽3个进行排列的组合
	static int[] df = new int[99999]; // 从白键中抽3个进行排列的组合

	// static int[] bf = new int[] { 33, 36 }; // 创建旋律数组

	static int[] b0 = new int[4];
	static int[] b1 = new int[4];
	static int[] b2 = new int[4];
	static int[] b3 = new int[4];
	static int[] intA[] = { b0, b1, b2, b3 };
	static String b0s = "";
	static String b1s = "";
	static String b2s = "";
	static String b3s = "";
	static String[] bs0 = new String[4];
	static String[] bs1 = new String[4];
	static String[] bs2 = new String[4];
	static String[] bs3 = new String[4];

	static int[] bb0 = new int[4];
	static int[] bb1 = new int[4];
	static int[] bb2 = new int[4];
	static int[] bb3 = new int[4];

	static ArrayList<String> s0 = new ArrayList<String>();
	static ArrayList<String> s1 = new ArrayList<String>();
	static ArrayList<String> s2 = new ArrayList<String>();
	static ArrayList<String> s3 = new ArrayList<String>();

	static List<String> qclist0 = new ArrayList<String>();
	static List<String> qclist1 = new ArrayList<String>();
	static List<String> qclist2 = new ArrayList<String>();
	static List<String> qclist3 = new ArrayList<String>();

	static List<String> concat12 = new ArrayList<String>();
	static String[] concat12sz = new String[16];
	static List<String> concatok12 = new ArrayList<String>();
	static ArrayList<String> concat12slist = new ArrayList<String>();



	static String cr = "";
	static String fr = "";
	
	public CF2() {

	}

	public static void C(int m, int n) { 
		
		if (b != null && b.length > 1) { // 3输入至少2个数

			for (int i = 0; i < b.length; i++) { // 4循环接收旋律数组

				if (i == 0) {		
		for(int i1=0;i1<b[i];i1++){
			for(int i2=0;i2<b[i];i2++){
				for(int i3=0;i3<b[i]-7;i3++){
					
								chord5=af[i1];
								chord3=af[i2];
								chord1=af[i3];
								
								boolean inChord = false;
								boolean morethenChord = false;
//								System.out.println(chord1+" "+chord3+" "+chord5 );
								if (
										(b[i] > chord5 && b[i] > chord3
										&& b[i] > chord1)
										&&
										(chord5>chord3&&chord5>chord1&&chord3>chord1)
										&&
										(b[i]- chord5<8&&chord5-chord3<8)										
								   )
	
								{
									morethenChord = true;
//									System.out.println(chord5+" "+chord3+" "+chord1 );
								}
								
								if (
//										(
//												(b[i] % 7 == chord1 % 7)|| (b[i] % 7 == chord3 % 7) || (b[i] % 7 == chord5 % 7)
//										)
//										&& 
										(
												((b[i] % 7 - (chord5) % 7) != 1)
												&& ((b[i] % 7 - (chord3) % 7) != 1)
												&& ((b[i] % 7 - (chord1) % 7) != 1)
												&& ((chord1 % 7 - b[i] % 7) != 1)
												&& ((chord3 % 7 - b[i] % 7) != 1)
												&& ((chord5 % 7 - b[i] % 7) != 1)
												&& 	
												((b[i] % 7 - (chord5) % 7) != 6)
												&& ((b[i] % 7 - (chord3) % 7) != 6)
												&& ((b[i] % 7 - (chord1) % 7) != 6)
												&& ((chord1 % 7 - b[i] % 7) != 6)
												&& ((chord3 % 7 - b[i] % 7) != 6)
												&& ((chord5 % 7 - b[i] % 7) != 6)
												
												&& 	
												(((chord5)% 7 - (chord3) % 7) != 1)
												&& (((chord5) % 7 - (chord1) % 7) != 1)
												&& (((chord3)% 7 - (chord5) % 7) != 1)
												&& (((chord1) % 7 - (chord5) % 7) != 1)
												&& 	
												(((chord5)% 7 - (chord3) % 7) != 6)
												&& (((chord5) % 7 - (chord1) % 7) != 6)
												&& (((chord3)% 7 - (chord5) % 7) != 6)
												&& (((chord1) % 7 - (chord5) % 7) != 6)
																								
												&& 	
												(((chord3)% 7 - (chord1) % 7) != 1)
												&& (((chord1) % 7 - (chord3) % 7) != 1)
												&& 	
												(((chord3)% 7 - (chord1) % 7) != 6)
												&& (((chord1) % 7 - (chord3) % 7) != 6)
													
										)												
								    ) // 排除2度7度关系
																	
								{
									inChord = true;
									//System.out.println(chord5+" "+chord3+" "+chord1 );
								}
								if(inChord&&morethenChord){
//									System.out.println(chord5+" "+chord3+" "+chord1 );
									
									if (b != null ) { // 声部非空
//										 System.out.println("开始判断和弦"
//										 + " ");
										boolean r = true;

										if (r) {

											b0s = "";
											b0[0] = b[i];
											b0[1] = chord5;
											b0[2] = chord3;
											b0[3] = chord1;

											for (int zhuani = 0; zhuani < 4; zhuani++) {

												b0s += "," + b0[zhuani];
											}

											s0.clear();
											s0.add(b0s);

											StringBuilder sb0 = new StringBuilder();
											String b0resultString = "";
											boolean flag0 = false;
											for (String str : s0) {
												if (flag0) {
													sb0.append(",");
												} else {
													flag0 = true;
												}
												sb0.append(str);
											}
											b0resultString = sb0
													.toString();

											String b0resultString2 = "";

											b0resultString2 = b0resultString
													.replaceAll(
															"[\\[\\]]",
															"")
													.replaceAll(" +",
															"");

											cr += b0resultString2;
											cr = cr.trim();

											sb0 = null;
											flag0 = false;
											b0resultString = "";
											b0resultString2 = "";
											b0s = "";
											s0.clear();
										}// r
									} // 声部非空
								}		
							}//fori3			
						}			
					}//fori1
				}//bi0
				if (i == 1) {		
		for(int i1=0;i1<b[i];i1++){
			for(int i2=0;i2<b[i];i2++){
				for(int i3=0;i3<b[i]-7;i3++){
									
								chord15=af[i1];
								chord13=af[i2];
								chord11=af[i3];
								
								boolean inchord1 = false;
								boolean morethenchord1 = false;
								
								if (
										(b[i] > chord15 && b[i] > chord13
										&& b[i] > chord11)
										&&
										(chord15>chord13&&chord15>chord11&&chord13>chord11)
										&&
										(b[i] -chord15<8&&chord15-chord13<8)	
								   )
	
								{
									morethenchord1 = true;
									// System.out.println("5.和旋低于旋律" );
								}
								
								if (
										(
												(b[i] % 7 == chord11 % 7)|| (b[i] % 7 == chord13 % 7) || (b[i] % 7 == chord15 % 7)
										)
										&& 
										(
												((b[i] % 7 - (chord15) % 7) != 1)
												&& ((b[i] % 7 - (chord13) % 7) != 1)
												&& ((b[i] % 7 - (chord11) % 7) != 1)
												&& ((chord11 % 7 - b[i] % 7) != 1)
												&& ((chord13 % 7 - b[i] % 7) != 1)
												&& ((chord15 % 7 - b[i] % 7) != 1)
												&& 	
												((b[i] % 7 - (chord15) % 7) != 6)
												&& ((b[i] % 7 - (chord13) % 7) != 6)
												&& ((b[i] % 7 - (chord11) % 7) != 6)
												&& ((chord11 % 7 - b[i] % 7) != 6)
												&& ((chord13 % 7 - b[i] % 7) != 6)
												&& ((chord15 % 7 - b[i] % 7) != 6)
												
												&& 	
												(((chord15)% 7 - (chord13) % 7) != 1)
												&& (((chord15) % 7 - (chord11) % 7) != 1)
												&& (((chord13)% 7 - (chord15) % 7) != 1)
												&& (((chord11) % 7 - (chord15) % 7) != 1)
												&& 	
												(((chord15)% 7 - (chord13) % 7) != 6)
												&& (((chord15) % 7 - (chord11) % 7) != 6)
												&& (((chord13)% 7 - (chord15) % 7) != 6)
												&& (((chord11) % 7 - (chord15) % 7) != 6)
																								
												&& 	
												(((chord13)% 7 - (chord11) % 7) != 1)
												&& (((chord11) % 7 - (chord13) % 7) != 1)
												&& 	
												(((chord13)% 7 - (chord11) % 7) != 6)
												&& (((chord11) % 7 - (chord13) % 7) != 6)
													
										)												
								    ) // 
																	
								{
									inchord1 = true;
								}
								if(inchord1&&morethenchord1){

									if (b != null ) { // 非空
											
										boolean r1 = true;
										if (r1) {

											b1s = "";
											b1[0] = b[i];
											b1[1] = chord15;
											b1[2] = chord13;
											b1[3] = chord11;

											for (int zhuani = 0; zhuani < 4; zhuani++) {

												b1s += "," + b1[zhuani]; // string
											}

											s1.clear();
											s1.add(b1s); // slist

											StringBuilder sb1 = new StringBuilder();
											String b1resultString = "";
											boolean flag1 = false;
											for (String str : s1) {
												if (flag1) {
													sb1.append(",");
												} else {
													flag1 = true;
												}
												sb1.append(str);
											}
											b1resultString = sb1
													.toString();

											String b1resultString2 = "";

											b1resultString2 = b1resultString
													.replaceAll(
															"[\\[\\]]",
															"")
													.replaceAll(" +",
															"");

											fr += b1resultString2;
											fr = fr.trim();

											sb1 = null;
											flag1 = false;
											b1resultString = "";
											b1resultString2 = "";
											b1s = "";
											s1.clear();
										}// r
									} // 声部非空
								}		
							}//fori3			
						}			
					}//fori1
				}//bi1
				
				
			}//bi
		}//bi
	}//C
	

}//class
