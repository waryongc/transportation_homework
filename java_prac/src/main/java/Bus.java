
import java.util.Random;

public class Bus extends Car {
    private int id;
    private int maxPassenger;
    private int nowPassenger;
    private int fare;
    private int oil;
    private int nowSpeed;
    private boolean status;



    Random random=new Random();
    public Bus() {
        this.id = random.nextInt(100);
        this.maxPassenger = 30;
        this.nowPassenger = 0;
        this.fare = 800;
        this.oil = 100;
        this.nowSpeed = 0;
        this.status = "운행 가능";
    }

    public String String(Passenger passenger){
        if(oil<10){
            return "주유가 필요합니다.";
        }
        return "운행 가능";
    }

    public void changeBusStatus(){
        if(this.oil<10){
            this.status = false;
            System.out.println("주유가 필요합니다.");
            System.out.println("차고지로 이동합니다.");
            return;
        }
        if(!this.status) {
            System.out.println("버스 상태 : 차고지행");
        }
    }

    public void addPassenger(Passenger passenger){
        if(!this.status){
            System.out.println("탑승불가");
            return;
        }
        if(nowPassenger==maxPassenger){
            System.out.println("정원 초과입니다.");
            return;
        }

        nowPassenger++;
        System.out.println("탑승했습니다. ("+this.nowPassenger+ "/"+this.maxPassenger+")");
        return;

    }

    public void changeSpeed(int speed){
        if(oil < 10) {
            changeStatus(oil);
            return;
        }
        if(status!="운행 가능"){
            return;
        }
        System.out.println(nowSpeed+"에서 "+(nowSpeed+speed)+"로 변경합니다.");
        nowSpeed+=speed;
    }


    public void ride(Passenger passenger) {
        nowSpeed=60;

        if(!this.status) {
            return;
        }
        if(this.oil < 10) {
            return;
        }
        System.out.println("도착했습니다. 운행을 종료합니다.");
        status=true;
        nowSpeed=0;
        changeBusStatus();
    }
}

