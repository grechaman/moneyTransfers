package ru.netology

import java.util.*

const val minimumCommission = 3500.0 // в копейках
const val percentCommission = 0.0075

fun main() {

    fun transferInRub(money: Double) = Math.round(money) / 100.0

    val scanner = Scanner(System.`in`)
    print(
        "Введите сумму перевода для расчета комиссии.\n" +
                "Рублей:"
    )
    val inputRub = scanner.nextInt()
    print("Копеек:")
    val inputKopeiki = scanner.nextInt()
    val amount = inputRub * 100 + inputKopeiki
    val commission = amount * percentCommission
    var transferAmount = 0.0
    if (commission > minimumCommission) transferAmount = amount + commission else transferAmount =
        amount + minimumCommission
    println(
        "Сумма перевода: " + transferInRub(transferAmount) + " рублей\n" +
                "Комиссия составила: " + transferInRub(transferAmount - amount) + " рублей"
    )
}