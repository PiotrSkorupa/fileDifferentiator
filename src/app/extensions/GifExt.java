package app.extensions;

import java.io.IOException;
import java.io.InputStream;

public class GifExt implements CheckExt {
    @Override
    public boolean isTrue(InputStream data) throws IOException {
        return false;
    }
}
