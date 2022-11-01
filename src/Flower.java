import java.util.Arrays;
import java.util.Objects;

public class Flower {
    String name;
    int price;
    String color;
    public void getFlowers(Flower[] flowers) {
        int rose = 0;
        int tulpan = 0;
        for (Flower flower : flowers) {
            if (flower.name.equals( "Rose")) {
                rose++;
            } else if (flower.name.equals("Tulpan")) {
                tulpan++;
            }
        }
        System.out.println("roses " + rose);
        System.out.println("tulpans " + tulpan);
        System.out.println();

        int index= 0;
        Flower [] roses = new Flower[3];
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i].name.equals("Rose")){
                roses[index] = flowers[i];
                System.out.print(roses[index].name + " ");
                System.out.print(roses[index].price + " ");
                System.out.print(roses[index].color + " ");
                System.out.println();
                index++;
            }
        }

        System.out.println();

        int index2 = 0;
        Flower [] tulpans = new Flower[tulpan];
        for (Flower flower : flowers) {
            if (flower.name.equals("Tulpan")) {
                tulpans[index2] = flower;
                System.out.print(tulpans[index2].name + " ");
                System.out.print(tulpans[index2].price + " ");
                System.out.print(tulpans[index2].color + " ");
                System.out.println();
                index2++;
            }
        }

    }

    public void getMaxPrice(Flower [] maxPrice){
        int coumter=maxPrice[0].price;
        int counter2 = maxPrice[0].price;

        String name1 = "";
        for (int i = 0; i < maxPrice.length; i++) {
            if (coumter<maxPrice[i].price) {
                coumter=maxPrice[i].price;

            }
            if (counter2 > maxPrice[i].price) {
                counter2=maxPrice[i].price;
            }
        }
        System.out.println();
        System.out.println("Самый дорогой цветок: " + coumter);
        System.out.println("Самый дещевый цветок: " + counter2);
    }

}
