package app.extensions;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class JpgExt implements CheckExt {

    private static final byte[] HEX = new byte[] {(byte) 0xFF, (byte) 0xD8, (byte) 0xFF, (byte) 0xE0};

    public boolean isTrue(InputStream inputStream) throws IOException {
        byte[] bytes = new byte[HEX.length];
        return inputStream.read(bytes) == HEX.length && Arrays.equals(bytes, HEX);
    }
}
