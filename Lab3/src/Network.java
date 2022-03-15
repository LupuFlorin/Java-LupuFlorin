
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Network {

    ArrayList <Node> nodes = new ArrayList <Node> ();


    void addNode (Node node) {
        nodes.add(node);
    }

    String getNodes(){
        StringBuilder result = new StringBuilder();

        nodes.sort((Object o1, Object o2) ->
        {
            Node p1 = (Node) o1;
            Node p2 = (Node) o2;
            return p1.getName().compareTo(p2.getName());
        });

        for (Node node : nodes) {
            result.append(node.getName());
            result.append("\n");
        }

        return result.toString();
    }

    String getCosts(){
        StringBuilder result = new StringBuilder();

        nodes.sort((Object o1, Object o2) ->
        {
            Node p1 = (Node) o1;
            Node p2 = (Node) o2;
            return p1.getName().compareTo(p2.getName());
        });

        for (Node node : nodes) {
            Set<Node> keys= node.map.keySet();

            for(Node key : keys){
                result.append(node.getName());
                result.append("--");
                result.append(key.getName());
                result.append("  ");
                result.append(node.map.get(key));
                result.append("\n");
            }

        }
        return result.toString();
    }
    String getIdentifiable(){
        StringBuilder result = new StringBuilder();
        ArrayList <Node> identifiable = new ArrayList <Node> ();
        for(Node node : nodes){
            if(node.IP !=0){
                identifiable.add(node);
            }
        }
        identifiable.sort((Object o1, Object o2) ->
        {
            Node p1 = (Node) o1;
            Node p2 = (Node) o2;
            if(p1.IP> p2.IP){
                return 1;
            }
            else if(p1.IP== p2.IP)
            {
                return 0;
            }
                else{
                    return -1;
            }
        });
        for (Node node : identifiable) {
            result.append(node.getName());
            result.append("\n");
        }
        return result.toString();
    }

    String Djikstra(Node source){
        StringBuilder result = new StringBuilder();
        source.distance=0;

        Set<Node> settledNodes = new HashSet<>();
        Set<Node> unsettledNodes = new HashSet<>();

        unsettledNodes.add(source);

        while(unsettledNodes.size()!=0){
            Node currentNode = getLowestDistanceNode(unsettledNodes);
            if(currentNode!=null) {
                unsettledNodes.remove(currentNode);
                Set<Node> keys = currentNode.map.keySet();
                for (Node key : keys) {
                    if (!settledNodes.contains(key)) {
                        calculateMinimumDistance(key, currentNode.map.get(key), currentNode);
                        unsettledNodes.add(key);
                    }
                }
                settledNodes.add(currentNode);
            }

        }

        ArrayList <Node> identifiable = new ArrayList <Node> ();
        for(Node node : nodes){
            if(node.IP !=0){
                identifiable.add(node);
            }
        }
        Set<Node> keys= source.shortestPath.keySet();
        for(Node key : keys){
            boolean ok=false;
            for(Node node:identifiable){
                if(key.getName().equals(node.getName())){
                    ok=true;
                }
            }
            if(ok){
                result.append(source.getName());
                result.append("->");
                result.append(key.getName());
                result.append("  ");
                result.append(key.map.get(key));
                result.append("\n");
            }
        }
        return result.toString();

    }


    Node getLowestDistanceNode(Set <Node> unsettledNodes){
        Node lowestDistanceNode= null;
        int lowestDistance = Integer.MAX_VALUE;
        for (Node node: unsettledNodes) {
            Set<Node> keys= node.map.keySet();
            for(Node key : keys) {
                int nodeDistance = node.map.get(key);
                if (nodeDistance < lowestDistance) {
                    lowestDistance = nodeDistance;
                    lowestDistanceNode = node;
                }
            }
        }
        return lowestDistanceNode;
    }
    void calculateMinimumDistance(Node evaluationNode,Integer distance,Node sourceNode){
        Integer sourceDistance = sourceNode.getDistance();

        if (sourceDistance + distance < evaluationNode.getDistance()) {
            evaluationNode.distance= sourceDistance+distance;
            sourceNode.shortestPath.put(evaluationNode,sourceDistance + distance);
        }
    }
}





