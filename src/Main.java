//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Task 1");
        int age = 19;
        if (age > 18) {
            System.out.println("Ты должен праздновать.");
            if (age < 21) {
                System.out.println("Выпей сливочного пива");
            } else {
                System.out.println("Иди куда хочешь и пей, что хочешь.");
            }
        } else {
            if (age > 7) {
                System.out.println("Иди в школу");
            } else {
                System.out.println("Иди в детский сад");
            }

        }
        System.out.println("Task 2");
        int age1 = 6;
        if (age == 18) {
            System.out.println("С окончанием школы!");
        } else if (age == 21) {
            System.out.println("Теперь тебе можно пить алкоголь!");
        } else if (age == 7) {
            System.out.println("Иди в школу!");
        } else {
            System.out.println("Пока сказать нечего!");
        }
        System.out.println("Task 3");
        char color = 'r';
        if (color == 'r') {
            System.out.println("Красный! Ехать нельзя!");
        } else if (color == 'y') {
                System.out.println("Желтый внимание.");
            } else {
                System.out.println("Зеленый!Проезд разрешен.");
            }
        System.out.println("Task 4");
        char color1 = 'g';
        switch (color1){
            case 'r':
            System.out.println("Красный! Ехать нельзя!");
            break;
            case 'y':
                System.out.println("Желтый внимание.");
                break;
            case 'g':
                System.out.println("Зеленый!Проезд разрешен.");
                break;
            case 'l':
                System.out.println("Поворот налево!");
                break;
            default:
                System.out.println("Светофор сломан.");
        }
        System.out.println("Task 5");
        if (age == 18) {
            System.out.println("С окончанием школы!");
        } else if (age == 21) {
            System.out.println("Теперь можно пить алкоголь");
        } else if (age == 7) {
            System.out.println("Иди в школу!");
        } else {
            System.out.println("Пока сказать нечего!");
        }
        System.out.println("Task 6");
        int age2 = 18;
        switch (age2) {
            case 18:
                System.out.println("С окончанием школы!");
                break;
            case 21:
                System.out.println("Теперь можно пить алкоголь");
                break;
            case 7:
                System.out.println("Иди в школу!");
                break;
            default:
                System.out.println("Пока сказать нечего!");
        }
        System.out.println("Task 7");
        int salary = 30000;
        if (salary >= 20000){
            System.out.println("Наконец-то я стал богатым!");
        } if (salary < 50000){
            System.out.println("Все равно мне не хватает на новое авто.");
        } else {
            System.out.println("Я могу позволить себе Mercedes.");
        }
        System.out.println("Task 8");
        int salary1 = 15000;
        if (salary1 >= 20000){
            System.out.println("Наконец-то я богат!");
            if (salary1 < 50000){
                System.out.println("Все равно мне не хватает на новое авто.");
            } else {
                System.out.println("Я могу позволить себе Mercedes.");
            }

        } else {
            if (salary >= 10000) {
                System.out.println("С этим уровнем доходов я останусь без машины.");
            } else {
                System.out.println("Пора затянуть пояса!");
            }
            System.out.println("Task 9");
            int salary2 = 5000;
            if (salary2 >= 20000) {
                System.out.println("Наконец-то я богат!");
                if (salary2 < 5000) {
                    System.out.println("Все равно мне не хватает на новое авто.");
                } else {
                    System.out.println("Я могу позволить себе Mercedes.");
                }
            } else if (salary2 >= 10000) {
                System.out.println("С этим уровнем доходов я останусь без машины.");
            } else {
                System.out.println("Пора затянуть пояса!");
            }
        }
        }
    }

