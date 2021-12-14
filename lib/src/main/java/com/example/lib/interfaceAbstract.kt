package com.example.lib

// 코틀린 인터페이스와 추상클래스
// 개요
//   인터페이스 interface : 여러 클래스들의 공통적인 속성과 행동을 나타낼 수 있다
//     클래스는 어떻게 how 구현하는가에 초점을 두지만, 인터페이스는 무엇 what 을 구현해야 하는지를 나타낸다
//     인터페이스를 사용하면 상속 관계가 없는 클래스들 간에 속성과 함수를 공유할 수 있다
//   추상클래스 abstract class : 인터페이스와 클래스의 특성을 혼합한 클래스 타입
//     서브 클래스를 가질 수 있고 생성자도 정의할 수 있다

open class Ant {
    var name = "Ant"

    override fun toString(): String {
        return "이름 : $name"
    }

    open fun place(): String {
        return name + "는 동굴에서 산다."
    }


}


class WaterAnt : Ant() {
    override fun place(): String {
        return name + "는 water에서 산다."
    }

    fun show(): String {
        return "water 주변"
    }

}

fun main(args: Array<String>){
    val ant: Ant = Ant()
    println( ant.toString() )
    println( ant.place() )

    val want: WaterAnt = WaterAnt()
    println( want.toString() )
    println( want.place() )
    println( want.show() )
}