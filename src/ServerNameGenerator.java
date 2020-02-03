import java.util.Random;

public class ServerNameGenerator {
    public static void main(String[] args) {

//        === 2. Server Name Generator =========================================

        String[] adjectives = {"aggressive", "agreeable", "ambitious", "brave", "calm", "delightful", "eager", "faithful", "muscular", "silly"};

        String[] nouns = {"people", "history", "way", "art", "world", "information", "map", "two", "family", "government"};

        System.out.println("Here is your server name: \n" + getRandom(adjectives) + "-" + getRandom(nouns));

    }

    public static String getRandom(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

}
