package newpackage;




import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
 
public class DigitalClock extends java.awt.Label {

    private DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Thread t = new Thread() {
        @Override
        public void run() {
            while (true) {
                setText(df.format(new Date()));
            }
        }
    };
    public DigitalClock(){
        t.start();
    }
    public void setPattern(String Pattern){
        df=new SimpleDateFormat(Pattern);
    }
}
