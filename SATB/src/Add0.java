import java.util.ArrayList;

/////////////////////////////����һ����֪��satb��������һ����֪���ɵ�satb��
public class Add0 {

	// static int cfa = 29;//һ����֪��satb��s
	// static int cfb = 26;//һ����֪��satb��a
	// static int cfc = 24;//һ����֪��satb��t
	// static int cfd = 15;//һ����֪��satb��b

	static int cfa = 0;// һ����֪��satb��s
	static int cfb = 0;// һ����֪��satb��a
	static int cfc = 0;// һ����֪��satb��t
	static int cfd = 0;// һ����֪��satb��b

	static int[] input = new int[] { cfa, cfb, cfc, cfd };

	static String As;
	static String As1;

	public Add0() {

	}

	public static String SC(int nnn) {
		int k = 0;
		String Class = "";
		String R = "";
		String K = "";

		if (nnn < 8) {
			K = "1";
		}
		if (nnn > 7 && nnn < 15) {
			K = "2";
		}
		if (nnn > 14 && nnn < 22) {
			K = "3";
		}
		if (nnn > 21 && nnn < 29) {
			K = "4";
		}
		if (nnn > 28 && nnn < 36) {
			K = "5";
		}
		if (nnn > 35 && nnn < 43) {
			K = "6";
		}

		if (nnn % 7 == 0) {
			Class = "B";
		}
		if (nnn % 7 == 1) {
			Class = "C";
		}
		if (nnn % 7 == 2) {
			Class = "D";
		}
		if (nnn % 7 == 3) {
			Class = "E";
		}
		if (nnn % 7 == 4) {
			Class = "F";
		}
		if (nnn % 7 == 5) {
			Class = "G";
		}
		if (nnn % 7 == 6) {
			Class = "A";
		}

		R = Class + K;
		return R;

	}

