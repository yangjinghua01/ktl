//public final class person 默认就是这样的不能被继承
open class person(id:Int) { //主构造
//    次构造
    constructor(id:Int, name:String):this(id){

    }
    constructor(id: Int,sex:Char):this(id){

    }
}