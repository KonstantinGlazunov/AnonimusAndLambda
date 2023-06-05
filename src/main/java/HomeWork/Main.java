package HomeWork;

public class Main {
    public static void main(String[] args) {
//реализацию этого интерфейса - через анонимный класс. Требуется чтобы метод в этой реализации возвращал самое короткое из этих двух слов.
        WordComparator shotrestWord = new WordComparator() {
            @Override
            public String Word(String word1, String word2) {
                if (word1.length() > word2.length()) {
                    return word2;
                }
                return word1;
            }
        };
        System.out.println(shotrestWord.Word("Short", "Long"));

//Создайте лямбду на основе этого интерфейса. Пусть в этой реализации метод возвращает самое длинное слово из двух. Вызовите метод.
        WordComparator longestWord = (String word1, String word2) -> {
            if (word1.length() < word2.length()) {
                return word2;
            }
            return word1;
        };
        System.out.println(longestWord.Word("Short", "Long"));



        //Вызовите метод, передав в него лямбду, такую что возвращается строка повторенная указанное количество раз.
       String result = repeat((string, number)   -> {
            for (int i = 1; i < number; i++) {
                System.out.print(string + " ");
            }
                   return string;
               }, "Word", 3);

        System.out.println(result);

    } //конец mein


//метод repeat, который принимает строку, число и лямбду(ее тип - это интерфейс, который вы создали) и возвращает новую строку.
    public static String repeat  (NewInterface newInterface, String string, int number){

        return newInterface.Method(string, number);
    }



}


