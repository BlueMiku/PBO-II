
package Stream;

import java.io.File;
import java.io.IOException;

public class TestStream {
    
    public static void main(String[] args) throws IOException {
        Stream test = new Stream();
        test.setFile(new File("Test2.txt"));
        test.setTeks("Hello World baby");
        test.simpan();
    }
}
