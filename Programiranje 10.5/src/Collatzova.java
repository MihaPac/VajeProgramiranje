
public class Collatzova {

	public static void main(String[] args) {
		collatzDolzina(6);
		collatzNajvecji(4);
		collatzPrint(24);
	}
	public static void collatzDolzina(int n){
		int dolz = 0;
		while (n != 1){
			if(n%2==0){
				n/=2;
				dolz += 1;
			}else{
				n=n*3+1;
				dolz += 1;
			}
		}
		dolz += 1;
		System.out.println(dolz);
	}
	public static void collatzNajvecji(int n){
		int najvecji = n;
		while (n != 1){
			if(n%2==0)n/=2;
			else{
				n=n*3+1;
				najvecji = Math.max(najvecji, n);
			}
		}
		System.out.println(najvecji);
	}
	public static void collatzPrint(int n){
		System.out.print(n);
		while (n != 1){
			if(n%2==0){
				n/=2;
				System.out.print(", " + n);
			}else{
				n=n*3+1;
				System.out.print(", " + n);
			}
		}
		System.out.println();
	}

}
