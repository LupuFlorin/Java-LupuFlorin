import java.math.BigInteger;

public class Main {
    public static void main(String[] args){
        Computer v1 = new Computer("v1");
        Router v2 = new Router("v2");
        Switch v3 =new Switch("v3");
        Computer v4 = new Computer("v4");
        Router v5 = new Router("v5");
        Switch v6 =new Switch("v6");
        Computer v = new Computer(("v"));
        v4.capacity=1;
        v1.IP=12;
        v2.IP=5;
        v4.IP=8;
        v5.IP=16;
        BigInteger[] units=v4.otherunits();
        System.out.println("MB = " + units[0]);
        System.out.println("KB = " + units[1]);
        System.out.println("b = " + units[2]);
        Network network = new Network();
        network.addNode(v1);
        network.addNode(v2);
        network.addNode(v3);
        network.addNode(v4);
        network.addNode(v5);
        network.addNode(v6);
        network.addNode(v);
        v1.map.put(v2,10);
        v1.map.put(v3,50);
        v2.map.put(v3,20);
        v2.map.put(v4,20);
        v2.map.put(v5,10);
        v3.map.put(v4,20);
        v4.map.put(v5,30);
        v4.map.put(v6,10);
        v5.map.put(v6,20);
        System.out.println(network.getNodes());
        System.out.println(network.getCosts());
        System.out.println(network.getIdentifiable());
        System.out.println(network.Djikstra(v1));
    }
}
