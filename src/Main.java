import java.time.LocalDate;

public class Main {
    public static int sum() {
        var deliveryDistance = 95;
        var deliverydays = 1;
        if (deliveryDistance > 20) {
            deliverydays++;
            if (deliveryDistance > 60)
                deliverydays++;
        }
        return deliverydays;
    }
//    public static void printoc() {
//        int clientDeviceYear = LocalDate.now().getYear();
//        int clientOs = 1;
//        if (clientOs == 0 && clientDeviceYear >=2015){
//            System.out.println("Установите версию приложения для iOS по ссылке");
//        } else if (clientOs == 0 && clientDeviceYear < 2015) {
//            System.out.println("Установите упращенную версию приложения для IOS по ссылке");
//        } if ( clientOs == 1 && clientDeviceYear>=2015){
//            System.out.println("Установите версию приложения для Android по ссылке");
//        } else if (clientOs == 1 && clientDeviceYear<2015) {
//            System.out.println("Установите упращенную версию приложения для iOS по ссылке");
//        }
//    }
//    public static void printGradeYear() {
//        int year = 2024;
//        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
//            System.out.println(year+ " - Высокосный");
//        }else {
//            System.out.println(year+" - Обычыный");
//        }
//    }
    public static void main(String[] args) {
//printGradeYear();
//  printoc();
sum();
        }
    }
