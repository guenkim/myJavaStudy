package sec10.practice06;

import java.util.Random;

public class Ex01 {

    public static void main(String[] args) {
        String nultr =null;
        //System.out.println(nultr.length());
        try{
            System.out.println(catOrNull().length());
        }catch(NullPointerException ne){
            ne.printStackTrace();
            System.out.println(0);
        }

    }

    public static String catOrNull(){
        return new Random().nextBoolean() ? "Cat" : null;
    }
}
