import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        XaLogger xaLogger = new XaLogger();
        xaLogger.Log("xalog message");

        BaseLogger[] baseLoggers=new BaseLogger[]{new XbLogger(),new XaLogger(),new XcLogger()};
        for (BaseLogger logger:baseLoggers){
            logger.Log("log message");
        }



    }
}