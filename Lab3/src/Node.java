import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Node {

    public String name;
    public double MAC;
    public double longitude, latitude;
    public int IP;
    int distance;


    public Node(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public Node(int distance){this.distance=distance;}
    public int getDistance() {return distance;}


    Map<Node, Integer> map = new HashMap<>();
    Map<Node, Integer> shortestPath = new HashMap<>();


}
