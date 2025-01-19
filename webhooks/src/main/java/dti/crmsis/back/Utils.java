package dti.crmsis.back;

public class Utils {
    public static String getCallerMethodName() {
        return StackWalker.getInstance()
                .walk(s -> s.skip(1).findFirst())
                .get()
                .getMethodName();
    }
}
