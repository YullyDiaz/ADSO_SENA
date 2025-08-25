/*
	Name exercise: Force gravitational
	Description: 6. Comparación de dos cuerpos en caída libre
Enunciado: Diseñar un diagrama de flujo que reciba la masa de dos cuerpos en caída
libre, calcule la fuerza gravitacional de cada uno y determine:
• Cuál cuerpo ejerce mayor fuerza gravitacional.
• Si ambas fuerzas son iguales.
Fórmula (Segunda Ley de Newton considerando gravedad):
Donde g = 9.81 m/s² (gravedad terrestre).
	Autor: Yully Diaz
	Date: march 15th 2025
*/

let forceOne;
let forceTwo;

let massOne=6;
let massTwo=3;
let gravity=9.81;

forceOne=massOne*gravity;
forceTwo=massTwo*gravity;

if(forceOne==forceTwo){
    console.log("Both force are equal");
}

if(forceOne>forceTwo){
    console.log("Force one is greater");
}
else{
    console.log("Force two is greater");
}
