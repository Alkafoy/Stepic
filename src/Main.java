public class Main {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {

        StackTraceElement[] methods = Thread.currentThread().getStackTrace();
        if (methods.length < 4) {
            return null;
        } else {
            return methods[2].getClassName() + " " + methods[2].getMethodName();
        }
    }
}
