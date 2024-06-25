package com.example.calculatorapp

fun main() {

// 연산 결과를 입력받을 변수 선언
    var resValue = 0

// 연산자 입력받는 부분 (연산자에 "-1"을 입력하거나 잘못 입력한 경우 프로그램 종료)
    print("연산자 입력 : ")
    var op:String = readLine()!!

    if (op == "-1") {
        println("-1은 입력할 수 없습니다")
        println("프로그램을 종료합니다.")
        return
    }

    if(op != "+" && op != "-" && op != "*" && op != "/") {
        println("잘못된 연산자 입력입니다.")
        println("프로그램을 종료합니다.")
        return
    }

    println("연산자 입력 결과 = ${op}")

// 숫자 입력 받는 부분 (연산자는 앞에서 정상적으로 입력 받음)
    print("첫 번째 숫자 입력 : ")
    var number1:Int = readLine()!!.toInt()

    print("두 번째 숫자 입력 : ")
    var number2:Int = readLine()!!.toInt()

// 이것도 역시 입력한 숫자가 -1이면 프로그램 종료
    if (number1 == -1 || number2 == -1) {
        println("-1은 입력할 수 없습니다")
        println("프로그램을 종료합니다.")
        return
    }

// 여기서 부모 클래스를 호출하는데 사실 이건 안 써도 됨
//    var number = Calculator(number1, number2)
//    number.calculator()

// 여기서는 입력받은 연산자가 무엇인가에 따라서 각각의 연산자에 따라 연산을 한 값을 리턴한 클래스 호출 (연산한 값을 "resValue"로 받아서 그걸 출력해준다)
    if (op == "+") {
        var add = AddOperation(number1, number2)
        resValue = add.calculator()
        println("계산 결과 = ${resValue}")
    } else if (op == "-") {
        var sub = SubstractOperation(number1, number2)
        resValue = sub.calculator()
        println("계산 결과 = ${resValue}")
    } else if (op == "*") {
        var mul = MultiplyOperation(number1, number2)
        resValue = mul.calculator()
        println("계산 결과 = ${resValue}")
    } else if (op == "/") {
        var div = DivideOperation(number1, number2)
        resValue = div.calculator()
        println("계산 결과 = ${resValue}")
    }
}

// 부모 클래스이다. (이곳에서 "calculator"를 자식 클래스로 상속시킨다.)
open class Calculator (number1:Int, number2: Int) {

    // 변수 선언 (클래스에서 쓰일 변수)
    var num1: Int = 0
    var num2: Int = 0

    // 변수 초기화 및 정의
    init {
        this.num1 = number1
        this.num2 = number2
    }

    // 이 내용을 자식 클래스에서 상속받아서 사용한다. 부모 클래스는 안 씀 (= 위에서 부모 클래스 호출하는 내용을 지워서 그렇다.)
    open fun calculator() : Int {
        println("첫번째 숫자 입력 결과 = ${num1}")
        println("두번째 숫자 입력 결과 = ${num2}")
        return 0     // 이 리턴 값은 코드에 영향이 없음
    }
}

// 여기서부터 각각의 숫자를 받아 부모 클래스에서 정의한 후 여기로 다시 넘겨 연산한다. 그리고 그걸 다시 리턴해준다.
class AddOperation(number1:Int, number2: Int) : Calculator(number1, number2) {
    override fun calculator() : Int {  // 여기서 오버라이딩 하고 (당연히 리턴 타입은 부모 클래스에 맞춰서 Int 타입이다)
        super.calculator() // 이렇게 하면 부모 클래스의 메소드 함수 내용을 상속 받을 수 있다.
        return num1 + num2
    }
}

class SubstractOperation(number1:Int, number2: Int) : Calculator(number1, number2) {
    override fun calculator() : Int {
        super.calculator()
        return num1-num2
    }
}

class MultiplyOperation(number1:Int, number2: Int) : Calculator(number1, number2) {
    override fun calculator() : Int {
        super.calculator()
        return num1 * num2
    }
}

class DivideOperation(number1:Int, number2: Int) : Calculator(number1, number2) {
    override fun calculator() : Int{
        super.calculator()
        return num1 / num2
    }
}