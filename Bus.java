public class Bus extends transport{

        int Max_passenger = 30;
        int Now_passenger;
        int Pay = 1000;
        int transport_number ;


        String status = "운행중";



        // 버스 상태변경
        public boolean post_states(boolean change) {
                if (change == false || this.Now_Oil == 0) {
                        status = "차고지행";
                }
                return change;
        }

        // 오일 변경
        public void now_oil(int use_oil) {
                this.Now_Oil += use_oil;
                System.out.println("주유량 = " + this.Now_Oil);
        }

        // 출력 버스
        public void get_bus_states_info() {
                System.out.println(("상태 = " + status));
                System.out.println("주유량 = " + this.Now_Oil);
                if (this.Now_Oil < 10) {
                        System.out.println("주유 필요");
                }

        }

        // 현재 탑승 상황
        public void board(int passengers) {
                this.Now_passenger += passengers;

                if (Now_passenger > Max_passenger) {
                        System.out.println("최대 승객 수 초과");
                        this.Now_passenger -= passengers;
                } else {
                        System.out.println("탑승 승객 수 = " + passengers);
                        System.out.println("잔여 승객 수 = " + (this.Max_passenger - passengers));
                        System.out.println("요금 확인 = " + (this.Pay * passengers));
                }


        }

        public int getNow_speed(int power) {
                if (Now_Oil >= 10) {
                        this.status = "운행";
                        this.Now_speed += power;

                } else {
                        post_states(false);
                }
                return Now_speed;
        }
}




