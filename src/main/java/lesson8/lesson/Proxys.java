package lesson8.lesson;

import java.lang.reflect.Proxy;

public class Proxys {
    public static void main(String[] args) {
        SoutPrinter soutPrinter = new SoutPrinter();
        Handler handler = new Handler(soutPrinter);
        Printer proxyPrinter = (Printer)Proxy.newProxyInstance(Printer.class.getClassLoader(),new Class[]{Printer.class},handler);
        proxyPrinter.print("========");
    }
}
