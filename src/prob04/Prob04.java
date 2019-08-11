package prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		
		char[] c3 = str.toCharArray();
		
		char[] c4 = new char[str.length()];
		
		for(int i = str.length()-1;i>=0;--i) {
			
			c4[(str.length()-1)-i] =c3[i]; 
		}
		
		return c4;
		
	}

	public static void printCharArray(char[] array){
		
		System.out.println(array);
	}
}