package ru.netology


fun main() {
    // создаем переменную для суммы покупки
    var purchaseAmount = 12000

// создаем переменную для проверки, является ли пользователь постоянным
    var isRegularCustomer = true

// создаем переменную для скидки
    var discount = 0

// проверяем сумму покупки и применяем соответствующую скидку
    if (purchaseAmount > 1000 && purchaseAmount <= 10000) {
        discount = 100
    } else if (purchaseAmount > 10000) {
        discount =  (purchaseAmount * 0.05).toInt()
    }

// проверяем, является ли пользователь постоянным и применяем дополнительную скидку
    if (isRegularCustomer) {
        discount += (purchaseAmount * 0.01).toInt()
    }

// выводим итоговую сумму с учетом скидки
    var totalAmount = purchaseAmount - discount
    println("Сумма покупки: $purchaseAmount руб.")
    println("Скидка: $discount руб.")
    println("Итого к оплате: $totalAmount руб.")
}