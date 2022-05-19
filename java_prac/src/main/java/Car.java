import java.util.Random;

public class Transportation{
    int id;
    int oil;
    int speed;
    int addSpeed;
    int maxPassenger;
    boolean status;
    public Transportation(int id, int oil, int speed, int addSpeed, int maxPassenger, boolean status) {
        this.id = id;
        this.oil = oil;
        this.speed = speed;
        this.addSpeed = addSpeed;
        this.maxPassenger = maxPassenger;
        this.status=status;
    }

    Random random = new Random();
    int makeId=random.nextInt(100);

    public Transportation(int id, int maxPassenger, boolean status) {
        this(makeId, 100, 0, 0, maxPassenger, status);
    }


    //기능
    public void move(){
        System.out.println("운행을 시작합니다.");
    }

    public void changeSpeed(int addSpeed){
        System.out.println("속도를 "+speed+"에서 "+(speed+addSpeed)+"로 변경합니다");
        speed+=addSpeed;
    }

    public void changeStatus(boolean status){
        if(status){
            status=false;
            System.out.println("탑승이 불가능합니다.");
        }else{
            status=true;
            System.out.println("탑승 가능합니다.");
        }

    }

    public void pickup(){

    }

}



