import java.util.ArrayList;
import java.util.List;

public class Rule {
	
	static boolean ruleok = false;

	public Rule() {

	}

	// ////////////////////////////////四部和声规则

	public static boolean rule(int a, int b, int c, int d, int a1, int b1,
			int c1, int d1) {
		boolean ruleok = false;

		boolean r2 = false;// parallel8 5
		boolean r3 = false;
		boolean r4 = false;

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

		if (a - b == 7) {
			parallel8s++;
		}
		if (a - c == 7) {
			parallel8s++;
		}
		if (a - d == 7) {
			parallel8s++;
		}
		if (b - c == 7) {
			parallel8s++;
		}
		if (b - d == 7) {
			parallel8s++;
		}
		if (c - d == 7) {
			parallel8s++;
		}

		if (a1 - b1 == 7) {
			parallel8s++;
		}
		if (a1 - c1 == 7) {
			parallel8s++;
		}
		if (a1 - d1 == 7) {
			parallel8s++;
		}
		if (b1 - c1 == 7) {
			parallel8s++;
		}
		if (b1 - d1 == 7) {
			parallel8s++;
		}
		if (c1 - d1 == 7) {
			parallel8s++;
		}

		if (a - b == 4) {
			parallel5s++;
		}
		if (a - c == 4) {
			parallel5s++;
		}
		if (a - d == 4) {
			parallel5s++;
		}
		if (b - c == 4) {
			parallel5s++;
		}
		if (b - d == 4) {
			parallel5s++;
		}
		if (c - d == 4) {
			parallel5s++;
		}

		if (a1 - b1 == 4) {
			parallel5s++;
		}
		if (a1 - c1 == 4) {
			parallel5s++;
		}
		if (a1 - d1 == 4) {
			parallel5s++;
		}
		if (b1 - c1 == 4) {
			parallel5s++;
		}
		if (b1 - d1 == 4) {
			parallel5s++;
		}
		if (c1 - d1 == 4) {
			parallel5s++;
		}

		// if (a - a1 == 1) {
		// seconds++;
		// }
		if (b - b1 == 1) {
			seconds++;
		}
		if (c - c1 == 1) {
			seconds++;
		}
		if (d - d1 == 1) {
			seconds++;
		}
		if (b - c1 == 1) {
			seconds++;
		}
		if (c - b1 == 1) {
			seconds++;
		}
		if (d - b1 == 1) {
			seconds++;
		}
		if (d - c1 == 1) {
			seconds++;
		}

		// if (a1 - a == 1) {
		// seconds++;
		// }
		if (b1 - b == 1) {
			seconds++;
		}
		if (c1 - c == 1) {
			seconds++;
		}
		if (d1 - d == 1) {
			seconds++;
		}
		if (c1 - b == 1) {
			seconds++;
		}
		if (b1 - c == 1) {
			seconds++;
		}
		if (b1 - d == 1) {
			seconds++;
		}
		if (c1 - d == 1) {
			seconds++;
		}

		// /////////////////////////////////根音大跳
		if (d - d1 > 7) {
			bassin8++;
		}
		if (d1 - d > 7) {
			bassin8++;
		}
		// ////////////////////////////////根音过低
		if (c - d > 15) {
			hx++;
		}
		if (c1 - d1 > 15) {
			hx++;
		}

		if (parallel8s < 2 && parallel5s < 2 && seconds < 20 && bassin8 < 1
				&& hx < 1) { // 排除平行8度，平行5度和非旋律2度，根音大跳，根音过低
			r2 = true;
		}

		if ((c > d) && (c1 > d1)) {
			r7 = true;
		}

		// ///////////////////////////////////三个音相同
		r8 = true;

		if ((a % 7 == b % 7) && (a % 7 == c % 7)) {
			r8 = false;
		}
		if ((a % 7 == b % 7) && (a % 7 == d % 7)) {
			r8 = false;
		}

		if ((b % 7 == a % 7) && (b % 7 == c % 7)) {
			r8 = false;
		}
		if ((b % 7 == a % 7) && (b % 7 == d % 7)) {
			r8 = false;
		}

		if ((c % 7 == a % 7) && (c % 7 == d % 7)) {
			r8 = false;
		}
		if ((c % 7 == a % 7) && (c % 7 == b % 7)) {
			r8 = false;
		}

		if ((d % 7 == a % 7) && (d % 7 == b % 7)) {
			r8 = false;
		}
		if ((d % 7 == a % 7) && (d % 7 == c % 7)) {
			r8 = false;
		}

		// ///////////////////fant
		if ((a1 % 7 == b1 % 7) && (a1 % 7 == c1 % 7)) {
			r8 = false;
		}
		if ((a1 % 7 == b1 % 7) && (a1 % 7 == d1 % 7)) {
			r8 = false;
		}

		if ((b1 % 7 == a1 % 7) && (b1 % 7 == c1 % 7)) {
			r8 = false;
		}
		if ((b1 % 7 == a1 % 7) && (b1 % 7 == d1 % 7)) {
			r8 = false;
		}

		if ((c1 % 7 == a1 % 7) && (c1 % 7 == d1 % 7)) {
			r8 = false;
		}
		if ((c1 % 7 == a1 % 7) && (c1 % 7 == b1 % 7)) {
			r8 = false;
		}

		if ((d1 % 7 == a1 % 7) && (d1 % 7 == b1 % 7)) {
			r8 = false;
		}
		if ((d1 % 7 == a1 % 7) && (d1 % 7 == c1 % 7)) {
			r8 = false;
		}

		// ///////////////////////////////////// 反向8 5
		int k = 0;
		int k5 = 0;
		for (int ik = 1; ik < 6; ik++) {
			k = 7 + 7 * ik;
			k5 = 7 + 5 * ik;

			if (a - b == 7
					&& a < a1
					&& (((a1 - c1 == k) && (b > c1)) || ((a1 - d1 == k) && (b > d1)))) {
				openparallel8s++;
			}

			if (b - c == 7
					&& b < a1
					&& (((a1 - c1 == k) && (c > c1)) || ((a1 - d1 == k) && (c > d1)))) {
				openparallel8s++;
			}
			if (b - c == 7 && b < b1 && (((b1 - d1 == k) && (c > d1)))) {
				openparallel8s++;
			}
			if (c - d == 7 && c < b1 && (((b1 - d1 == k) && (d > d1)))) {
				openparallel8s++;
			}
			if (c - d == 7 && c < c1 && (((c1 - d1 == k) && (d > d1)))) {
				openparallel8s++;
			}

			// ///////////////////////////////////反向五度
			if (a - b == 7
					&& a < a1
					&& (((a1 - c1 == k5) && (b > c1)) || ((a1 - d1 == k5) && (b > d1)))) {
				openparallel5s++;
			}

			if (b - c == 7
					&& b < a1
					&& (((a1 - c1 == k5) && (c > c1)) || ((a1 - d1 == k5) && (c > d1)))) {
				openparallel5s++;
			}
			if (b - c == 7 && b < b1 && (((b1 - d1 == k5) && (c > d1)))) {
				openparallel5s++;
			}
			if (c - d == 7 && c < b1 && (((b1 - d1 == k5) && (d > d1)))) {
				openparallel5s++;
			}
			if (c - d == 7 && c < c1 && (((c1 - d1 == k5) && (d > d1)))) {
				openparallel5s++;
			}

		}
		if (openparallel5s++ < 1 && openparallel8s++ < 1) {
			r9 = true;
		}

		// ///////////////////////////////////////////增四度
		if ((b % 7 == 4 && a == b + 3) || (c % 7 == 4 && b == c + 3)
				|| (d % 7 == 4 && c == d + 3) || (b1 % 7 == 4 && a1 == b1 + 3)
				|| (c1 % 7 == 4 && b1 == c1 + 3)
				|| (d1 % 7 == 4 && c1 == d1 + 3)

		// ||
		// (cant[ii+1]%7==4&&a1==fant[i+1]+3)
		// ||
		// (cant[ii+2]%7==4&&fant[i+1]==fant[i+2]+3)
		// ||
		// (cant[ii+3]%7==4&&fant[i+2]==fant[i+3]+3)
		// ||
		// (fant[i+1]%7==4&&a==cant[ii+1]+3)
		// ||
		// (fant[i+2]%7==4&&cant[ii+1]==cant[ii+2]+3)
		// ||
		// (fant[i+3]%7==4&&cant[ii+2]==cant[ii+3]+3)

		) {
			r11 = false;
		}

		// ////////////////////////////////////四部同向
		if ((a > a1 && b > b1 && c > c1 && d > d1)
				|| (a < a1 && b < b1 && c < c1 && d < d1)) {
			r10 = false;
		}

		// ////////////跳进
		int jump3 = 0;

		if (b - b1 > 3) {
			jump3++;
		}
		if (c - c1 > 3) {
			jump3++;
		}
		if (jump3 > 1) {
			r12 = false;
		}

		// ///////////////////////////声部超越
		r13 = true;
		if (b > a1) {
			r13 = false;
		}
		if (c > b1) {
			r13 = false;
		}
		if (d > c1) {
			r13 = false;
		}

		if (b1 > a) {
			r13 = false;
		}
		if (c1 > b) {
			r13 = false;
		}
		if (d1 > c) {
			r13 = false;
		}

		// //////////////////////隐伏85
		r14 = true;
		for (int k14 = 0; k14 < 8; k14++) {
			if (((a > a1 && d > d1) || (a < a1 && d < d1)
					&& (a % 7 - d % 7 == 0 && a1 % 7 - d1 % 7 == 0) || (a - d == 5 + 7 * k14 && a1
					- d1 == 5 + 7 * k14)
					&& (a - a1 > 3))) {
				r14 = false;
			}
		}

		if (r2
		// &&
		// r51
		// &&r61
				&& r8 && r9 && r10 && r11 && r12 && r13 && r14

		) {
			ruleok = true;
		} // if r2

		return ruleok;
	}

}// class
