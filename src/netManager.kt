class netManager {
//    只有一个实例
    object Holder{
        val instance = netManager()
    }
//    看不到static 可以派生操作
    companion object{
//    全部都是 相当于java static
        fun getInstance():netManager{
           return Holder.instance
        }
    }
    fun showI(){
        println("da")
    }
}