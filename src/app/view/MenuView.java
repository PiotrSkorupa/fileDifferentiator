package app.view;

import app.validate.Validator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MenuView implements Displayable {

    public void display() throws IOException {

        File file;
        Validator validator = new Validator();
        Scanner scanner = new Scanner(System.in);
        State state = State.INIT;

        while (state != State.EXIT) {
            {
                switch (state) {
                    case INIT: {
                        System.out.println("");
                        System.out.println(" 1 - Enter the path to the file you want to check");
                        System.out.println(" 0 - EXIT");

                        switch (scanner.nextInt()) {

                            case 1:
                                state = State.VERIFY;
                                scanner.nextLine();
                                break;

                            case 0:
                                state = State.EXIT;
                                scanner.nextLine();
                                break;

                            default:
                                System.out.println("Wrong answer");
                                state = State.INIT;
                                scanner.nextLine();
                                break;
                        }
                        break;
                    }

                    case VERIFY: {
                        System.out.println(">");
                        file = new File(scanner.nextLine());
                        try {
                            validator.validate(file);
                        } catch (FileNotFoundException e) {
                            System.out.println("The file " + file.getPath() + " was not found.");
                        }
                    }
                    state = State.INIT;
                }
            }
        }
    }

    public enum State {
        INIT,
        VERIFY,
        EXIT
    }

}
