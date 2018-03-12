package util;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {

    ArrayList<String> contents = new ArrayList<>();

    public static List<String> slurp(String filepath){
        Path path = Paths.get(filepath);
        List<String> contents = null;
        try {
            contents = Files.readAllLines(Paths.get(filepath));
            for(int i = 0;i<contents.size();i++){
                String line = contents.get(i);
                System.out.printf("%s: %s\n", i+1, line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return contents;
    }


    public static void spit(String filename, List<String> contents, boolean append){

        try {
            if(append){
            Files.write(Paths.get(filename), contents,StandardOpenOption.APPEND);
        }else {
                Files.write(Paths.get(filename), contents);
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }


    public static void makeExciting (String filename){
        ArrayList<String> exciting = new ArrayList<>();
        try {
            List<String> original = Files.readAllLines(Paths.get(filename));
            for(String line:original){
                exciting.add(line.toUpperCase() + "!");
            }
            Files.write(Paths.get(filename),exciting);

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

    }

    public static void copy(String originalFile, String copyName){
        try {
            Files.move(Paths.get(originalFile), Paths.get(copyName), StandardCopyOption.ATOMIC_MOVE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static void move(String oldPath, String newPath){
//        try {
//            Files.move(Paths.get(oldPath), Paths.get(newPath), StandardCopyOption.REPLACE_EXISTING);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }








    public static void main(String[] args) {

        ArrayList<String> roasts = new ArrayList<>();
        roasts.add("light");
        roasts.add("medium");
        roasts.add("medium");
        roasts.add("dark");

        slurp("Readme.md");
        spit("coffee.md",roasts, false);
        makeExciting("coffee.md");
        copy("coffeeCopy.md", "anotherCoffeeCopy.md");
//        move("coffee.md", "newfolder");

    }


}
