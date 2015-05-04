import static java.lang.System.out;
import java.util.Date;

public class HelloWorld
{
   public static void main(String[] args)
   {
      out.println("Hello, " + args[0] + ", the time is " + new Date());
   }
}
