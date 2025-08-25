/*
	Name exercise: friction of an object
	Description: 7. Cálculo de la Fricción de un Objeto sobre una Superficie
Enunciado: Diseñar un diagrama de flujo que calcule la fuerza de fricción entre un
objeto y la superficie sobre la que se mueve.
• Pedir al usuario:
o Masa del objeto (kg)
o Coeficiente de fricción (\mu)
o Aceleración gravitacional (g)
• Calcular la fuerza normal y la fuerza de fricción:
Fórmula:
• Si la fuerza de fricción es mayor a 50N, indicar que la fricción es alta.
• Si es menor a 50N, indicar que la fricción es baja.
	Autor: Yully Diaz
	Date: march 15th 2025
*/

let normalForce;
let forceFriction;

let mass=8;
let acceleration=3;
let coefficientFriction=5;

normalForce=mass*acceleration;
forceFriction=coefficientFriction*normalForce;

if(forceFriction>50){
    console.log("High");
}
else{
    console.log("low");
}