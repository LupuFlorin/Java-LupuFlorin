import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class City {

    static Map<Intersection[] , LinkedList<Street> > cityMap = new HashMap<>();
     Intersection[] nodes;
    static LinkedList<Street> streetList = new LinkedList<>();
    public Map<Intersection[], LinkedList<Street>> getCityMap() {
        return cityMap;
    }

    public static void setCityMap(Intersection[] nodes, LinkedList<Street> streetList) {
        cityMap.put(nodes, streetList);

    }

    public LinkedList<Street> getStreetList() {

        return streetList;
    }

    public static String longerthan(Intersection[] nodes, Street[] streets, int length){
        StringBuilder result = new StringBuilder();
        for(Street street : streets){
            if(street.getLength()>length){
                int streetsjoined=0;
                for(Street street1 : streets){
                    if((street.getI1()==street1.getI1() || street.getI1()==street1.getI2() || street.getI2()==street1.getI1() || street.getI2()==street1.getI2()) && street!=street1){
                        streetsjoined++;
                    }
                }
                if(streetsjoined >=3) {
                    result.append(street.getName());
                    result.append("\n");
                }
            }
        }
        return result.toString() ;
    }

}
