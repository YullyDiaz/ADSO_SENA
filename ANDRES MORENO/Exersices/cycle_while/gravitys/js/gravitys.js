/*
	Name exercise: Gravitys
	Description: 
Enunciado: Se calculará el peso (W) de un objeto en diferentes planetas usando la ecuación: 
W=m×gW = m \times g 
Donde g es la gravedad del planeta. El usuario podrá elegir: 
 Tierra (9.81 m/s²) 
 Marte (3.71 m/s²) 
 Júpiter (24.79 m/s²) 
Condiciones adicionales: 
 Se debe acumular la suma total de todos los pesos calculados. 
 Se debe contar cuántas veces se ha realizado un cálculo. 
 El programa se repetirá hasta que el usuario ingrese una masa negativa.
	Autor: Yully Diaz
	Date: march 15th 2025
*/

let weightEarth;
let weightMars;
let weightJupiter;

let gravityEarth=9.81;
let gravityMars=3.71;
let gravityJupiter=24.79;
let counter=0;
let weightTotal=0;
let mass=6;

while(mass>=0){
    weightEarth=mass*gravityEarth;
    weightMars=mass*gravityMars;
    weightJupiter=mass*gravityJupiter;
    weightTotal=weightEarth+weightMars+weightJupiter;
    counter=counter+1;    
    console.log(weightEarth);
    console.log(weightMars);
    console.log(weightJupiter);
}
console.log(weightTotal);
console.log(counter);