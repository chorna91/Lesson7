import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Task3 {

    public boolean check (int x){
        return x % 3 == 0 | x % 5 == 0 & x > 0;
    }

    public static void main(String[] args) {
        Task3 example = new Task3();
        System.out.println(example.check(5));
        System.out.println(example.check(1));
    }
}
