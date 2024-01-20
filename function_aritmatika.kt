fun jumlah(a: Int, b: Int): Int{
    return a + b 
}

fun kurang(a: Int, b: Int): Int{
    return a - b
}
fun kali(a: Int, b: Int): Int{
    return a * b
}

fun bagi(a: Double, b: Double): Double{
    return a / b
}


fun segitiga(a: Int, t: Int): Double{
    return 0.5 * a * t
}

fun persegipnjng(p: Int, l: Int): Int{
    return p * l
}

fun main() {
    val add = jumlah (10, 23)
    println("ini adalah hasil penjumlahan: $add")
   
   val min = kurang (23, 10)
   println("ini adalah hasil pengurangan: $min")
   
   val mul = kali (23, 10)
   println("ini adalah hasil perkalian: $mul")
   
    val dif = bagi (23.0, 10.0)
   println("ini adalah hasil pembagian: $dif")
   
   val pp = persegipnjng(20, 10)
   println("ini adalah hasil luas persegi panjang: $pp")
   
   val sgt = segitiga(20, 10)
   println("ini adalah hasil luas segitiga: $sgt")
}
