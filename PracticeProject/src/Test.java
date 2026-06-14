import com.practice.CarBuilder;

public class Test {
    public static void main(String[] args) {
        System.out.println(new CarBuilder.Builder().setName("Arka").setPrice(1000L).build());
    }
}
