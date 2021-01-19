import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Task6 {

    public static void main(String[] args){

            for (int i = 2; i <= 50; i++) {
                if (i % 2 == 0) System.out.println(i);
            }
        }
    }