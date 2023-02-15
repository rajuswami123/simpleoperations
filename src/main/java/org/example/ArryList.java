package org.example;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArryList {
    public static void main(String[] args){
        Logger ou = Logger.getLogger("com.api.jar");
        ArrayList<Integer> integers=new ArrayList<Integer>();
        //Add elements method
        integers.add(1);
        integers.add(34);
        integers.add(323);
        //Adding elements at a particular index
        integers.add(3,45);
        integers.add(0,324);
        //get method (returns the element at that index
        ou.log(Level.INFO,()->""+ integers.get(1));
        //remove method which removes the element at that index
        integers.remove(1);
        //returns the index of element in the list...(if not in list return a negative integer)
        ou.log(Level.INFO,()->""+integers.indexOf(1));
        //returns the size of list
        ou.log(Level.INFO,()->""+integers.size());
        //printing the list
        ou.log(Level.INFO,()->""+integers);
    }
}
