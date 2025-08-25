/*
	Name exercise: Force
	Description: 
Enunciado: Crea un diagrama de flujo que solicite una masa (m) y una aceleración (a) y calcule la fuerza (F) aplicando la fórmula: 
F=m×aF = m \times a 
Condiciones adicionales: 
 Se debe acumular la suma total de todas las fuerzas calculadas. 
 Se debe contar cuántos cálculos se han realizado. 
 El programa finaliza cuando el usuario ingresa una masa o aceleración negativa. 
	Autor: Yully Diaz
	Date: march 15th 2025
*/

let force;

let mass=6;
let acceleration=3;
let totalAmount=0;
let counter=0;

while(mass>=0 && acceleration>=0){
    force=mass*acceleration;
    totalAmount=totalAmount+force;
    counter=counter+1;
    console.log(force);
}
console.log(counter);
console.log(totalAmount);