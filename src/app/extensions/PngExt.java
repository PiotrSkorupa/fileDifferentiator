package app.extensions;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class PngExt implements CheckExt{

    private static final byte[] HEX = new byte[] {(byte) 0x89, (byte) 0x50, (byte) 0x4E};

    public boolean isTrue(InputStream inputStream) throws IOException {
        byte[] bytes = new byte[HEX.length];
        return inputStream.read(bytes) == HEX.length && Arrays.equals(bytes, HEX);
    }

}
