import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bag {
    private final List<Tile> letters= new ArrayList<Tile>();
    Random rand=new Random();
    public Bag() {
        for (char c = 'a'; c < 'z'; c++) {
            int points=rand.nextInt(1,10);
            for(int i=0;i<=9;i++){
                letters.add(new Tile(c,points));
            }
        }
    }

    public synchronized List<Tile> extractTiles(int howMany) {
        List<Tile> extracted = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            if (letters.isEmpty()) {
                break;
            }
            int randletter= rand.nextInt(letters.size());
            extracted.add(letters.get(randletter));
            letters.remove(letters.get(randletter));
        }
        return extracted;
    }
}