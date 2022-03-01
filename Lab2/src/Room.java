

public class Room {


    String name;
    Type type;
    int cap;
    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    @Override

    public String toString() {
        return  " " + name  +
                "(cap=" +cap +
                ", "+ type + "),";

    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public enum Type{
        lab,
        lecturehall,
        classroom;
    }

}
