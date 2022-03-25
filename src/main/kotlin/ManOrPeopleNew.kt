fun main() {
    val likes = 11
    val manOrPeople = if (likes % 10 == 1 && likes != 11 && likes % 100 != 11) "человеку" else "людям"
    println("Понравилось $likes $manOrPeople")
}