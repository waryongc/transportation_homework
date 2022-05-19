public class Passenger {
    private int goal;

    public Passenger(){
    }

    public Passenger(int goal) {
        this.goal = goal;
    }

    public int getGoal(){
        return goal;
    }

    public Passenger setGoal(int goal){
        this.goal=goal;
        return this;
    }
}