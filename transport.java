
public class transport {

    int transport_number =0;
    int Now_Oil = 100;
    int Now_speed = 0;

    int change_speed ;
    int Max_passenger;

    public void now_oil(int use_oil) {
        this.Now_Oil += use_oil;

    }
    public int get_random_number() {
        this.transport_number = (int)(Math.random()*9999+1);
        return this.transport_number;
    }


}
