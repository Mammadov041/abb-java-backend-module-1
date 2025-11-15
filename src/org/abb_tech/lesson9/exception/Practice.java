package org.abb_tech.lesson9.exception;

import org.abb_tech.lesson9.classes.Animal;
import org.abb_tech.lesson9.classes.Frog;
import org.abb_tech.lesson9.enums.ErrorCodeEnum;

public class Practice {
    static void main(String[] args) {
        try{
            int a = 10;
            String name = null;
            System.out.println(name.charAt(1));
            System.out.println(a/0);
            System.out.println("After dividing to zero");
        }catch ( ArithmeticException exception){
            System.out.println("Arithmetic exception occured dividing zero");
        }catch (NullPointerException exception){
            System.out.println("Null pointer exception occurred " + exception.getMessage());
            try{
                throw new NameNullException("String is null", ErrorCodeEnum.NAME_NULL,exception);
            }catch (NameNullException nameNullException){
                System.out.println(nameNullException.getErrorEnum().getErrorCode());
                System.out.println(nameNullException);
            }
        }
        System.out.println("Program completed");

        try{
            // try with resources
            try(Animal f = new Frog("Niko",21)){
                f.jump();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
