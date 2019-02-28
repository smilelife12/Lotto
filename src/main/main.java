package main;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("This program give you Lotto numbers randomly. If you want to start this program, " +
                    "press the 's'. Or, if you want to quit, press 'q'!");
            String input = sc.next();
            if(lotto.isStop(input))
                break;
            if (lotto.isRight(input)) {
                int [] LottoNum = lotto.getNum();
                continue;
            }
            System.out.println("You do not press right button.");
        }
    }
}
