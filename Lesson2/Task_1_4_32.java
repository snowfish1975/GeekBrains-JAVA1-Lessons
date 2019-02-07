import java.util.Arrays;

public class Task_1_4_32 {
    private static final int fieldSize = 10;
    private static final int mineCount = 15;
    private static int[][] gameField = new int[fieldSize][fieldSize];

    public static void main(String[] args) {
        int mineX, mineY;
        for (int i = 0; i < mineCount; i++) {
            do {
                mineX = (int) (Math.random() * fieldSize);
                mineY = (int) (Math.random() * fieldSize);
            } while (gameField[mineX][mineY] == 10);
            gameField[mineX][mineY] = 10;
        }
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
               if (gameField[i][j]<10) {
                   for (int k = -1; k < 2; k++) {
                       for (int l = -1; l < 2; l++) {
                           if((i+k)>=0  && (i+k)<fieldSize && (j+l)>=0 && (j+l)<fieldSize && (gameField[i+k][j+l]==10))
                               gameField[i][j]++;
                       }
                   }
               }

           }
            System.out.println(Arrays.toString(gameField[i]));
        }
    }
}