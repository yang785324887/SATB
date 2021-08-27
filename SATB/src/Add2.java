import java.util.ArrayList;

//////////////////////////////////////////////SATBtest构造封装 可输出字符串（多旋律组合专用2）
public class Add2 {
		
	static String As;
	static String As1;
	public Add2() {

	}
		

		
		public static void A(String ct,String ft) { //  对比和声 处理关系
			
			int[] A = new int[99999];
		
			String  b0s = "";
			ArrayList<String> s0 = new ArrayList<String>();

			int[] A1 = new int[99999];
			String  b1s = "";
			ArrayList<String> s1 = new ArrayList<String>();
			
			
			
//			System.out.println("ct：" + ct);
//			System.out.println("ft：" + ft);
			System.out.println(" " );
			
			
			
			ArrayList<String> cast = new ArrayList<String>();				
			String[] cat = new String[99999];
			int[] cant = new int[99999];

			for (int ic = 0; ic < ct.length(); ic++) {
				cat = ct.split(",");

			}

			for (int ia = 0; ia < cat.length; ia++) {
				cast.add(cat[ia]);
			}
			cast.set(0, "0");
//			System.out.println(cast.size());
			// cas.remove(0);
			// System.out.println(cas);

			for (int ia = 0; ia < cast.size(); ia++) {
				cant[ia] = Integer.parseInt(cast.get(ia));//所有音所有声部排列的情况 转成int数组
				// cai.add(Integer.parseInt(cas.get(ia)));
			}
			// cai.remove(0);
//			System.out.println("cant[ia]: ");
//			for (int ia = 1; ia < cast.size(); ia++) {
//				System.out.print(cant[ia] + " ");
//			}
			System.out.println("");
			
			
			
			ArrayList<String> fast = new ArrayList<String>();
			String[] fat = new String[99999];
			int[] fant = new int[99999];
			
			
			for (int ic = 0; ic < ft.length(); ic++) {
				fat = ft.split(",");
			}
			
			for (int ia = 0; ia < fat.length; ia++) {
				fast.add(fat[ia]);
			}
			fast.set(0, "0");
//			System.out.println(fast.size());
			for (int ia = 0; ia < fast.size(); ia++) {
				fant[ia] = Integer.parseInt(fast.get(ia));//所有音 所有声部排列的情况 转成int数组
			}
			// fai.remove(0);
//			System.out.println("fant[ia]: ");
//			for (int ia = 1; ia < fast.size(); ia++) {
//				System.out.print(fant[ia] + " ");
//			}
//			System.out.println("fast.size():"+fast.size());//
			
			System.out.println(" " );
			
			int count=0;
			for (int i = 1; i < fast.size(); i += 4) {
                                        //外层数组 指针一次前进4个
				for (int ii = 5; ii < cast.size(); ii += 8) {	//内层数组 指针一次前进8个
					//外层四个数和内层的四个数构成两个四部和声链接
//					int count1=0;
//					if(count1>4){
//						i+=4;
//					}
//					count1++; 
					
					boolean r2 = false;// parallel8 5
					boolean r3 = false;
					boolean r4 = false;
					boolean r5 = false;//
					boolean r6 = false;//
					boolean r51 = false;
					boolean r61 = false;
					boolean r7 = false;
					boolean r8 = true;// 排除3个声部音相同
					boolean r9 = false;// 反向8 5度
					// ///////////////
					boolean r10 = true;// 四部同向
					boolean r11 = true;// 排除增四度
					boolean r12 = true;// 备用
					boolean r13 = true;// 备用
					boolean r14 = true;// 备用
					boolean r15 = true;// 备用
					int hx = 0;
					int parallel8s = 0;
					int parallel5s = 0;

					int openparallel8s = 0;
					int openparallel5s = 0;
					int seconds = 0;
					int bassin8 = 0;

					// ///////////////////////cant
					int chordnum = 0;
					String ck = "";
					// /////////////////////1
					if ((cant[ii] % 7 == 1) || (cant[ii] % 7 == 3)
							|| (cant[ii] % 7 == 5)) {
						if ((cant[ii + 1] % 7 == 1) && (cant[ii + 2] % 7 == 3)
								&& (cant[ii + 3] % 7 == 5)) {
							chordnum = 10135;
							r51 = true;
						}
						if ((cant[ii + 1] % 7 == 1) && (cant[ii + 3] % 7 == 3)
								&& (cant[ii + 2] % 7 == 5)
								&& (cant[ii] % 7 == 1 || cant[ii] % 7 == 5)) {
							chordnum = 10153;
							r51 = true;
							r5 = true;
							ck = "一级六和弦";
						}
						if ((cant[ii + 2] % 7 == 1) && (cant[ii + 1] % 7 == 3)
								&& (cant[ii + 3] % 7 == 5)) {
							chordnum = 10315;
							r51 = true;
						}
						if ((cant[ii + 2] % 7 == 1) && (cant[ii + 3] % 7 == 3)
								&& (cant[ii + 1] % 7 == 5)
								&& (cant[ii] % 7 == 1 || cant[ii] % 7 == 5)) {
							chordnum = 10513;
							r51 = true;
							r5 = true;
							ck = "一级六和弦";
						}
						if ((cant[ii + 3] % 7 == 1) && (cant[ii + 1] % 7 == 3)
								&& (cant[ii + 2] % 7 == 5) && cant[ii] % 7 == 1) {
							chordnum = 10351;
							r51 = true;
							r5 = true;
							ck = "一级正三和弦";
						}
						if ((cant[ii + 3] % 7 == 1) && (cant[ii + 2] % 7 == 3)
								&& (cant[ii + 1] % 7 == 5) && cant[ii] % 7 == 1) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "一级正三和弦";
						}
						// ///////////////a=t1
						// if ((cant[ii+3] % 7 == 1) && (cant[ii+2] % 7 == 3)
						// && (cant[ii+1] % 7 == 3)&&cant[ii]% 7 == 5) {
						// chordnum = 10531;r51 = true;
						// r5=true;
						// }
						if ((cant[ii + 3] % 7 == 1) && (cant[ii + 2] % 7 == 5)
								&& (cant[ii + 1] % 7 == 5) && cant[ii] % 7 == 3) {
							chordnum = 10531;
							r51 = true;
							// r5=true;ck="一级正三和弦重复5音";
						}
						// ///////////////a=t3
						if ((cant[ii + 3] % 7 == 3) && (cant[ii + 2] % 7 == 5)
								&& (cant[ii + 1] % 7 == 5) && cant[ii] % 7 == 1) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "一级六和弦重复5音 A=T 根音旋律位置";
						}
						if ((cant[ii + 3] % 7 == 3) && (cant[ii + 2] % 7 == 1)
								&& (cant[ii + 1] % 7 == 1) && cant[ii] % 7 == 5) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "一级六和弦重复根音 A=T 五音旋律位置";
						}
						// //////////////a=b1
						if ((cant[ii + 3] % 7 == 1) && (cant[ii + 2] % 7 == 3)
								&& (cant[ii + 1] % 7 == 1) && cant[ii] % 7 == 5) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "一级正三和弦重复根音 A=B 五音旋律位置";
						}
						if ((cant[ii + 3] % 7 == 1) && (cant[ii + 2] % 7 == 5)
								&& (cant[ii + 1] % 7 == 1) && cant[ii] % 7 == 3) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "一级正三和弦重复根音 A=B 三音旋律位置";
						}
						// //////////////a=b5
						if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 1)
								&& (cant[ii + 1] % 7 == 5) && cant[ii] % 7 == 3) {
							chordnum = 10531;
							r51 = true;
							// r5=true;ck="一级四六和弦 重复五音 A=B 三音旋律位置";
						}
						if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 3)
								&& (cant[ii + 1] % 7 == 5) && cant[ii] % 7 == 1) {
							chordnum = 10531;
							r51 = true;
							// r5=true;ck="一级四六和弦 重复五音 A=B 根音旋律位置";
						}
						// //////////////t=b1
						if ((cant[ii + 3] % 7 == 1) && (cant[ii + 2] % 7 == 1)
								&& (cant[ii + 1] % 7 == 3) && cant[ii] % 7 == 5) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "一级正三和弦重复根音 T=B 五音旋律位置";
						}
						if ((cant[ii + 3] % 7 == 1) && (cant[ii + 2] % 7 == 1)
								&& (cant[ii + 1] % 7 == 5) && cant[ii] % 7 == 3) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "一级正三和弦重复根音 T=B 三音旋律位置";
						}
						// //////////////t=b5
						if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 5)
								&& (cant[ii + 1] % 7 == 1) && cant[ii] % 7 == 3) {
							chordnum = 10531;
							r51 = true;
							// r5=true;ck="一级四六和弦 重复五音 T=B 三音旋律位置";
						}
						if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 5)
								&& (cant[ii + 1] % 7 == 3) && cant[ii] % 7 == 1) {
							chordnum = 10531;
							r51 = true;
							// r5=true;ck="一级四六和弦 重复五音 T=B 根音旋律位置";
						}
					}

					// //////////////////2
					if ((cant[ii] % 7 == 2) || (cant[ii] % 7 == 4)
							|| (cant[ii] % 7 == 6)) {
						if ((cant[ii + 1] % 7 == 2) && (cant[ii + 2] % 7 == 4)
								&& (cant[ii + 3] % 7 == 6)) {
							chordnum = 20246;
							r51 = true;
						}
						if ((cant[ii + 1] % 7 == 2) && (cant[ii + 3] % 7 == 4)
								&& (cant[ii + 2] % 7 == 6)) {
							chordnum = 20264;
							r51 = true;
							r5 = true;
							ck = "二级六和弦";
						}

						if ((cant[ii + 2] % 7 == 2) && (cant[ii + 1] % 7 == 4)
								&& (cant[ii + 3] % 7 == 6)) {
							chordnum = 20426;
							r51 = true;
						}
						if ((cant[ii + 2] % 7 == 2) && (cant[ii + 3] % 7 == 4)
								&& (cant[ii + 1] % 7 == 6)) {
							chordnum = 20624;
							r51 = true;
							r5 = true;
							ck = "二级六和弦";
						}

						if ((cant[ii + 3] % 7 == 2) && (cant[ii + 1] % 7 == 4)
								&& (cant[ii + 2] % 7 == 6)) {
							chordnum = 20462;
							r51 = true;
							r5 = true;
							ck = "二级原位和弦";
						}
						if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 4)
								&& (cant[ii + 1] % 7 == 6)) {
							chordnum = 20642;
							r51 = true;
							r5 = true;
							ck = "二级原位和弦";
						}
						// ///////////////a=t2 4
						if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 4)
								&& (cant[ii + 1] % 7 == 4) && cant[ii] % 7 == 6) {
							chordnum = 10422;
							r51 = true;
							r5 = true;
							ck = "二级原位和弦 重复三音A=T 五音旋律位置";
						}
						// if ((cant[ii+3] % 7 == 4) && (cant[ii+2] % 7 == 6)
						// && (cant[ii+1] % 7 == 6)&&cant[ii]% 7==2) {
						// chordnum = 10466;r51 = true;
						// r5=true;
						// }

						// //////////////a=t4 2
						if ((cant[ii + 3] % 7 == 4) && (cant[ii + 2] % 7 == 2)
								&& (cant[ii + 1] % 7 == 2) && cant[ii] % 7 == 6) {
							chordnum = 10422;
							r51 = true;
							r5 = true;
							ck = "二级六和弦 重复根音A=T 五音旋律位置";
						}

						// /////////////// a=b4
						if ((cant[ii + 3] % 7 == 4) && (cant[ii + 2] % 7 == 2)
								&& (cant[ii + 1] % 7 == 4) && cant[ii] % 7 == 6) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "二级六和弦 重复三音A=B 五音旋律位置";
						}
						if ((cant[ii + 3] % 7 == 4) && (cant[ii + 2] % 7 == 6)
								&& (cant[ii + 1] % 7 == 4) && cant[ii] % 7 == 2) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "二级六和弦 重复三音A=B 根音旋律位置";
						}
						// /////////////// a=b2
						if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 4)
								&& (cant[ii + 1] % 7 == 2) && cant[ii] % 7 == 6) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "二级原位和弦 重复根音A=B 五音旋律位置";
						}
						if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 6)
								&& (cant[ii + 1] % 7 == 2) && cant[ii] % 7 == 4) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "二级原位和弦 重复根音A=B 三音旋律位置";
						}
						// //////////////t=b4
						if ((cant[ii + 3] % 7 == 4) && (cant[ii + 2] % 7 == 4)
								&& (cant[ii + 1] % 7 == 2) && cant[ii] % 7 == 6) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "二级六和弦 重复三音T=B 五音旋律位置";
						}
						if ((cant[ii + 3] % 7 == 4) && (cant[ii + 2] % 7 == 4)
								&& (cant[ii + 1] % 7 == 6) && cant[ii] % 7 == 2) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "二级六和弦 重复三音T=B 根音旋律位置";
						}
						// //////////////t=b2
						if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 2)
								&& (cant[ii + 1] % 7 == 4) && cant[ii] % 7 == 6) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "二级原位和弦 重复根音T=B 五音旋律位置";
						}
						if ((cant[ii + 3] % 7 == 4) && (cant[ii + 2] % 7 == 4)
								&& (cant[ii + 1] % 7 == 2) && cant[ii] % 7 == 4) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "二级原位和弦 重复根音T=B 三音旋律位置";
						}
					}

					// /////////////////////////////3
					if ((cant[ii] % 7 == 3) || (cant[ii] % 7 == 5)
							|| (cant[ii] % 7 == 0)) {
						if ((cant[ii + 1] % 7 == 3) && (cant[ii + 2] % 7 == 5)
								&& (cant[ii + 3] % 7 == 0)) {
							chordnum = 20246;
							r51 = true;
						}
						if ((cant[ii + 1] % 7 == 3) && (cant[ii + 3] % 7 == 5)
								&& (cant[ii + 2] % 7 == 0)) {
							chordnum = 20264;
							r51 = true;
							r5 = true;
							ck = "三级六和弦";
						}

						if ((cant[ii + 2] % 7 == 3) && (cant[ii + 1] % 7 == 5)
								&& (cant[ii + 3] % 7 == 0)) {
							chordnum = 20426;
							r51 = true;
						}
						if ((cant[ii + 2] % 7 == 3) && (cant[ii + 3] % 7 == 5)
								&& (cant[ii + 1] % 7 == 0)) {
							chordnum = 20624;
							r51 = true;
							r5 = true;
							ck = "三级六和弦";
						}

						if ((cant[ii + 3] % 7 == 3) && (cant[ii + 1] % 7 == 5)
								&& (cant[ii + 2] % 7 == 0)) {
							chordnum = 20462;
							r51 = true;
							r5 = true;
							ck = "三级原位和弦";
						}
						if ((cant[ii + 3] % 7 == 3) && (cant[ii + 2] % 7 == 5)
								&& (cant[ii + 1] % 7 == 0)) {
							chordnum = 20642;
							r51 = true;
							r5 = true;
							ck = "三级原位和弦";
						}
						// ///////////////a=t2 4
						if ((cant[ii + 3] % 7 == 3) && (cant[ii + 2] % 7 == 5)
								&& (cant[ii + 1] % 7 == 5) && cant[ii] % 7 == 0) {
							chordnum = 10422;
							r51 = true;
							r5 = true;
							ck = "三级原位和弦 重复三音A=T 五音旋律位置";
						}
						// if ((cant[ii+3] % 7 == 5) && (cant[ii+2] % 7 == 0)
						// && (cant[ii+1] % 7 == 0)&&cant[ii]% 7==2) {
						// chordnum = 10466;r51 = true;
						// r5=true;
						// }

						// //////////////a=t4 2
						if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 3)
								&& (cant[ii + 1] % 7 == 3) && cant[ii] % 7 == 0) {
							chordnum = 10422;
							r51 = true;
							r5 = true;
							ck = "三级六和弦 重复根音A=T 五音旋律位置";
						}

						// /////////////// a=b4
						if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 3)
								&& (cant[ii + 1] % 7 == 5) && cant[ii] % 7 == 0) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "三级六和弦 重复三音A=B 五音旋律位置";
						}
						if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 0)
								&& (cant[ii + 1] % 7 == 5) && cant[ii] % 7 == 3) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "三级六和弦 重复三音A=B 根音旋律位置";
						}
						// /////////////// a=b2
						if ((cant[ii + 3] % 7 == 3) && (cant[ii + 2] % 7 == 5)
								&& (cant[ii + 1] % 7 == 3) && cant[ii] % 7 == 0) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "三级原位和弦 重复根音A=B 五音旋律位置";
						}
						if ((cant[ii + 3] % 7 == 3) && (cant[ii + 2] % 7 == 0)
								&& (cant[ii + 1] % 7 == 3) && cant[ii] % 7 == 5) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "三级原位和弦 重复根音A=B 三音旋律位置";
						}
						// //////////////t=b4
						if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 5)
								&& (cant[ii + 1] % 7 == 3) && cant[ii] % 7 == 0) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "三级六和弦 重复三音T=B 五音旋律位置";
						}
						if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 5)
								&& (cant[ii + 1] % 7 == 0) && cant[ii] % 7 == 3) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "三级六和弦 重复三音T=B 根音旋律位置";
						}
						// //////////////t=b2
						if ((cant[ii + 3] % 7 == 3) && (cant[ii + 2] % 7 == 3)
								&& (cant[ii + 1] % 7 == 5) && cant[ii] % 7 == 0) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "三级原位和弦 重复根音T=B 五音旋律位置";
						}
						if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 5)
								&& (cant[ii + 1] % 7 == 3) && cant[ii] % 7 == 5) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "三级原位和弦 重复根音T=B 三音旋律位置";
						}
					}

					// /////////////////4
					if ((cant[ii] % 7 == 4) || (cant[ii] % 7 == 6)
							|| (cant[ii] % 7 == 1)) {
						if ((cant[ii + 1] % 7 == 4) && (cant[ii + 2] % 7 == 6)
								&& (cant[ii + 3] % 7 == 1)) {
							chordnum = 10135;
							r51 = true;
						}
						if ((cant[ii + 1] % 7 == 4) && (cant[ii + 3] % 7 == 6)
								&& (cant[ii + 2] % 7 == 1)
								&& (cant[ii] % 7 == 4 || cant[ii] % 7 == 1)) {
							chordnum = 10153;
							r51 = true;
							r5 = true;
							ck = "四级六和弦";
						}
						if ((cant[ii + 2] % 7 == 4) && (cant[ii + 1] % 7 == 6)
								&& (cant[ii + 3] % 7 == 1)) {
							chordnum = 10315;
							r51 = true;
						}
						if ((cant[ii + 2] % 7 == 4) && (cant[ii + 3] % 7 == 6)
								&& (cant[ii + 1] % 7 == 1)
								&& (cant[ii] % 7 == 4 || cant[ii] % 7 == 1)) {
							chordnum = 10513;
							r51 = true;
							r5 = true;
							ck = "四级六和弦";
						}
						if ((cant[ii + 3] % 7 == 4) && (cant[ii + 1] % 7 == 6)
								&& (cant[ii + 2] % 7 == 1) && cant[ii] % 7 == 4) {
							chordnum = 10351;
							r51 = true;
							r5 = true;
							ck = "四级正三和弦";
						}
						if ((cant[ii + 3] % 7 == 4) && (cant[ii + 2] % 7 == 6)
								&& (cant[ii + 1] % 7 == 1) && cant[ii] % 7 == 4) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "四级正三和弦";
						}
						// ///////////////a=t1
						// if ((cant[ii+3] % 7 == 4) && (cant[ii+2] % 7 == 6)
						// && (cant[ii+1] % 7 == 6)&&cant[ii]% 7 == 1) {
						// chordnum = 10531;r51 = true;
						// r5=true;
						// }
						if ((cant[ii + 3] % 7 == 4) && (cant[ii + 2] % 7 == 1)
								&& (cant[ii + 1] % 7 == 1) && cant[ii] % 7 == 6) {
							chordnum = 10531;
							r51 = true;
							// r5=true;ck="四级正三和弦重复5音";
						}
						// ///////////////a=t3
						if ((cant[ii + 3] % 7 == 6) && (cant[ii + 2] % 7 == 1)
								&& (cant[ii + 1] % 7 == 1) && cant[ii] % 7 == 4) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "四级六和弦重复5音 A=T 根音旋律位置";
						}
						if ((cant[ii + 3] % 7 == 6) && (cant[ii + 2] % 7 == 4)
								&& (cant[ii + 1] % 7 == 4) && cant[ii] % 7 == 1) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "四级六和弦重复根音 A=T 五音旋律位置";
						}
						// //////////////a=b1
						if ((cant[ii + 3] % 7 == 4) && (cant[ii + 2] % 7 == 6)
								&& (cant[ii + 1] % 7 == 4) && cant[ii] % 7 == 1) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "四级正三和弦重复根音 A=B 五音旋律位置";
						}
						if ((cant[ii + 3] % 7 == 4) && (cant[ii + 2] % 7 == 1)
								&& (cant[ii + 1] % 7 == 4) && cant[ii] % 7 == 6) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "四级正三和弦重复根音 A=B 三音旋律位置";
						}
						// //////////////a=b5
						if ((cant[ii + 3] % 7 == 1) && (cant[ii + 2] % 7 == 4)
								&& (cant[ii + 1] % 7 == 1) && cant[ii] % 7 == 6) {
							chordnum = 10531;
							r51 = true;
							// r5=true;ck="四级四六和弦 重复五音 A=B 三音旋律位置";
						}
						if ((cant[ii + 3] % 7 == 1) && (cant[ii + 2] % 7 == 6)
								&& (cant[ii + 1] % 7 == 1) && cant[ii] % 7 == 4) {
							chordnum = 10531;
							r51 = true;
							// r5=true;ck="四级四六和弦 重复五音 A=B 根音旋律位置";
						}
						// //////////////t=b1
						if ((cant[ii + 3] % 7 == 4) && (cant[ii + 2] % 7 == 4)
								&& (cant[ii + 1] % 7 == 6) && cant[ii] % 7 == 1) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "四级正三和弦重复根音 T=B 五音旋律位置";
						}
						if ((cant[ii + 3] % 7 == 4) && (cant[ii + 2] % 7 == 4)
								&& (cant[ii + 1] % 7 == 1) && cant[ii] % 7 == 6) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "四级正三和弦重复根音 T=B 三音旋律位置";
						}
						// //////////////t=b5
						if ((cant[ii + 3] % 7 == 1) && (cant[ii + 2] % 7 == 1)
								&& (cant[ii + 1] % 7 == 4) && cant[ii] % 7 == 6) {
							chordnum = 10531;
							r51 = true;
							// r5=true;ck="四级四六和弦 重复五音 T=B 三音旋律位置";
						}
						if ((cant[ii + 3] % 7 == 1) && (cant[ii + 2] % 7 == 1)
								&& (cant[ii + 1] % 7 == 6) && cant[ii] % 7 == 4) {
							chordnum = 10531;
							r51 = true;
							// r5=true;ck="四级四六和弦 重复五音 T=B 根音旋律位置";
						}
					}

					// ////////////////////////5
					if ((cant[ii] % 7 == 5) || (cant[ii] % 7 == 0)
							|| (cant[ii] % 7 == 2)) {
						if ((cant[ii + 1] % 7 == 5) && (cant[ii + 2] % 7 == 0)
								&& (cant[ii + 3] % 7 == 2)) {
							chordnum = 10135;
							r51 = true;
						}
						if ((cant[ii + 1] % 7 == 5) && (cant[ii + 3] % 7 == 0)
								&& (cant[ii + 2] % 7 == 2)
								&& (cant[ii] % 7 == 5 || cant[ii] % 7 == 2)) {
							chordnum = 10153;
							r51 = true;
							r5 = true;
							ck = "五级六和弦";
						}
						if ((cant[ii + 2] % 7 == 5) && (cant[ii + 1] % 7 == 0)
								&& (cant[ii + 3] % 7 == 2)) {
							chordnum = 10315;
							r51 = true;
						}
						if ((cant[ii + 2] % 7 == 5) && (cant[ii + 3] % 7 == 0)
								&& (cant[ii + 1] % 7 == 2)
								&& (cant[ii] % 7 == 5 || cant[ii] % 7 == 2)) {
							chordnum = 10513;
							r51 = true;
							r5 = true;
							ck = "五级六和弦";
						}
						if ((cant[ii + 3] % 7 == 5) && (cant[ii + 1] % 7 == 0)
								&& (cant[ii + 2] % 7 == 2) && cant[ii] % 7 == 5) {
							chordnum = 10351;
							r51 = true;
							r5 = true;
							ck = "五级正三和弦";
						}
						if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 0)
								&& (cant[ii + 1] % 7 == 2) && cant[ii] % 7 == 5) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "五级正三和弦";
						}
						// ///////////////a=t1
						// if ((cant[ii+3] % 7 == 5) && (cant[ii+2] % 7 == 0)
						// && (cant[ii+1] % 7 == 0)&&cant[ii]% 7 == 2) {
						// chordnum = 10531;r51 = true;
						// r5=true;
						// }
						if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 2)
								&& (cant[ii + 1] % 7 == 2) && cant[ii] % 7 == 0) {
							chordnum = 10531;
							r51 = true;
							// r5=true;ck="五级正三和弦重复5音";
						}
						// ///////////////a=t3
						if ((cant[ii + 3] % 7 == 0) && (cant[ii + 2] % 7 == 2)
								&& (cant[ii + 1] % 7 == 2) && cant[ii] % 7 == 5) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "五级六和弦重复5音 A=T 根音旋律位置";
						}
						if ((cant[ii + 3] % 7 == 0) && (cant[ii + 2] % 7 == 5)
								&& (cant[ii + 1] % 7 == 5) && cant[ii] % 7 == 2) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "五级六和弦重复根音 A=T 五音旋律位置";
						}
						// //////////////a=b1
						if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 0)
								&& (cant[ii + 1] % 7 == 5) && cant[ii] % 7 == 2) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "五级正三和弦重复根音 A=B 五音旋律位置";
						}
						if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 2)
								&& (cant[ii + 1] % 7 == 5) && cant[ii] % 7 == 0) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "五级正三和弦重复根音 A=B 三音旋律位置";
						}
						// //////////////a=b5
						if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 5)
								&& (cant[ii + 1] % 7 == 2) && cant[ii] % 7 == 0) {
							chordnum = 10531;
							r51 = true;
							// r5=true;ck="五级四六和弦 重复五音 A=B 三音旋律位置";
						}
						if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 0)
								&& (cant[ii + 1] % 7 == 2) && cant[ii] % 7 == 5) {
							chordnum = 10531;
							r51 = true;
							// r5=true;ck="五级四六和弦 重复五音 A=B 根音旋律位置";
						}
						// //////////////t=b1
						if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 5)
								&& (cant[ii + 1] % 7 == 0) && cant[ii] % 7 == 2) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "五级正三和弦重复根音 T=B 五音旋律位置";
						}
						if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 5)
								&& (cant[ii + 1] % 7 == 2) && cant[ii] % 7 == 0) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "五级正三和弦重复根音 T=B 三音旋律位置";
						}
						// //////////////t=b5
						if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 2)
								&& (cant[ii + 1] % 7 == 5) && cant[ii] % 7 == 0) {
							chordnum = 10531;
							r51 = true;
							// r5=true;ck="五级四六和弦 重复五音 T=B 三音旋律位置";
						}
						if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 2)
								&& (cant[ii + 1] % 7 == 0) && cant[ii] % 7 == 5) {
							chordnum = 10531;
							r51 = true;
							// r5=true;ck="五级四六和弦 重复五音 T=B 根音旋律位置";
						}
					}

					// /////////////////6
					if ((cant[ii] % 7 == 6) || (cant[ii] % 7 == 1)
							|| (cant[ii] % 7 == 3)) {
						if ((cant[ii + 1] % 7 == 6) && (cant[ii + 2] % 7 == 1)
								&& (cant[ii + 3] % 7 == 3)) {
							chordnum = 60613;
							r51 = true;
						}
						if ((cant[ii + 1] % 7 == 6) && (cant[ii + 3] % 7 == 1)
								&& (cant[ii + 2] % 7 == 3)) {
							chordnum = 60631;
							r51 = true;

						}
						if ((cant[ii + 2] % 7 == 6) && (cant[ii + 1] % 7 == 1)
								&& (cant[ii + 3] % 7 == 3)) {
							chordnum = 70274;
							r51 = true;
						}
						if ((cant[ii + 2] % 7 == 6) && (cant[ii + 3] % 7 == 1)
								&& (cant[ii + 1] % 7 == 3)) {
							chordnum = 60361;
							r51 = true;

						}
						if ((cant[ii + 3] % 7 == 6) && (cant[ii + 1] % 7 == 1)
								&& (cant[ii + 2] % 7 == 3)
								&& (cant[ii] % 7 == 6 || cant[ii] % 7 == 1)) {
							chordnum = 70247;
							r51 = true;
							r5 = true;
							ck = "六级原位三和弦";
						}
						if ((cant[ii + 3] % 7 == 6) && (cant[ii + 2] % 7 == 1)
								&& (cant[ii + 1] % 7 == 3)
								&& (cant[ii] % 7 == 6 || cant[ii] % 7 == 1)) {
							chordnum = 70427;
							r51 = true;
							r5 = true;
							ck = "六级原位三和弦";
						}
						// ///////////////a=t
						if ((cant[ii + 3] % 7 == 6) && (cant[ii + 2] % 7 == 3)
								&& (cant[ii + 1] % 7 == 3) && cant[ii] % 7 == 1) {
							chordnum = 10422;
							r51 = true;
							r5 = true;
							ck = "六级原位三和弦 A=T 重复五音 根音旋律";
						}
						// if ((cant[ii+3] % 7 == 1) && (cant[ii+2] % 7 == 6)
						// && (cant[ii+1] % 7 == 6)&&cant[ii]% 7==3) {
						// chordnum = 10466;r51 = true;
						// r5=true;
						// }
						// //////////////a=b
						if ((cant[ii + 3] % 7 == 6) && (cant[ii + 2] % 7 == 3)
								&& (cant[ii + 1] % 7 == 6) && cant[ii] % 7 == 1) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "六级原位三和弦 A=B 重复根音 三音旋律";
						}
						if ((cant[ii + 3] % 7 == 6) && (cant[ii + 2] % 7 == 1)
								&& (cant[ii + 1] % 7 == 6) && cant[ii] % 7 == 3) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "六级原位三和弦 A=B 重复根音 五音旋律";
						}
						// //////////////t=b
						if ((cant[ii + 3] % 7 == 6) && (cant[ii + 2] % 7 == 6)
								&& (cant[ii + 1] % 7 == 3) && cant[ii] % 7 == 1) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "六级原位三和弦 T=B 重复根音 三音旋律";
						}
						if ((cant[ii + 3] % 7 == 6) && (cant[ii + 2] % 7 == 6)
								&& (cant[ii + 1] % 7 == 1) && cant[ii] % 7 == 3) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "六级原位三和弦 T=B 重复根音 五音旋律";
						}
					}

					// /////////////////7
					if ((cant[ii] % 7 == 0) || (cant[ii] % 7 == 2)
							|| (cant[ii] % 7 == 4)) {
						if ((cant[ii + 1] % 7 == 0) && (cant[ii + 2] % 7 == 2)
								&& (cant[ii + 3] % 7 == 4)) {
							chordnum = 70724;
							r51 = true;
						}
						if ((cant[ii + 1] % 7 == 0) && (cant[ii + 3] % 7 == 2)
								&& (cant[ii + 2] % 7 == 4)) {
							chordnum = 70742;
							r51 = true;
							r5 = true;
							ck = "七级六和弦";
						}
						if ((cant[ii + 2] % 7 == 0) && (cant[ii + 1] % 7 == 2)
								&& (cant[ii + 3] % 7 == 4)) {
							chordnum = 70274;
							r51 = true;
						}
						if ((cant[ii + 2] % 7 == 0) && (cant[ii + 3] % 7 == 2)
								&& (cant[ii + 1] % 7 == 4)) {
							chordnum = 70472;
							r51 = true;
							r5 = true;
							ck = "七级六和弦";
						}
						if ((cant[ii + 3] % 7 == 0) && (cant[ii + 1] % 7 == 2)
								&& (cant[ii + 2] % 7 == 4)) {
							chordnum = 70247;
							r51 = true;
						}
						if ((cant[ii + 3] % 7 == 0) && (cant[ii + 2] % 7 == 2)
								&& (cant[ii + 1] % 7 == 4)) {
							chordnum = 70427;
							r51 = true;
						}
						// ///////////////a=t
						if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 4)
								&& (cant[ii + 1] % 7 == 4) && cant[ii] % 7 == 0) {
							chordnum = 10422;
							r51 = true;
							r5 = true;
							ck = "七级六和弦 重复五音A=T 根音旋律 ";
						}
						if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 0)
								&& (cant[ii + 1] % 7 == 0) && cant[ii] % 7 == 4) {
							chordnum = 10466;
							r51 = true;
							r5 = true;
							ck = "七级六和弦 重复根音A=T 五音旋律 ";
						}
						// //////////////a=b
						if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 0)
								&& (cant[ii + 1] % 7 == 2) && cant[ii] % 7 == 4) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "七级六和弦 重复五音A=B 五音旋律 ";
						}
						if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 4)
								&& (cant[ii + 1] % 7 == 2) && cant[ii] % 7 == 0) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "七级六和弦 重复五音A=B 根音旋律 ";
						}
						// //////////////t=b
						if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 2)
								&& (cant[ii + 1] % 7 == 0) && cant[ii] % 7 == 4) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "七级六和弦 重复五音T=B 五音旋律 ";
						}
						if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 2)
								&& (cant[ii + 1] % 7 == 4) && cant[ii] % 7 == 0) {
							chordnum = 10531;
							r51 = true;
							r5 = true;
							ck = "七级六和弦 重复五音T=B 根音旋律 ";
						}
					}

					// ///////////////////////fant main
					int chordnum1 = 0;
					String ck2 = "";
					if ((fant[i] % 7 == 1) || (fant[i] % 7 == 3)
							|| (fant[i] % 7 == 5)) {
						if ((fant[i + 1] % 7 == 1) && (fant[i + 2] % 7 == 3)
								&& (fant[i + 3] % 7 == 5)) {
							chordnum = 10135;
							r61 = true;
						}
						if ((fant[i + 1] % 7 == 1) && (fant[i + 3] % 7 == 3)
								&& (fant[i + 2] % 7 == 5)
								&& (fant[i] % 7 == 1 || fant[i] % 7 == 5)) {
							chordnum = 10153;
							r61 = true;
							r6 = true;
							ck2 = "一级六和弦";
						}
						if ((fant[i + 2] % 7 == 1) && (fant[i + 1] % 7 == 3)
								&& (fant[i + 3] % 7 == 5)) {
							chordnum = 10315;
							r61 = true;
						}
						if ((fant[i + 2] % 7 == 1) && (fant[i + 3] % 7 == 3)
								&& (fant[i + 1] % 7 == 5)
								&& (fant[i] % 7 == 1 || fant[i] % 7 == 5)) {
							chordnum = 10513;
							r61 = true;
							r6 = true;
							ck2 = "一级六和弦";
						}
						if ((fant[i + 3] % 7 == 1) && (fant[i + 1] % 7 == 3)
								&& (fant[i + 2] % 7 == 5) && fant[i] % 7 == 1) {
							chordnum = 10351;
							r61 = true;
							r6 = true;
							ck2 = "一级正三和弦";
						}
						if ((fant[i + 3] % 7 == 1) && (fant[i + 2] % 7 == 3)
								&& (fant[i + 1] % 7 == 5) && fant[i] % 7 == 1) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "一级正三和弦";
						}
						// ///////////////a=t1
						// if ((fant[i+3] % 7 == 1) && (fant[i+2] % 7 == 3)
						// && (fant[i+1] % 7 == 3)&&fant[i]% 7 == 5) {
						// chordnum = 10531;r61 = true;
						// r6=true;
						// }
						if ((fant[i + 3] % 7 == 1) && (fant[i + 2] % 7 == 5)
								&& (fant[i + 1] % 7 == 5) && fant[i] % 7 == 3) {
							chordnum = 10531;
							r61 = true;
							// r6=true;ck2="一级正三和弦重复5音";
						}
						// ///////////////a=t3
						if ((fant[i + 3] % 7 == 3) && (fant[i + 2] % 7 == 5)
								&& (fant[i + 1] % 7 == 5) && fant[i] % 7 == 1) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "一级六和弦重复5音 A=T 根音旋律位置";
						}
						if ((fant[i + 3] % 7 == 3) && (fant[i + 2] % 7 == 1)
								&& (fant[i + 1] % 7 == 1) && fant[i] % 7 == 5) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "一级六和弦重复根音 A=T 五音旋律位置";
						}
						// //////////////a=b1
						if ((fant[i + 3] % 7 == 1) && (fant[i + 2] % 7 == 3)
								&& (fant[i + 1] % 7 == 1) && fant[i] % 7 == 5) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "一级正三和弦重复根音 A=B 五音旋律位置";
						}
						if ((fant[i + 3] % 7 == 1) && (fant[i + 2] % 7 == 5)
								&& (fant[i + 1] % 7 == 1) && fant[i] % 7 == 3) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "一级正三和弦重复根音 A=B 三音旋律位置";
						}
						// //////////////a=b5
						if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 1)
								&& (fant[i + 1] % 7 == 5) && fant[i] % 7 == 3) {
							chordnum = 10531;
							r61 = true;
							// r6=true;ck2="一级四六和弦 重复五音 A=B 三音旋律位置";
						}
						if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 3)
								&& (fant[i + 1] % 7 == 5) && fant[i] % 7 == 1) {
							chordnum = 10531;
							r61 = true;
							// r6=true;ck2="一级四六和弦 重复五音 A=B 根音旋律位置";
						}
						// //////////////t=b1
						if ((fant[i + 3] % 7 == 1) && (fant[i + 2] % 7 == 1)
								&& (fant[i + 1] % 7 == 3) && fant[i] % 7 == 5) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "一级正三和弦重复根音 T=B 五音旋律位置";
						}
						if ((fant[i + 3] % 7 == 1) && (fant[i + 2] % 7 == 1)
								&& (fant[i + 1] % 7 == 5) && fant[i] % 7 == 3) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "一级正三和弦重复根音 T=B 三音旋律位置";
						}
						// //////////////t=b5
						if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 5)
								&& (fant[i + 1] % 7 == 1) && fant[i] % 7 == 3) {
							chordnum = 10531;
							r61 = true;
							// r6=true;ck2="一级四六和弦 重复五音 T=B 三音旋律位置";
						}
						if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 5)
								&& (fant[i + 1] % 7 == 3) && fant[i] % 7 == 1) {
							chordnum = 10531;
							r61 = true;
							// r6=true;ck2="一级四六和弦 重复五音 T=B 根音旋律位置";
						}
					}

					// //////////////////2
					if ((fant[i] % 7 == 2) || (fant[i] % 7 == 4)
							|| (fant[i] % 7 == 6)) {
						if ((fant[i + 1] % 7 == 2) && (fant[i + 2] % 7 == 4)
								&& (fant[i + 3] % 7 == 6)) {
							chordnum = 20246;
							r61 = true;
						}
						if ((fant[i + 1] % 7 == 2) && (fant[i + 3] % 7 == 4)
								&& (fant[i + 2] % 7 == 6)) {
							chordnum = 20264;
							r61 = true;
							r6 = true;
							ck2 = "二级六和弦";
						}

						if ((fant[i + 2] % 7 == 2) && (fant[i + 1] % 7 == 4)
								&& (fant[i + 3] % 7 == 6)) {
							chordnum = 20426;
							r61 = true;
						}
						if ((fant[i + 2] % 7 == 2) && (fant[i + 3] % 7 == 4)
								&& (fant[i + 1] % 7 == 6)) {
							chordnum = 20624;
							r61 = true;
							r6 = true;
							ck2 = "二级六和弦";
						}

						if ((fant[i + 3] % 7 == 2) && (fant[i + 1] % 7 == 4)
								&& (fant[i + 2] % 7 == 6)) {
							chordnum = 20462;
							r61 = true;
							r6 = true;
							ck2 = "二级原位和弦";
						}
						if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 4)
								&& (fant[i + 1] % 7 == 6)) {
							chordnum = 20642;
							r61 = true;
							r6 = true;
							ck2 = "二级原位和弦";
						}
						// ///////////////a=t2 4
						if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 4)
								&& (fant[i + 1] % 7 == 4) && fant[i] % 7 == 6) {
							chordnum = 10422;
							r61 = true;
							r6 = true;
							ck2 = "二级原位和弦 重复三音A=T 五音旋律位置";
						}
						// if ((fant[i+3] % 7 == 4) && (fant[i+2] % 7 == 6)
						// && (fant[i+1] % 7 == 6)&&fant[i]% 7==2) {
						// chordnum = 10466;r61 = true;
						// r6=true;
						// }

						// //////////////a=t4 2
						if ((fant[i + 3] % 7 == 4) && (fant[i + 2] % 7 == 2)
								&& (fant[i + 1] % 7 == 2) && fant[i] % 7 == 6) {
							chordnum = 10422;
							r61 = true;
							r6 = true;
							ck2 = "二级六和弦 重复根音A=T 五音旋律位置";
						}

						// /////////////// a=b4
						if ((fant[i + 3] % 7 == 4) && (fant[i + 2] % 7 == 2)
								&& (fant[i + 1] % 7 == 4) && fant[i] % 7 == 6) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "二级六和弦 重复三音A=B 五音旋律位置";
						}
						if ((fant[i + 3] % 7 == 4) && (fant[i + 2] % 7 == 6)
								&& (fant[i + 1] % 7 == 4) && fant[i] % 7 == 2) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "二级六和弦 重复三音A=B 根音旋律位置";
						}
						// /////////////// a=b2
						if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 4)
								&& (fant[i + 1] % 7 == 2) && fant[i] % 7 == 6) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "二级原位和弦 重复根音A=B 五音旋律位置";
						}
						if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 6)
								&& (fant[i + 1] % 7 == 2) && fant[i] % 7 == 4) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "二级原位和弦 重复根音A=B 三音旋律位置";
						}
						// //////////////t=b4
						if ((fant[i + 3] % 7 == 4) && (fant[i + 2] % 7 == 4)
								&& (fant[i + 1] % 7 == 2) && fant[i] % 7 == 6) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "二级六和弦 重复三音T=B 五音旋律位置";
						}
						if ((fant[i + 3] % 7 == 4) && (fant[i + 2] % 7 == 4)
								&& (fant[i + 1] % 7 == 6) && fant[i] % 7 == 2) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "二级六和弦 重复三音T=B 根音旋律位置";
						}
						// //////////////t=b2
						if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 2)
								&& (fant[i + 1] % 7 == 4) && fant[i] % 7 == 6) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "二级原位和弦 重复根音T=B 五音旋律位置";
						}
						if ((fant[i + 3] % 7 == 4) && (fant[i + 2] % 7 == 4)
								&& (fant[i + 1] % 7 == 2) && fant[i] % 7 == 4) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "二级原位和弦 重复根音T=B 三音旋律位置";
						}
					}

					// /////////////////////////////3
					if ((fant[i] % 7 == 3) || (fant[i] % 7 == 5)
							|| (fant[i] % 7 == 0)) {
						if ((fant[i + 1] % 7 == 3) && (fant[i + 2] % 7 == 5)
								&& (fant[i + 3] % 7 == 0)) {
							chordnum = 20246;
							r61 = true;
						}
						if ((fant[i + 1] % 7 == 3) && (fant[i + 3] % 7 == 5)
								&& (fant[i + 2] % 7 == 0)) {
							chordnum = 20264;
							r61 = true;
							r6 = true;
							ck2 = "三级六和弦";
						}

						if ((fant[i + 2] % 7 == 3) && (fant[i + 1] % 7 == 5)
								&& (fant[i + 3] % 7 == 0)) {
							chordnum = 20426;
							r61 = true;
						}
						if ((fant[i + 2] % 7 == 3) && (fant[i + 3] % 7 == 5)
								&& (fant[i + 1] % 7 == 0)) {
							chordnum = 20624;
							r61 = true;
							r6 = true;
							ck2 = "三级六和弦";
						}

						if ((fant[i + 3] % 7 == 3) && (fant[i + 1] % 7 == 5)
								&& (fant[i + 2] % 7 == 0)) {
							chordnum = 20462;
							r61 = true;
							r6 = true;
							ck2 = "三级原位和弦";
						}
						if ((fant[i + 3] % 7 == 3) && (fant[i + 2] % 7 == 5)
								&& (fant[i + 1] % 7 == 0)) {
							chordnum = 20642;
							r61 = true;
							r6 = true;
							ck2 = "三级原位和弦";
						}
						// ///////////////a=t2 4
						if ((fant[i + 3] % 7 == 3) && (fant[i + 2] % 7 == 5)
								&& (fant[i + 1] % 7 == 5) && fant[i] % 7 == 0) {
							chordnum = 10422;
							r61 = true;
							r6 = true;
							ck2 = "三级原位和弦 重复三音A=T 五音旋律位置";
						}
						// if ((fant[i+3] % 7 == 5) && (fant[i+2] % 7 == 0)
						// && (fant[i+1] % 7 == 0)&&fant[i]% 7==2) {
						// chordnum = 10466;r61 = true;
						// r6=true;
						// }

						// //////////////a=t4 2
						if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 3)
								&& (fant[i + 1] % 7 == 3) && fant[i] % 7 == 0) {
							chordnum = 10422;
							r61 = true;
							r6 = true;
							ck2 = "三级六和弦 重复根音A=T 五音旋律位置";
						}

						// /////////////// a=b4
						if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 3)
								&& (fant[i + 1] % 7 == 5) && fant[i] % 7 == 0) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "三级六和弦 重复三音A=B 五音旋律位置";
						}
						if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 0)
								&& (fant[i + 1] % 7 == 5) && fant[i] % 7 == 3) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "三级六和弦 重复三音A=B 根音旋律位置";
						}
						// /////////////// a=b2
						if ((fant[i + 3] % 7 == 3) && (fant[i + 2] % 7 == 5)
								&& (fant[i + 1] % 7 == 3) && fant[i] % 7 == 0) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "三级原位和弦 重复根音A=B 五音旋律位置";
						}
						if ((fant[i + 3] % 7 == 3) && (fant[i + 2] % 7 == 0)
								&& (fant[i + 1] % 7 == 3) && fant[i] % 7 == 5) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "三级原位和弦 重复根音A=B 三音旋律位置";
						}
						// //////////////t=b4
						if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 5)
								&& (fant[i + 1] % 7 == 3) && fant[i] % 7 == 0) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "三级六和弦 重复三音T=B 五音旋律位置";
						}
						if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 5)
								&& (fant[i + 1] % 7 == 0) && fant[i] % 7 == 3) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "三级六和弦 重复三音T=B 根音旋律位置";
						}
						// //////////////t=b2
						if ((fant[i + 3] % 7 == 3) && (fant[i + 2] % 7 == 3)
								&& (fant[i + 1] % 7 == 5) && fant[i] % 7 == 0) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "三级原位和弦 重复根音T=B 五音旋律位置";
						}
						if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 5)
								&& (fant[i + 1] % 7 == 3) && fant[i] % 7 == 5) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "三级原位和弦 重复根音T=B 三音旋律位置";
						}
					}

					// /////////////////4
					if ((fant[i] % 7 == 4) || (fant[i] % 7 == 6)
							|| (fant[i] % 7 == 1)) {
						if ((fant[i + 1] % 7 == 4) && (fant[i + 2] % 7 == 6)
								&& (fant[i + 3] % 7 == 1)) {
							chordnum = 10135;
							r61 = true;
						}
						if ((fant[i + 1] % 7 == 4) && (fant[i + 3] % 7 == 6)
								&& (fant[i + 2] % 7 == 1)
								&& (fant[i] % 7 == 4 || fant[i] % 7 == 1)) {
							chordnum = 10153;
							r61 = true;
							r6 = true;
							ck2 = "四级六和弦";
						}
						if ((fant[i + 2] % 7 == 4) && (fant[i + 1] % 7 == 6)
								&& (fant[i + 3] % 7 == 1)) {
							chordnum = 10315;
							r61 = true;
						}
						if ((fant[i + 2] % 7 == 4) && (fant[i + 3] % 7 == 6)
								&& (fant[i + 1] % 7 == 1)
								&& (fant[i] % 7 == 4 || fant[i] % 7 == 1)) {
							chordnum = 10513;
							r61 = true;
							r6 = true;
							ck2 = "四级六和弦";
						}
						if ((fant[i + 3] % 7 == 4) && (fant[i + 1] % 7 == 6)
								&& (fant[i + 2] % 7 == 1) && fant[i] % 7 == 4) {
							chordnum = 10351;
							r61 = true;
							r6 = true;
							ck2 = "四级正三和弦";
						}
						if ((fant[i + 3] % 7 == 4) && (fant[i + 2] % 7 == 6)
								&& (fant[i + 1] % 7 == 1) && fant[i] % 7 == 4) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "四级正三和弦";
						}
						// ///////////////a=t1
						// if ((fant[i+3] % 7 == 4) && (fant[i+2] % 7 == 6)
						// && (fant[i+1] % 7 == 6)&&fant[i]% 7 == 1) {
						// chordnum = 10531;r61 = true;
						// r6=true;
						// }
						if ((fant[i + 3] % 7 == 4) && (fant[i + 2] % 7 == 1)
								&& (fant[i + 1] % 7 == 1) && fant[i] % 7 == 6) {
							chordnum = 10531;
							r61 = true;
							// r6=true;ck2="四级正三和弦重复5音";
						}
						// ///////////////a=t3
						if ((fant[i + 3] % 7 == 6) && (fant[i + 2] % 7 == 1)
								&& (fant[i + 1] % 7 == 1) && fant[i] % 7 == 4) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "四级六和弦重复5音 A=T 根音旋律位置";
						}
						if ((fant[i + 3] % 7 == 6) && (fant[i + 2] % 7 == 4)
								&& (fant[i + 1] % 7 == 4) && fant[i] % 7 == 1) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "四级六和弦重复根音 A=T 五音旋律位置";
						}
						// //////////////a=b1
						if ((fant[i + 3] % 7 == 4) && (fant[i + 2] % 7 == 6)
								&& (fant[i + 1] % 7 == 4) && fant[i] % 7 == 1) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "四级正三和弦重复根音 A=B 五音旋律位置";
						}
						if ((fant[i + 3] % 7 == 4) && (fant[i + 2] % 7 == 1)
								&& (fant[i + 1] % 7 == 4) && fant[i] % 7 == 6) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "四级正三和弦重复根音 A=B 三音旋律位置";
						}
						// //////////////a=b5
						if ((fant[i + 3] % 7 == 1) && (fant[i + 2] % 7 == 4)
								&& (fant[i + 1] % 7 == 1) && fant[i] % 7 == 6) {
							chordnum = 10531;
							r61 = true;
							// r6=true;ck2="四级四六和弦 重复五音 A=B 三音旋律位置";
						}
						if ((fant[i + 3] % 7 == 1) && (fant[i + 2] % 7 == 6)
								&& (fant[i + 1] % 7 == 1) && fant[i] % 7 == 4) {
							chordnum = 10531;
							r61 = true;
							// r6=true;ck2="四级四六和弦 重复五音 A=B 根音旋律位置";
						}
						// //////////////t=b1
						if ((fant[i + 3] % 7 == 4) && (fant[i + 2] % 7 == 4)
								&& (fant[i + 1] % 7 == 6) && fant[i] % 7 == 1) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "四级正三和弦重复根音 T=B 五音旋律位置";
						}
						if ((fant[i + 3] % 7 == 4) && (fant[i + 2] % 7 == 4)
								&& (fant[i + 1] % 7 == 1) && fant[i] % 7 == 6) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "四级正三和弦重复根音 T=B 三音旋律位置";
						}
						// //////////////t=b5
						if ((fant[i + 3] % 7 == 1) && (fant[i + 2] % 7 == 1)
								&& (fant[i + 1] % 7 == 4) && fant[i] % 7 == 6) {
							chordnum = 10531;
							r61 = true;
							// r6=true;ck2="四级四六和弦 重复五音 T=B 三音旋律位置";
						}
						if ((fant[i + 3] % 7 == 1) && (fant[i + 2] % 7 == 1)
								&& (fant[i + 1] % 7 == 6) && fant[i] % 7 == 4) {
							chordnum = 10531;
							r61 = true;
							// r6=true;ck2="四级四六和弦 重复五音 T=B 根音旋律位置";
						}
					}

					// ////////////////////////5
					if ((fant[i] % 7 == 5) || (fant[i] % 7 == 0)
							|| (fant[i] % 7 == 2)) {
						if ((fant[i + 1] % 7 == 5) && (fant[i + 2] % 7 == 0)
								&& (fant[i + 3] % 7 == 2)) {
							chordnum = 10135;
							r61 = true;
						}
						if ((fant[i + 1] % 7 == 5) && (fant[i + 3] % 7 == 0)
								&& (fant[i + 2] % 7 == 2)
								&& (fant[i] % 7 == 5 || fant[i] % 7 == 2)) {
							chordnum = 10153;
							r61 = true;
							r6 = true;
							ck2 = "五级六和弦";
						}
						if ((fant[i + 2] % 7 == 5) && (fant[i + 1] % 7 == 0)
								&& (fant[i + 3] % 7 == 2)) {
							chordnum = 10315;
							r61 = true;
						}
						if ((fant[i + 2] % 7 == 5) && (fant[i + 3] % 7 == 0)
								&& (fant[i + 1] % 7 == 2)
								&& (fant[i] % 7 == 5 || fant[i] % 7 == 2)) {
							chordnum = 10513;
							r61 = true;
							r6 = true;
							ck2 = "五级六和弦";
						}
						if ((fant[i + 3] % 7 == 5) && (fant[i + 1] % 7 == 0)
								&& (fant[i + 2] % 7 == 2) && fant[i] % 7 == 5) {
							chordnum = 10351;
							r61 = true;
							r6 = true;
							ck2 = "五级正三和弦";
						}
						if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 0)
								&& (fant[i + 1] % 7 == 2) && fant[i] % 7 == 5) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "五级正三和弦";
						}
						// ///////////////a=t1
						// if ((fant[i+3] % 7 == 5) && (fant[i+2] % 7 == 0)
						// && (fant[i+1] % 7 == 0)&&fant[i]% 7 == 2) {
						// chordnum = 10531;r61 = true;
						// r6=true;
						// }
						if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 2)
								&& (fant[i + 1] % 7 == 2) && fant[i] % 7 == 0) {
							chordnum = 10531;
							r61 = true;
							// r6=true;ck2="五级正三和弦重复5音";
						}
						// ///////////////a=t3
						if ((fant[i + 3] % 7 == 0) && (fant[i + 2] % 7 == 2)
								&& (fant[i + 1] % 7 == 2) && fant[i] % 7 == 5) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "五级六和弦重复5音 A=T 根音旋律位置";
						}
						if ((fant[i + 3] % 7 == 0) && (fant[i + 2] % 7 == 5)
								&& (fant[i + 1] % 7 == 5) && fant[i] % 7 == 2) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "五级六和弦重复根音 A=T 五音旋律位置";
						}
						// //////////////a=b1
						if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 0)
								&& (fant[i + 1] % 7 == 5) && fant[i] % 7 == 2) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "五级正三和弦重复根音 A=B 五音旋律位置";
						}
						if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 2)
								&& (fant[i + 1] % 7 == 5) && fant[i] % 7 == 0) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "五级正三和弦重复根音 A=B 三音旋律位置";
						}
						// //////////////a=b5
						if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 5)
								&& (fant[i + 1] % 7 == 2) && fant[i] % 7 == 0) {
							chordnum = 10531;
							r61 = true;
							// r6=true;ck2="五级四六和弦 重复五音 A=B 三音旋律位置";
						}
						if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 0)
								&& (fant[i + 1] % 7 == 2) && fant[i] % 7 == 5) {
							chordnum = 10531;
							r61 = true;
							// r6=true;ck2="五级四六和弦 重复五音 A=B 根音旋律位置";
						}
						// //////////////t=b1
						if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 5)
								&& (fant[i + 1] % 7 == 0) && fant[i] % 7 == 2) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "五级正三和弦重复根音 T=B 五音旋律位置";
						}
						if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 5)
								&& (fant[i + 1] % 7 == 2) && fant[i] % 7 == 0) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "五级正三和弦重复根音 T=B 三音旋律位置";
						}
						// //////////////t=b5
						if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 2)
								&& (fant[i + 1] % 7 == 5) && fant[i] % 7 == 0) {
							chordnum = 10531;
							r61 = true;
							// r6=true;ck2="五级四六和弦 重复五音 T=B 三音旋律位置";
						}
						if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 2)
								&& (fant[i + 1] % 7 == 0) && fant[i] % 7 == 5) {
							chordnum = 10531;
							r61 = true;
							// r6=true;ck2="五级四六和弦 重复五音 T=B 根音旋律位置";
						}
					}

					// /////////////////6
					if ((fant[i] % 7 == 6) || (fant[i] % 7 == 1)
							|| (fant[i] % 7 == 3)) {
						if ((fant[i + 1] % 7 == 6) && (fant[i + 2] % 7 == 1)
								&& (fant[i + 3] % 7 == 3)) {
							chordnum = 60613;
							r61 = true;
						}
						if ((fant[i + 1] % 7 == 6) && (fant[i + 3] % 7 == 1)
								&& (fant[i + 2] % 7 == 3)) {
							chordnum = 60631;
							r61 = true;

						}
						if ((fant[i + 2] % 7 == 6) && (fant[i + 1] % 7 == 1)
								&& (fant[i + 3] % 7 == 3)) {
							chordnum = 70274;
							r61 = true;
						}
						if ((fant[i + 2] % 7 == 6) && (fant[i + 3] % 7 == 1)
								&& (fant[i + 1] % 7 == 3)) {
							chordnum = 60361;
							r61 = true;

						}
						if ((fant[i + 3] % 7 == 6) && (fant[i + 1] % 7 == 1)
								&& (fant[i + 2] % 7 == 3)
								&& (fant[i] % 7 == 6 || fant[i] % 7 == 1)) {
							chordnum = 70247;
							r61 = true;
							r6 = true;
							ck2 = "六级原位三和弦";
						}
						if ((fant[i + 3] % 7 == 6) && (fant[i + 2] % 7 == 1)
								&& (fant[i + 1] % 7 == 3)
								&& (fant[i] % 7 == 6 || fant[i] % 7 == 1)) {
							chordnum = 70427;
							r61 = true;
							r6 = true;
							ck2 = "六级原位三和弦";
						}
						// ///////////////a=t
						if ((fant[i + 3] % 7 == 6) && (fant[i + 2] % 7 == 3)
								&& (fant[i + 1] % 7 == 3) && fant[i] % 7 == 1) {
							chordnum = 10422;
							r61 = true;
							r6 = true;
							ck2 = "六级原位三和弦 A=T 重复五音 根音旋律";
						}
						// if ((fant[i+3] % 7 == 1) && (fant[i+2] % 7 == 6)
						// && (fant[i+1] % 7 == 6)&&fant[i]% 7==3) {
						// chordnum = 10466;r61 = true;
						// r6=true;
						// }
						// //////////////a=b
						if ((fant[i + 3] % 7 == 6) && (fant[i + 2] % 7 == 3)
								&& (fant[i + 1] % 7 == 6) && fant[i] % 7 == 1) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "六级原位三和弦 A=B 重复根音 三音旋律";
						}
						if ((fant[i + 3] % 7 == 6) && (fant[i + 2] % 7 == 1)
								&& (fant[i + 1] % 7 == 6) && fant[i] % 7 == 3) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "六级原位三和弦 A=B 重复根音 五音旋律";
						}
						// //////////////t=b
						if ((fant[i + 3] % 7 == 6) && (fant[i + 2] % 7 == 6)
								&& (fant[i + 1] % 7 == 3) && fant[i] % 7 == 1) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "六级原位三和弦 T=B 重复根音 三音旋律";
						}
						if ((fant[i + 3] % 7 == 6) && (fant[i + 2] % 7 == 6)
								&& (fant[i + 1] % 7 == 1) && fant[i] % 7 == 3) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "六级原位三和弦 T=B 重复根音 五音旋律";
						}
					}

					// ///////////////7
					if ((fant[i] % 7 == 0) || (fant[i] % 7 == 2)
							|| (fant[i] % 7 == 4)) {
						if ((fant[i + 1] % 7 == 0) && (fant[i + 2] % 7 == 2)
								&& (fant[i + 3] % 7 == 4)) {
							chordnum = 70724;
							r61 = true;
						}
						if ((fant[i + 1] % 7 == 0) && (fant[i + 3] % 7 == 2)
								&& (fant[i + 2] % 7 == 4)) {
							chordnum = 70742;
							r61 = true;
							r6 = true;
							ck2 = "七级六和弦";
						}
						if ((fant[i + 2] % 7 == 0) && (fant[i + 1] % 7 == 2)
								&& (fant[i + 3] % 7 == 4)) {
							chordnum = 70274;
							r61 = true;
						}
						if ((fant[i + 2] % 7 == 0) && (fant[i + 3] % 7 == 2)
								&& (fant[i + 1] % 7 == 4)) {
							chordnum = 70472;
							r61 = true;
							r6 = true;
							ck2 = "七级六和弦";
						}
						if ((fant[i + 3] % 7 == 0) && (fant[i + 1] % 7 == 2)
								&& (fant[i + 2] % 7 == 4)) {
							chordnum = 70247;
							r61 = true;
						}
						if ((fant[i + 3] % 7 == 0) && (fant[i + 2] % 7 == 2)
								&& (fant[i + 1] % 7 == 4)) {
							chordnum = 70427;
							r61 = true;
						}
						// ///////////////a=t
						if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 4)
								&& (fant[i + 1] % 7 == 4) && fant[i] % 7 == 0) {
							chordnum = 10422;
							r61 = true;
							r6 = true;
							ck2 = "七级六和弦 重复五音A=T 根音旋律 ";
						}
						if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 0)
								&& (fant[i + 1] % 7 == 0) && fant[i] % 7 == 4) {
							chordnum = 10466;
							r61 = true;
							r6 = true;
							ck2 = "七级六和弦 重复根音A=T 五音旋律 ";
						}
						// //////////////a=b
						if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 0)
								&& (fant[i + 1] % 7 == 2) && fant[i] % 7 == 4) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "七级六和弦 重复五音A=B 五音旋律 ";
						}
						if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 4)
								&& (fant[i + 1] % 7 == 2) && fant[i] % 7 == 0) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "七级六和弦 重复五音A=B 根音旋律 ";
						}
						// //////////////t=b
						if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 2)
								&& (fant[i + 1] % 7 == 0) && fant[i] % 7 == 4) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "七级六和弦 重复五音T=B 五音旋律 ";
						}
						if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 2)
								&& (fant[i + 1] % 7 == 4) && fant[i] % 7 == 0) {
							chordnum = 10531;
							r61 = true;
							r6 = true;
							ck2 = "七级六和弦 重复五音T=B 根音旋律 ";
						}
					}

					if (cant[ii] - cant[ii + 1] == 7) {
						parallel8s++;
					}
					if (cant[ii] - cant[ii + 2] == 7) {
						parallel8s++;
					}
					if (cant[ii] - cant[ii + 3] == 7) {
						parallel8s++;
					}
					if (cant[ii + 1] - cant[ii + 2] == 7) {
						parallel8s++;
					}
					if (cant[ii + 1] - cant[ii + 3] == 7) {
						parallel8s++;
					}
					if (cant[ii + 2] - cant[ii + 3] == 7) {
						parallel8s++;
					}

					if (fant[i] - fant[i + 1] == 7) {
						parallel8s++;
					}
					if (fant[i] - fant[i + 2] == 7) {
						parallel8s++;
					}
					if (fant[i] - fant[i + 3] == 7) {
						parallel8s++;
					}
					if (fant[i + 1] - fant[i + 2] == 7) {
						parallel8s++;
					}
					if (fant[i + 1] - fant[i + 3] == 7) {
						parallel8s++;
					}
					if (fant[i + 2] - fant[i + 3] == 7) {
						parallel8s++;
					}

					if (cant[ii] - cant[ii + 1] == 4) {
						parallel5s++;
					}
					if (cant[ii] - cant[ii + 2] == 4) {
						parallel5s++;
					}
					if (cant[ii] - cant[ii + 3] == 4) {
						parallel5s++;
					}
					if (cant[ii + 1] - cant[ii + 2] == 4) {
						parallel5s++;
					}
					if (cant[ii + 1] - cant[ii + 3] == 4) {
						parallel5s++;
					}
					if (cant[ii + 2] - cant[ii + 3] == 4) {
						parallel5s++;
					}

					if (fant[i] - fant[i + 1] == 4) {
						parallel5s++;
					}
					if (fant[i] - fant[i + 2] == 4) {
						parallel5s++;
					}
					if (fant[i] - fant[i + 3] == 4) {
						parallel5s++;
					}
					if (fant[i + 1] - fant[i + 2] == 4) {
						parallel5s++;
					}
					if (fant[i + 1] - fant[i + 3] == 4) {
						parallel5s++;
					}
					if (fant[i + 2] - fant[i + 3] == 4) {
						parallel5s++;
					}

					// if (cant[ii] - fant[i] == 1) {
					// seconds++;
					// }
					if (cant[ii + 1] - fant[i + 1] == 1) {
						seconds++;
					}
					if (cant[ii + 2] - fant[i + 2] == 1) {
						seconds++;
					}
					if (cant[ii + 3] - fant[i + 3] == 1) {
						seconds++;
					}
					if (cant[ii + 1] - fant[i + 2] == 1) {
						seconds++;
					}
					if (cant[ii + 2] - fant[i + 1] == 1) {
						seconds++;
					}
					if (cant[ii + 3] - fant[i + 1] == 1) {
						seconds++;
					}
					if (cant[ii + 3] - fant[i + 2] == 1) {
						seconds++;
					}

					// if (fant[i] - cant[ii] == 1) {
					// seconds++;
					// }
					if (fant[i + 1] - cant[ii + 1] == 1) {
						seconds++;
					}
					if (fant[i + 2] - cant[ii + 2] == 1) {
						seconds++;
					}
					if (fant[i + 3] - cant[ii + 3] == 1) {
						seconds++;
					}
					if (fant[i + 2] - cant[ii + 1] == 1) {
						seconds++;
					}
					if (fant[i + 1] - cant[ii + 2] == 1) {
						seconds++;
					}
					if (fant[i + 1] - cant[ii + 3] == 1) {
						seconds++;
					}
					if (fant[i + 2] - cant[ii + 3] == 1) {
						seconds++;
					}

					// /////////////////////////////////根音大跳
					if (cant[ii + 3] - fant[i + 3] > 7) {
						bassin8++;
					}
					if (fant[i + 3] - cant[ii + 3] > 7) {
						bassin8++;
					}
					// ////////////////////////////////根音过低
					if (cant[ii + 2] - cant[ii + 3] > 15) {
						hx++;
					}
					if (fant[i + 2] - fant[i + 3] > 15) {
						hx++;
					}

					if (parallel8s < 2 && parallel5s < 2 && seconds < 20
							&& bassin8 < 1 && hx < 1) { // 排除平行8度，平行5度和非旋律2度，根音大跳，根音过低
						r2 = true;
					}

					if ((cant[ii + 2] > cant[ii + 3])
							&& (fant[i + 2] > fant[i + 3])) {
						r7 = true;
					}

					// ///////////////////////////////////三个音相同
					r8 = true;

					if ((cant[ii] % 7 == cant[ii + 1] % 7)
							&& (cant[ii] % 7 == cant[ii + 2] % 7)) {
						r8 = false;
					}
					if ((cant[ii] % 7 == cant[ii + 1] % 7)
							&& (cant[ii] % 7 == cant[ii + 3] % 7)) {
						r8 = false;
					}

					if ((cant[ii + 1] % 7 == cant[ii] % 7)
							&& (cant[ii + 1] % 7 == cant[ii + 2] % 7)) {
						r8 = false;
					}
					if ((cant[ii + 1] % 7 == cant[ii] % 7)
							&& (cant[ii + 1] % 7 == cant[ii + 3] % 7)) {
						r8 = false;
					}

					if ((cant[ii + 2] % 7 == cant[ii] % 7)
							&& (cant[ii + 2] % 7 == cant[ii + 3] % 7)) {
						r8 = false;
					}
					if ((cant[ii + 2] % 7 == cant[ii] % 7)
							&& (cant[ii + 2] % 7 == cant[ii + 1] % 7)) {
						r8 = false;
					}

					if ((cant[ii + 3] % 7 == cant[ii] % 7)
							&& (cant[ii + 3] % 7 == cant[ii + 1] % 7)) {
						r8 = false;
					}
					if ((cant[ii + 3] % 7 == cant[ii] % 7)
							&& (cant[ii + 3] % 7 == cant[ii + 2] % 7)) {
						r8 = false;
					}

					// ///////////////////fant
					if ((fant[i] % 7 == fant[i + 1] % 7)
							&& (fant[i] % 7 == fant[i + 2] % 7)) {
						r8 = false;
					}
					if ((fant[i] % 7 == fant[i + 1] % 7)
							&& (fant[i] % 7 == fant[i + 3] % 7)) {
						r8 = false;
					}

					if ((fant[i + 1] % 7 == fant[i] % 7)
							&& (fant[i + 1] % 7 == fant[i + 2] % 7)) {
						r8 = false;
					}
					if ((fant[i + 1] % 7 == fant[i] % 7)
							&& (fant[i + 1] % 7 == fant[i + 3] % 7)) {
						r8 = false;
					}

					if ((fant[i + 2] % 7 == fant[i] % 7)
							&& (fant[i + 2] % 7 == fant[i + 3] % 7)) {
						r8 = false;
					}
					if ((fant[i + 2] % 7 == fant[i] % 7)
							&& (fant[i + 2] % 7 == fant[i + 1] % 7)) {
						r8 = false;
					}

					if ((fant[i + 3] % 7 == fant[i] % 7)
							&& (fant[i + 3] % 7 == fant[i + 1] % 7)) {
						r8 = false;
					}
					if ((fant[i + 3] % 7 == fant[i] % 7)
							&& (fant[i + 3] % 7 == fant[i + 2] % 7)) {
						r8 = false;
					}

					// ///////////////////////////////////// 反向8 5
					int k = 0;
					int k5 = 0;
					for (int ik = 1; ik < 6; ik++) {
						k = 7 + 7 * ik;
						k5 = 7 + 5 * ik;

						if (cant[ii] - cant[ii + 1] == 7
								&& cant[ii] < fant[i]
								&& (((fant[i] - fant[i + 2] == k) && (cant[ii + 1] > fant[i + 2])) || ((fant[i]
										- fant[i + 3] == k) && (cant[ii + 1] > fant[i + 3])))) {
							openparallel8s++;
						}

						if (cant[ii + 1] - cant[ii + 2] == 7
								&& cant[ii + 1] < fant[i]
								&& (((fant[i] - fant[i + 2] == k) && (cant[ii + 2] > fant[i + 2])) || ((fant[i]
										- fant[i + 3] == k) && (cant[ii + 2] > fant[i + 3])))) {
							openparallel8s++;
						}
						if (cant[ii + 1] - cant[ii + 2] == 7
								&& cant[ii + 1] < fant[i + 1]
								&& (((fant[i + 1] - fant[i + 3] == k) && (cant[ii + 2] > fant[i + 3])))) {
							openparallel8s++;
						}
						if (cant[ii + 2] - cant[ii + 3] == 7
								&& cant[ii + 2] < fant[i + 1]
								&& (((fant[i + 1] - fant[i + 3] == k) && (cant[ii + 3] > fant[i + 3])))) {
							openparallel8s++;
						}
						if (cant[ii + 2] - cant[ii + 3] == 7
								&& cant[ii + 2] < fant[i + 2]
								&& (((fant[i + 2] - fant[i + 3] == k) && (cant[ii + 3] > fant[i + 3])))) {
							openparallel8s++;
						}

						// ///////////////////////////////////反向五度
						if (cant[ii] - cant[ii + 1] == 7
								&& cant[ii] < fant[i]
								&& (((fant[i] - fant[i + 2] == k5) && (cant[ii + 1] > fant[i + 2])) || ((fant[i]
										- fant[i + 3] == k5) && (cant[ii + 1] > fant[i + 3])))) {
							openparallel5s++;
						}

						if (cant[ii + 1] - cant[ii + 2] == 7
								&& cant[ii + 1] < fant[i]
								&& (((fant[i] - fant[i + 2] == k5) && (cant[ii + 2] > fant[i + 2])) || ((fant[i]
										- fant[i + 3] == k5) && (cant[ii + 2] > fant[i + 3])))) {
							openparallel5s++;
						}
						if (cant[ii + 1] - cant[ii + 2] == 7
								&& cant[ii + 1] < fant[i + 1]
								&& (((fant[i + 1] - fant[i + 3] == k5) && (cant[ii + 2] > fant[i + 3])))) {
							openparallel5s++;
						}
						if (cant[ii + 2] - cant[ii + 3] == 7
								&& cant[ii + 2] < fant[i + 1]
								&& (((fant[i + 1] - fant[i + 3] == k5) && (cant[ii + 3] > fant[i + 3])))) {
							openparallel5s++;
						}
						if (cant[ii + 2] - cant[ii + 3] == 7
								&& cant[ii + 2] < fant[i + 2]
								&& (((fant[i + 2] - fant[i + 3] == k5) && (cant[ii + 3] > fant[i + 3])))) {
							openparallel5s++;
						}

					}
					if (openparallel5s++ < 1 && openparallel8s++ < 1) {
						r9 = true;
					}

					// ///////////////////////////////////////////增四度
					if ((cant[ii + 1] % 7 == 4 && cant[ii] == cant[ii + 1] + 3)
							|| (cant[ii + 2] % 7 == 4 && cant[ii + 1] == cant[ii + 2] + 3)
							|| (cant[ii + 3] % 7 == 4 && cant[ii + 2] == cant[ii + 3] + 3)
							|| (fant[i + 1] % 7 == 4 && fant[i] == fant[i + 1] + 3)
							|| (fant[i + 2] % 7 == 4 && fant[i + 1] == fant[i + 2] + 3)
							|| (fant[i + 3] % 7 == 4 && fant[i + 2] == fant[i + 3] + 3)

					// ||
					// (cant[ii+1]%7==4&&fant[i]==fant[i+1]+3)
					// ||
					// (cant[ii+2]%7==4&&fant[i+1]==fant[i+2]+3)
					// ||
					// (cant[ii+3]%7==4&&fant[i+2]==fant[i+3]+3)
					// ||
					// (fant[i+1]%7==4&&cant[ii]==cant[ii+1]+3)
					// ||
					// (fant[i+2]%7==4&&cant[ii+1]==cant[ii+2]+3)
					// ||
					// (fant[i+3]%7==4&&cant[ii+2]==cant[ii+3]+3)

					) {
						r11 = false;
					}

					// ////////////////////////////////////四部同向
					if ((cant[ii] > fant[i] && cant[ii + 1] > fant[i + 1]
							&& cant[ii + 2] > fant[i + 2] && cant[ii + 3] > fant[i + 3])
							|| (cant[ii] < fant[i] && cant[ii + 1] < fant[i + 1]
									&& cant[ii + 2] < fant[i + 2] && cant[ii + 3] < fant[i + 3])) {
						r10 = false;
					}

					// ////////////跳进
					int jump3 = 0;

					if (cant[ii + 1] - fant[i + 1] > 3) {
						jump3++;
					}
					if (cant[ii + 2] - fant[i + 2] > 3) {
						jump3++;
					}
					if (jump3 > 1) {
						r12 = false;
					}

					// ///////////////////////////声部超越
					r13 = true;
					if (cant[ii + 1] > fant[i]) {
						r13 = false;
					}
					if (cant[ii + 2] > fant[i + 1]) {
						r13 = false;
					}
					if (cant[ii + 3] > fant[i + 2]) {
						r13 = false;
					}

					if (fant[i + 1] > cant[ii]) {
						r13 = false;
					}
					if (fant[i + 2] > cant[ii + 1]) {
						r13 = false;
					}
					if (fant[i + 3] > cant[ii + 2]) {
						r13 = false;
					}

					// //////////////////////隐伏85
					r14 = true;
					for (int k14 = 0; k14 < 8; k14++) {
						if (((cant[ii] > fant[i] && cant[ii + 3] > fant[i + 3])
								|| (cant[ii] < fant[i] && cant[ii + 3] < fant[i + 3])
								&& (cant[ii] % 7 - cant[ii + 3] % 7 == 0 && fant[i]
										% 7 - fant[i + 3] % 7 == 0) || (cant[ii]
								- cant[ii + 3] == 5 + 7 * k14 && fant[i]
								- fant[i + 3] == 5 + 7 * k14)
								&& (cant[ii] - fant[i] > 3))) {
							r14 = false;
						}
					}

					if (r2
							// &&
							// r51
							// &&r61
							&& r5 && r6 && r8 && r9 && r10 && r11 
							&& r12 && r13
							&& r14

					) {

						
						if (A != null ) { // 声部非空
//							 System.out.println("开始判断和弦"
//							 + " ");
							boolean r = true;

							if (r) {
								if(ii>4){
								b0s = "";
								A[0] = cant[ii-4];
								A[1] = cant[ii-3];
								A[2] = cant[ii-2];
								A[3] = cant[ii-1];
								A[4] = cant[ii];
								A[5] = cant[ii+1];
								A[6] = cant[ii+2];
								A[7] = cant[ii+3];
								A[8] = fant[i];
								A[9] = fant[i+1];
								A[10] = fant[i+2];
								A[11] = fant[i+3];
								}
								for (int zhuani = 0; zhuani < 12; zhuani++) {

									b0s += "," + A[zhuani];
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

								As += b0resultString2;
								As = As.trim();

								sb0 = null;
								flag0 = false;
								b0resultString = "";
								b0resultString2 = "";
								b0s = "";
								s0.clear();
							}// r
						} // 声部非空
						
					
						if (A1 != null ) { // 非空
							
							boolean r1 = true;
							if (r1) {

								b1s = "";
								A1[0] = fant[i];
								A1[1] = fant[i+1];
								A1[2] = fant[i+2];
								A1[3] = fant[i+3];

								for (int zhuani = 0; zhuani < 4; zhuani++) {

									b1s += "," + A1[zhuani]; // string
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

								As1 += b1resultString2;
								As1 = As1.trim();

								sb1 = null;
								flag1 = false;
								b1resultString = "";
								b1resultString2 = "";
								b1s = "";
								s1.clear();
							}// r
						} // 声部非空
						

//						System.out.print(
//								cant[ii-4] + " " + cant[ii - 3] + " "
//								+ cant[ii - 2] + " " + cant[ii - 1] + "链接 " +
//								cant[ii] + " " + cant[ii + 1] + " "
//								+ cant[ii + 2] + " " + cant[ii + 3] + "链接 " + 
//								fant[i]
//								+ " " + fant[i + 1] + " " + fant[i + 2] + " "
//								+ fant[i + 3]
////								cant[ii] + " " + cant[ii + 1] + " "
////								+ cant[ii + 2] + " " + cant[ii + 3] + "链接 " + fant[i]
////								+ " " + fant[i + 1] + " " + fant[i + 2] + " "
////								+ fant[i + 3]
//////								+"  数字："+
//////								cant[ii]%7 + " " + cant[ii + 1]%7 + " "
//////								+ cant[ii + 2]%7 + " " + cant[ii + 3]%7 + "链接 " + fant[i]%7
//////								+ " " + fant[i + 1]%7 + " " + fant[i + 2]%7 + " "
//////								+ fant[i + 3]%7
////										
////										+"  音名："+
////										SC(cant[ii]) + " " + SC(cant[ii + 1]) + " "
////										+ SC(cant[ii + 2]) + " " + SC(cant[ii + 3]) + "链接 " + SC(fant[i])
////										+ " " + SC(fant[i + 1]) + " " + SC(fant[i + 2]) + " "
////										+ SC(fant[i + 3])
////										+"  分析："+ck+ " 链接  " +ck2
//								);
//						count++;
//						System.out.println(" ");
					
					} // if r2
				}//for can
			}//for fan
//			System.out.print("count:"+count);
//			System.out.println("As "+As);
		}
		
		
	}
	


