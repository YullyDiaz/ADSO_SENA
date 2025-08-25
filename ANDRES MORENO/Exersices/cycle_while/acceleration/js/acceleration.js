/*
	Name exercise:End note
	Description: 
Enunciado: Si la fuerza aplicada es cero, el objeto permanece en reposo. Si la fuerza es distinta de cero, se calcula la aceleración con: 
a=Fma = \frac{F}{m} 
Y se actualiza la velocidad: 
v=v+a×tv = v + a \times t 
donde t = 1s. 
Condiciones adicionales: 
 Se debe contar cuántos segundos el objeto ha estado en movimiento. 
 Se debe acumular la distancia total recorrida con: 
d=v×td = v \times t 
 El programa finaliza cuando el usuario ingresa una fuerza de 0. 
	Autor: Yully Diaz
	Date: march 15th 2025
*/

let acceleration;

let force=9;
let mass=5;
let time=9;
let distance=4;
let velocity=4;
let counter=0;
let accumulated=0;

while(force>0 && force<0){
    acceleration=force/mass;
    velocity=(velocity+acceleration)*time;
    distance=velocity/time;
    accumulated=accumulated+distance;
    counter=counter+1;

    console.log(force);
    console.log(mass);
}
console.log(accumulated);
console.log(counter);
