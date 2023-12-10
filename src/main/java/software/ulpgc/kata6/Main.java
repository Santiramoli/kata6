package software.ulpgc.kata6;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws Exception {

            Scanner scanner = new Scanner(System.in);
            System.out.print("\nIntroduzca el número de generaciones: ");
            int n_gen = scanner.nextInt();

            GameOfLife initial = new GameOfLife("X..X..X\n....X.X\n.....XX\n..X...X\nX......\n.X...X.\n.......");
            GraphicBoard gB = new GraphicBoard(initial.toString());
            System.out.println("\n1º Gen\n");
            gB.Board();


            for (int i = 2; i <= n_gen; i++){
                System.out.println(i + "º Gen\n");
                GameOfLife gameOfLife = new GameOfLife(initial.next().toString());
                GraphicBoard gB1 = new GraphicBoard(gameOfLife.toString());
                gB1.Board();
                initial = gameOfLife;
            }
        }
}
