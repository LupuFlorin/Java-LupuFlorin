import java.math.BigInteger;

public interface Storage {
    void setCapacity(int capacity);
    int getCapacity();
    default BigInteger[] otherunits(){
        //units[0]=GB->MB
        //units[1]=GB->KB;
        //units[2]=GB->b
        int GB=getCapacity();
        BigInteger[] units = new BigInteger[3];
        units[0]= BigInteger.valueOf(GB* 1_024);
        units[1]= BigInteger.valueOf(GB* 1_048_576);
        units[2]= BigInteger.valueOf(GB* 1_073_741_824);
        return units;
    }
}
