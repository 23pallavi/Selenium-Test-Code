package selenium.selenium_demo;

/**
 * @author pallavi
 *
 */
import java.text.SimpleDateFormat;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
       Date d = new Date();
       ConstructorDemo d1 = new ConstructorDemo();
       d1.hashMap();
       SimpleDateFormat sdf = new SimpleDateFormat("M/d/YYYY");
       System.out.println(sdf.format(d));
       
    }
}
