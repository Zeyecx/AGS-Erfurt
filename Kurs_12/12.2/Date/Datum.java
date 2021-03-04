
package date;
import java.text.*;
import java.util.*;

/**
 * @author Barthyr
 */

public class Datum {
    GregorianCalendar cal = new GregorianCalendar(); 

    
    // user input
    private int day = 0;
    private int month = 0;
    private int year = 0;
    
    
    // System value 
    private int dsys = 0;
    private int msys = 0;
    private int ysys = 0;
    
    
    // setter Block
    public void set_day(Integer day){
        this.day = day;
    }
    
    public void set_month(Integer month){
        this.month = month;
    }    
    
    public void set_year(Integer year){
        this.year = year;
    }
    
    public void set_dsys(Integer dysys){
        this.dsys = cal.get(Calendar.DAY_OF_MONTH);
    }
    
    public void set_msys(Integer msys){
        this.msys = cal.get(Calendar.MONTH);
    }
    
    public void set_ysys(Integer ysys){
        this.ysys = cal.get(Calendar.YEAR);
    }
    
    // getter Block
     
    public int get_day(){
        return day;
    }
    
    public int get_month(){
        return month;
    }
    
    public int get_year(){
        return year;
    }
    
    public int get_dsys(){
        return dsys;
    }
    
    public int get_msys(){
        return msys;
    }
    
    public int get_ysys(){
        return ysys;
    }
    
    // VGL sys and user
    
    public boolean check_date(){
        return get_day() == get_dsys() && get_month() == get_msys() && get_year() == get_ysys();
    }
    
    
    
}
