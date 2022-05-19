import Bus;
import Passenger;

public class Main {
    public static void main(String[] args) {

        System.out.println( "===================택시탑승 테스트==============================");



        Bus bus =new Bus();
        Passenger 철수=new Passenger(21);

        System.out.println( "=================== 운행중 탑승 테스트=====================");

        Passenger 짱구 = new Passenger(21);
        taxi.addPassenger(짱구);

        bus.addPassenger(철수);
        bus.addPassenger(철수);
        bus.addPassenger(철수);
        bus.addPassenger(철수);
        bus.addPassenger(철수);
        bus.addPassenger(철수);
        bus.addPassenger(철수);
        bus.addPassenger(철수);
        bus.addPassenger(철수);
        bus.addPassenger(철수);

        System.out.println( "===================버스 정원초과 테스트=====================");
        bus.addPassenger(철수);

        System.out.println();

        System.out.println( "===================기본속도 컨트롤 테스트=====================");
        bus.changeSpeed(20);

        System.out.println();

        System.out.println( "===================이동 테스트=====================");
        bus.ride(철수);




    }
}