import java.util.Scanner;

public class AnimalPicker {
    public void main(String [] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Would you like to see a dog or a cat? ");
        String animal = in.next();


        if (animal.equals("dog")) {
            System.out.println("    ___\r\n" + //
                                " __/ / \\\r\n" + //
                                "|    |/\\\r\n" + //
                                "|_--\\   \\              /-\r\n" + //
                                "     \\   \\-___________/ /\r\n" + //
                                "      \\                :\r\n" + //
                                "      |                :\r\n" + //
                                "      |       ___ \\    )\r\n" + //
                                "       \\|  __/     \\  )\r\n" + //
                                "        | /         \\  \\\r\n" + //
                                "        |l           ( l\r\n" + //
                                "        |l            ll\r\n" + //
                                "        |l            |l\r\n" + //
                                "       / l           / l\r\n" + //
                                "       --/           --\r\n" + //
                                "");
        }
        else if (animal.equals("cat")) {
            System.out.println("      _          ___\r\n" + //
                                "    /' '\\       / \" \\\r\n" + //
                                "   |  ,--+-----4 /   |\r\n" + //
                                "   ',/   o  o     --.;\r\n" + //
                                "--._|_   ,--.  _.,-- \\----.\r\n" + //
                                "------'--`--' '-----,' VJ  |\r\n" + //
                                "     \\_  ._\\_.   _,-'---._.'\r\n" + //
                                "       `--...--``  /\r\n" + //
                                "         /###\\   | |\r\n" + //
                                "         |.   `.-'-'.\r\n" + //
                                "        .||  /,     |\r\n" + //
                                "       do_o00oo_,.ob\r\n" + //
                                "");
        } else {
            System.out.println("Error: That is not one of the answers. ");
        
        }
    }
}