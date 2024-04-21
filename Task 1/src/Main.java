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

        boolean isPosibletoCook = false;

        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        //todo дописать логику программы сюда

        if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
            System.out.println("Вы можете приготовить эликсир зоркости.");
            isPosibletoCook = true;
        }
        if (dumplingsCount >= 4 && ravenBonesCount >= 2) {
            System.out.println("Вы можете приготовить эликсир стойкости.");
            isPosibletoCook = true;
        }
        if (ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2) {
            System.out.println("Вы можете приготовить эликсир скрытности.");
            isPosibletoCook = true;
        }
        if (ghoulTearsCount >= 5 && ravenBonesCount >= 3 && dumplingsCount >= 10 && toadEyesCount >= 4) {
            System.out.println("Вы можете приготовить эликсир зоркости.");
            isPosibletoCook = true;
        }
        if (!isPosibletoCook){
            System.out.println("Не хватает ингрединтов.");
        }

    }
}
