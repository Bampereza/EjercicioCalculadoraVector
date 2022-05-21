
package calculadorab;

/**
 *
 * @author aldan
 */
public class CalculadoraEspecialBA {
    
    private String tipoCalculadora;
    private int numeroDeTeclas;
    int[] vector;
    private double[] matriz;
    private int indiceVector;
    

    CalculadoraEspecialBA(){
        this.tipoCalculadora="Calculadora Especial";
    }
   
    CalculadoraEspecialBA(String tipo){
        this.tipoCalculadora=tipo;
    }
    
    CalculadoraEspecialBA(String tipo, int cantidad){
        this.tipoCalculadora=tipo;
        this.numeroDeTeclas=cantidad;
    }

    public String getTipoCalculadora() {
        return this.tipoCalculadora;
    }

    public void setTipoCalculadora(String tipoCalculadora) {
        this.tipoCalculadora = tipoCalculadora;
    }

    public int getNumeroDeTeclas() {
        return numeroDeTeclas;
    }

    public void setNumeroDeTeclas(int numeroDeTeclas) {
        this.numeroDeTeclas = numeroDeTeclas;
    }
   
      
 
}



