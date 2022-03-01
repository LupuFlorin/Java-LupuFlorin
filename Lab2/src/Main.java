public class Main {
    public static void main(String [] args){

        Event C1 = new Event();
        C1.name="C1";
        C1.size=100;
        C1.start=8;
        C1.end=10;
        Event C2 = new Event();
        C2.name="C2";
        C2.size=100;
        C2.start=10;
        C2.end=12;
        Event L1 = new Event();
        L1.name="L1";
        L1.size=30;
        L1.start=8;
        L1.end=10;
        Event L2 = new Event();
        L2.name="L2";
        L2.size=30;
        L2.start=8;
        L2.end=10;
        Event L3 = new Event();
        L3.name="L3";
        L3.size=30;
        L3.start=10;
        L3.end=12;

        Room R1= new Room();
        R1.name="401";
        R1.cap=30;
        R1.type= Room.Type.lab;
        Room R2= new Room();
        R2.name="403";
        R2.cap=30;
        R2.type= Room.Type.lab;
        Room R3= new Room();
        R3.name="405";
        R3.cap=30;
        R3.type= Room.Type.lab;
        Room R4= new Room();
        R4.name="309";
        R4.cap=100;
        R4.type= Room.Type.lecturehall;

        System.out.print("Events:");
        System.out.print(C1);
        System.out.print(C2);
        System.out.print(L1);
        System.out.print(L2);
        System.out.println(L3);
        System.out.print("Rooms:");
        System.out.print(R1);
        System.out.print(R2);
        System.out.print(R3);
        System.out.println(R4);


    }
}