	public static void A(String ct, String ft) { // �ԱȺ��� �����ϵ

		ChordKind ckinput = new ChordKind();

		ckinput.Ischord(cfa, cfb, cfc, cfc);

		if (ckinput.ischord = true) {

			// }
			int[] cant = new int[4];

			int[] A = new int[99999];
			String b0s = "";
			ArrayList<String> s0 = new ArrayList<String>();

			int[] A1 = new int[99999];
			String b1s = "";
			ArrayList<String> s1 = new ArrayList<String>();
			//
			// // System.out.println("ct��" + ct);
			// // System.out.println("ft��" + ft);
			// System.out.println(" ");
			//
			// ArrayList<String> cast = new ArrayList<String>();
			// String[] cat = new String[99999];
			//
			//
			// for (int ic = 0; ic < ct.length(); ic++) {
			// cat = ct.split(",");
			//
			// }
			//
			// for (int ia = 0; ia < cat.length; ia++) {
			// cast.add(cat[ia]);
			// }
			// cast.set(0, "0");
			// System.out.println(cast.size());
			// // cas.remove(0);
			// // System.out.println(cas);
			//
			// for (int ia = 0; ia < cast.size(); ia++) {
			// cant[ia] = Integer.parseInt(cast.get(ia));// �����������������е����
			// // ת��int����
			// // cai.add(Integer.parseInt(cas.get(ia)));
			// }
			// // cai.remove(0);
			// System.out.println("cant[ia]: ");
			// for (int ia = 1; ia < cast.size(); ia++) {
			// System.out.print(cant[ia] + " ");
			// }
			// System.out.println("");
			//
			cant[0] = cfa;
			cant[1] = cfb;
			cant[2] = cfc;
			cant[3] = cfd;

			// /////////////////////f

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
			// System.out.println(fast.size());
			for (int ia = 0; ia < fast.size(); ia++) {
				fant[ia] = Integer.parseInt(fast.get(ia));// ������ �����������е����
															// ת��int����
			}
			// fai.remove(0);
			// System.out.println("fant[ia]: ");
			// for (int ia = 1; ia < fast.size(); ia++) {
			// System.out.print(fant[ia] + " ");
			// }
			// System.out.println("fast.size():" + fast.size());//

			System.out.println(" ");

			int count = 0;

			for (int i = 1; i < fast.size(); i += 4) { // ������� ָ��һ��ǰ���ĸ�
			// for (int ii = 0; ii < 4; i++) { // �ڲ����� ָ��һ��ǰ���ĸ�
				int ii = 0;
				// ����ĸ������ڲ���ĸ������������Ĳ���������
				boolean r2 = false;
				boolean r3 = false;
				boolean r4 = false;
				boolean r5 = false;
				boolean r6 = false;
				boolean r51 = false;
				boolean r61 = false;
				boolean r7 = false;
				boolean r8 = true;// �ų�3����������ͬ
				boolean r9 = false;
				int hx = 0;
				int parallel8s = 0;
				int parallel5s = 0;
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
						ck = "һ��������";
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
						ck = "һ��������";
					}
					if ((cant[ii + 3] % 7 == 1) && (cant[ii + 1] % 7 == 3)
							&& (cant[ii + 2] % 7 == 5) && cant[ii] % 7 == 1) {
						chordnum = 10351;
						r51 = true;
						r5 = true;
						ck = "һ����������";
					}
					if ((cant[ii + 3] % 7 == 1) && (cant[ii + 2] % 7 == 3)
							&& (cant[ii + 1] % 7 == 5) && cant[ii] % 7 == 1) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "һ����������";
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
						// r5=true;ck="һ�����������ظ�5��";
					}
					// ///////////////a=t3
					if ((cant[ii + 3] % 7 == 3) && (cant[ii + 2] % 7 == 5)
							&& (cant[ii + 1] % 7 == 5) && cant[ii] % 7 == 1) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "һ���������ظ�5�� A=T ��������λ��";
					}
					if ((cant[ii + 3] % 7 == 3) && (cant[ii + 2] % 7 == 1)
							&& (cant[ii + 1] % 7 == 1) && cant[ii] % 7 == 5) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "һ���������ظ����� A=T ��������λ��";
					}
					// //////////////a=b1
					if ((cant[ii + 3] % 7 == 1) && (cant[ii + 2] % 7 == 3)
							&& (cant[ii + 1] % 7 == 1) && cant[ii] % 7 == 5) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "һ�����������ظ����� A=B ��������λ��";
					}
					if ((cant[ii + 3] % 7 == 1) && (cant[ii + 2] % 7 == 5)
							&& (cant[ii + 1] % 7 == 1) && cant[ii] % 7 == 3) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "һ�����������ظ����� A=B ��������λ��";
					}
					// //////////////a=b5
					if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 1)
							&& (cant[ii + 1] % 7 == 5) && cant[ii] % 7 == 3) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "һ���������� �ظ����� A=B ��������λ��";
					}
					if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 3)
							&& (cant[ii + 1] % 7 == 5) && cant[ii] % 7 == 1) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "һ���������� �ظ����� A=B ��������λ��";
					}
					// //////////////t=b1
					if ((cant[ii + 3] % 7 == 1) && (cant[ii + 2] % 7 == 1)
							&& (cant[ii + 1] % 7 == 3) && cant[ii] % 7 == 5) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "һ�����������ظ����� T=B ��������λ��";
					}
					if ((cant[ii + 3] % 7 == 1) && (cant[ii + 2] % 7 == 1)
							&& (cant[ii + 1] % 7 == 5) && cant[ii] % 7 == 3) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "һ�����������ظ����� T=B ��������λ��";
					}
					// //////////////t=b5
					if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 5)
							&& (cant[ii + 1] % 7 == 1) && cant[ii] % 7 == 3) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "һ���������� �ظ����� T=B ��������λ��";
					}
					if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 5)
							&& (cant[ii + 1] % 7 == 3) && cant[ii] % 7 == 1) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "һ���������� �ظ����� T=B ��������λ��";
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
						ck = "����������";
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
						ck = "����������";
					}

					if ((cant[ii + 3] % 7 == 2) && (cant[ii + 1] % 7 == 4)
							&& (cant[ii + 2] % 7 == 6)) {
						chordnum = 20462;
						r51 = true;
						r5 = true;
						ck = "����ԭλ����";
					}
					if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 4)
							&& (cant[ii + 1] % 7 == 6)) {
						chordnum = 20642;
						r51 = true;
						r5 = true;
						ck = "����ԭλ����";
					}
					// ///////////////a=t2 4
					if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 4)
							&& (cant[ii + 1] % 7 == 4) && cant[ii] % 7 == 6) {
						chordnum = 10422;
						r51 = true;
						r5 = true;
						ck = "����ԭλ���� �ظ�����A=T ��������λ��";
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
						ck = "���������� �ظ�����A=T ��������λ��";
					}

					// /////////////// a=b4
					if ((cant[ii + 3] % 7 == 4) && (cant[ii + 2] % 7 == 2)
							&& (cant[ii + 1] % 7 == 4) && cant[ii] % 7 == 6) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "���������� �ظ�����A=B ��������λ��";
					}
					if ((cant[ii + 3] % 7 == 4) && (cant[ii + 2] % 7 == 6)
							&& (cant[ii + 1] % 7 == 4) && cant[ii] % 7 == 2) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "���������� �ظ�����A=B ��������λ��";
					}
					// /////////////// a=b2
					if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 4)
							&& (cant[ii + 1] % 7 == 2) && cant[ii] % 7 == 6) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "����ԭλ���� �ظ�����A=B ��������λ��";
					}
					if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 6)
							&& (cant[ii + 1] % 7 == 2) && cant[ii] % 7 == 4) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "����ԭλ���� �ظ�����A=B ��������λ��";
					}
					// //////////////t=b4
					if ((cant[ii + 3] % 7 == 4) && (cant[ii + 2] % 7 == 4)
							&& (cant[ii + 1] % 7 == 2) && cant[ii] % 7 == 6) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "���������� �ظ�����T=B ��������λ��";
					}
					if ((cant[ii + 3] % 7 == 4) && (cant[ii + 2] % 7 == 4)
							&& (cant[ii + 1] % 7 == 6) && cant[ii] % 7 == 2) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "���������� �ظ�����T=B ��������λ��";
					}
					// //////////////t=b2
					if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 2)
							&& (cant[ii + 1] % 7 == 4) && cant[ii] % 7 == 6) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "����ԭλ���� �ظ�����T=B ��������λ��";
					}
					if ((cant[ii + 3] % 7 == 4) && (cant[ii + 2] % 7 == 4)
							&& (cant[ii + 1] % 7 == 2) && cant[ii] % 7 == 4) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "����ԭλ���� �ظ�����T=B ��������λ��";
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
						ck = "����������";
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
						ck = "����������";
					}

					if ((cant[ii + 3] % 7 == 3) && (cant[ii + 1] % 7 == 5)
							&& (cant[ii + 2] % 7 == 0)) {
						chordnum = 20462;
						r51 = true;
						r5 = true;
						ck = "����ԭλ����";
					}
					if ((cant[ii + 3] % 7 == 3) && (cant[ii + 2] % 7 == 5)
							&& (cant[ii + 1] % 7 == 0)) {
						chordnum = 20642;
						r51 = true;
						r5 = true;
						ck = "����ԭλ����";
					}
					// ///////////////a=t2 4
					if ((cant[ii + 3] % 7 == 3) && (cant[ii + 2] % 7 == 5)
							&& (cant[ii + 1] % 7 == 5) && cant[ii] % 7 == 0) {
						chordnum = 10422;
						r51 = true;
						r5 = true;
						ck = "����ԭλ���� �ظ�����A=T ��������λ��";
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
						ck = "���������� �ظ�����A=T ��������λ��";
					}

					// /////////////// a=b4
					if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 3)
							&& (cant[ii + 1] % 7 == 5) && cant[ii] % 7 == 0) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "���������� �ظ�����A=B ��������λ��";
					}
					if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 0)
							&& (cant[ii + 1] % 7 == 5) && cant[ii] % 7 == 3) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "���������� �ظ�����A=B ��������λ��";
					}
					// /////////////// a=b2
					if ((cant[ii + 3] % 7 == 3) && (cant[ii + 2] % 7 == 5)
							&& (cant[ii + 1] % 7 == 3) && cant[ii] % 7 == 0) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "����ԭλ���� �ظ�����A=B ��������λ��";
					}
					if ((cant[ii + 3] % 7 == 3) && (cant[ii + 2] % 7 == 0)
							&& (cant[ii + 1] % 7 == 3) && cant[ii] % 7 == 5) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "����ԭλ���� �ظ�����A=B ��������λ��";
					}
					// //////////////t=b4
					if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 5)
							&& (cant[ii + 1] % 7 == 3) && cant[ii] % 7 == 0) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "���������� �ظ�����T=B ��������λ��";
					}
					if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 5)
							&& (cant[ii + 1] % 7 == 0) && cant[ii] % 7 == 3) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "���������� �ظ�����T=B ��������λ��";
					}
					// //////////////t=b2
					if ((cant[ii + 3] % 7 == 3) && (cant[ii + 2] % 7 == 3)
							&& (cant[ii + 1] % 7 == 5) && cant[ii] % 7 == 0) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "����ԭλ���� �ظ�����T=B ��������λ��";
					}
					if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 5)
							&& (cant[ii + 1] % 7 == 3) && cant[ii] % 7 == 5) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "����ԭλ���� �ظ�����T=B ��������λ��";
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
						ck = "�ļ�������";
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
						ck = "�ļ�������";
					}
					if ((cant[ii + 3] % 7 == 4) && (cant[ii + 1] % 7 == 6)
							&& (cant[ii + 2] % 7 == 1) && cant[ii] % 7 == 4) {
						chordnum = 10351;
						r51 = true;
						r5 = true;
						ck = "�ļ���������";
					}
					if ((cant[ii + 3] % 7 == 4) && (cant[ii + 2] % 7 == 6)
							&& (cant[ii + 1] % 7 == 1) && cant[ii] % 7 == 4) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "�ļ���������";
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
						// r5=true;ck="�ļ����������ظ�5��";
					}
					// ///////////////a=t3
					if ((cant[ii + 3] % 7 == 6) && (cant[ii + 2] % 7 == 1)
							&& (cant[ii + 1] % 7 == 1) && cant[ii] % 7 == 4) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "�ļ��������ظ�5�� A=T ��������λ��";
					}
					if ((cant[ii + 3] % 7 == 6) && (cant[ii + 2] % 7 == 4)
							&& (cant[ii + 1] % 7 == 4) && cant[ii] % 7 == 1) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "�ļ��������ظ����� A=T ��������λ��";
					}
					// //////////////a=b1
					if ((cant[ii + 3] % 7 == 4) && (cant[ii + 2] % 7 == 6)
							&& (cant[ii + 1] % 7 == 4) && cant[ii] % 7 == 1) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "�ļ����������ظ����� A=B ��������λ��";
					}
					if ((cant[ii + 3] % 7 == 4) && (cant[ii + 2] % 7 == 1)
							&& (cant[ii + 1] % 7 == 4) && cant[ii] % 7 == 6) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "�ļ����������ظ����� A=B ��������λ��";
					}
					// //////////////a=b5
					if ((cant[ii + 3] % 7 == 1) && (cant[ii + 2] % 7 == 4)
							&& (cant[ii + 1] % 7 == 1) && cant[ii] % 7 == 6) {
						chordnum = 10531;
						r51 = true;
						// r5=true;ck="�ļ��������� �ظ����� A=B ��������λ��";
					}
					if ((cant[ii + 3] % 7 == 1) && (cant[ii + 2] % 7 == 6)
							&& (cant[ii + 1] % 7 == 1) && cant[ii] % 7 == 4) {
						chordnum = 10531;
						r51 = true;
						// r5=true;ck="�ļ��������� �ظ����� A=B ��������λ��";
					}
					// //////////////t=b1
					if ((cant[ii + 3] % 7 == 4) && (cant[ii + 2] % 7 == 4)
							&& (cant[ii + 1] % 7 == 6) && cant[ii] % 7 == 1) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "�ļ����������ظ����� T=B ��������λ��";
					}
					if ((cant[ii + 3] % 7 == 4) && (cant[ii + 2] % 7 == 4)
							&& (cant[ii + 1] % 7 == 1) && cant[ii] % 7 == 6) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "�ļ����������ظ����� T=B ��������λ��";
					}
					// //////////////t=b5
					if ((cant[ii + 3] % 7 == 1) && (cant[ii + 2] % 7 == 1)
							&& (cant[ii + 1] % 7 == 4) && cant[ii] % 7 == 6) {
						chordnum = 10531;
						r51 = true;
						// r5=true;ck="�ļ��������� �ظ����� T=B ��������λ��";
					}
					if ((cant[ii + 3] % 7 == 1) && (cant[ii + 2] % 7 == 1)
							&& (cant[ii + 1] % 7 == 6) && cant[ii] % 7 == 4) {
						chordnum = 10531;
						r51 = true;
						// r5=true;ck="�ļ��������� �ظ����� T=B ��������λ��";
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
						ck = "�弶������";
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
						ck = "�弶������";
					}
					if ((cant[ii + 3] % 7 == 5) && (cant[ii + 1] % 7 == 0)
							&& (cant[ii + 2] % 7 == 2) && cant[ii] % 7 == 5) {
						chordnum = 10351;
						r51 = true;
						r5 = true;
						ck = "�弶��������";
					}
					if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 0)
							&& (cant[ii + 1] % 7 == 2) && cant[ii] % 7 == 5) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "�弶��������";
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
						// r5=true;ck="�弶���������ظ�5��";
					}
					// ///////////////a=t3
					if ((cant[ii + 3] % 7 == 0) && (cant[ii + 2] % 7 == 2)
							&& (cant[ii + 1] % 7 == 2) && cant[ii] % 7 == 5) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "�弶�������ظ�5�� A=T ��������λ��";
					}
					if ((cant[ii + 3] % 7 == 0) && (cant[ii + 2] % 7 == 5)
							&& (cant[ii + 1] % 7 == 5) && cant[ii] % 7 == 2) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "�弶�������ظ����� A=T ��������λ��";
					}
					// //////////////a=b1
					if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 0)
							&& (cant[ii + 1] % 7 == 5) && cant[ii] % 7 == 2) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "�弶���������ظ����� A=B ��������λ��";
					}
					if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 2)
							&& (cant[ii + 1] % 7 == 5) && cant[ii] % 7 == 0) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "�弶���������ظ����� A=B ��������λ��";
					}
					// //////////////a=b5
					if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 5)
							&& (cant[ii + 1] % 7 == 2) && cant[ii] % 7 == 0) {
						chordnum = 10531;
						r51 = true;
						// r5=true;ck="�弶�������� �ظ����� A=B ��������λ��";
					}
					if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 0)
							&& (cant[ii + 1] % 7 == 2) && cant[ii] % 7 == 5) {
						chordnum = 10531;
						r51 = true;
						// r5=true;ck="�弶�������� �ظ����� A=B ��������λ��";
					}
					// //////////////t=b1
					if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 5)
							&& (cant[ii + 1] % 7 == 0) && cant[ii] % 7 == 2) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "�弶���������ظ����� T=B ��������λ��";
					}
					if ((cant[ii + 3] % 7 == 5) && (cant[ii + 2] % 7 == 5)
							&& (cant[ii + 1] % 7 == 2) && cant[ii] % 7 == 0) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "�弶���������ظ����� T=B ��������λ��";
					}
					// //////////////t=b5
					if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 2)
							&& (cant[ii + 1] % 7 == 5) && cant[ii] % 7 == 0) {
						chordnum = 10531;
						r51 = true;
						// r5=true;ck="�弶�������� �ظ����� T=B ��������λ��";
					}
					if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 2)
							&& (cant[ii + 1] % 7 == 0) && cant[ii] % 7 == 5) {
						chordnum = 10531;
						r51 = true;
						// r5=true;ck="�弶�������� �ظ����� T=B ��������λ��";
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
						ck = "����ԭλ������";
					}
					if ((cant[ii + 3] % 7 == 6) && (cant[ii + 2] % 7 == 1)
							&& (cant[ii + 1] % 7 == 3)
							&& (cant[ii] % 7 == 6 || cant[ii] % 7 == 1)) {
						chordnum = 70427;
						r51 = true;
						r5 = true;
						ck = "����ԭλ������";
					}
					// ///////////////a=t
					if ((cant[ii + 3] % 7 == 6) && (cant[ii + 2] % 7 == 3)
							&& (cant[ii + 1] % 7 == 3) && cant[ii] % 7 == 1) {
						chordnum = 10422;
						r51 = true;
						r5 = true;
						ck = "����ԭλ������ A=T �ظ����� ��������";
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
						ck = "����ԭλ������ A=B �ظ����� ��������";
					}
					if ((cant[ii + 3] % 7 == 6) && (cant[ii + 2] % 7 == 1)
							&& (cant[ii + 1] % 7 == 6) && cant[ii] % 7 == 3) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "����ԭλ������ A=B �ظ����� ��������";
					}
					// //////////////t=b
					if ((cant[ii + 3] % 7 == 6) && (cant[ii + 2] % 7 == 6)
							&& (cant[ii + 1] % 7 == 3) && cant[ii] % 7 == 1) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "����ԭλ������ T=B �ظ����� ��������";
					}
					if ((cant[ii + 3] % 7 == 6) && (cant[ii + 2] % 7 == 6)
							&& (cant[ii + 1] % 7 == 1) && cant[ii] % 7 == 3) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "����ԭλ������ T=B �ظ����� ��������";
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
						ck = "�߼�������";
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
						ck = "�߼�������";
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
						ck = "�߼������� �ظ�����A=T �������� ";
					}
					if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 0)
							&& (cant[ii + 1] % 7 == 0) && cant[ii] % 7 == 4) {
						chordnum = 10466;
						r51 = true;
						r5 = true;
						ck = "�߼������� �ظ�����A=T �������� ";
					}
					// //////////////a=b
					if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 0)
							&& (cant[ii + 1] % 7 == 2) && cant[ii] % 7 == 4) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "�߼������� �ظ�����A=B �������� ";
					}
					if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 4)
							&& (cant[ii + 1] % 7 == 2) && cant[ii] % 7 == 0) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "�߼������� �ظ�����A=B �������� ";
					}
					// //////////////t=b
					if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 2)
							&& (cant[ii + 1] % 7 == 0) && cant[ii] % 7 == 4) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "�߼������� �ظ�����T=B �������� ";
					}
					if ((cant[ii + 3] % 7 == 2) && (cant[ii + 2] % 7 == 2)
							&& (cant[ii + 1] % 7 == 4) && cant[ii] % 7 == 0) {
						chordnum = 10531;
						r51 = true;
						r5 = true;
						ck = "�߼������� �ظ�����T=B �������� ";
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
						ck2 = "һ��������";
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
						ck2 = "һ��������";
					}
					if ((fant[i + 3] % 7 == 1) && (fant[i + 1] % 7 == 3)
							&& (fant[i + 2] % 7 == 5) && fant[i] % 7 == 1) {
						chordnum = 10351;
						r61 = true;
						r6 = true;
						ck2 = "һ����������";
					}
					if ((fant[i + 3] % 7 == 1) && (fant[i + 2] % 7 == 3)
							&& (fant[i + 1] % 7 == 5) && fant[i] % 7 == 1) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "һ����������";
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
						// r6=true;ck2="һ�����������ظ�5��";
					}
					// ///////////////a=t3
					if ((fant[i + 3] % 7 == 3) && (fant[i + 2] % 7 == 5)
							&& (fant[i + 1] % 7 == 5) && fant[i] % 7 == 1) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "һ���������ظ�5�� A=T ��������λ��";
					}
					if ((fant[i + 3] % 7 == 3) && (fant[i + 2] % 7 == 1)
							&& (fant[i + 1] % 7 == 1) && fant[i] % 7 == 5) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "һ���������ظ����� A=T ��������λ��";
					}
					// //////////////a=b1
					if ((fant[i + 3] % 7 == 1) && (fant[i + 2] % 7 == 3)
							&& (fant[i + 1] % 7 == 1) && fant[i] % 7 == 5) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "һ�����������ظ����� A=B ��������λ��";
					}
					if ((fant[i + 3] % 7 == 1) && (fant[i + 2] % 7 == 5)
							&& (fant[i + 1] % 7 == 1) && fant[i] % 7 == 3) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "һ�����������ظ����� A=B ��������λ��";
					}
					// //////////////a=b5
					if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 1)
							&& (fant[i + 1] % 7 == 5) && fant[i] % 7 == 3) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "һ���������� �ظ����� A=B ��������λ��";
					}
					if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 3)
							&& (fant[i + 1] % 7 == 5) && fant[i] % 7 == 1) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "һ���������� �ظ����� A=B ��������λ��";
					}
					// //////////////t=b1
					if ((fant[i + 3] % 7 == 1) && (fant[i + 2] % 7 == 1)
							&& (fant[i + 1] % 7 == 3) && fant[i] % 7 == 5) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "һ�����������ظ����� T=B ��������λ��";
					}
					if ((fant[i + 3] % 7 == 1) && (fant[i + 2] % 7 == 1)
							&& (fant[i + 1] % 7 == 5) && fant[i] % 7 == 3) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "һ�����������ظ����� T=B ��������λ��";
					}
					// //////////////t=b5
					if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 5)
							&& (fant[i + 1] % 7 == 1) && fant[i] % 7 == 3) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "һ���������� �ظ����� T=B ��������λ��";
					}
					if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 5)
							&& (fant[i + 1] % 7 == 3) && fant[i] % 7 == 1) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "һ���������� �ظ����� T=B ��������λ��";
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
						ck2 = "����������";
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
						ck2 = "����������";
					}

					if ((fant[i + 3] % 7 == 2) && (fant[i + 1] % 7 == 4)
							&& (fant[i + 2] % 7 == 6)) {
						chordnum = 20462;
						r61 = true;
						r6 = true;
						ck2 = "����ԭλ����";
					}
					if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 4)
							&& (fant[i + 1] % 7 == 6)) {
						chordnum = 20642;
						r61 = true;
						r6 = true;
						ck2 = "����ԭλ����";
					}
					// ///////////////a=t2 4
					if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 4)
							&& (fant[i + 1] % 7 == 4) && fant[i] % 7 == 6) {
						chordnum = 10422;
						r61 = true;
						r6 = true;
						ck2 = "����ԭλ���� �ظ�����A=T ��������λ��";
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
						ck2 = "���������� �ظ�����A=T ��������λ��";
					}

					// /////////////// a=b4
					if ((fant[i + 3] % 7 == 4) && (fant[i + 2] % 7 == 2)
							&& (fant[i + 1] % 7 == 4) && fant[i] % 7 == 6) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "���������� �ظ�����A=B ��������λ��";
					}
					if ((fant[i + 3] % 7 == 4) && (fant[i + 2] % 7 == 6)
							&& (fant[i + 1] % 7 == 4) && fant[i] % 7 == 2) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "���������� �ظ�����A=B ��������λ��";
					}
					// /////////////// a=b2
					if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 4)
							&& (fant[i + 1] % 7 == 2) && fant[i] % 7 == 6) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "����ԭλ���� �ظ�����A=B ��������λ��";
					}
					if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 6)
							&& (fant[i + 1] % 7 == 2) && fant[i] % 7 == 4) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "����ԭλ���� �ظ�����A=B ��������λ��";
					}
					// //////////////t=b4
					if ((fant[i + 3] % 7 == 4) && (fant[i + 2] % 7 == 4)
							&& (fant[i + 1] % 7 == 2) && fant[i] % 7 == 6) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "���������� �ظ�����T=B ��������λ��";
					}
					if ((fant[i + 3] % 7 == 4) && (fant[i + 2] % 7 == 4)
							&& (fant[i + 1] % 7 == 6) && fant[i] % 7 == 2) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "���������� �ظ�����T=B ��������λ��";
					}
					// //////////////t=b2
					if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 2)
							&& (fant[i + 1] % 7 == 4) && fant[i] % 7 == 6) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "����ԭλ���� �ظ�����T=B ��������λ��";
					}
					if ((fant[i + 3] % 7 == 4) && (fant[i + 2] % 7 == 4)
							&& (fant[i + 1] % 7 == 2) && fant[i] % 7 == 4) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "����ԭλ���� �ظ�����T=B ��������λ��";
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
						ck2 = "����������";
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
						ck2 = "����������";
					}

					if ((fant[i + 3] % 7 == 3) && (fant[i + 1] % 7 == 5)
							&& (fant[i + 2] % 7 == 0)) {
						chordnum = 20462;
						r61 = true;
						r6 = true;
						ck2 = "����ԭλ����";
					}
					if ((fant[i + 3] % 7 == 3) && (fant[i + 2] % 7 == 5)
							&& (fant[i + 1] % 7 == 0)) {
						chordnum = 20642;
						r61 = true;
						r6 = true;
						ck2 = "����ԭλ����";
					}
					// ///////////////a=t2 4
					if ((fant[i + 3] % 7 == 3) && (fant[i + 2] % 7 == 5)
							&& (fant[i + 1] % 7 == 5) && fant[i] % 7 == 0) {
						chordnum = 10422;
						r61 = true;
						r6 = true;
						ck2 = "����ԭλ���� �ظ�����A=T ��������λ��";
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
						ck2 = "���������� �ظ�����A=T ��������λ��";
					}

					// /////////////// a=b4
					if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 3)
							&& (fant[i + 1] % 7 == 5) && fant[i] % 7 == 0) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "���������� �ظ�����A=B ��������λ��";
					}
					if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 0)
							&& (fant[i + 1] % 7 == 5) && fant[i] % 7 == 3) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "���������� �ظ�����A=B ��������λ��";
					}
					// /////////////// a=b2
					if ((fant[i + 3] % 7 == 3) && (fant[i + 2] % 7 == 5)
							&& (fant[i + 1] % 7 == 3) && fant[i] % 7 == 0) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "����ԭλ���� �ظ�����A=B ��������λ��";
					}
					if ((fant[i + 3] % 7 == 3) && (fant[i + 2] % 7 == 0)
							&& (fant[i + 1] % 7 == 3) && fant[i] % 7 == 5) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "����ԭλ���� �ظ�����A=B ��������λ��";
					}
					// //////////////t=b4
					if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 5)
							&& (fant[i + 1] % 7 == 3) && fant[i] % 7 == 0) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "���������� �ظ�����T=B ��������λ��";
					}
					if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 5)
							&& (fant[i + 1] % 7 == 0) && fant[i] % 7 == 3) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "���������� �ظ�����T=B ��������λ��";
					}
					// //////////////t=b2
					if ((fant[i + 3] % 7 == 3) && (fant[i + 2] % 7 == 3)
							&& (fant[i + 1] % 7 == 5) && fant[i] % 7 == 0) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "����ԭλ���� �ظ�����T=B ��������λ��";
					}
					if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 5)
							&& (fant[i + 1] % 7 == 3) && fant[i] % 7 == 5) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "����ԭλ���� �ظ�����T=B ��������λ��";
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
						ck2 = "�ļ�������";
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
						ck2 = "�ļ�������";
					}
					if ((fant[i + 3] % 7 == 4) && (fant[i + 1] % 7 == 6)
							&& (fant[i + 2] % 7 == 1) && fant[i] % 7 == 4) {
						chordnum = 10351;
						r61 = true;
						r6 = true;
						ck2 = "�ļ���������";
					}
					if ((fant[i + 3] % 7 == 4) && (fant[i + 2] % 7 == 6)
							&& (fant[i + 1] % 7 == 1) && fant[i] % 7 == 4) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "�ļ���������";
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
						// r6=true;ck2="�ļ����������ظ�5��";
					}
					// ///////////////a=t3
					if ((fant[i + 3] % 7 == 6) && (fant[i + 2] % 7 == 1)
							&& (fant[i + 1] % 7 == 1) && fant[i] % 7 == 4) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "�ļ��������ظ�5�� A=T ��������λ��";
					}
					if ((fant[i + 3] % 7 == 6) && (fant[i + 2] % 7 == 4)
							&& (fant[i + 1] % 7 == 4) && fant[i] % 7 == 1) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "�ļ��������ظ����� A=T ��������λ��";
					}
					// //////////////a=b1
					if ((fant[i + 3] % 7 == 4) && (fant[i + 2] % 7 == 6)
							&& (fant[i + 1] % 7 == 4) && fant[i] % 7 == 1) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "�ļ����������ظ����� A=B ��������λ��";
					}
					if ((fant[i + 3] % 7 == 4) && (fant[i + 2] % 7 == 1)
							&& (fant[i + 1] % 7 == 4) && fant[i] % 7 == 6) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "�ļ����������ظ����� A=B ��������λ��";
					}
					// //////////////a=b5
					if ((fant[i + 3] % 7 == 1) && (fant[i + 2] % 7 == 4)
							&& (fant[i + 1] % 7 == 1) && fant[i] % 7 == 6) {
						chordnum = 10531;
						r61 = true;
						// r6=true;ck2="�ļ��������� �ظ����� A=B ��������λ��";
					}
					if ((fant[i + 3] % 7 == 1) && (fant[i + 2] % 7 == 6)
							&& (fant[i + 1] % 7 == 1) && fant[i] % 7 == 4) {
						chordnum = 10531;
						r61 = true;
						// r6=true;ck2="�ļ��������� �ظ����� A=B ��������λ��";
					}
					// //////////////t=b1
					if ((fant[i + 3] % 7 == 4) && (fant[i + 2] % 7 == 4)
							&& (fant[i + 1] % 7 == 6) && fant[i] % 7 == 1) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "�ļ����������ظ����� T=B ��������λ��";
					}
					if ((fant[i + 3] % 7 == 4) && (fant[i + 2] % 7 == 4)
							&& (fant[i + 1] % 7 == 1) && fant[i] % 7 == 6) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "�ļ����������ظ����� T=B ��������λ��";
					}
					// //////////////t=b5
					if ((fant[i + 3] % 7 == 1) && (fant[i + 2] % 7 == 1)
							&& (fant[i + 1] % 7 == 4) && fant[i] % 7 == 6) {
						chordnum = 10531;
						r61 = true;
						// r6=true;ck2="�ļ��������� �ظ����� T=B ��������λ��";
					}
					if ((fant[i + 3] % 7 == 1) && (fant[i + 2] % 7 == 1)
							&& (fant[i + 1] % 7 == 6) && fant[i] % 7 == 4) {
						chordnum = 10531;
						r61 = true;
						// r6=true;ck2="�ļ��������� �ظ����� T=B ��������λ��";
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
						ck2 = "�弶������";
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
						ck2 = "�弶������";
					}
					if ((fant[i + 3] % 7 == 5) && (fant[i + 1] % 7 == 0)
							&& (fant[i + 2] % 7 == 2) && fant[i] % 7 == 5) {
						chordnum = 10351;
						r61 = true;
						r6 = true;
						ck2 = "�弶��������";
					}
					if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 0)
							&& (fant[i + 1] % 7 == 2) && fant[i] % 7 == 5) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "�弶��������";
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
						// r6=true;ck2="�弶���������ظ�5��";
					}
					// ///////////////a=t3
					if ((fant[i + 3] % 7 == 0) && (fant[i + 2] % 7 == 2)
							&& (fant[i + 1] % 7 == 2) && fant[i] % 7 == 5) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "�弶�������ظ�5�� A=T ��������λ��";
					}
					if ((fant[i + 3] % 7 == 0) && (fant[i + 2] % 7 == 5)
							&& (fant[i + 1] % 7 == 5) && fant[i] % 7 == 2) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "�弶�������ظ����� A=T ��������λ��";
					}
					// //////////////a=b1
					if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 0)
							&& (fant[i + 1] % 7 == 5) && fant[i] % 7 == 2) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "�弶���������ظ����� A=B ��������λ��";
					}
					if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 2)
							&& (fant[i + 1] % 7 == 5) && fant[i] % 7 == 0) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "�弶���������ظ����� A=B ��������λ��";
					}
					// //////////////a=b5
					if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 5)
							&& (fant[i + 1] % 7 == 2) && fant[i] % 7 == 0) {
						chordnum = 10531;
						r61 = true;
						// r6=true;ck2="�弶�������� �ظ����� A=B ��������λ��";
					}
					if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 0)
							&& (fant[i + 1] % 7 == 2) && fant[i] % 7 == 5) {
						chordnum = 10531;
						r61 = true;
						// r6=true;ck2="�弶�������� �ظ����� A=B ��������λ��";
					}
					// //////////////t=b1
					if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 5)
							&& (fant[i + 1] % 7 == 0) && fant[i] % 7 == 2) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "�弶���������ظ����� T=B ��������λ��";
					}
					if ((fant[i + 3] % 7 == 5) && (fant[i + 2] % 7 == 5)
							&& (fant[i + 1] % 7 == 2) && fant[i] % 7 == 0) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "�弶���������ظ����� T=B ��������λ��";
					}
					// //////////////t=b5
					if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 2)
							&& (fant[i + 1] % 7 == 5) && fant[i] % 7 == 0) {
						chordnum = 10531;
						r61 = true;
						// r6=true;ck2="�弶�������� �ظ����� T=B ��������λ��";
					}
					if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 2)
							&& (fant[i + 1] % 7 == 0) && fant[i] % 7 == 5) {
						chordnum = 10531;
						r61 = true;
						// r6=true;ck2="�弶�������� �ظ����� T=B ��������λ��";
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
						ck2 = "����ԭλ������";
					}
					if ((fant[i + 3] % 7 == 6) && (fant[i + 2] % 7 == 1)
							&& (fant[i + 1] % 7 == 3)
							&& (fant[i] % 7 == 6 || fant[i] % 7 == 1)) {
						chordnum = 70427;
						r61 = true;
						r6 = true;
						ck2 = "����ԭλ������";
					}
					// ///////////////a=t
					if ((fant[i + 3] % 7 == 6) && (fant[i + 2] % 7 == 3)
							&& (fant[i + 1] % 7 == 3) && fant[i] % 7 == 1) {
						chordnum = 10422;
						r61 = true;
						r6 = true;
						ck2 = "����ԭλ������ A=T �ظ����� ��������";
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
						ck2 = "����ԭλ������ A=B �ظ����� ��������";
					}
					if ((fant[i + 3] % 7 == 6) && (fant[i + 2] % 7 == 1)
							&& (fant[i + 1] % 7 == 6) && fant[i] % 7 == 3) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "����ԭλ������ A=B �ظ����� ��������";
					}
					// //////////////t=b
					if ((fant[i + 3] % 7 == 6) && (fant[i + 2] % 7 == 6)
							&& (fant[i + 1] % 7 == 3) && fant[i] % 7 == 1) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "����ԭλ������ T=B �ظ����� ��������";
					}
					if ((fant[i + 3] % 7 == 6) && (fant[i + 2] % 7 == 6)
							&& (fant[i + 1] % 7 == 1) && fant[i] % 7 == 3) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "����ԭλ������ T=B �ظ����� ��������";
					}
				}

				// /////////////////7
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
						ck2 = "�߼�������";
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
						ck2 = "�߼�������";
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
						ck2 = "�߼������� �ظ�����A=T �������� ";
					}
					if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 0)
							&& (fant[i + 1] % 7 == 0) && fant[i] % 7 == 4) {
						chordnum = 10466;
						r61 = true;
						r6 = true;
						ck2 = "�߼������� �ظ�����A=T �������� ";
					}
					// //////////////a=b
					if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 0)
							&& (fant[i + 1] % 7 == 2) && fant[i] % 7 == 4) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "�߼������� �ظ�����A=B �������� ";
					}
					if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 4)
							&& (fant[i + 1] % 7 == 2) && fant[i] % 7 == 0) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "�߼������� �ظ�����A=B �������� ";
					}
					// //////////////t=b
					if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 2)
							&& (fant[i + 1] % 7 == 0) && fant[i] % 7 == 4) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "�߼������� �ظ�����T=B �������� ";
					}
					if ((fant[i + 3] % 7 == 2) && (fant[i + 2] % 7 == 2)
							&& (fant[i + 1] % 7 == 4) && fant[i] % 7 == 0) {
						chordnum = 10531;
						r61 = true;
						r6 = true;
						ck2 = "�߼������� �ظ�����T=B �������� ";
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
				if (fant[ii + 2] - fant[ii + 3] == 7) {
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

				if (cant[ii] - fant[i] == 1) {
					seconds++;
				}
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

				if (fant[i] - cant[ii] == 1) {
					seconds++;
				}
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

				// /////////////////////////////////��������
				if (cant[ii + 3] - fant[i + 3] > 8) {
					bassin8++;
				}
				if (fant[i + 3] - cant[ii + 3] > 8) {
					bassin8++;
				}
				// ////////////////////////////////��������
				if (cant[ii + 2] - cant[ii + 3] > 15) {
					hx++;
				}
				if (fant[i + 2] - fant[i + 3] > 15) {
					hx++;
				}

				if (parallel8s < 2 && parallel5s < 2 && seconds < 2
						&& bassin8 < 1 && hx < 1) { // �ų�ƽ��8�ȣ�ƽ��5�Ⱥͷ�����2�ȣ�������������������
					r2 = true;
				}

				if ((cant[ii + 2] > cant[ii + 3])
						&& (fant[i + 2] > fant[i + 3])) {
					r7 = true;
				}

				// ///////////////////////////////////��������ͬ
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

				if (r2 && r51 && r61 && r5 && r6
				// &&r7
						&& r8

				// // &&(r5||r6)
				// &&r61
				) {

					if (A != null) { // �����ǿ�
						// System.out.println("��ʼ�жϺ���"
						// + " ");
						boolean r = true;

						if (r) {

							b0s = "";
							A[0] = cant[ii];
							A[1] = cant[ii + 1];
							A[2] = cant[ii + 2];
							A[3] = cant[ii + 3];
							A[4] = fant[i];
							A[5] = fant[i + 1];
							A[6] = fant[i + 2];
							A[7] = fant[i + 3];
							for (int zhuani = 0; zhuani < 8; zhuani++) {

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
							b0resultString = sb0.toString();

							String b0resultString2 = "";

							b0resultString2 = b0resultString.replaceAll(
									"[\\[\\]]", "").replaceAll(" +", "");

							As += b0resultString2;
							As = As.trim();

							sb0 = null;
							flag0 = false;
							b0resultString = "";
							b0resultString2 = "";
							b0s = "";
							s0.clear();
						}// r
					} // �����ǿ�

					if (A1 != null) { // �ǿ�

						boolean r1 = true;
						if (r1) {

							b1s = "";
							A1[0] = fant[i];
							A1[1] = fant[i + 1];
							A1[2] = fant[i + 2];
							A1[3] = fant[i + 3];

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
							b1resultString = sb1.toString();

							String b1resultString2 = "";

							b1resultString2 = b1resultString.replaceAll(
									"[\\[\\]]", "").replaceAll(" +", "");

							As1 += b1resultString2;
							As1 = As1.trim();

							sb1 = null;
							flag1 = false;
							b1resultString = "";
							b1resultString2 = "";
							b1s = "";
							s1.clear();
						}// r
					} // �����ǿ�

					System.out.print(cant[ii]
							+ " "
							+ cant[ii + 1]
							+ " "
							+ cant[ii + 2]
							+ " "
							+ cant[ii + 3]
							+ "���� "
							+ fant[i]
							+ " "
							+ fant[i + 1]
							+ " "
							+ fant[i + 2]
							+ " "
							+ fant[i + 3]
							// +"  ���֣�"+
							// cant[ii]%7 + " " + cant[ii + 1]%7 + " "
							// + cant[ii + 2]%7 + " " + cant[ii + 3]%7 +
							// "���� " + fant[i]%7
							// + " " + fant[i + 1]%7 + " " + fant[i + 2]%7 +
							// " "
							// + fant[i + 3]%7

							+ "  ������" + SC(cant[ii]) + " " + SC(cant[ii + 1])
							+ " " + SC(cant[ii + 2]) + " " + SC(cant[ii + 3])
							+ "���� " + SC(fant[i]) + " " + SC(fant[i + 1]) + " "
							+ SC(fant[i + 2]) + " " + SC(fant[i + 3]) + "  ������"
							+ ck + " ����  " + ck2);
					count++;
					System.out.println(" ");

				} // if r2
				// for can
			}// for fan
			System.out.println("count:" + count);
			// System.out.println("As " + As);

		} else {
			System.out.println(" ������ĸ����޷������Ĳ���������������");
		}// ckinput
	}

}
