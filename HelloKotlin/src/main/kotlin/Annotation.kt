
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
@Repeatable
annotation class Annotation(val why: String)

@Annotation("Just")
class Asd()

@Annotation("Just")
fun annotatedFun(){

}

fun main(){
    Asd::class.annotations.filterIsInstance<Annotation>().forEach { println(it.why) }
    ::annotatedFun.annotations.filterIsInstance<Annotation>().forEach { println(it.why) }
}