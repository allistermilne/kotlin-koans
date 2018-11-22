package iii_conventions

import java.time.LocalDate

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

operator fun MyDate.rangeTo(other: MyDate): DateRange = todoTask27()

fun MyDate.compareTo(first: MyDate, second: MyDate) {
    if (LocalDate.of(first.year, first.month, first.dayOfMonth)
            > LocalDate.of(second.year, second.month, second.dayOfMonth))
        return 1
}

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(val start: MyDate, val endInclusive: MyDate)
