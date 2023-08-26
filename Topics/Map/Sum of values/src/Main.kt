fun summator(map: Map<Int, Int>): Int {
    var c  = 0
    for((key, value) in map) {
        if (key % 2 == 0) {
            c += value
        }
    }
    return c
}
/*
fun summator(map: Map<Int, Int>) = map.filter { it.key % 2 == 0 }.values.sum()
*/
