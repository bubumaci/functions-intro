package com.codecool;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(args[0]);
        System.out.println(args[1]);

        Calculator calculator = new Calculator();

        calculator.setA(4);
        calculator.setB(6);
        System.out.println(calculator.getSum());

        Scanner scanner = new Scanner(System.in);
        int number;
        try {
            number = Integer.parseInt(scanner.nextLine()); // kettő bé --> NumberFormatException
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception);
            number = 123;
        }
        System.out.println(number);
//
//        int[] array = new int[3];
//        System.out.println(array[123]);  //ArrayIndexOutOfBoundsException


//
//        // Peldanyositas es class-ok
//        ArrayList<Person> personList = new ArrayList<>();
//        Person person1 = new Person("Kis Miska", "Budapest, Valami utca 5", 30);
//        personList.add(person1);
//        for (Person p :
//                personList) {
//            System.out.println(p.toString());
//        }
//
//        int[] result1 = new int[10];
//        char[] ch = new char[10];
//        System.out.println(Arrays.toString(result1));
//        System.out.println(Arrays.toString(ch));
//        ArrayList<Integer> resultArrayList = new ArrayList<>();
//
////        resultArrayList.get(i);
////        resultArrayList.add(i+min);
////        String[] array = resultArrayList.toArray();
////        resultArrayList.set(i, i + 5);
//
//        for (int i = 0; i < 10; i++) {
//            result1[i] = i + 5;
//            resultArrayList.add(i, i + 5);
//            resultArrayList.set(i, i + 5);
//        }
//
//        System.out.println(Arrays.toString(resultArrayList.toArray()));
//        System.out.println(Arrays.toString(result1));
//
//        String[] stars = new String[10];
//        for (int i = 0; i < stars.length; i++) {
//            stars[i] = String.valueOf(i);
//        }
//
//        String sentence = "ABC";
//        String expected = "a**b**c";
//
//        String result = String.join("**", sentence.split(""));
//        sentence = sentence + "abc";
//        String[] tomb = sentence.split("");
//
//        for (String character : tomb) {
//            System.out.println(character);
//            if ("a".equals(character)) {
//                character += "a";
//            }
//        }
//
//        System.out.println(Arrays.toString(tomb));
//        System.out.println("/\"//\\//'/\n/Users/");
//
//        for (int i = 0; i < tomb.length; i++) {
//            if ("a".equals(tomb[i])) {
//                tomb[i] += "a";
//            }
//        }
//        System.out.println(Arrays.toString(tomb));
//
//        System.out.println("end");
    }


    private void szovegTipusKonverzio() {
        String hosszu = "abc, def, ghi";

        System.out.println(hosszu);

        String[] szovegTomb = hosszu.split("");
        String egeszMondat = String.join("", szovegTomb);

        System.out.println(Arrays.toString(szovegTomb));
        for (String e : szovegTomb) {
            System.out.println(e);
        }
        System.out.println(egeszMondat);
    }

    private void tipusKonverzio() {
        String szovegbenSzam = "1";
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int egeszSzam = Integer.parseInt(scanner.nextLine());
        String szoveg = String.valueOf(egeszSzam);

        if (input.equals(szovegbenSzam)) {
            System.out.println("helyes valasz");
        } else {
            System.out.println("hamis");
        }

        int szam = scanner.nextInt();
        // itt még marad egy enter a csőben, be kell olvasni azt is
        scanner.nextLine();
    }
}


// dont repeat yourself
// keep it stupid simple
// beszédes informatív elnevezése a fügvényeknek és változóknak (nevek nem kezdődhetnek számokkal)
// you aint gonna need it (fölösleges dolgokat töröld ki)
// avoid magic numbers, give them a name (for explanation)
// viszonylag rövid, nem túl sok sor (nem több mint? 17 pl), nem ér ki a képernyő szélén túlra
// szervezd függvenyekbe
// egy függveny csak egy dolgot csinál
