package com.example.calculatorapp

/*
fun main() {

// 여기서 먼저 변수 선언
    var number1 = 0
    var number2 = 0
    var op = ""

// 연산자를 "-1"을 입력하거나 잘못 입력했을 경우에는 프로그램 종료, 아니면 프로그램 실행
    while (true) {
        print("연산자 입력 : ")
        op = readLine()!!
        // var op = readLine()!!로 써도 된다. 맨처음에 변수 선언 안했다면)

        if (op == "-1") {
            println("-1은 입력할 수 없습니다")
            println("프로그램을 종료합니다.")
            return
        }

        if(op != "+" && op != "-" && op != "*" && op != "/" && op != "%") {
            println("잘못된 연산자 입력입니다.")
            println("프로그램을 종료합니다.")
            return
        }

// 숫자 입력 받기 (연산자는 앞에서 정상적으로 입력받았으니)
        print("첫 번째 숫자 입력 : ")
        number1 = readLine()!!.toInt()
        // var number1 = readLine()!!.toInt()로 써도 된다. 맨처음에 변수 선언 안했다면)

        print("두 번째 숫자 입력 : ")
        number2 = readLine()!!.toInt()
        // var number2 = readLine()!!.toInt()로 써도 된다. 맨처음에 변수 선언 안했다면)

// 두 숫자 중 -1을 입력한 것이 있으면 프로그램 종료
        if (number1 == -1 || number2 == -1) {
            println("-1은 입력을 할 수 없습니다.")
            println("그래서 프로그램을 종료합니다.")
            break
        }

// 연산하는 클래스 호출
        val cal = Calculator(number1, number2, op)
        cal.value()
    }
}

class Calculator (number1:Int, number2:Int, op:String) {

    // 클래스 내에서 쓰이는 변수 선언
    var num1 = 0
    var num2 = 0
    var op2 = ""

    // 변수 초기화 및 정의
    init {
        this.num1 = number1
        this.num2 = number2
        this.op2 = op
    }

    // 여기서부터 연산 파트
    fun value() {
        when (op2) {
            "+" -> println("계산 결과 = ${num1 + num2}")
            "-" -> println("계산 결과 = ${num1 - num2}")
            "*" -> println("계산 결과 = ${num1 * num2}")
            "/" -> println("계산 결과 = ${num1 / num2}")
            "%" -> println("계산 결과 = ${num1 % num2}")
        }
    }
}
*/
