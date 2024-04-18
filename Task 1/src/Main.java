import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int toadEyesCount = 0;          //Жабьи глаза
//        int ghoulTearsCount = 0;        //Слезы вурдалака
//        int ravenBonesCount = 0;        //Кости ворона
//        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )

        //todo реализовать ввод пользователем кол-ва ингредиентов.
        System.out.println("Введите количество жабьих глаз: ");
        int toadEyesCount = scan.nextInt();
        System.out.println("Введите количество костей ворона: ");
        int ghoulTearsCount = scan.nextInt();
        System.out.println("Введите количество слез вурдалака: ");
        int ravenBonesCount = scan.nextInt();
        System.out.println("Введите количество пельмешек: ");
        int dumplingsCount = scan.nextInt();


        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        //todo дописать логику программы сюда
        for (toadEyesCount; toadEyesCount > 0; toadEyesCount=+3)

        if (toadEyesCount / 3 > 0 && ravenBonesCount / 1 > 0) {
            System.out.println("Вы можете приготовить: " + toadEyesCount / 3 + " шт эликсиров зоркости.");
        } else {
            System.out.println("Недостаточно ингредиентов");
        }
    }
}
