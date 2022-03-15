public class Router extends Node implements Identifiable{


    Router(String name){
        super (name);
    }

    Router(int distance){ super (String.valueOf(distance));}

    public double getMAC() {
        return MAC;
    }

    public void setMAC(double MAC) {
        this.MAC = MAC;
    }

    public double getIP() {
        return IP;
    }

    public void setIP(int IP) {
        this.IP = IP;
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
