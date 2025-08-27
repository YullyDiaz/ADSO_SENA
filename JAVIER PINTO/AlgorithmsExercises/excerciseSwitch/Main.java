package excerciseSwitch;

import java.util.Scanner; // Importa la clase Scanner para leer los datos ingresados desde la consola.
public class Main { // Define la clase Main.
    public static void main(String[] args) { // Define el método main para la entrada.
        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa el numero del caso seleccionado, los cuales van del 1 al 32");
        int option = input.nextInt();
        int counter;
        double numberOne, numberTwo, numberThree, numberFour, numberFive, numberSix, numberSeven, numberEight;
        String textOne, textTwo, textThree, op;
        char texOne;
        switch (option) {
            case 1:
            System.out.println("CASO 1: Calcular la distancia recorrida por un móvil");
            /*Inicio del ingreso de los valores*/
            System.out.println("Ingresar la velocidad");
            numberOne = input.nextInt(); 
            System.out.println("Ingresar el tiempo");
            numberTwo = input.nextInt();
            /*Fin del ingreso de los valores*/
            numberThree = numberOne * numberTwo; //Se realiza la operacion
            System.out.println("La distancia recorrida es: " + numberThree); //Se imprime el resultado
            break;

            case 2:
            System.out.println("CASO 2: Calcular el promedio de tres notas");
            System.out.println("Ingresar la nota #1");
            numberOne = input.nextInt();
            System.out.println("Ingrese la nota #2");
            numberTwo = input.nextInt();
            System.out.println("Ingrese la nota #3");
            numberThree = input.nextInt();
            /*Fin del ingreso de valore.*/
            numberFour = (numberOne + numberTwo + numberThree) / 3;  //Se realiza la operacion
            System.out.println("El promedio es: " + numberFour);
            break;
            
            case 3:
            System.out.println("Ingresar las respuestas correctas");
            numberOne =input.nextInt();
            System.out.println("Ingresar las respuestas Incorrectas");
            numberTwo =input.nextInt();
            System.out.println("Ingresar las respuestas en blanco");
            numberThree =input.nextInt();
            /*Fin del ingreso de valore.*/
            /*Inicio de las operaciones de los puntajes.*/
            numberFour = numberOne * 4;
            numberFive = numberTwo * (-1);
            numberSix= numberFour + numberFive;
            /*Fin de las operaciones de los puntajes.*/
            System.out.println("Las respuestas en blanco son: " + numberThree);
            System.out.println("El puntaje final es: " + numberSix);
            break;
            
            case 4:
            System.out.println("CASO 4: Calcular el total de puntos obtenidos en un torneo de futbol");
            System.out.println("Ingresar los partidos ganados");
            numberOne =input.nextInt();
            System.out.println("Ingresar los partidos empatados");
            numberTwo =input.nextInt();
            System.out.println("Ingresar los partidos perdidos");
            numberThree =input.nextInt();
            /*Fin del ingreso de valore.*/
            /*Inicio de las operaciones de los puntajes.*/
            numberFour = numberOne * 3;
            numberFive = numberTwo * 1;
            numberSix= numberFour + numberFive;
            /*Fin de las operaciones de los puntajes.*/
            System.out.println("El total de partidos son: " + numberSix);
            System.out.println("El total de partidos perdidos son: " + numberThree);
            break;

            case 5:
            System.out.println("CASO 5: Calcular la planilla de un empleado");
            /*Inicio del ingreso de valore.*/
            System.out.println("Ingresar las horas laboradas");
            numberOne =input.nextInt();
            System.out.println("Ingresar la tarifa por hora");
            numberTwo =input.nextInt();
            /*Fin del ingreso de valore.*/
            numberThree = numberOne * numberTwo;
            System.out.println("Planilla: " + numberThree);
            break;

            case 6:
            System.out.println("CASO 6: Calcular el área de un triángulo");
            System.out.println("Ingrese el lado A del traingulo");
            numberOne =input.nextInt();
            System.out.println("Ingrese el lado B del traingulo");
            numberTwo =input.nextInt();
            System.out.println("Ingrese el lado C del traingulo");
            numberThree =input.nextInt();
            /*Fin del ingreso de valore.*/
            /*Inicio de las operaciones.*/
            numberFour = (numberOne + numberTwo + numberThree) / 2;
            numberFive = Math.sqrt( numberFour * (numberFour - numberOne) * (numberFour - numberTwo) * (numberFour - numberThree));
            /*Fin de las operaciones.*/
            System.out.println("El area del triangulo es: " + numberFive);
            break;

            case 7:
            System.out.println("CASO 7: Calcular la cantidad de CDs que se pueden grabar en un disco duro");
            System.out.println("Ingresar el numero de GB del disco duro");
            numberOne =input.nextInt();
            /*Inicio de las operaciones.*/
            numberTwo = numberOne * 1.024;
            numberThree = Math.ceil((numberTwo / 700) + 2); //Se coloca +2 ya que solo asi logra ser veridico realizando el proceso por otro medio.
            /*Fin de las operaciones.*/
            System.out.println(numberThree);

            break;

            case 8:
            System.out.println("CASO 8: Calcular la distancia entre dos puntos en un plano cartesiano");
            System.out.println("Ingresar el punto A");
            numberOne =input.nextDouble();
            System.out.println("Ingresar abcisa B");
            numberTwo =input.nextDouble();
            System.out.println("Ingresar ordenada A");
            numberThree =input.nextDouble();
            System.out.println("Ingresar ordenada B");
            numberFour =input.nextDouble();
            /*Inicio de las operaciones.*/
            double deltaX = numberTwo - numberOne;
            double deltaY = numberFour - numberThree;
            numberFive = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
            /*Fin de las operaciones.*/
            System.out.println("La distancia es: " + numberFive);
            break;

            case 9:
            System.out.println("CASO 9: Calcular si una persona debe solicitar su CUIL");
            System.out.println("Ingresar su año de nacimiento");
            numberOne =input.nextInt();
            System.out.println("Ingresar el año actual");
            numberTwo =input.nextInt();
            numberThree =numberTwo - numberOne;
            //Condicional para determinar si debe solicitar el CUIL
            if ( numberThree > 17){
                System.out.println("Debe sacar su CUIL");
            }
            else {
                System.out.println( "No debe sacar su CUIL todavia");
            }
            break;
    

            case 10:
            System.out.println("CASO 10: Calcular la diferencia de edad entre dos hermanos");
           System.out.println("Ingresar la edad del primer hermano");
            numberOne =input.nextInt();
            System.out.println("Ingresar la edad del segundo hermano");
            numberTwo =input.nextInt();
            /*Inicio del ingreso de valore.*/
            if (numberOne > numberTwo){
                numberThree = numberOne - numberTwo;
                System.out.println("El primer hermano es el mayor, por " +numberThree);
            }
            else {
                numberThree = numberTwo - numberOne;
                System.out.println("El segundo hermano es el mayor por " + numberThree);
            }
            System.out.println("La diferencia de edades es: " + numberThree);
            break;

            case 11:
            System.out.println("CASO 11: Calcular si un empleado recibirá incentivos por su producción semanal");
            System.out.println("Ingresar la producción del dia lunes");
            numberOne =input.nextInt();
            System.out.println("Ingresar la producción del dia Martes");
            numberTwo =input.nextInt();
            System.out.println("Ingresar la producción del dia Miercoles");
            numberThree =input.nextInt();
            System.out.println("Ingresar la producción del dia Jueves");
            numberFour =input.nextInt();
            System.out.println("Ingresar la producción del dia Viernes");
            numberFive =input.nextInt();
            System.out.println("Ingresar la producción del dia Sabado");
            numberSix =input.nextInt();
            /*Fin del ingreso de valore.*/
            /*Inicio de las operaciones.*/
            numberSeven = (numberOne + numberTwo + numberThree + numberFour + numberFive + numberSix);
            numberEight = numberSeven / 6;
            /*Fin de las operaciones.*/
            if (numberEight >= 100){
                System.out.println("Recibe Incentivos");
            }
            else {
                System.out.println("No recibe Incentivos");
            }
            break;

            case 12:
            System.out.println("CASO 12: Leer tres numeros y determinar el mayor.");
            System.out.println("Ingresa el primer numero");
            int numOne =input.nextInt();
            System.out.println("Ingresa el segundo numero");
            int numTwo =input.nextInt();
            System.out.println("Ingresa el tercer numero:");
            int numThree =input.nextInt();
            int largerNumber;
            if ((numOne > numTwo) && (numOne > numThree)){
                largerNumber = numOne;
            }
            else if (numOne > numThree){
                largerNumber = numTwo;
            }
            else{
                largerNumber = numThree;
            }
            System.out.println("El numero mayor es:" + largerNumber);
            break;

            case 13:
            System.out.println("CASO 13: Determinar el tipo de triángulo según sus lados");
            System.out.println("Ingresar el primer lado");
            numberOne =input.nextInt();

            System.out.println("Ingresar el segundo lado");
            numberTwo =input.nextInt();

            System.out.println("Ingresar el tercer lado");
            numberThree =input.nextInt();
            /*Fin del ingreso de valore.*/
            //Condicional donde se halla la calse de triangulo
            if ((numberOne != numberTwo) && (numberTwo != numberThree) && (numberThree != numberOne)){
                textOne = "Escaleno";
            }
            else if ((numberOne == numberTwo) && (numberTwo == numberThree)){
                textOne = "Equilatero";
            }
            else{
                textOne = "Isósceles";
            }
            System.out.println("El tipo de triangulo es:" + textOne);
            break;

            case 14:
            System.out.println("CASO 14: Convertir un número entero a su representación en números romanos");
            System.out.println("Ingresar un numero entero entre 1 y 10:");
            numberOne =input.nextInt();
            /*Fin del ingreso de valore.*/
            /*Inicio del Switch donde se presentan las opciones*/
            switch (option) {
                  case 1:
                        textOne = "I";
                  break;
                  case 2:
                        textOne = "II";
                  break;
                  case 3:
                        textOne = "III";
                  break;
                  case 4:
                        textOne = "IV";
                  break;
                  case 5:
                        textOne = "V";
                  break;
                  case 6:
                        textOne = "VI";
                  break;
                  case 7:
                        textOne = "VII";
                  break;
                  case 8:
                        textOne = "VIII";
                  break;
                  case 9:
                        textOne = "IX";
                  break;
                  case 10:
                        textOne = "X";
                  break;
            }
            /*Fin del Switch donde se presentan las opciones*/
            System.out.println("El numero en romano es:" + numberTwo);
            break;

            case 15:
            System.out.println("CASO 15: Calcular la bonificación de un vendedor según el monto de venta alcanzado");
            System.out.println("Ingrese el monto de venta alcanzado:");
            numberOne =input.nextInt();
            //Inicio de las operaciones
            if (numberOne >= 0 && numberOne <= 1000) {
                numberTwo = (0 * numberOne) / 100;
            }else if (numberOne >= 1000 && numberOne < 5000){
                numberTwo = (3 * numberOne) / 100;
            }else if (numberOne >= 5000 && numberOne < 20000){
                numberTwo = (5 * numberOne) / 100;
            }else if (numberOne >= 20000){
                numberTwo = (8 * numberOne) / 100;
            }else {
                numberOne = 0;     
            }
            //Fin de las operaciones
            //Se imprimen los resultados
            System.out.println("El total de bonificación es:" + numberTwo);
            break;

            case 16:
            System.out.println("CASO 16: Convertir un número entero del 1 al 5 a su representación en vocales");
             System.out.println("Ingresar un numero entero del 1 al 5:");
            numberOne =input.nextInt();
            //Inicio del Switvh donde se da a alegir
            switch (option) {
                  case 1:
                        textOne = "A";
                  break;
                  case 2:
                        textOne = "E";
                  break;
                  case 3:
                        textOne = "I";
                  break;
                  case 4:
                        textOne = "O";
                  break;
                  case 5:
                        textOne = "U";
                  break;
                  default:
                        textOne = "Valor incorrecto";
                  break;
            }
            //Fin del Switvh donde se da a alegir
            //Se imprimen los resultados
            System.out.println("El resultado es:" + textOne);
            break;

            case 17:
            System.out.println("CASO 17: Descomponer un número entero de dos dígitos en decenas y unidades");
            System.out.println("Ingresa un numero entero de dos digitos");
            int numb =input.nextInt();
            double integerquotient = Math.sqrt(numb / 10);
            double remainder  = numb - (integerquotient * 10);
            double tens = integerquotient;
            double units = remainder ;
            System.out.println("Decenas:" + tens);
            System.out.println("Unidades:" + units);
            break;

            case 18:
            System.out.println("CASO 18: Determinar si un número entero es par o impar");
            System.out.println("Ingresar un numero entero de dos digitos");
            System.out.println("Ingresa un numero entero diferente a cero");
            numberOne =input.nextInt();
            numberTwo = numberOne / 2;
            numberThree = numberOne - (numberTwo * 2);
            if (numberThree == 0){ //Condicional para sacar los pares e impares
                System.out.println("The number "+numberOne+" is even.");
            }else{
                System.out.println("The number "+numberOne+" is odd.");
            }
            break;
            
            case 19:
            System.out.println("CASO 19: Imprimir los primeros 5 números pares");
            System.out.println(numberOne);
            for (counter = 1; counter <= 4; counter++){ //Ciclo for para que me realice el proceso de los numeros pares.
                numberOne = numberOne + 2;
                System.out.println(numberOne);
            } 
            break;

            case 20:
            System.out.println("CASO 20: Calcular el sueldo promedio de empleados");
            System.out.println("Ingresar el numero de empleados");
            numberOne =input.nextInt();
            numberThree = 0;
            for (counter = 1; counter <= numberOne; counter++){ //Mostrará y hara la obtencion del promedio de los sueldos que se le haya indicado.
                System.out.println("Ingresar los sueldos de los empleados");
                numberTwo =input.nextDouble();

                numberThree = numberTwo + numberTwo;
            }
            numberFour = numberThree / numberOne;
            System.out.println("El sueldo promedio es:" + numberFour);
            break;

            case 21:
            System.out.println("CASO 21: Contar la cantidad de personas mayores y menores de edad");
            for (counter = 1; counter <= 3; counter++){ //Ciclo que nos va a pedir las edades y además a definir si es mayor de edad o no.
            System.out.println("Ingresa la edad");
            numberThree =input.nextInt();
            if (numberThree < 18 ){
                numberOne = numberOne + 1;
            }else{
                numberTwo = numberTwo + 1;
            }
        }
        System.out.println("La cantidad de mayores es:" + numberTwo);
        System.out.println("La cantidad de menores es:" + numberOne);
            break;

            case 22:
            System.out.println("CASO 22: Calcular el producto de dos números enteros sin usar el operador de multiplicación");
            System.out.println("Ingresar el primer numero entero");
            numberOne =input.nextInt();
            System.out.println("Ingresar el segundo numero entero");
            numberTwo =input.nextInt();
            numberThree = 0;
            for (counter = 1; counter <= numberTwo; counter++){ //Ciclo que realiza las sumas sucesivas.
                numberThree = numberThree + numberOne;
            }
            System.out.println("El producto es: " + numberThree);
            break;

            case 23:
            System.out.println("CASO 23: Muestra los 10 primeros nuemeros excepto los pares.");
             counter = 0;
            for (numberOne = 1; counter < 10; numberOne++){ //Ciclo que hace el proceso de mostrar los números enteros a partir de 1 excepto los pares.
                if(numberOne % 2 != 0){
                    System.out.println(numberOne);
                    counter++;
                }
            }
            break;

            case 24:
            System.out.println("CASO 24: Imprimir una serie de números a partir de un número ingresado");
            System.out.println("Ingresar la serie");
            numOne =input.nextInt();
            while (numOne < 1000){ //Ciclo que nos los numeros de serie.
                System.out.println(numOne);
                numOne = (numOne * 2 ) + 1;
            }
            break;

            case 25:
            System.out.println("CASO 25: Imprimir letras hasta que se ingrese una vocal");
            System.out.println("Ingresar las letras");
            texOne = "V";
            while (texOne.equals("V")){
                textTwo =input.next().charAt(0);
                System.out.println(textTwo);
                switch (texTwo) { //Verifica si la letra ingresada es una vocal o no.
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                    textOne = "R";
                    break;
                    default:
                    textOne = "V";
                    break;
                }
            }
            System.out.println("Fin del programa ingresaste una vocal");
            input.close();
            break;

            case 26:
            System.out.println("CASO 26: Numeros de serie menor que 1000");
            System.out.println(numberOne);
            System.out.println(numberTwo);
            while (numberThree < 100000){ //Ciclo que nos dara los numeros de la serie.
                System.out.println(numberThree);
                numberOne = numberTwo;
                numberTwo = numberThree;
                numberThree = numberOne + numberTwo;
                System.out.println(numberThree);
                break;
            }
            break;

            case 27:
            System.out.println("CASO 27: Realizar operaciones aritméticas básicas");
            System.out.println("Ingresa un operador aritmético");
            op =input.nextLine();
            System.out.println("Ingresa el primer número");
            numberOne =input.nextInt();
            System.out.println("Ingresa el segundo número");
            numberTwo =input.nextInt();

            switch (op) { //Los caso que se ejecutan segun los datos recibidos.
                case "+" :
                numberThree = numberOne + numberTwo;
                System.out.println(numberThree);
                break;

                case "-" :
                numberThree = numberOne - numberTwo;
                System.out.println(numberThree);
                break;

                case "*" :
                numberThree = numberOne * numberTwo;
                System.out.println(numberThree);
                break;

                case "/" :
                numberThree = numberOne * numberTwo;
                System.out.println(numberThree);
                break;

                default:
                numberThree = 0;
                break;
            }
            break;

            case 28:
            System.out.println("CASO 28: Contar vocales y consonantes en una secuencia de letras");
            System.out.println("Ingrese 10 letras");
            char letra =input.next().charAt(0);
            int NV,NC;
            NV = 0;
            NC = 0;
            for (counter = 1; counter <= 10; counter++){
                System.out.println(letra);
                switch (letra) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    NV = NV + 1;    
                    break;
                    default:
                    NC = NC + 1;
                        break;
                }
            }
            System.out.println("Numero de vocales" +NV);
            System.out.println("Numero de consonates" +NC);
            break;

            case 29:
                System.out.println("Ingrese el voto");
                int VE =input.nextInt();
                int G;
                int C1 = 0;
                int C2 = 0;
                int C3 = 0;
                int C0 = 0;
                for (counter = 1; counter <= 160; counter++){
                    System.out.println(VE);
                    switch (VE) {
                        case 1:
                        case 2:
                        case 3:
                        C1 = C1 + 1;     
                            break;
                    
                        default:
                        C0 = C0 + 1;
                            break;
                    }
                }
                if ((C1 > C2) && (C2 > C3) && (C1 > C0)){
                    G = C1;
                }else if((C2 > C3) && (C2 > C0)){
                    G = C2;
                }else if(C3 > C0){
                    G = C3;
                }else{
                    G = C0;
                }
                System.out.println("El ganador es:" +G);
            break;

            case 30:
                System.out.println("Ingrese el primer numero");
                num1 =input.nextInt();
                System.out.println("Ingrese el segundo numero");
                num2 =input.nextInt();
                result = (num1 + num2) / 2;
                System.out.println("El promedio de los numeros es:" + result);
                break;

             case 31:
            System.out.println("Ingrese un numero");
            num =input.nextInt();
            switch (num) {
                    case 1:
                    System.out.println("enero");
                        break;
                    case 2: 
                    System.out.println("febrero");
                    case 3:
                    System.out.println("Marzo");
                        break;
                    case 4:
                    System.out.println("Abril");
                        break;
                    case 5:
                    System.out.println("Mayo");
                        break;
                    case 6:
                    System.out.println("Junio");
                        break;
                    case 7:
                    System.out.println("Julio");
                        break;
                    case 8:
                    System.out.println("Agosto");
                        break;
                    case 9:
                    System.out.println("septiembre");
                        break;
                    case 10:
                    System.out.println("Octubre");
                        break;
                    case 11:
                    System.out.println("Noviembre");
                        break;
                    case 12:
                    System.out.println("Diciembre");
                        break;
                    default:
                    break;
            }

            case 32:
            System.out.println("ingrese un numero");
            num = input.nextInt();
            if(num == 0){
                System.out.println("El numero ingresado no puede ser cero");
            }
            for (counter = 1; counter <= num; counter++){
                if (num %  counter == 0){
                    System.out.println(counter);
                }
            }break;
            default:
                break;
        }
    }  
}
