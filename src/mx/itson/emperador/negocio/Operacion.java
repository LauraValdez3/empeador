
package mx.itson.emperador.negocio;

public class Operacion {
    
     /**
     * Separa una cadena de texto a partir de la expresión coma.
     * @param valor Cadena de texto que será separada a partir de la expresión dada.
     * @return Array de string donde cada posición representa una división de la cadena de texto.
     */
        public String [] separar (String valor){
        String [] elementos = valor.split(",");
        return elementos;
    }
    
}
