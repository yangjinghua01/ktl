class Test {
    val I = "AAA"
//    这不是一个内部类，所以拿不到外部类的成员
    class Sub{
        fun show(){
            println()
        }
    }
//    这才是内部类
    inner class Sub2{
        fun show(){
            println(I)
        }
    }
}