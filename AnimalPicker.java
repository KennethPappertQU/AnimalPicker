import java.util.Scanner;

public class AnimalPicker {
    public void main(String [] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Would you like to see a dog, a fish, or a cat? ");
        String animal = in.next();

        boolean isChosen = false;

        while (isChosen) {
            if (animal.equals("dog")) {
                System.out.println("/^-----^\\\r\n" + //
                                        "V  o o  V\r\n" + //
                                        " |  Y  |\r\n" + //
                                        "  \\ Q /\r\n" + //
                                        "  / - \\\r\n" + //
                                        "  |    \\\r\n" + //
                                        "  |     \\     )\r\n" + //
                                        "  || (___\\====\r\n" + //
                                        "");
                isChosen = true;
            }
            else if (animal.equals("cat")) {
                System.out.println(" _._     _,-'\"\"`-._\r\n" + //
                                        "(,-.`._,'(       |\\`-/|\r\n" + //
                                        "    `-.-' \\ )-`( , o o)\r\n" + //
                                        "          `-    \\`_`\"'-");
                isChosen = true;
            }  else {
                System.out.println("Error: That is not one of the answers. ");
                isChosen = true;
            }
        }
    }
}





