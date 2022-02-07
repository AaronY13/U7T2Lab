import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args)
    {
        Car car1 = new Car("Ford", 2000);
        Car car2 = new Car("Honda", 8400);
        Car car3 = new Car("Hyundai", 1000);
        Car[] cars = {car1, car2, car3};

        ArrayList<Car> carList = new ArrayList<Car>(Arrays.asList(cars));
        System.out.println(carList);

    }
}
