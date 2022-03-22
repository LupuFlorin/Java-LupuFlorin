import java.util.LinkedList;
import java.util.Map;

public class Methods {

    static LinkedList comparator(LinkedList streets){
        StringBuilder result = new StringBuilder();

        streets.sort((Object o1, Object o2) ->
        {
            Street p1 = (Street) o1;
            Street p2 = (Street) o2;
            if(p1.getLength()> p2.getLength()){
                return 1;
            }
            else if(p1.getLength()== p2.getLength())
            {
                return 0;
            }
            else{
                return -1;
            }
        });

        return streets;
    }

}

