//Elaborar un algoritmo paa obtener el resultado del escrutinio en las eleciones del delegado del colegio, considerar que hay 160 electores y se han presentado 3 candidatos, todos  votaron, el algoritmo debe declarar al ganador por mayoria simple.
package exerciseT_Nine;

import java.util.Scanner; //Importa la clase Scanner para leer los datos igresados desde la consola.
public class Winner { //Se define la clase Winner
    public static void main(String[] args) { //Define el metodo main para la entrada.
        Scanner input = new Scanner(System.in);
        //Se declaran las variables
        int numberOne,numberTwo,numberThree,numberFour,counter,numberFive,numberSix;
        numberOne = 0;
        numberTwo= 0;
        numberThree = 0;
        numberFour = 0;

        for (counter = 0; counter <= 160; counter++){ //Ciclo en donde se ingresan los votos.
            counter = counter ++; // Incrementa el contador para que se detenga al llegar a 160 votos.
            System.out.println("Ingresar el voto");
            numberFive =input.nextInt();

            switch (numberFive) { //Se utiliza un switch para clasificar los votos.
                case 1:
                numberOne = numberOne + 1;
                break;

                case 2:
                numberTwo = numberTwo + 1;
                break;

                case 3:
                numberThree = numberThree + 1;   
                break;
            
                default:
                numberFour = numberFour + 1;
                break;
            }
            
            if ((numberOne > numberTwo) && (numberTwo > numberThree) && (numberOne > numberFive)){ // Verifica si el candidato 1 tiene más votos que los demás.
                numberSix = numberOne;

            }else if((numberTwo > numberThree) && (numberTwo > numberFour)){
                numberSix = numberTwo;

            }else if(numberThree > numberFour){
                numberSix = numberThree;
            }else{
                numberSix = numberFour;
            }
            System.out.println("Los votos del candidato 1 :" +numberOne);
            System.out.println("Los votos del candidato 2 :" +numberTwo);
            System.out.println("Los votos del candidato 3 :" +numberThree);
            System.out.println("Los votos nulos son: " +numberSix);
        }
        input.close();
    }
    
}
