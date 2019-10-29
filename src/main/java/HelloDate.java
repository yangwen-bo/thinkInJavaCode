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

//        calendar.set(  );
        calendar.set( Calendar.HOUR_OF_DAY,23 );
        calendar.set( Calendar.MINUTE,59 );
        calendar.set( Calendar.SECOND,59 );
        Date end = calendar.getTime();

        int i=0x1002;//十六进制
        int y=03251;//八进制
        System.out.println(Long.toBinaryString( i ));//二进制数形式显示
        float f=1.39e-43f;//1.39*10^-43
        System.out.println(f);
//        printBinarInt(f);
//        printBinarLong(f);

    }
}
