public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int clientOS = 3;
        int iOS = 0;
        int Android = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Другого ничего нет!!)) P.S. поставь 0");
            }
        }
    }


    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 3;
        int clientDeviceYear = 2015;
        int iOS = 0;
        int Android = 1;
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            } }
        else  if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
            }



        public static void task3 () {
            System.out.println("Задача 3");
            int year = 2024;
            if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }


    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 200;
        int deliveryDays = 1;

        if (deliveryDistance <=20) {
            System.out.println("Потребуется дней: 1");
        } else {
            if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println("Потребуется дней: 2");
            }
            if (deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println("Потребуется дней: 3");
            } else if (deliveryDistance > 100){
                System.out.println("Доставка не осуществляется");
            }
        }}




    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 14;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("Некорректный месяц: " + monthNumber);
        }

        }
    }



