package com.codecool;

import org.jetbrains.annotations.NotNull;

import java.util.Random;
import java.util.Scanner;

public class CleanMain {

    private static final int BOUND = 100;
    private static final String[] LIST_OF_JOKES = new String[]{
            "Why aren’t koalas actual bears? Because they dont meet the koalafications",
            "Why didn’t the koala make the finals?. It got diskoalafide",
            "Q: What’s a koalas favorite drink\n" + "A: Coca Koala"};

    public static void runCleanMain() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Choose an option: game, laugh, quit");
        String choice = scanner.nextLine();
        while (textIsQuit(choice)) {
            if (textIsGame(choice)) {
                performRandomNumberGame(scanner, random);
            } else if (textIsLaugh(choice)) {
                performRandomKoalaJoke(random);
            } else {
                noSuchMenuOption();
            }
            choice = askForNextMenuOption(scanner);
        }
    }

    private static boolean textIsLaugh(@NotNull String inputText) {
        return inputText.equals("laugh");
    }

    private static boolean textIsGame(@NotNull String inputText) {
        return inputText.equals("game");
    }

    private static boolean textIsQuit(@NotNull String inputText) {
        return !inputText.equals("quit");
    }

    private static void noSuchMenuOption() {
        System.out.println("No such option");
    }

    private static void performRandomNumberGame(@NotNull Scanner scanner, @NotNull Random random) {
        System.out.println("Give me the number im thinking of between 0 and " + BOUND);
        int number = random.nextInt(BOUND);
        int guess = Integer.parseInt(scanner.nextLine());
        if (guess != number) {
            System.out.println("Wrong. The answer was " + number);
        } else {
            System.out.println("Correct. The answer was " + number);
        }
    }

    private static void performRandomKoalaJoke(@NotNull Random random) {
        System.out.println(LIST_OF_JOKES[random.nextInt(LIST_OF_JOKES.length)]);
    }

    private static String askForNextMenuOption(@NotNull Scanner scanner) {
        System.out.println("Whats next?");
        System.out.println("Choose an option: game, laugh, quit");
        return scanner.nextLine();
    }
}
