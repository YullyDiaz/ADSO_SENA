package JAVA.Number;

//Se utilizan atributos como Teléfono y Edad para realizar el ejercicio.
class NumberData {

    //Se utilizan modificadores de acceso privados
    private long phone;
    private int age;

    //Implementación de un contructor para los atributos con parámetros
    public NumberData() {
        this.phone = 1234567890L;
        this.age = 25;
    }

    public NumberData(Long phoneData, Integer ageData) {
        this.phone = (phoneData != null) ? phoneData : 1234567890L;
        this.age = (ageData != null) ? ageData : 25;
    }

    //En esta sección empleamos el encapsulamiento aplicando get y set a los atributos
    public long getPhone() {
        return this.phone;
    }

    public void setPhone(long newPhone) {
        if (newPhone > 0) {
            this.phone = newPhone;
        } else {
            throw new IllegalArgumentException("El teléfono debe ser un número válido");
        }
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int newAge) {
        if (newAge >= 0 && newAge <= 120) {
            this.age = newAge;
        } else {
            throw new IllegalArgumentException("La edad debe ser un número entre 0 y 120");
        }
    }

    //En esta parte de la codificación aplicamos un metodo con return en donde esperamos que el programa nos regrese el número de teléfono formateado
    public String formatPhoneNumber() {
        String phoneString = String.valueOf(this.phone);
        if (phoneString.length() == 10) {
            return "(" + phoneString.substring(0, 3) + ") " + phoneString.substring(3, 6) + "-" + phoneString.substring(6);
        }
        return phoneString; 
    }

    //Por último implementamos un metodo void para la ejecución del programa.
    public void displayNumberData() {
        System.out.println("DATOS NUMÉRICOS");
        System.out.println("Teléfono: " + this.phone);
        System.out.println("Edad: " + this.age);
        System.out.println("Teléfono formateado: " + this.formatPhoneNumber());
    }
}

