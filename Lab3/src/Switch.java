
public class Switch extends Node{

    Switch(String name){
        super (name);
    }

    Switch(int distance){ super (String.valueOf(distance));}

    public double getMAC() {
        return MAC;
    }

    public void setMAC(double MAC) {
        this.MAC = MAC;
    }
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
