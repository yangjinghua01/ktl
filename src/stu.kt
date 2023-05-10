class stu(id: Int) : person(id) {
//    在kt中全部是没有默认值的
//    在java中 成员有默认值，但是方法内部没有默认值
//    lateinit
    lateinit var name:String;
    var idnumber: Int = 0;
}