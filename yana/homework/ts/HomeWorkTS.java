package yana.homework.ts;

import java.util.Scanner;



public class HomeWorkTS {
    public static void main(String[] args) {
        // Переменные для хранения количества правильных и неправильных ответов
        int correctCount = 0, wrongCount = 0;

        // Ниже вместо null надо написать реализацию,
        // написано так, чтобы просто компилировалось

        String[][][] array = {
                {{"Когда Новый год?"}, {"Весна","Лето","Осень","Зима"}, {"3"}},
                {{"Когда Пасха?"}, {"Зима","Весна","Лето","Осень"}, {"1"}},
                {{"Когда птицы улетают в теплые края?"}, {"Весна","Осень","Лето","Зима"}, {"1"}},
                {{"Когда День Влюбленных?"}, {"Весна","Осень","Лето","Зима"}, {"3"}},
                {{"Когда дети идут первый раз в школу?"}, {"Лето","Весна","Осень","Зима"}, {"2"}}
        };


        String[] array1 = {"test"};
        String[] array2 = new String[array1.length +1];
        for ( int n = 0; n < array2.length - 1; n++) {
            array2[n] = array1[n];
        }
        array2[array2.length - 1] = "Новое значение";
        System.out.println(array2.length);

//        String[] questions = {
//                "Когда Новый год?",
//                "Когда Пасха?",
//                "Когда птицы улетают в теплые края? ",
//                "Когда День Влюбленных?",
//                "Когда дети идут первый раз в школу?"
//        };
//
//
//        String[][] answerOptions = {
//                {"Весна","Лето","Осень","Зима"},
//                {"Зима","Весна","Лето","Осень"},
//                {"Весна","Осень","Лето","Зима"},
//                {"Весна","Осень","Лето","Зима"},
//                {"Лето","Весна","Осень","Зима"}
//        };
//
//        int[] correctAnswers = {3,1,1,0,2};


        // Примечание - можете придумать как хранить всю информацию в одном массиве

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < array.length; i++) {
            System.out.println("Вопрос № "+ (i+1) + " " + array[i][0][0]);
            for (int a = 0; a < array[i][1].length; a++) {
                System.out.println( ( a + 1 ) + ". " + array[i][1][a]);
            }
            System.out.print("Ваш ответ: ");
            int result = scanner.nextInt();

            int correctResult = Integer.parseInt(array[i][2][0]);

            if ( result == (correctResult + 1)) {
                System.out.println("Ваш ответ верен!Умничка!Продолжай дальше!");
                correctCount = correctCount + 1;
            } else {
                System.out.println("Ваш ответ не верен!!! Подумай еще!!!!");
                wrongCount = wrongCount + 1;
            }

        }

        //Выводим общий результат
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }



}
