package JAVA.Boolean;
//Se utilizan atributos como verdadero, falso, encendido, y apagado son los que se manejan como datos boleanos por lo tanto, se implementan en el ejercicio.
class BooleanSystem {

    //Se utilizan modificadores de acceso privados
    private boolean onState;
    private boolean offState;

    //Implementación de un contructor para los atributos con parámetros
    public BooleanSystem() {
        this.onState = true;
        this.offState = false;
    }

    public BooleanSystem(Boolean onState, Boolean offState) {
        this.onState = (onState != null) ? onState : true;
        this.offState = (offState != null) ? offState : false;
    }

    //En esta sección empleamos el encapsulamiento aplicando get y set a los atributos
    public boolean getOnState() {
        return this.onState;
    }

    public void setOnState(boolean newOnState) {
        this.onState = newOnState;
    }

    public boolean getOffState() {
        return this.offState;
    }

    public void setOffState(boolean newOffState) {
        this.offState = newOffState;
    }

    //En esta parte de la codificación aplicamos un metodo con return en donde esperamos que el programa regrese el estado del sistema
    public boolean systemActive() {
        boolean isActive = this.onState && !this.offState;
        return isActive;
    }

    //Por último implementamos un metodo void para la ejecución del programa.
    public void displaySystemState() {
        System.out.println("ESTADO DEL SISTEMA");
        System.out.println("Sistema On: " + this.onState);
        System.out.println("Sistema Off: " + this.offState);
    }
}
