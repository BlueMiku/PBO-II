package newpackage;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class Kalender {

    public static List<LocalDate> datesBetween(LocalDate start, LocalDate end) {
        List<LocalDate> ret = new ArrayList<LocalDate>();
        for (LocalDate date = start; !date.isAfter(end); date = date.plusDays(1)) {
//        System.out.println(date);
            ret.add(date);
        }
        return ret;

    }
 LocalDate start = LocalDate.now();
  LocalDate end = LocalDate.of(2016, Month.JANUARY, 30);

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }
    
}
