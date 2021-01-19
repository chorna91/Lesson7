import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Task1 {

    public int [] arrayMultiply (int [] array, int num){
        int [] newArray = new int[]{array.length};

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i] * num;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int [] array5 = {1, 3, 5, 7, 5, 9};
        Task1 example = new Task1();
        System.out.println(example.arrayMultiply(array5, 3));
    }
}
