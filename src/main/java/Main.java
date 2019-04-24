import adapter.AdapterLinii1;
import adapter.AdapterLinii2;
import adapter.ParserDlaLinii1;
import adapter.ParserDlaLinii2;

public class Main {
    public static void main(String[] args) {
        AdapterLinii1 adapterLinii1 = new AdapterLinii1(new ParserDlaLinii1());
        String a = adapterLinii1.createFlightInfoObjectList("C:\\Users\\bonzo\\IdeaProjects\\Adapter\\resources\\LOTY1").get(16).toString();
        System.out.println(a);
        AdapterLinii2 adapterLinii2 = new AdapterLinii2(new ParserDlaLinii2());
        String b = adapterLinii2.createFlightInfoObjectList("C:\\Users\\bonzo\\IdeaProjects\\Adapter\\resources\\LOTY2").get(16).toString();
        System.out.println(b);
    }
}