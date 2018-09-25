package app.vaidate;

import java.io.IOException;
import java.io.InputStream;

public interface ExtensionCheck {

    boolean isTrue(InputStream data) throws IOException;

}
