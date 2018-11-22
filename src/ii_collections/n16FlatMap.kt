package ii_collections

fun example() {

    val result = listOf("abc", "12").flatMap { it.toList() }

    result == listOf('a', 'b', 'c', '1', '2')
}

val Customer.orderedProducts: Set<Product> get() {
    // Return all products this customer has ordered
    return this.orders.flatMap { it.products.toList() }.toSet()
}

val Shop.allOrderedProducts: Set<Product> get() {
    return this.customers.flatMap { it.orderedProducts }.toSet()
}
