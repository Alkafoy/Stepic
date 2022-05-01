public class Main {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        Thread current = Thread.currentThread();
        StackTraceElement[] methods = current.getStackTrace();

        return null; // your implementation here
    }
}
