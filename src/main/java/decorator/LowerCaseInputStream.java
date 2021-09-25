package decorator;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int input = in.read();
        return input == -1? input : Character.toLowerCase((char)in.read());
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Starting reading");
        InputStream inputStream = new LowerCaseInputStream(new BufferedInputStream(System.in));
        int c;
        while ((c = inputStream.read()) > 0) {
            System.out.println((char)c);
        }
    }
}
