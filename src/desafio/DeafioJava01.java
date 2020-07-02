//autor luiz Carlos Soares Neto
package desafio;


public class DeafioJava01 {
	public static void main(String[] args) {
			int n = 13;
			while(n!=1){
				if((n%2) == 0){
					
					n/=2;
					System.out.print("-> "+n);
				}else{
					 n = (3 * n) + 1;
					 System.out.print("-> "+n);
				}
			}
	}
}
