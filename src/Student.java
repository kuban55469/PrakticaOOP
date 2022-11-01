import java.util.Arrays;

public class Student {
    String name;
    byte age;
    char gender;
    int telNumber;

    public void getStudent(Student [] students){
        int counterM= 0;
        int counterW= 0;
        for (Student std: students) {
            if (std.gender == 'm'){
                counterM++;
            }
            else if (std.gender == 'w'){
                counterW++;
            }
        }
        System.out.println("mens: " + counterM);
        System.out.println("womens: " + counterW);

    }
}
