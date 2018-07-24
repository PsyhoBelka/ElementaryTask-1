package ua.rozhkov;

class ChessBoard {

    void print(Object s) {
        System.out.print(s);
    }

    void printBoard(int width, int height) {
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

