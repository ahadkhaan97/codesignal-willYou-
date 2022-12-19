fun main() {
    print(solution(young = true, beautiful = true, loved = true))
}

fun solution(young: Boolean, beautiful: Boolean, loved: Boolean): Boolean {
    if ((young && beautiful && !loved) || ((!young || !beautiful) && loved))
        return true

    return false
}