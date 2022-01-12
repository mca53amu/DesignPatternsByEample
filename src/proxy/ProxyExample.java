package proxy;

public class ProxyExample {
    public static void main(String[] args) {
        ExpensiveObject proxyExpensiveObject = new ProxyExpensiveObject();
        proxyExpensiveObject.test();

    }
}
