import com.github.javafaker.Faker;
import org.jgrapht.Graph;
import org.jgrapht.alg.spanning.PrimMinimumSpanningTree;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultUndirectedWeightedGraph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args){
        Faker faker= new Faker();
        StringBuilder result = new StringBuilder();
        var nodes = IntStream.rangeClosed(0, 8)
                .mapToObj(i -> new Intersection(faker.name().fullName()) )
                .toArray(Intersection[]::new);
        for(Intersection node : nodes){
            result.append(node.getName());
            result.append("\n");
        }
        System.out.println(result);


        Map<Intersection[], LinkedList<Street>> cityMap = new HashMap<>();
        LinkedList<Street> streetList = new LinkedList<>();
        Street streets[] = new Street[16];
        streets[0]=new Street();
        streets[1]=new Street();
        streets[2]=new Street();
        streets[3]=new Street();
        streets[4]=new Street();
        streets[5]=new Street();
        streets[6]=new Street();
        streets[7]=new Street();
        streets[8]=new Street();
        streets[9]=new Street();
        streets[10]=new Street();
        streets[11]=new Street();
        streets[12]=new Street();
        streets[13]=new Street();
        streets[14]=new Street();
        streets[15]=new Street();

        streets[0].setLength(2);
        streets[0].setI1(nodes[0]);
        streets[0].setI2(nodes[1]);
        streets[0].setName(faker.name().fullName());

        streets[1].setLength(2);
        streets[1].setI1(nodes[0]);
        streets[1].setI2(nodes[2]);
        streets[1].setName(faker.name().fullName());

        streets[2].setLength(2);;
        streets[2].setI1(nodes[0]);
        streets[2].setI2(nodes[3]);
        streets[2].setName(faker.name().fullName());

        streets[3].setLength(2);
        streets[3].setI1(nodes[1]);
        streets[3].setI2(nodes[2]);
        streets[3].setName(faker.name().fullName());

        streets[4].setLength(1);
        streets[4].setI1(nodes[2]);
        streets[4].setI2(nodes[3]);
        streets[4].setName(faker.name().fullName());

        streets[5].setLength(3);
        streets[5].setI1(nodes[1]);
        streets[5].setI2(nodes[4]);
        streets[5].setName(faker.name().fullName());

        streets[6].setLength(2);
        streets[6].setI1(nodes[2]);
        streets[6].setI2(nodes[6]);
        streets[6].setName(faker.name().fullName());

        streets[7].setLength(2);
        streets[7].setI1(nodes[2]);
        streets[7].setI2(nodes[5]);
        streets[7].setName(faker.name().fullName());

        streets[8].setLength(3);
        streets[8].setI1(nodes[3]);
        streets[8].setI2(nodes[5]);
        streets[8].setName(faker.name().fullName());

        streets[9].setLength(1);
        streets[9].setI1(nodes[4]);
        streets[9].setI2(nodes[7]);
        streets[9].setName(faker.name().fullName());

        streets[10].setLength(1);
        streets[10].setI1(nodes[6]);
        streets[10].setI2(nodes[7]);
        streets[10].setName(faker.name().fullName());

        streets[11].setLength(2);
        streets[11].setI1(nodes[4]);
        streets[11].setI2(nodes[8]);
        streets[11].setName(faker.name().fullName());

        streets[12].setLength(1);
        streets[12].setI1(nodes[7]);
        streets[12].setI2(nodes[8]);
        streets[12].setName(faker.name().fullName());

        streets[13].setLength(1);
        streets[13].setI1(nodes[6]);
        streets[13].setI2(nodes[8]);
        streets[13].setName(faker.name().fullName());

        streets[14].setLength(3);
        streets[14].setI1(nodes[5]);
        streets[14].setI2(nodes[8]);
        streets[14].setName(faker.name().fullName());

        streets[15].setLength(1);
        streets[15].setI1(nodes[4]);
        streets[15].setI2(nodes[5]);
        streets[15].setName(faker.name().fullName());

        streetList.add(streets[0]);
        streetList.add(streets[1]);
        streetList.add(streets[2]);
        streetList.add(streets[3]);
        streetList.add(streets[4]);
        streetList.add(streets[5]);
        streetList.add(streets[6]);
        streetList.add(streets[7]);
        streetList.add(streets[8]);
        streetList.add(streets[9]);
        streetList.add(streets[10]);
        streetList.add(streets[11]);
        streetList.add(streets[12]);
        streetList.add(streets[13]);
        streetList.add(streets[14]);
        streetList.add(streets[15]);

        cityMap.put(nodes,streetList);
        Methods.comparator(streetList);

        StringBuilder result1 = new StringBuilder();
        for(Street street : streetList){
            result1.append(street.getName());
            result1.append("--");
            result1.append(street.getLength());
            result1.append("\n");
        }
        System.out.println(result1);

        HashSet<Intersection> intersections = new HashSet<Intersection>();
        for(Intersection node : nodes){
            intersections.add(node);
            intersections.add(node);
        }
        StringBuilder result2 = new StringBuilder();
        for(Intersection intersection : intersections){
            result2.append(intersection.getName());
            result2.append("\n");
        }
        System.out.println(result2);

        City.setCityMap(nodes,streetList);
        System.out.println(City.longerthan(nodes,streets,3));

        DefaultUndirectedWeightedGraph<String, DefaultEdge> graph = new DefaultUndirectedWeightedGraph<>(DefaultEdge.class);
        String v0="v0";
        String v1="v1";
        String v2="v2";
        String v3="v3";
        String v4="v4";
        String v5="v5";
        String v6="v6";
        String v7="v7";
        String v8="v8";
        graph.addVertex(v0);
        graph.addVertex(v1);
        graph.addVertex(v2);
        graph.addVertex(v3);
        graph.addVertex(v4);
        graph.addVertex(v5);
        graph.addVertex(v6);
        graph.addVertex(v7);
        graph.addVertex(v8);

        graph.addEdge(v0,v1);
        graph.addEdge(v0,v2);
        graph.addEdge(v0,v3);
        graph.addEdge(v1,v2);
        graph.addEdge(v2,v3);
        graph.addEdge(v1,v4);
        graph.addEdge(v2,v6);
        graph.addEdge(v2,v5);
        graph.addEdge(v3,v5);
        graph.addEdge(v4,v7);
        graph.addEdge(v6,v7);
        graph.addEdge(v4,v8);
        graph.addEdge(v7,v8);
        graph.addEdge(v6,v8);
        graph.addEdge(v5,v8);
        graph.addEdge(v4,v5);

        graph.setEdgeWeight(v0,v1,2);
        graph.setEdgeWeight(v0,v2,2);
        graph.setEdgeWeight(v0,v3,2);
        graph.setEdgeWeight(v1,v2,2);
        graph.setEdgeWeight(v2,v3,1);
        graph.setEdgeWeight(v1,v4,3);
        graph.setEdgeWeight(v2,v6,2);
        graph.setEdgeWeight(v2,v5,2);
        graph.setEdgeWeight(v3,v5,3);
        graph.setEdgeWeight(v4,v7,1);
        graph.setEdgeWeight(v6,v7,1);
        graph.setEdgeWeight(v4,v8,2);
        graph.setEdgeWeight(v7,v8,1);
        graph.setEdgeWeight(v6,v8,1);
        graph.setEdgeWeight(v5,v8,3);
        graph.setEdgeWeight(v4,v5,1);

        new PrimMinimumSpanningTree(graph);

    }

}
