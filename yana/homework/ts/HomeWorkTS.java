package yana.homework.ts;

import java.util.Scanner;



public class HomeWorkTS {
    public static void main(String[] args) {
        // Переменные для хранения количества правильных и неправильных ответов
        int correctCount = 0, wrongCount = 0;

        // Ниже вместо null надо написать реализацию,
        // написано так, чтобы просто компилировалось

        String[] questions = {
                "Когда Новый год?",
                "Когда Пасха?",
                "Когда птицы улетают в теплые края? ",
                "Когда День Влюбленных?",
                "Когда дети идут первый раз в школу?"
        };


        String[][] answerOptions = {
                {"Весна","Лето","Осень","Зима"},
                {"Зима","Весна","Лето","Осень"},
                {"Весна","Осень","Лето","Зима"},
                {"Весна","Осень","Лето","Зима"},
                {"Лето","Весна","Осень","Зима"}
        };

        int[] correctAnswers = {3,1,1,0,2};


        // Примечание - можете придумать как хранить всю информацию в одном массиве

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < questions.length; i++) {
            System.out.println("Вопрос № "+ (i+1) + " " + questions[i]);
            for (int a = 0; a < answerOptions[i].length; a++) {
                System.out.println( ( a + 1 ) + ". " + answerOptions[i][a]);
            }
            System.out.print("Ваш ответ: ");
            int result = scanner.nextInt();

            int correctResult = correctAnswers[i];

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
