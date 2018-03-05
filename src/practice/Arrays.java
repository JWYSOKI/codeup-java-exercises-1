package practice;

public class Arrays {

    public static void main(String[] args) {
//        making an array

//        double[] prices;
//
//        prices = new double[4];
//
//        prices[0] = 24.99;
////
//        final int NUMBER_OF_BEATLES = 4;
//        BandMember[] theBeatles = new BandMember[NUMBER_OF_BEATLES];
//
//        theBeatles[0] = new BandMember("Ringo");
//
//        theBeatles[1] = new BandMember("John");
//
//        theBeatles[2] = new BandMember("George");
//
//        theBeatles[3] = new BandMember("Paul");
//
//        System.out.println("The beatles are made up of \n" + theBeatles[0].getName()
//         + "\n" + theBeatles[1].getName() + "\n"+ theBeatles[2].getName() + "\n" +
//        theBeatles[3].getName());

        String[] beatles = {"John", "Paul", "Ringo", ""};

        System.out.println(beatles[0]);
        System.out.println(beatles[2]);
        System.out.println(beatles[3]);

        beatles[2] = "George";
        System.out.println(beatles[2]);

        System.out.println(beatles.length);


    }


}
