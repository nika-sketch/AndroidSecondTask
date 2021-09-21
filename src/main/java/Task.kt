package main.java

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

fun main() {
    var firstList = ArrayList<Int>()
    firstList.add(4)
    firstList.add(7)
    firstList.add(2)
    firstList.add(3)
    firstList.add(3)
    firstList.add(2)

    println("First Task: " + firstTask(firstList))
    //.....................................//

    var firstItems = ArrayList<Int>()
    firstItems.add(7)
    firstItems.add(6)
    firstItems.add(5)
    firstItems.add(9)

    var secondItems = ArrayList<Int>()
    secondItems.add(5)
    secondItems.add(6)
    secondItems.add(9)
    secondItems.add(4)

    var intersection = secondTask(firstItems, secondItems)
    println("Second Task: $intersection")
    //.....................................//

    var unification = thirdTask(firstItems, secondItems)
    println("Third Task: $unification")
    //.....................................//

    var smallerThenAvg = fourthTask(firstItems)
    println("Fourth Task: $smallerThenAvg")
    //.....................................//

    var secondMaxAndSecondMin = fifthTask(firstItems)
    println("Fifth Task: $secondMaxAndSecondMin")

}

private fun firstTask(list:ArrayList<Int>):Int {
    var uniqueElementCounter = 0
    for (item in list.distinct()) {
        if (Collections.frequency(list, item) == 1) {
            uniqueElementCounter++
        }
    }
    return uniqueElementCounter
}

private fun secondTask(firstList:ArrayList<Int>, secondList:ArrayList<Int>):Set<Int> {
    val finalList = java.util.ArrayList<Int>()
    for (i in firstList.indices) {
        for (j in secondList.indices) {
            if (firstList[i] == secondList[j]) {
                finalList.add(firstList[i])
            }
        }
    }
    var finalSet = HashSet<Int>()
    for (item in finalList) {
        finalSet.add(item)
    }
    return finalSet
}

private fun thirdTask(firstList:ArrayList<Int>, secondList:ArrayList<Int>):Set<Int> {
    var finalSet = HashSet<Int>()

    for (item in firstList) {
        finalSet.add(item)
    }

    for (item in secondList) {
        finalSet.add(item)
    }

    return finalSet
}

private fun fourthTask(list:ArrayList<Int>):Set<Int> {
    var finalSet = HashSet<Int>()

    var sum = 0
    for (i in list.indices) {
        sum += list[i]
    }
    var avg = sum / list.size

    for (i in list.indices) {
        if (list[i] < avg) {
            finalSet.add(list[i])
        }
    }
    return finalSet
}

private fun fifthTask(list:ArrayList<Int>): ArrayList<Int> {
    var result = ArrayList<Int>()
    list.sort()
    result.add(list[1])
    result.add(list[list.size - 2])
    return result
}






