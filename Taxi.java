public class Taxi extends transport{



    int Pay =3000;
    int Km_pay = 1000;
    int km_start = 1;
    String status = "일반";
    int total_pay = 0;




    public void board(int passenger, String destination, int dis){
        if(passenger>5){
            System.out.println("최대 승객 수 초과");
        }
        super.Max_passenger=4;
        this.status ="운행 중";
        int pay=Km_pay+(dis-1)*500;
        this.total_pay += pay;
        System.out.println("탑승 승객 수 = "+passenger);
        System.out.println("잔여 승객 수 = "+(super.Max_passenger-passenger));
        System.out.println("기본 요금 확인 = "+this.Pay);
        System.out.println("목적지 = "+destination);
        System.out.println("지불할 요금 = "+pay);
        System.out.println("상태 = "+status);


    }


    public void payment(){
        status = "일반";
        super.Max_passenger = 4;
        System.out.println("주유량 = "+super.Now_Oil);
        System.out.println("누적 요금 = "+this.total_pay);
        if(this.Now_Oil<10){
            System.out.println("주유 필요");

        }

    }
    public void Passenger(int passenger){
        if(passenger>4){
            System.out.println("최대 승객 수 초과");
        }
    }
    public void get_taxi_states_info() {
        if (this.Now_Oil ==0){
            status = "운행불가";
        }
        System.out.println(("상태 = " + status));
        System.out.println("주유량 = " + this.Now_Oil);
        if (this.Now_Oil < 10) {
            System.out.println("주유 필요");
        }

    }


}
