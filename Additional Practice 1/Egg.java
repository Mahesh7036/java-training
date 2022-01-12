
public class Egg {

	public static void main(String[] args) {
		
		undScore("_");
		System.out.println("\n     /        \\");
		System.out.println("    /          \\");
		System.out.println("     -\"-'-\"-'-\"-");
		System.out.println("    \\          /");
		System.out.println("     \\________/");
		
		

	}
	static void undScore(String u) {
		for(int i=0;i<=5;i++) {
			System.out.print(" ");
		}
		for(int i=0;i<=7;i++) {
			System.out.print(u);
		}
		
		
	}

}
