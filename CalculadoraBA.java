//Brandon Isaías Ampérez Aldana 0909-21-4628
package calculadorab;


public class CalculadoraBA extends CalculadoraEspecialBA{
    
 //Area de atributos
    String tipoCalculadora;
    int cantidadDeTeclas;
    int anchoPantalla;
    String color;
    String marca;
    int ancho;
    int alto;
    
    
    //Atributos agregados
     double raiz;
     int potencia;
     long redondear;
     double numeroAleatorio;
     double sumarB;
     double restaB;
     double multiB;
     double divB;
     private String [] vectorTransacciones;
     private int indiceVector;
     double resultado;
     private String[] registrarTransaccion;
    
    //Constructor - Funciona para inicializar variables y recursos de clase
    public CalculadoraBA(){
        this.tipoCalculadora="Calculadora BÃ¡sica";
        this.cantidadDeTeclas=50;
        this.anchoPantalla=15;
        this.marca="Casio";
        vectorTransacciones= new String [100];//inicializo el vector
         this.indiceVector=0;  
         this.registrarTransaccion(color, numeroAleatorio, sumarB, restaB);
                
    }
    //metodos
    
    public double sumar(double primerNumero, double segundoNumeroB){
        this.registrarTransaccion("suma", primerNumero, segundoNumeroB, primerNumero+segundoNumeroB);
        return sumarB =primerNumero+segundoNumeroB;
    }

    public double restar(double primerNumero, double segundoNumeroB){
        this.registrarTransaccion("resta", primerNumero, segundoNumeroB, primerNumero-segundoNumeroB);
        return restaB = primerNumero-segundoNumeroB;
    }

    public double dividir(double primerNumero, double segundoNumeroB){
        this.registrarTransaccion("dividir", primerNumero, segundoNumeroB, primerNumero/segundoNumeroB);
        return divB = primerNumero/segundoNumeroB;
    }

    public double multiplicar(double primerNumero, double segundoNumeroB){
        this.registrarTransaccion("multipplicar", primerNumero, segundoNumeroB, primerNumero*segundoNumeroB);
        return multiB = primerNumero*segundoNumeroB;
    }
    //METODOS AGREGADOS POR SERVICIO BA
    public double raizBA(double primerNumero){
      return raiz =(double)Math.sqrt (primerNumero);   
    }
    public int potenciaBA(int primerNumeroB, int segundoNumeroB){
        return potencia = (int) Math.pow (primerNumeroB, segundoNumeroB);
    }
    public double redondearBA(double primerNumero){
         return redondear = (long) Math.round (primerNumero);
    }
     public double numeroAleatorioBA(){
         return numeroAleatorio =(double) Math.random ();
    } 
    // Distintos GET Y SET
    public String getMarca() {
        return marca;
    }
    public String getTipo() {
        return this.tipoCalculadora;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnchoPantalla() {
        return anchoPantalla;
    }

    public void setAnchoPantalla(int anchoPantalla) {
        this.anchoPantalla = anchoPantalla;
    }

    public void setColor(String cualquierColor){
        this.color=cualquierColor;
    }

    public String getColor(){
        return this.color;
    }
    
    //Arreglos agregados
    
     public void registrarTransaccion(String tipo, double primerParametro, double segundoParametro, double resultado){
      indiceVector=indiceVector+1;
      vectorTransacciones[indiceVector]= primerParametro+""+ tipo+""+segundoParametro+" resultado: "+resultado;
        
    }
     
     public void mostrarTransacciones(){
          try{   
              System.out.println(vectorTransacciones.length);
            for (int i=1; i<vectorTransacciones.length;i++){
                if(vectorTransacciones[i]!=null){
                    System.out.println(vectorTransacciones[i]);
                }
            } 
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }
     }
     
       public void almacenarNumero(int numero){
        this.vector[indiceVector]=numero;
        this.indiceVector=this.indiceVector+1;
    }

    public void  mostrarNumeros(){
        for(int i=0; i<this.vector.length; i++){
            if(this.vector[i]!=0){
                System.out.println(vector[i]);
    }
}
}
}
    
    
   