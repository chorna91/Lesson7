import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter

public class Task5 {

    public int checkGrade(int grade) {

        switch (grade) {
            case 1:
                System.out.println("Плохо");
                break;
            case 2:
                System.out.println("Неудачно");
                break;
            case 3:
                System.out.println("Удовлетворительно");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 5:
                System.out.println("Отлично");
                break;
        }
        return grade;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the grade 1-5");
        int b = scan.nextInt();

        Task5 example = new Task5();
        System.out.println(example.checkGrade(b));
    }

}
