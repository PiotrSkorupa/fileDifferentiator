package app.extensions;

import java.io.IOException;
import java.io.InputStream;

public interface CheckExt {

    boolean isTrue(InputStream data) throws IOException;

}
