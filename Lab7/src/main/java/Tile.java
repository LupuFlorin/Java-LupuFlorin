public class Tile {
    private final char letter;
    private final int points;

    @Override
    public String toString() {
        return "Tile{" +
                "letter=" + letter +
                ", points=" + points +
                '}';
    }

    public Tile(char letter,int points) {
        this.letter=letter;
        this.points=points;
    }

    public int getPoints() {
        return points;
    }

    public char getLetter() {
        return letter;
    }

}