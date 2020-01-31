import java.util.Random;
import java.util.Scanner;

public class AdventureGame {
    public static void main(String[] args) {

        AdventureGame();

    }

    public static void AdventureGame() {

        Random rand = new Random(); //instance of random class

        System.out.println("Ready to Play? (type: [yes/no])\n");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();

        String userName;

        if (option.equalsIgnoreCase("yes")) {

            String castleElement =

                    "\n   |>>>                                                      |>>>\n" +
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

            System.out.println("* You get to the gates of Outlandia and you're stopped by the royal guard. *\n");


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

            // asks user for their name
            System.out.println("\"Sir Knight, what is your name?\"\n");
            Scanner scanner2 = new Scanner(System.in);
            userName = scanner2.next();

            System.out.println("\n\"" + userName + ", huh?\"");
            System.out.println("\"That's a great name for a Knight!\"\n");

            // asks if the user is ready to enter the arena
            System.out.println("\"Sir " + userName + ", are you ready to enter the arena and test your might?\" (type: [yes/no])\n");
            Scanner scanner4 = new Scanner(System.in);
            String option2 = scanner4.nextLine();

           if (option2.equalsIgnoreCase("yes")) {
            System.out.println("\n\"Good luck, " + userName + ", you're going to need it!\"\n");
            } else if (!option2.equalsIgnoreCase("yes")) {
               System.out.println("\n\"Ahhh get in there!\"\n");
               System.out.println("* The guard pushes Sir " + userName + " into the arena. *\n");
               System.out.println("\"You'll be fine...\"\n");
           }

            // user comes across weapons to choose from.
            System.out.println("* You see weapons on the rack next to you upon entering the arena. *\n");
            System.out.println("* The first weapon is a sword. *\n");
            String sword =
                    "        /\n" +
                            "*//////{<>==================-\n" +
                            "        \\\n";
            System.out.println(sword);
            System.out.println("* The second weapon is an axe. *\n");
            String axe =
                    "  ,  /\\  .  \n" +
                            " //`-||-'\\\\ \n" +
                            "(| -=||=- |)\n" +
                            " \\\\,-||-.// \n" +
                            "  `  ||  '  \n" +
                            "     ||     \n" +
                            "     ||     \n" +
                            "     ||     \n" +
                            "     ||     \n" +
                            "     ||     \n" +
                            "     ()\n";
            System.out.println(axe);
            System.out.println("* The third weapon is a bow and arrows. *\n");
            String bowWithArrows =
                    "   (\n" +
                            "    \\\n" +
                            "     )\n" +
                            "##-------->        \n" +
                            "     )\n" +
                            "    /\n" +
                            "   (\n";
            System.out.println(bowWithArrows);

            System.out.println("* Which will you choose... *\n");
        }

        else if (!option.equalsIgnoreCase("yes")) {
            System.out.println("\n\"Maybe next time you'll be ready...\"\n");
        }

    }

}
