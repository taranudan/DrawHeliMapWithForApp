
public class DrawHeliMapWithForApp {

	public static void main(String[] args) {
		
		//Constant
		final int SCALE = 10;
		
		//Variables
		int hX = 5;
		int hY = 4;
		
		//Map
		for (int y = 1; y <= SCALE; y++) {
			System.out.printf("%2d. ", y);
			for(int x = 1; x <= SCALE; x++) {
				if (x == 1 || y == 1 || x == SCALE || y == SCALE) {
					System.out.print("# ");
				}
				
				//Helicopter position
				else if (x == hX && y == hY) {
					System.out.print("H ");
				}
				
				// The region marked with x
				else if ((x >= hX - 1 && x <= hX + 1 && y >= hY - 1 && y <= hY + 1) || (((x == hX - 2) || (x == hX + 2)) && y == hY)) {
					System.out.print("x ");
				}

				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
