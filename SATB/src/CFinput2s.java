import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


///////////////////////////////////////satb���������ܸ������ɲ���2��satb�ṩʹ��
public class CFinput2s {

	private static int chord1; // ��һ�����ɵ�B����
	private static int chord3;// T����
	private static int chord5;// A����

	private static int chord11;// �ڶ������ɵ�B����
	private static int chord13;// T����
	private static int chord15;// A����

	static int bn1 = 29;// ��������1
	static int bn2 = 31;// ��������2
	
	static int[] b = new int[] { bn1, bn2 }; // ������������

	static int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14,
			15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31,
			32, 33, 34, 35, 36, 37, 38, 39, 40, 41 };// 46,47,48,49,50//,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80
	// ���ټ����϶�Ӧ�İ׼�

	static int[] af = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,
			14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
			31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41 };// 46,47,48,49,50//,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80
	// ���ټ����϶�Ӧ�İ׼��ڶ���

	// //////////////////////int����ת��String��Ҫ
	static int[] b0 = new int[4];
	static int[] b1 = new int[4];
	static String b0s = "";
	static String b1s = "";
	static ArrayList<String> s0 = new ArrayList<String>();
	static ArrayList<String> s1 = new ArrayList<String>();

	static String cr = ""; // ��1�������п��ܹ��ɵ�SATBƴ�ӳ��ַ���
	static String fr = ""; // ��2�������п��ܹ��ɵ�SATBƴ�ӳ��ַ���

	public CFinput2s() {

	}

	public static void C() {
//		System.out.println("���ִ��������C1��ʼ�����������еĺ�������������29��ʾC5 7*4+1=C5������32��ʾF5 7*4+4=F5��������С��41��");		
		System.out.println("������һ��������һ�����ӵ�����");
		Scanner sc1 = new Scanner(System.in); // ��������
		String str1 = sc1.next().toString();
		int str1i=0;
		str1i = Integer.parseInt(str1);
		
		System.out.println("������һ����������һ�����ӵ�����");
		Scanner sc2 = new Scanner(System.in); // ��������
		String str2 = sc2.next().toString();
		int str2i=0;
		str2i = Integer.parseInt(str2);

		if (b != null && b.length > 1) { // ��������2����

			for (int i = 0; i < b.length; i++) { // ѭ��������������

				if (i == 0) { // ��1�����ɹ���SATB
					
					b[i]=str1i;
										
					for (int i1 = 0; i1 < b[i]; i1++) {
						for (int i2 = 0; i2 < b[i]; i2++) {
							for (int i3 = 0; i3 < b[i]; i3++) {

								chord5 = af[i1];// A����
								chord3 = af[i2];// T����
								chord1 = af[i3];// B����

								boolean inChord = false;
								boolean morethenChord = false;
								// System.out.println(chord1+" "+chord3+" "+chord5
								// );
								if ((b[i] > chord5 && b[i] > chord3 && b[i] > chord1)
										&& (chord5 > chord3 && chord5 > chord1 && chord3 > chord1)
										&& (b[i] - chord5 < 8 && chord5
												- chord3 < 8)) // �Ϸ�3�����˶��ڣ�SATB�ɸߵ���

								{
									morethenChord = true;
									// System.out.println(chord5+" "+chord3+" "+chord1
									// );
								}

								if (
								// (
								// (b[i] % 7 == chord1 % 7)|| (b[i] % 7 ==
								// chord3 % 7) || (b[i] % 7 == chord5 % 7)
								// )
								// &&
								(((b[i] % 7 - (chord5) % 7) != 1)
										&& ((b[i] % 7 - (chord3) % 7) != 1)
										&& ((b[i] % 7 - (chord1) % 7) != 1)
										&& ((chord1 % 7 - b[i] % 7) != 1)
										&& ((chord3 % 7 - b[i] % 7) != 1)
										&& ((chord5 % 7 - b[i] % 7) != 1)
										&& ((b[i] % 7 - (chord5) % 7) != 6)
										&& ((b[i] % 7 - (chord3) % 7) != 6)
										&& ((b[i] % 7 - (chord1) % 7) != 6)
										&& ((chord1 % 7 - b[i] % 7) != 6)
										&& ((chord3 % 7 - b[i] % 7) != 6)
										&& ((chord5 % 7 - b[i] % 7) != 6)

										&& (((chord5) % 7 - (chord3) % 7) != 1)
										&& (((chord5) % 7 - (chord1) % 7) != 1)
										&& (((chord3) % 7 - (chord5) % 7) != 1)
										&& (((chord1) % 7 - (chord5) % 7) != 1)
										&& (((chord5) % 7 - (chord3) % 7) != 6)
										&& (((chord5) % 7 - (chord1) % 7) != 6)
										&& (((chord3) % 7 - (chord5) % 7) != 6)
										&& (((chord1) % 7 - (chord5) % 7) != 6)

										&& (((chord3) % 7 - (chord1) % 7) != 1)
										&& (((chord1) % 7 - (chord3) % 7) != 1)
										&& (((chord3) % 7 - (chord1) % 7) != 6) && (((chord1) % 7 - (chord3) % 7) != 6)

								)) // �ų�2��7�ȹ�ϵ

								{
									inChord = true;
									// System.out.println(chord5+" "+chord3+" "+chord1
									// );
								}
								if (inChord && morethenChord) {
									// System.out.println(chord5+" "+chord3+" "+chord1
									// );

									// �ѵ�1�������п��ܹ��ɵ�SATBint����,ת��ƴ�ӳ��ַ���
									if (b != null) {
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
											b0resultString = sb0.toString();

											String b0resultString2 = "";

											b0resultString2 = b0resultString
													.replaceAll("[\\[\\]]", "")
													.replaceAll(" +", "");

											cr += b0resultString2; // ��1�������п��ܹ��ɵ�SATBƴ�ӳ��ַ���
											cr = cr.trim();

											sb0 = null; // ����
											flag0 = false;
											b0resultString = "";
											b0resultString2 = "";
											b0s = "";
											s0.clear();
										}// r
									} // �����ǿ�
								}
							}// fori3
						}
					}// fori1
				}// bi0

				if (i == 1) { // ��2�����ɹ���SATB
					
					b[i]=str2i;

					for (int i1 = 0; i1 < b[i]; i1++) {
						for (int i2 = 0; i2 < b[i]; i2++) {
							for (int i3 = 0; i3 < b[i] - 7; i3++) {

								chord15 = af[i1];
								chord13 = af[i2];
								chord11 = af[i3];

								boolean inchord1 = false;
								boolean morethenchord1 = false;

								if ((b[i] > chord15 && b[i] > chord13 && b[i] > chord11)
										&& (chord15 > chord13
												&& chord15 > chord11 && chord13 > chord11)
										&& (b[i] - chord15 < 8 && chord15
												- chord13 < 8))

								{
									morethenchord1 = true;
									// System.out.println("5.������������" );
								}

								if (((b[i] % 7 == chord11 % 7)
										|| (b[i] % 7 == chord13 % 7) || (b[i] % 7 == chord15 % 7))
										&& (((b[i] % 7 - (chord15) % 7) != 1)
												&& ((b[i] % 7 - (chord13) % 7) != 1)
												&& ((b[i] % 7 - (chord11) % 7) != 1)
												&& ((chord11 % 7 - b[i] % 7) != 1)
												&& ((chord13 % 7 - b[i] % 7) != 1)
												&& ((chord15 % 7 - b[i] % 7) != 1)
												&& ((b[i] % 7 - (chord15) % 7) != 6)
												&& ((b[i] % 7 - (chord13) % 7) != 6)
												&& ((b[i] % 7 - (chord11) % 7) != 6)
												&& ((chord11 % 7 - b[i] % 7) != 6)
												&& ((chord13 % 7 - b[i] % 7) != 6)
												&& ((chord15 % 7 - b[i] % 7) != 6)

												&& (((chord15) % 7 - (chord13) % 7) != 1)
												&& (((chord15) % 7 - (chord11) % 7) != 1)
												&& (((chord13) % 7 - (chord15) % 7) != 1)
												&& (((chord11) % 7 - (chord15) % 7) != 1)
												&& (((chord15) % 7 - (chord13) % 7) != 6)
												&& (((chord15) % 7 - (chord11) % 7) != 6)
												&& (((chord13) % 7 - (chord15) % 7) != 6)
												&& (((chord11) % 7 - (chord15) % 7) != 6)

												&& (((chord13) % 7 - (chord11) % 7) != 1)
												&& (((chord11) % 7 - (chord13) % 7) != 1)
												&& (((chord13) % 7 - (chord11) % 7) != 6) && (((chord11) % 7 - (chord13) % 7) != 6)

										)) //

								{
									inchord1 = true;
								}
								if (inchord1 && morethenchord1) {

									if (b != null) { // �ǿ�
										// ChordKind chk1 = new ChordKind();
										// chk1.Ischord(b[i], chord15, chord13,
										// chord11);

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
											b1resultString = sb1.toString();

											String b1resultString2 = "";

											b1resultString2 = b1resultString
													.replaceAll("[\\[\\]]", "")
													.replaceAll(" +", "");

											fr += b1resultString2; // ��2�������п��ܹ��ɵ�SATBƴ�ӳ��ַ���
											fr = fr.trim();

											sb1 = null;
											flag1 = false;
											b1resultString = "";
											b1resultString2 = "";
											b1s = "";
											s1.clear();
										}// r
									} // �����ǿ�
								}
							}// fori3
						}
					}// fori1
				}// bi1

			}// bi
		}// bi
	}// C

}// class
