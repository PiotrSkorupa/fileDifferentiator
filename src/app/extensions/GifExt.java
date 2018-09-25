package app.extensions;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class GifExt implements CheckExt {

    private static final byte[] HEX = new byte[] {(byte) 0x47, (byte) 0x49, (byte) 0x46};

    public boolean isTrue(InputStream inputStream) throws IOException {
        byte[] bytes = new byte[HEX.length];
        return inputStream.read(bytes) == HEX.length && Arrays.equals(bytes, HEX);
    }
}
