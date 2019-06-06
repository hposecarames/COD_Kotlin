
class Xogador (private var dorsal: Int, private var demarcacion: String, id: Int, nome: String, apelido: String, idade: Int):
    Seleccion(id, nome, apelido, idade) {

    fun xogarPartido(){

    }

    fun entrenar(){

    }

    override fun viaxar(){
        println("Viaxan os xogadores")
    }

    override fun toString(): String {
        return super.toString() + "\nDorsal: $dorsal \nDemarcación: $demarcacion"
    }
}