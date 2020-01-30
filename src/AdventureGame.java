import java.util.Random;
import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {

        AdventureGame();

    }

    public static void AdventureGame() {

        Random rand = new Random(); //instance of random class

        String castleElement =

                        "   |>>>                                                      |>>>\n" +
                        "   |                                                         |\n" +
                        "   /\\                                                        /\\\n" +
                        "  |  |                                                      |  |\n" +
                        " /----\\               Welcome to Outlandia!                /----\\\n" +
                        "[______]    Where Brave Knights Face Formidable Foes.     [______]\n" +
                        " |    |         _____                        _____         |    |\n" +
                        " |[]  |        [     ]                      [     ]        |  []|\n" +
                        " |    |       [_______][ ][ ][ ][][ ][ ][ ][_______]       |    |\n" +
                        " |    [ ][ ][ ]|     |  ,----------------,  |     |[ ][ ][ ]    |\n" +
                        " |             |     |/'    ____..____    '\\|     |             |\n" +
                        "  \\  []        |     |    /'    ||    '\\    |     |        []  /\n" +
                        "   |      []   |     |   |o     ||     o|   |     |  []       |\n" +
                        "   |           |  _  |   |     _||_     |   |  _  |           |\n" +
                        "   |   []      | (_) |   |    (_||_)    |   | (_) |       []  |\n" +
                        "   |           |     |   |     (||)     |   |     |           |\n" +
                        "   |           |     |   |      ||      |   |     |           |\n" +
                        " /''           |     |   |o     ||     o|   |     |           ''\\\n" +
                        "[_____________[_______]--'------''------'--[_______]_____________]\n";


        System.out.println(castleElement);
        System.out.println("Ready to enter and test your might? (type: [yes/no])\n");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();

        int userName;


        if (option.equalsIgnoreCase("yes")) {

            String knightElement =
                    "       !\n" +
                            "      .-.\n" +
                            "    __|=|__\n" +
                            "   (_/`-`\\_)\n" +
                            "   //\\___/\\\\\n" +
                            "   <>/   \\<>\n" +
                            "    \\|_._|/\n" +
                            "     <_I_>\n" +
                            "      |||\n" +
                            "     /_|_\\\n";

            System.out.println(knightElement);
            System.out.println("Sir Knight, what is your name?\n");
            Scanner scanner2 = new Scanner(System.in);
            userName = scanner2.nextInt();

        }

        else if (!option.equalsIgnoreCase("n")) {
            System.out.println("Maybe next time you'll be ready...\n");
        }

    }

}
