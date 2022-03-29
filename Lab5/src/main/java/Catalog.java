import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Catalog implements Serializable {
    private String id;
    private List<Item> items= new ArrayList<>();

    public Catalog(String myRefs) {
        this.id=myRefs;
        this.items=new ArrayList<>();
    }

    public void add(Item item){
        items.add(item);
    }
    public String toString(Item item){

            return "Item{" +
                    "id='" + id + '\'' +
                    ", title='" + item.getTitle() + '\'' +
                    ", location='" + item.getLocation() + '\'' +
                    ", year=" + item.getYear() +
                    ", author='" + item.getAuthor() + '\''+
                    '}';

    }

}
