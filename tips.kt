import java.text.DecimalFormat

// 입력받기
//val readln = readln()

// format
val format1 = DecimalFormat("00")
val format2 = DecimalFormat("##00.000")

// 정렬
list.sort() // 오름차순 > [1, 2, 3, 4, 5]
list.sortDescending() // 내림차순 > [5, 4, 3, 2, 1]
list.reverse() // 리스트 뒤집기 > [1, 2, 3, 4, 5]