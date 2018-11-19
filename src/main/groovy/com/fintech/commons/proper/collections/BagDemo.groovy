package com.fintech.commons.proper.collections

import org.apache.commons.collections4.Bag
import org.apache.commons.collections4.bag.HashBag
import org.apache.commons.collections4.bag.TreeBag

public class BagDemo {

    public static void hashBagDemo() {
        Bag<Integer> hashBag = new HashBag<>()
        hashBag.add(3)
        hashBag.add(3)
        hashBag.add(1)
        hashBag.add(4)
        hashBag.add(8)
        hashBag.add(2, 3)

        println("\n\n\n\n ******* HashBag Demo ******")
        println(" ******* HashBag ======= " + hashBag + "******")
        println(" ******* HashBag Size======= " + hashBag.size() + "******")
        println(" ******* HashBag Number 2 Count======= " + hashBag.getCount(2) + "******")
        println(" ******* HashBag Unique Set======= " + hashBag.uniqueSet() + "******")

        hashBag.remove(3) //remove All
        hashBag.remove(2, 2) //remove only Two copies

        println(" ******* HashBag Unique Set======= " + hashBag.uniqueSet() + "******")
        println(" ******* HashBag Size======= " + hashBag.size() + "******")

    }


    public static void treeSetBagDemo() {
        Bag<Integer> treeBag = new TreeBag<>()
        treeBag.add(3)
        treeBag.add(1)
        treeBag.add(4)
        treeBag.add(8)
        treeBag.add(2, 5)

        println("\n\n\n\n ******* treeBag Demo ******")
        println(" ******* treeBag ======= " + treeBag + "******")
        println(" ******* treeBag Size======= " + treeBag.size() + "******")
        println(" ******* treeBag Number 2 Count======= " + treeBag.getCount(2) + "******")
        println(" ******* treeBag Unique Set======= " + treeBag.uniqueSet() + "******")

        treeBag.remove(3) //remove All
        treeBag.remove(2, 2) //remove only Two copies

        println(" ******* treeBag Unique Set======= " + treeBag.uniqueSet() + "******")
        println(" ******* treeBag Size======= " + treeBag.size() + "******")

    }


}
