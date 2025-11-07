package org.abb_tech.lesson7.collection_api;

import org.abb_tech.lesson7.classes.Elephant;

import java.util.*;

public class Practice {
    static void main() {
        List<Elephant> elephants = new ArrayList<>();

        Elephant e1 = new Elephant("A",1,"Black",5);
        Elephant e2 = new Elephant("B",5,"Black",5);
        Elephant e3 = new Elephant("C",10,"Black",5);
        Elephant e4 = new Elephant("D",15,"Black",5);

        elephants.add(e1);
        elephants.add(e2);
        elephants.add(e3);
        elephants.add(e4);

//        System.out.println("Written with for");
//        for(int i = 0;i < elephants.size();i++){
//            System.out.println(elephants.get(i));
//        }
//
//        System.out.println("Written with for each");
//        for(Elephant e : elephants){
//            System.out.println(e);
//        }

//        System.out.println("Written with while");
//        Iterator<Elephant> elephantIterator = elephants.iterator();
//        while(elephantIterator.hasNext()){
//            Elephant e = elephantIterator.next();
//            System.out.println(elephants.getFirst());
//        }

        System.out.println("Linked list");
        LinkedList<Elephant> elephantLinkedList = new LinkedList<>();
        elephantLinkedList.add(e1);
        elephantLinkedList.add(e2);
        elephantLinkedList.add(e3);
        elephantLinkedList.add(e4);

        for(Elephant e : elephantLinkedList){
            System.out.println(e);
        }

        System.out.println("Stack");
        Stack<Elephant> stackElephants = new Stack<>();
        stackElephants.add(e1);
        stackElephants.add(e2);
        stackElephants.add(e3);
        stackElephants.add(e4);
        while(stackElephants.iterator().hasNext()){
            System.out.println(stackElephants.pop());
        }
    }
}
