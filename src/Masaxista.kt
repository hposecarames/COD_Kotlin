
class Masaxista (var titulacion: String?, var anosExperiencia: Int, id: Int, nome: String, apelido: String, edade: Int) :
Seleccion(id, nome, apelido, edade) {


    fun darMasaxes() {

    }

    override fun viaxar() {
       println("Viaxan os masaxistas")
    }



    override fun toString(): String {
        return super.toString() + "\nTitulación = $titulacion \nAnos de experiencia = $anosExperiencia"
    }


}