
public class test10 {

	public static void main(String[] args) {
		//Êä³ö13²ã½ğ×ÖËş
		for (int i = 1; i <=13; i++) {
			for (int j = 1; j < 14-i; j++) {
//				System.out.print('\t');
				System.out.print("   ");
			}
			for (int k = i; k >= 1; k--) {
//				System.out.print(k);
//				System.out.print('\t');
				System.out.print(k>10?k+" ":k+"  ");
			}
			for (int n = 2; n <= i; n++) {
//				System.out.print(n);
//				System.out.print('\t');
				System.out.print(n>10?n+" ":n+"  ");
			}
			System.out.println('\n');
		}

	}

}
