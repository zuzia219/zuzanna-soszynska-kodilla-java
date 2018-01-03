package com.kodilla.rps;

public class DecideIfGameEnds {

    public boolean IfGameEnds() {
        boolean end = false;
        boolean ifThekeyIsRight = false;
        while (ifThekeyIsRight != true) {
            System.out.println("");
            System.out.println("If you wish to play again - please enter  - n, if you wish to end the game - please enter x");
            KeyboardControl control = new KeyboardControl();
            String ifGameEnds = control.keyboardControlStrings();
            if (ifGameEnds.equals("x")) {
                System.out.println("Do you REALLY want to end the game? If you wish to play again - please enter - n, if you wish to end the game please enter x");
                ifGameEnds = control.keyboardControlStrings();
                if (ifGameEnds.equals("x")) {
                    ifThekeyIsRight = true;
                    end = true;
                }
                if (ifGameEnds.equals("n"))
                    ifThekeyIsRight = true;
                else
                    System.out.println("Key not active");
            } else if (ifGameEnds.equals("n")) {
                System.out.println("The new game will begin");
                ifThekeyIsRight = true;
            } else
                System.out.println("Key not active");

        }
        return end;
    }
}
