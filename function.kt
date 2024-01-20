
fun setUser(name: String, jurusan: String): String {
    return "$name jurusan $jurusan di SMKN 9"
}
fun printUser(name: String) {
    println("Your name is $name")
}
fun rapot(name: String, nilai: Int, rangking: Int): String{
      return("nilai $name totalnya $nilai mendapatkan rangking $rangking ") 
}
fun sekolah(name: String, jurusan: String){
     println("$name jurusan $jurusan di smkn 9 ") 
    
}
fun lulus(name: String, mtk: Int, bing: Int, bind: Int, pkn: Int, cek: String) : String{
    return ("siswa bernama $name dengan deskripsi nilai berikut:\nnilai Matematika $mtk \nnilai Bing \t$bing \nnilai Bind \t$bind \nnilai pkn \t$pkn \ndinyatakan \t$cek")
}
fun main() {
    val user = setUser("Jeno", "TKJ")
    println(user)
    sekolah("putri", "RPL")
    printUser(user)
    
    val nilai = rapot("Budi", 350, 10)
    println(nilai)
    
    val mlm = lulus ("Udin", 80, 90, 100, 75, "LULUS")
    println(mlm)
}
