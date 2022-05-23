public class test {
    public static String reverseWords(String inputText) {
        String[] array = inputText.split(" ");
        String result = "";
        for (int i=array.length-1; i>=0; i--) {
            result = result + array[i] + " ";
        }

        return result;
    }

    private test() {

    }

    public static void main(String[] args) {
        System.out.println("Ввод пустой строки - " + test.reverseWords(""));
        System.out.println("Ввод одного слова - " + test.reverseWords("word"));
        System.out.println("Ввод двух слов - " + test.reverseWords("два слова"));
    }
}
