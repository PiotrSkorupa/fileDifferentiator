package app;

import app.view.Displayable;
import app.view.MenuView;

public class Main {
    public static void main(String[] args) {

        Displayable displayable = new MenuView();
        displayable.display();

    }
}
