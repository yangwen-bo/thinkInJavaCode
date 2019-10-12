import java.text.DateFormat;
import java.util.*;

/**
 * @Author yangwen-bo
 * @Date 2019/10/8.
 * @Version 1.0
 */
public class HelloDate {
    public static void main(String[] args) {
        Calendar calendar =Calendar.getInstance();
        calendar.add( Calendar.DAY_OF_MONTH,-180 );
        calendar.set( Calendar.HOUR_OF_DAY,0 );
        calendar.set( Calendar.MINUTE,0 );
        calendar.set( Calendar.SECOND,0 );
        Date begin = calendar.getTime();

        DateFormat df1 = DateFormat.getDateInstance();//
        System.out.println(df1.format(begin));

        calendar.set( Calendar.HOUR_OF_DAY,23 );
        calendar.set( Calendar.MINUTE,59 );
        calendar.set( Calendar.SECOND,59 );
        Date end = calendar.getTime();


    }
}
