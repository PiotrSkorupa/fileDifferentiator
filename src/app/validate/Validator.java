package app.validate;

import app.extensions.*;
import java.io.*;

public class Validator {

    private String check;
    private CheckExt checkExt;

    public CheckExt extCheck(File file) {
        check = (file.getName().substring(file.getName().lastIndexOf('.') + 1));
        if (check.equals("jpg")) {
            checkExt = new JpgExt();
        } else if (check.equals("png")) {
            checkExt = new PngExt();
        } else if (check.equals("gif")) {
            checkExt = new GifExt();
        } else if (check.equals("txt")) {
            checkExt = new TxtExt();
        } else {
            checkExt = new UnknownExt();
        }
        return checkExt;
    }

}
