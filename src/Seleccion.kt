
open class Seleccion (var id: Int, var nome: String, var apelido: String, var idade: Int ){

    fun concentrarse(){
        println("Concentrase a selección")
    }

    open fun viaxar(){
        println("Viaxa a seleccion")
    }
    override fun toString(): String {
        return "Id: $id\nNome: $nome\nApelido: $apelido\nIdade: $idade"
    }
}

