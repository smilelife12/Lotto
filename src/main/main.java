package main;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("\nThis program give you Lotto numbers randomly.\n If you want to start this " +
                    "program, " +
                    "press the 's'. Or, if you want to quit, press 'q'!");
            String input = sc.next();
            if(lotto.isStop(input)) {
                System.out.println("\nThis program is Quit.....");
                break;
            }
            if (lotto.isRight(input)) {
                int [] LottoNum = lotto.getNum();
                System.out.println("\nYour Lotto Number is ");
                for (int num:
                     LottoNum) {
                    System.out.print(num+"\t");

                }
                continue;
            }
            System.out.println("\nYou do not press right button.\n");
        }
    }
}
