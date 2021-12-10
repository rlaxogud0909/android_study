package com.example.lib

public class MainClass {
    public fun printTest(){
        println("test")
    }
}

// JVM : 코틀린 소스코드 -> 바이트코드 변환 -> JVM 이 바이트코드 실행 -> 콘솔 출력
// 데이터타입 : 자바는 (기본데이터타입 8개 + 참조데이터타입), 코틀린은 모두 참조데이터타입
// 코틀린 내장(built-in) 타입 : String, Char, Boolean, Int, Double 과 컬렉션 타입 List, Set, Map
// 연산자(우선순위)
// 제어문(조건문, 반복문)
// 메소드(함수)
// ---------------------------
// 객체지향(추상화, 캡슐화, 상속, 다형성) -> 리팩토링 + 디자인패턴
// 쓰레드 IO, 네트워크

// 코틀린 REPL : 작은 코드 테스트해 보고 싶을 때 사용
// Tools > 코틀린 > 코틀린 REPL

// 변수, 상수, 타입
// 변수 선언하기 : 변수 정의 형식
//      var a : Int = 5
//      변수정의키워드(val, var) | 변수 이름 | 타입정의 | 대입연산자 | 대입값


fun main(args: Array<String>){
    example05()

//    example01()
//    example00()
//    example02()
//    example03()
//    example04()
}

private fun example05() {
    val userCount: Int = 10   // Int 타입 어노테이션 지정
    val singlStrength = 2.231 // Double 타입 추론
    val companyName = "OZ10"  // String 타입 추론

    // 타입 어노테이션을 지정하여 불변 변수를 선언할 때는 초깃값을 나중에 지정이 가능
    val bookTitle: String
    val iosBookType = false

    if (iosBookType) {
        bookTitle = "iOS App"
    } else {
        bookTitle = "Android App"
    }
    println(bookTitle)
//    bookTitle = "iOS App"
}


private fun example04() {
    val f : Short = 200
    val b = f.toByte()
    println(b)
}


// 사칙연산
private fun example03() {
    println(5 + 5)
    println(10 - 2)
    println(3 * 2)
    println(7 / 2)
    println(7 % 2)
    println(7 / 2.0)
}

// 타입
private fun example02() {
    // 논리형
    val b1 = true
    val b2 = false
    println(b1)

    // 문자형
    val c = 'A'

    // 정수형
    val num1: Byte = 127 // Byte -> 최대 127
    val num2: Short = 20 // Short -> 2byte
    val num3: Int = 30 // Int -> 4byte (Int: 디폴트값)
    val num4: Long = 40 //Long -> 8byte

    // 실수형
    val num5 = 10.3 // double 형 (8byte)
    val num6 = 10.3.toFloat() // float 형 (4byte)
}

private fun example01() {
    println("Welcome to Kotlin")
    for (i in 1..8) {
        println("i = $i")
    }
}

private fun example00() {
    println(1 + 2)
}