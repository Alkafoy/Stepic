import java.math.*;
import java.util.Arrays;
import java.util.function.*;

public class Main {
    public static void main(String[] args) throws Exception {
        test();
    }

    public static String getCallerClassAndMethodName() {

        return null; // your implementation here
    }

    public static void test() {
        Thread current = Thread.currentThread();
        StackTraceElement[] methods = current.getStackTrace();

        for (var info : methods)
            System.out.println(info);
    }

}


