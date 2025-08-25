/*
	Name exercise:End note
	Description: Ejercicio 6: Cálculo de la Energía Potencial Gravitatoria 
Enunciado: Se calculará la energía potencial gravitatoria (Epg) de un objeto según la ecuación: 
Epg=m×g×hEpg = m \times g \times h 
Donde: 
 m es la masa del objeto. 
 g es la aceleración de la gravedad (9.81 m/s² en la Tierra). 
 h es la altura desde la que se encuentra el objeto. 
Condiciones adicionales: 
 Se debe acumular la suma total de la energía potencial calculada. 
 Se debe contar cuántas veces se ha calculado la energía potencial. 
 El programa se repetirá hasta que el usuario ingrese una altura negativa. 
	Autor: Yully Diaz
	Date: march 15th 2025
*/

let gravitationalPotencialEnergy;

let accumulated=0;
let counter=0;
let mass=9;
let height=5;
let accelerationGravity=9.81;

while(heihg>0){
    gravitationalPotencialEnergy=mass*accelerationGravity*height;
    accumulated=accumulated+gravitationalPotencialEnergy;
    counter=counter+1;
    console.log(gravitationalPotencialEnergy);
}
console.log(accumulated);
console.log(counter);