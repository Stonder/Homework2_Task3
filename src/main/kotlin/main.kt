fun main() {
    val regularCustomer = true
    val price = 10202_00
    var totalPrice:Int

    if (price <= 1000_00) {
        totalPrice = price
    } else if (price <= 10000_00) {
        totalPrice = price - 100_00
    } else {
        totalPrice = (price * 0.95).toInt()
    }

    totalPrice = if (regularCustomer) (totalPrice * 0.99).toInt() else totalPrice
    println("Итоговая цена ${totalPrice / 100} руб. ${totalPrice % 100} коп.")
}