import java.util.Scanner;

public class test11 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("��������Ľ׳ˣ�");
		int i=scanner.nextInt();
		int r=1;
		if (i==0) {
			r=0;
		}
		if(i>0 && i<17){
			for (int j = i; j >=1; j--) {
				r*=j;
			}
		}
		System.out.println(i+"�Ľ׳�Ϊ"+r);
	}

}
