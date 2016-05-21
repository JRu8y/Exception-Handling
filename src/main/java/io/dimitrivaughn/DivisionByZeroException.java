package io.dimitrivaughn;
import java.io.*;
import java.util.*;

/**
 * Created by dimitrivaughn on 5/20/16.
 */
public class DivisionByZeroException extends Exception{

    String error;

    public DivisionByZeroException(String error){
        this.error = error;
        System.out.println(error);
    }

}
