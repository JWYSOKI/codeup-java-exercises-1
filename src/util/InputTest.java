package util;

public class InputTest {


    public static void main(String[] args) {

        Input newInput = new Input();
        System.out.println(newInput.getString());
        System.out.println(newInput.yesNo());
        System.out.println(newInput.getInt(1,100));
        System.out.println(newInput.getInt());
        System.out.println(newInput.getDouble(0.01,99.99));
        System.out.println(newInput.getDouble());
    }

}

