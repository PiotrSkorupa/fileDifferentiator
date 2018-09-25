package app.validate;

import app.extensions.*;

import java.io.*;
import java.nio.file.Files;

public class Validator {

    private String check;
    private CheckExt checkExt;

    public void validate(File file) throws IOException {
        extCheck(file);
        String type = Files.probeContentType(file.toPath());
        InputStream in = new FileInputStream(file);

        try {
            if (check != null) {
                if (checkExt.isTrue(in) && !check.equals("txt")) {
                    System.out.println("true");
                } else if (checkExt.isTrue(in) && check.equals("txt") && type.startsWith("text")) {
                    System.out.println("true");
                } else if (!checkExt.isTrue(in) && !check.equals("txt") && !check.equals("jpg") && !check.equals("png") && !check.equals("gif")) {
                    System.out.println("unknown extension");
                } else {
                    System.out.println("false");
                }
            }
            in.close();
        } catch (NullPointerException e) {
            System.out.print("No file in this path");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

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
