package yana.homework.ts;

public class TestAddHome {
    public static void main(String[] args) {
    firstPartHomeWork();
    secondPartHomeWork();
    }

    static void textDisplayPrint () {
        System.out.println("Когда то что то получится!");

    }

    static void firstPartHomeWork () {
        int a = 3;

        if ( a == 3){
            textDisplayPrint();

        }
        for ( ; a == 3;){
            textDisplayPrint();
            break;
        }
        while ( a == 3 ){
            textDisplayPrint();
            break;
        }
        do {
            textDisplayPrint();
            break;
        }
        while ( a ==3);

        switch (a){
            case 3:
                textDisplayPrint();
                break;
            default:
                System.out.println("Если долго мучиться))))");
                break;

        }
    }

    static void textDisplayPrintSecondPart () {
        System.out.println("Ну вот и текст!Ура получилось!");
    }
    static void secondPartHomeWork () {


        for (int i = -10 ; i < 0; i++ ){
            textDisplayPrintSecondPart();
        }

        int i2 = -10;
        while (i2 < 0){
            textDisplayPrintSecondPart();

            i2++;
        }

        int i3 = -10;
        do {
            textDisplayPrintSecondPart();
            i3++;
        }
        while ( i3 < 0 );


    }

}
