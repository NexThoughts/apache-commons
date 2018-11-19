package com.fintech.commons.proper.collections

import org.apache.commons.collections.BidiMap
import org.apache.commons.collections.bidimap.TreeBidiMap

public class BidiMapDemo {

    public static void execute() {
        TreeBidiMap bidiMap = new TreeBidiMap()
        bidiMap.put("1", "first")
        bidiMap.put("2", "second")
        bidiMap.put("3", "third")
        bidiMap.put("4", "four")

        println("---------- First Key of Map : ==" + bidiMap.firstKey())
        println("---------- Value Fom Key(3) : ==" + bidiMap.get("3"))
        println("---------- Key(4) From Value : ==" + bidiMap.get("four"))

        println("\n---------- Map Before Inverse: ==" + bidiMap)
        BidiMap inversedMap = bidiMap.inverseBidiMap()
        println("---------- Map After Inverse: ==" + inversedMap)

    }
}
