package app.extensions;

import app.vaidate.ExtensionCheck;

import java.io.IOException;
import java.io.InputStream;

public class JpqExt implements ExtensionCheck {

    @Override
    public boolean isTrue(InputStream data) throws IOException {
        return false;
    }
}
