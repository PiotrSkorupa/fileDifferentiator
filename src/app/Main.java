package app;

import app.view.Displayable;
import app.view.MenuView;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Displayable displayable = new MenuView();
        displayable.display();

    }
}
