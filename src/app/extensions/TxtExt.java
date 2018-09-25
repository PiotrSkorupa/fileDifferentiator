package app.extensions;

import java.io.IOException;
import java.io.InputStream;

public class TxtExt implements CheckExt {
    @Override
    public boolean isTrue(InputStream data) throws IOException {
        return false;
    }
}
