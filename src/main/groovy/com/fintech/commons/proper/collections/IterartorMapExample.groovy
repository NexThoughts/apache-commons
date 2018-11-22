package com.fintech.commons.proper.collections

import org.apache.commons.collections.IterableMap
import org.apache.commons.collections.map.HashedMap

class IterartorMapExample {

    public static void execute() {
        IterableMap iterableMap = new HashedMap()
        iterableMap.put("1", "First")
        iterableMap.put("2", "Second")
        iterableMap.put("3", "Third")
        iterableMap.put("4", "Fourth")
        iterableMap.put("5", "Five")

        def iterator = iterableMap.mapIterator()
        while (iterator.hasNext()) {
            println("====== Key -- ${iterator.next()}  ==== value --- ${iterator.value}")
        }

    }
}
