/*
	Name exercise:acceleration of an object
	Description: 8. Cálculo de la aceleración de un objeto sometido a una fuerza
Enunciado: Diseñar un diagrama de flujo que permita calcular la aceleración de un
objeto sometido a una fuerza dada su masa.
• Pedir al usuario:
o Masa del objeto (kg)
o Fuerza aplicada (N)
• Calcular la aceleración co la segunda ley de Newton:
Fórmula:
• Determinar si la aceleración es alta o baja según un umbral de 5 m/s².
	Autor: Yully Diaz
	Date: march 15th 2025
*/

let acceleration;

let mass=8;
let force=2;

acceleration=force/mass;

if(acceleration>5){
    console.log("High");
}
else{
    console.log("Low");
}