
import java.util.Random;

public class Taxi extends Car {

    private int id; //택시번호
    private int fare; //기본요금
    private int addFare; //추가요금
    private int oil; //기름
    private int nowSpeed; //현재속도
    private boolean taxiGoal;  //목적지
    private int basicDistance; // 기본거리
    private int goalDistance; //목적지까지 거리
    private boolean status; //상태

    Random random=new Random();

    public Taxi() {
        this.id = random.nextInt(100);
        this.fare = 3000;
        this.addFare = 0;
        this.oil = 100;
        this.nowSpeed = 0;
        this.taxiGoal = false;
        this.basicDistance = 4;
        this.goalDistance = 0;
        this.status = true;
    }


    public Taxi() {
    }

    public void upFare(int goal){
        this.addFare=(goal-4)*100;
        System.out.println("추가요금은 "+ addFare+"원 입니다.");
    }


    public void fare(int goal){
        if(!this.taxiGoal){
            System.out.println("택시에 타지 않았습니다.");
            return;
        }
        this.upFare(goal);
        System.out.println("총금액은 "+(this.fare+this.addFare)+"원 입니다.");
        if (oil>=10){
            changeStatus();
        }

        public void ride(Passenger passenger1) {
            if(!this.taxiGoal){
                System.out.println("택시에 타지 않았습니다.");
                return;
            }
            boolean isRiding = true;
            int cnt = 0;
            nowSpeed=60;

            System.out.println("현재 속도 " + this.nowSpeed + "km/h 입니다.");

            while (isRiding) {
                cnt++;
                System.out.println("이동중 현재 거리 : " + cnt);
                if (cnt == passenger1.getGoal()) {
                    isRiding = false;
                }
            }
            System.out.println("도착했습니다.");
            this.oil -= passenger1.getGoal();
        }

        public void pickUp(Passenger passenger1) {
            if (!this.status) {
                System.out.println("탑승 불가");
                return;
            }
            this.status = false;
            System.out.println("택시 상태 : " + (this.status ? "일반" : "운행 중"));
            this.taxiGoal = true;
        }

    }

    public void changeSpeed(int Speed) {
        if(!this.taxiGoal){
            System.out.println("택시에 타지 않았습니다.");
            return;
        }
        System.out.println("속도 " + this.nowSpeed + "에서" +(this.nowSpeed + (Speed))+"로 변경 했습니다.");
        this.nowSpeed += (Speed);
    }

}
