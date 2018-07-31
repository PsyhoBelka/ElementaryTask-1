
package ua.rozhkov;

/**
 * Class represent chessboard and do print of chessboard layout
 *
 * @author Rozhkov AG
 * @version 1.0
 */
class ChessBoard {

	void print(Object s) {

		System.out.print(s);
	}

	/**
	 * Method printBoard print chessboard from input parameters
	 *
	 * @param width
	 * @param height
	 */
	void printBoard(int width, int height) {

		if (width < 0 || height < 0) {
			System.out.println("Wrong parametrs! Must be more than 0");
			return;
		}
		boolean shift = true;
		for (int j = 0; j < height; j++) {
			for (int i = 0; i < width; i++) {
				if (shift) {
					print("*");
					shift = false;
				} else {
					print(" ");
					shift = true;
				}
			}
			System.out.println();
			shift = !shift;
		}
	}
}

