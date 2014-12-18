
package Stream;

import java.io.File;
import java.io.IOException;

public class TestStream1 {
    
    public static void main(String[] args) throws IOException {
        Stream test = new Stream();
        test.setFile(new File("Test.txt"));
        test.baca();
        System.out.println(test.getTeks());
    }
}
