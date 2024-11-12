import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args){

        System.out.println("Задача 1");
        int total = 0;
        int month = 1;

        while (total < 2459000){
            total = total + 15000;
            month += 1;
                    }

        System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");

        System.out.println();
        System.out.println("Задача 2");
        int i = 1;

        for(; i <= 10; i++){
            System.out.print(i + " ");
             }
        System.out.println();
        for(i = 10; i > 0; i--){
            System.out.print(i + " ");

        }

        System.out.println();
        System.out.println("Задача 3");

        int y = 12000000;
        int plus = 17;
        int minus = 8;

        for (i = 1; i <= 10; i++){
            y = y + y*plus/1000 - y*minus/1000;
            System.out.println("Год " + i + ", численность населения составляет " + y);
        }

        System.out.println();
        System.out.println("Задача 4");

        int sum = 15000;
        for(i=1; sum <= 12000000; i++){
        sum = sum + sum*7/100;
            System.out.println("Месяц " + i + ", сумма накоплений: " + sum);
        }

        System.out.println();
        System.out.println("Задача 5");

        sum = 15000;
        for(i=1; sum <= 12000000; i++){
            sum = sum + sum*7/100;
            if (i%6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений: " + sum);
            }
        }

        System.out.println();
        System.out.println("Задача 6");

        sum = 15000;
        for(i=1; i <= 12*9; i++){
            sum = sum + sum*7/100;
            if (i%6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений: " + sum);
            }
        }

        System.out.println();
        System.out.println("Задача 7");

        for(i = 1; i <= 31; i +=7){
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет." );
        }

        System.out.println();
        System.out.println("Задача 8");

        int year = 2024;
        for (i = 0; i <= year+100; i +=79){
            if(i <= year+100 && i >= year-200){
                System.out.println(i);
            }


        }









    }




}
