package com.codecool;

import java.util.Random;
import java.util.Scanner;

public class DirtyMain {

    private static void runDirtyMain() {
        Scanner s = new Scanner(System.in);
        System.out.println("choose an option: game, laugh, quit");
        String t = s.nextLine();
        while (!t.equals("quit")) {
            if (t.equals("game")) {
                Random r = new Random();
                System.out.println("give me the number im thinking of between 0 and 100");
                int n = r.nextInt(100);
                int g = Integer.parseInt(s.nextLine());
                if (g != n) {
                    System.out.println("wrong. the answer was " + n);
                } else {
                    System.out.println("correct. the answer was " + n);
                }
            } else if (t.equals("laugh")) {
                String[] l = new String[]{"Why aren’t koalas actual bears? Because they dont meet the koalafications", "Why didn’t the koala make the finals?. It got diskoalafide","Q: What’s a koalas favorite drink\n" + "A: Coca Koala"};
                Random r = new Random();
                System.out.println(l[r.nextInt(3)]);
            } else {
                System.out.println("no such option");
            }
            System.out.println("whats next?");
            System.out.println("choose an option: game, laugh, quit");
            t = s.nextLine();
        }
    }
}
