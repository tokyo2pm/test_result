package les05;

public class Sample_06 {

	public static void main(String[] args) {
		// 中間試験と期末試験の点数によってその学期の成績を出力するプログラム

		int mid = 71;
		int end = 70;
		
		if ((mid <= 50 && mid > 70 && end >= 70) || (mid >= 70 && end >=70)) {
			System.out.println("成績は５です");
		} else if ((mid >= 70 && end >= 50 && end < 70) || (mid < 50 && end >= 70)) {
			System.out.println("成績は４です");
		} else if ((mid >= 70 && end < 50) || (mid >= 50 && mid < 70 && end >= 50 && end < 70)) {
			System.out.println("成績は３です");
		} else if ((mid >= 50 && mid < 70 && end < 50) || (mid < 50 && end >= 50 && end < 70)) {
			System.out.println("成績は２です");
		} else {
			System.out.println("成績は１です");
		}
	}

}
