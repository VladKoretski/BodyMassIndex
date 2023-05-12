public class Main {
    public static void main(String[] args) {
       BMIService index = new BMIService ();

//Объявление переменных (рост, вес, индекс массы тела) и вывод на консоль
        float height = 1.87f;
        float weight = 98;
        int bodyMassIndex;
        System.out.println("The height = " + height + " meters" + ", the weight = " + weight + " kilograms");

//Расчет индекса массы тела и вывод на консоль
        bodyMassIndex = index.calculate (height, weight);
        System.out.println("Body mass index = " + bodyMassIndex);
    }
}
