import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Task2 {
    public boolean check (int x, int y){
        if ( x == 10 | y == 10 | x + y == 10) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Task2 example = new Task2();
        System.out.println(example.check(3,10));
        System.out.println(example.check(3,5));
    }
}
