import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Tuzik";
        dog.color = "black";
        dog.from = "USA";
        dog.age = 5;
        dog.vesy = 25;
        System.out.println(dog.alabai());

        System.out.println();

        Car car = new Car();
        car.marka = "Nissan";
        car.name = "Skylane";
        car.maxSpeed = 295;
        car.getSpeed();

        System.out.println();
        

        Student std1 = new Student();
        std1.name = "Nurai";
        std1.age = 18;
        std1.gender = 'w';
        std1.telNumber = 123456789;

        Student std2 = new Student();
        std2.name = "Apal";
        std2.age = 18;
        std2.gender = 'w';
        std2.telNumber = 123456789;

        Student std3 = new Student();
        std3.name = "Asan";
        std3.age = 18;
        std3.gender = 'm';
        std3.telNumber = 123456789;

        Student std4 = new Student();
        std4.name = "Uson";
        std4.age = 18;
        std4.gender = 'm';
        std4.telNumber = 123456789;

        Student std5 = new Student();
        std5.name = "Alisher";
        std5.age = 18;
        std5.gender = 'm';
        std5.telNumber = 123456789;

        Student std6 = new Student();
        std6.name = "Aijan";
        std6.age = 18;
        std6.gender = 'w';
        std6.telNumber = 123456789;

        Student [] students = {std1,std2,std3,std4,std5,std6};

        //std.getStudent(students);


        Flower flower1 = new Flower();
        flower1.name = "Rose";
        flower1.price = 2000;
        flower1.color = "Red";

        Flower flower2 = new Flower();
        flower2.name = "Rose";
        flower2.price = 1500;
        flower2.color = "Yellow";

        Flower flower3 = new Flower();
        flower3.name = "Rose";
        flower3.price = 1000;
        flower3.color = "White";

        Flower flower4 = new Flower();
        flower4.name = "Tulpan";
        flower4.price = 500;
        flower4.color = "Violet";

        Flower flower5 = new Flower();
        flower5.name = "Tulpan";
        flower5.price = 400;
        flower5.color = "Orange";

        Flower flower6 = new Flower();
        flower6.name = "Tulpan";
        flower6.price = 300;
        flower6.color = "Black";

        Flower [] flowers = {flower1,flower2,flower3,flower4,flower5,flower6};
        Flower [] flowersPrice = {flower1,flower2,flower3,flower4,flower5,flower6};

        flower1.getFlowers(flowers);
        flower1.getMaxPrice(flowersPrice);
    }
}