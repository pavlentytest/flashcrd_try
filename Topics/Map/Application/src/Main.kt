fun bill(priceList: Map<String, Int>, shoppingList: MutableList<String>): Int {
    var total = 0
    for ((key, value) in priceList) {
        for(elem in shoppingList) {
            if (elem == key)
                total += value
        }
    }
    return total
}