package Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream {

    private String teks = " ";
    private File file;

    public void baca() throws FileNotFoundException, IOException{
        FileInputStream is = new FileInputStream(file);
        int c;
        while ((c=is.read())!=-1){
            teks = teks+(char)c;
        }
    }
    public void simpan() throws FileNotFoundException, IOException {

        FileOutputStream os = new FileOutputStream(file);
        os.write(teks.getBytes());
        os.close();
    }

    public String getTeks() {
        return teks;
    }

    public void setTeks(String teks) {
        this.teks = teks;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

}
