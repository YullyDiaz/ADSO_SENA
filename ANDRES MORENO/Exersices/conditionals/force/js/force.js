/*
	Name exercise: force of an object
	Description: 5. Determinar la Fuerza de un Objeto y Compararla con un Límite
Enunciado: Diseñar un diagrama de flujo que calcule la fuerza ejercida por un objeto y
determine si es mayor o menor que un valor umbral.
- Pedir al usuario la masa (kg) y la aceleración (m/s²).
- Calcular la fuerza usando la segunda ley de Newton.
Fórmula: F = m × a
- Si Fuerza ≥ 100N, imprimir 'La fuerza es alta'.
- Si Fuerza < 100N, imprimir 'La fuerza es baja'.
	Autor: Yully Diaz
	Date: march 15th 2025
*/

let mass=8;
let acceleration=9;

let force;

force=mass*acceleration;

if(force>=100){
    console.log("Strenght is high");

}
else{
    console.log("strenght is low");
}