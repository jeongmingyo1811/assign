package static2.ex;
public class Car {
    private String car;
    private static int total;

    Car(String car){
        this.car=car;
        System.out.println("차량 구입, 이름:"+car);
        total++;
    }

    static void showTotalCars(){
        System.out.println(total);
    }
}
