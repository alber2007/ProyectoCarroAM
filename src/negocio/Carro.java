package negocio;

public class Carro {
private int potencia;
double velocidad;

    /*
    metodos para ingresar informacion
    set()
    "siempre" el tipo de retorno es void
    siempre reibe un paràmetro
    parametro generalmente es del mismo tipo del atributo
     */

    public void setPotencia(int potencia){
        //se actualiza solo si el dato es correcto
            if(potencia > 0)
            this.potencia = potencia;}
    //se actualiza solo si el dato es correcto
    public void setVelocidad(double velocidad){
        //se actualiza si el dato es correcto si no se setea
        if(velocidad<0)
            velocidad = 0;
        this.velocidad = velocidad;
    }

    /*
    metodos para sacar informacion
    get()
    siempre retorna valor
    el tipo de retorno generalmente es del mismo tipo del atributo
     */

    public int getPotencia(){
        return potencia;
    }
    public double getVelocidad(){
        return velocidad;
    }

        public void acelerar(){
            velocidad+= potencia;
        }

        public void frenar(){
            velocidad /= 2;
    }



}





