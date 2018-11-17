package com.fintech.commonsDemo.collections;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.TreeBag;

public class BagDemo {

    public static void hashBagDemo() {
        Bag<Integer> hashBag = new HashBag<>();
        hashBag.add(3);
        hashBag.add(3);
        hashBag.add(1);
        hashBag.add(4);
        hashBag.add(8);
        hashBag.add(2, 3);

        System.out.println("\n\n\n\n ******* HashBag Demo ******");
        System.out.println(" ******* HashBag ======= " + hashBag + "******");
        System.out.println(" ******* HashBag Size======= " + hashBag.size() + "******");
        System.out.println(" ******* HashBag Number 2 Count======= " + hashBag.getCount(2) + "******");
        System.out.println(" ******* HashBag Unique Set======= " + hashBag.uniqueSet() + "******");

        hashBag.remove(3); //remove All
        hashBag.remove(2, 2); //remove only Two copies

        System.out.println(" ******* HashBag Unique Set======= " + hashBag.uniqueSet() + "******");
        System.out.println(" ******* HashBag Size======= " + hashBag.size() + "******");

    }



    public static void treeSetBagDemo() {
        Bag<Integer> treeBag = new TreeBag<>();
        treeBag.add(3);
        treeBag.add(1);
        treeBag.add(4);
        treeBag.add(8);
        treeBag.add(2, 5);

        System.out.println("\n\n\n\n ******* treeBag Demo ******");
        System.out.println(" ******* treeBag ======= " + treeBag + "******");
        System.out.println(" ******* treeBag Size======= " + treeBag.size() + "******");
        System.out.println(" ******* treeBag Number 2 Count======= " + treeBag.getCount(2) + "******");
        System.out.println(" ******* treeBag Unique Set======= " + treeBag.uniqueSet() + "******");

        treeBag.remove(3); //remove All
        treeBag.remove(2, 2); //remove only Two copies

        System.out.println(" ******* treeBag Unique Set======= " + treeBag.uniqueSet() + "******");
        System.out.println(" ******* treeBag Size======= " + treeBag.size() + "******");

    }





}
