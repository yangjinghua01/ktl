//默认是puclic final class Person 不能被人家继承的 abstract 相当于open
abstract class Per :Callback{
    override fun callbackMethod(): Boolean {
        TODO("Not yet implemented")
    }
    abstract fun initView():Int
}