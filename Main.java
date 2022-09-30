public class Main {
    public static void main(String[] args)
    {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        if(bus1.get_random_number() != bus2.get_random_number()) {
            bus1.board(2);
            bus1.now_oil(-50);
            bus1.post_states(false);
            bus1.now_oil(10);
            bus1.get_bus_states_info();
            bus1.post_states(true);
            bus1.board(45);
            bus1.board(5);
            bus1.now_oil(-55);
            bus1.get_bus_states_info();
        }

        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();
        if(taxi1.get_random_number() != taxi2.get_random_number())        {
            System.out.println("다름");
            taxi1.get_taxi_states_info();
            taxi1.board(2,"서울역",2);
            taxi1.now_oil(-80);
            taxi1.payment();
            taxi1.Passenger(5);
            taxi1.board(3,"구로디지털단지역",12);
            taxi1.now_oil(-20);
            taxi1.payment();
        }



    }
}