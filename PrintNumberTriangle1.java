
public class PrintNumberTriangle1 {
	public static void main(String[] args) {
		
		for (int row = 1; row <= 6; row++) {
			
			for (int column = 1; column <= 6; column++) {
				
				if (row >= column) {
					System.out.print(column + " ");
				} else {
					System.out.print("  ");
				}
	
			}
			
			System.out.println("");
		}
	}

}
