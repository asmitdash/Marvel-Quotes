package tests2;

import java.util.HashMap;
import java.util.Scanner;

public class Marvel_quotes{
    public static void main(String[] args) {
        HashMap<String, String> quotes = new HashMap<>();
        
        quotes.put("Iron Man", "I am Iron Man.");
        quotes.put("Captain America", "I can do this all day.");
        quotes.put("Thor", "Bring me Thanos!");
        quotes.put("Black Widow", "I don't have a family. Not anymore.");
        quotes.put("Hulk", "Hulk... SMASH!");
        quotes.put("Thanos", "I am inevitable.");
        quotes.put("Loki", "I am Loki, of Asgard. And I am burdened with glorious purpose.");
        quotes.put("Ultron", "There are no strings on me.");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hero or villain name: ");
        String heroOrVillain = input.nextLine().trim();
        
        if(quotes.containsKey(heroOrVillain)){
        System.out.println(quotes.get(heroOrVillain));
        }else{
        System.out.println("Sorry, we don't have a quote for "+ heroOrVillain);
        }
    }
}
