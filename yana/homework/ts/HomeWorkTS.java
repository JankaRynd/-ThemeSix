package yana.homework.ts;

import yana.homework.ts.objects.Question;
import yana.homework.ts.objects.Quiz;

import java.util.Scanner;



public class HomeWorkTS {
    public static void main(String[] args) {
        Question question1 = new Question();
        question1.setQuestion("Когда Новый год?");
        question1.setAnswers(new String[]{"Весна", "Лето", "Осень", "Зима"});
        question1.packosti();
        question1.setCorrectAnswer(3);
        Question question2 = new Question();
        question2.setQuestion("Когда Пасха?");
        question2.setAnswers(new String[]{"Зима", "Весна", "Лето", "Осень"});
        question2.setCorrectAnswer(1);
        Question question3 = new Question();
        question3.setQuestion("Когда птицы улетают в теплые края?");
        question3.setAnswers(new String[]{"Весна", "Осень", "Лето", "Зима"});
        question3.setCorrectAnswer(1);
        Question question4 = new Question();
        question4.setQuestion("Когда День Влюбленных?");
        question4.setAnswers(new String[]{"Весна", "Осень", "Лето", "Зима"});
        question4.setCorrectAnswer(3);
        Question question5 = new Question();
        question5.setQuestion("Когда дети идут первый раз в школу?");
        question5.setAnswers(new String[]{"Лето", "Весна", "Осень", "Зима"});
        question5.setCorrectAnswer(2);


        Quiz victorina = new Quiz();
        victorina.setQuestions(new Question[]{question1, question2, question3, question4, question5});


//        // Переменные для хранения количества правильных и неправильных ответов
//        int correctCount = 0, wrongCount = 0;
//
//        // Ниже вместо null надо написать реализацию,
//        // написано так, чтобы просто компилировалось
//
//        String[][][] array = {
//                {{"Когда Новый год?"}, {"Весна","Лето","Осень","Зима"}, {"3"}},
//                {{"Когда Пасха?"}, {"Зима","Весна","Лето","Осень"}, {"1"}},
//                {{"Когда птицы улетают в теплые края?"}, {"Весна","Осень","Лето","Зима"}, {"1"}},
//                {{"Когда День Влюбленных?"}, {"Весна","Осень","Лето","Зима"}, {"3"}},
//                {{"Когда дети идут первый раз в школу?"}, {"Лето","Весна","Осень","Зима"}, {"2"}}
//        };

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

        for(int i = 0; i < victorina.getQuestions().length; i++) {
            System.out.println("Вопрос № "+ (i+1) + " " + victorina.getQuestions()[i].getQuestion());
            for (int a = 0; a < victorina.getQuestions()[i].getAnswers().length; a++) {
                System.out.println( ( a + 1 ) + ". " + victorina.getQuestions()[i].getAnswers()[a]);
            }
            System.out.print("Ваш ответ: ");
            int result = 10;
            try {
                result = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                System.out.println("Формат ответа неправильный, Ожидаются цифры");
            }
            int correctResult = victorina.getQuestions()[i].getCorrectAnswer();

            if ( result == (correctResult + 1)) {
                System.out.println("Ваш ответ верен!Умничка!Продолжай дальше!");
                victorina.setCorrectCount(victorina.getCorrectCount() + 1);
            } else {
                System.out.println("Ваш ответ не верен!!! Подумай еще!!!!");
                victorina.setWrongCount(victorina.getWrongCount() + 1);
            }

        }

        //Выводим общий результат
        System.out.println("Результат: правильно " + victorina.getCorrectCount() + ", неправильно " + victorina.getWrongCount());
    }



}
