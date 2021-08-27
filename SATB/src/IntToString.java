import java.util.ArrayList;

public class IntToString {

	static String cr0 = "";
	static  int[] b0 = new int[4];
	static  String b0s = "";
	static  ArrayList<String> s0 = new ArrayList<String>();

	public IntToString() {

	}

	public static void A(int bis, int chord5, int chord3, int chord1) {
//		int[] b0 = new int[4];
//		String b0s = "";
//		ArrayList<String> s0 = new ArrayList<String>();

		b0s = "";
		b0[0] = bis;
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

		b0resultString2 = b0resultString.replaceAll("[\\[\\]]", "").replaceAll(
				" +", "");

		cr0 += b0resultString2;
		cr0 = cr0.trim();

		sb0 = null;
		flag0 = false;
		b0resultString = "";
		b0resultString2 = "";
		b0s = "";
		s0.clear();
	}
}
