fun main() {
    ttt@ for (i in 1..10) {
        for (j in 1..10) {
            println("i:$i,j:$j")
            if (i == 5) {
                break//停止内循环
                break@ttt//停止标记循环
            }
        }
    }
    val person = person(1, "1")
    val u = user(1, sex = 2, name = "12")
    val (uid,uname,usex) =u.copy()
    println("$uid,$uname,$usex")
    var n = netManager()
    n.showI()

}
class  yjh{
    val I = "AA"
    fun show(){
        println(I)
        println(this.I)
        println(this@yjh.I)
    }
}