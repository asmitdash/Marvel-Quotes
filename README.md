# Marvel-Quotes
This code creates a HashMap that contains key-value pairs of hero or villain names and their quotes from the Marvel Cinematic Universe. It also creates a Scanner object to read input from the user and store it in the "heroOrVillain" variable.
The code then uses the nextLine() method from the scanner to read the input from the user and the trim() method to remove any leading or trailing whitespaces.

It then uses the containsKey() method from the HashMap to check if the input hero or villain name exists in the HashMap as a key and if it exists it uses the get() method to retrieve the value (quote) associated with the key (heroOrVillain) and prints it to the console.
If the key doesn't exist, it will print "Sorry, we don't have a quote for " + heroOrVillain ,

This allows the user to input a specific hero or villain name and have the code output a quote associated with that character. This can be useful for creating a trivia game or for displaying quotes on a website or application.
