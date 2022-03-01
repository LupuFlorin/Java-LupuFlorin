public class Event {
    String name;
    int size;
    int start;
    int end;

    @Override

    public String toString() {
        return " " + name  +
                "(size=" + size +
                ", start=" + start +
                ", end=" + end +"),";
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
