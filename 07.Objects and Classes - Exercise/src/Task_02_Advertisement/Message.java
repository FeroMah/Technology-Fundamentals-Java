package Task_02_Advertisement;

import java.util.Random;

public class Message {
    private String[] phrase = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
    private String[] event = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
    private String[] author = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
    private String[] city = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

    private Random rnd = new Random();

    public String getRandomMassage() {

        String phraseRND = this.phrase[rnd.nextInt(phrase.length)];
        String eventRND = this.event[rnd.nextInt(event.length)];
        String authorRND = this.author[rnd.nextInt(author.length)];
        String cityRND = this.city[rnd.nextInt(city.length)];

        return String.format("%s %s %s - %s",
                phraseRND, eventRND, authorRND, cityRND);
    }

}

