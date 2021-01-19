import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Task4 {


    public int checkNumberOfElement(int [] array, int num ) {
        int howMany = 0;

        for (int i : array) {
            if (i == num) howMany++;
        }
        return howMany;

    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 5, 9};
        Task4 example = new Task4();
        System.out.println(example.checkNumberOfElement(array, 5));
    }
}

