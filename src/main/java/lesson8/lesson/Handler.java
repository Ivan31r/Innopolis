package lesson8.lesson;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Handler implements InvocationHandler {
    private final Printer printer;

    public Handler(Printer printer) {
        this.printer = printer;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();
        System.out.println("Start message");

        method.invoke(printer,args);
        System.out.println("finish message");
        System.out.println(System.currentTimeMillis()-start);

        return null;
    }
}
