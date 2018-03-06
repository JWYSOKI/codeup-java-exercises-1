public class ServerNameGenerator {

public static String[] nouns = {"Castle", "Yacht", "Cave", "Spatula", "Rock-Formation", "Toaster-Oven", "Jesus", "Lucifer", "Jack-Black", "Jerry-Seinfeld"};

public static String[] adjectives = {"Lovely", "Majestic", "Hilarious", "Splendid", "Frozen", "Harmful", "Conniving", "Indifferent", "Fantastic", "Disgusting"};

public static void serverName(){
    int randomNum = (int) Math.ceil(Math.random() * 100);

    if(randomNum<=nouns.length || randomNum<=adjectives.length){
        System.out.println("Here is your server name: \n" +
                adjectives[randomNum] + "-" + nouns[randomNum]);
    }else {
        serverName();
    }
}

    public static void main(String[] args) {
        serverName();
    }

}
