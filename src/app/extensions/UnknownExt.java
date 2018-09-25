package app.extensions;

import java.io.InputStream;

public class UnknownExt implements CheckExt {

    public boolean isTrue(InputStream inputStream) {
        return false;
    }

}
