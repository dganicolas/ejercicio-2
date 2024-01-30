/**Crear una clase Persona que tenga nombre, peso (en kg con decimales), altura (en metros con decimales) y su imc. HECHO
Crear un constructor primario con todos los atributos, excepto nombre e imc. Este último atributo se calcula en función del peso y la altura. Por tanto no se debe poder modificar, pero si consultar. HECHO,
*/
/**
 * 
 * */
class Persona(var peso:Double,var altura:Double){
    var nombre: String? ="usuario"
        set(value) {
            try{

                require(value != "" && value != null){
                    "error"
                }
                field = value
            }catch (e:Exception) {
                field = "usuario"
            }
        }
    var imc= 0.0

        get(){
            return peso*altura
        }
    //-- Crear un constructor secundario que también incluya el nombre de la persona cómo parámetro.
    constructor(nombre:String, peso:Double, altura:Double):this(peso, altura){

        this.nombre=nombre
    }

    //Implementa el método toString, representación del objeto en forma de String: override fun toString() = "". (Pulsa Ctrl+o)
    override fun toString(): String {
        return "La persona es ${this.nombre} con un peso de ${this.peso} y una altura de ${this.altura} y su imc es de ${this.imc}"
    }
    fun comparar(persona: Any, personaComparar: Any){
        var comprobar: Boolean = persona.equals(personaComparar)
        if (comprobar ==false){
            println("las personas no son iguales")
            //println("las personas ${persona.nombre} y ${personaComparar.nombre}")
        }else{
            println("las personas son iguales")
        }
    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Persona) return false

        if (this.nombre != other.nombre) return false
        if (this.altura != other.altura) return false
        if (this.peso != other.peso) return false
        return true
    }
}
fun main() {
    /**
    *

--




En el main() a) crear 3 personas diferentes (la primera sin nombre) utilizando el constructor primario y secundario y
* b) mostrarlas por consola. A continuación, realizar lo siguiente:


.

    * */

    /**
     * Sobre la persona 1:
     *   a) modificar su nombre y para ello debes solicitarlo al usuario por consola. No puede ser nulo o vacio. -----
     * * b) Mostrar por consola sólo el nombre, peso y altura.---------
     * */
    print("¿dame el nombre del usuario?")
    val persona1 = Persona(readln(),23.0,23.0)
    println(persona1)
    /**
     * Sobre la persona 3:
     * a) Mostrar el peso, altura y imc.
     * b) Modificar la altura, por ejemplo a 1.80
     * c) Mostrar el peso, altura y imc
     * */
    val persona3 = Persona("diego",73.0,1.80)
    println(persona3)
    /**
     * Sobre la persona 2;
     * a) Modificar la altura para que tenga el mismo valor que la persona 3.---
     * b) Mostrar la persona 2 y persona 3.
     * c) Comparar si las dos personas son iguales, y mostrar el resultado.
     * d) Implementa el método equals():boolean (Pulsa Ctrl+o).
     * e) Ejecutar la comparación.
     * */
    val persona2 = Persona("alberto",23.0,1.80)
    println(persona2)
    println(persona2.comparar(persona2,persona3))
}