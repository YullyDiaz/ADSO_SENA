/*
	Name exercise:End note
	Description: 
    4. Cálculo de Notas Finales
Enunciado: Diseñar un diagrama de flujo que reciba tres notas y realice los siguientes
cálculos:
- Calcular los porcentajes de cada nota:
- Nota 1 → 20%
- Nota 2 → 35%
- Nota 3 → 45%
- Sumar los porcentajes de las notas y clasificar la nota final:
- Mayor a 4.5 → Nota Superior
- Entre 3.5 y 4.5 → Nota Buena
- Entre 3 y 3.5 → Nota Media
- Menor a 3 → Nota Mala
	Autor: Yully Diaz
	Date: march 15th 2025
*/

let gradeOne=5;
let gradeTwo=4;
let gradeThree=2;

let endNote;

gradeOne=gradeOne*0.2;
gradeTwo=gradeTwo*0.35;
gradeThree=gradeThree*0.45;
endNote=gradeOne+gradeTwo+gradeThree;

if(endNote>4.5){
    console.log(endNote);
    console.log("Top grade");

}else if(endNote>=3.5 && endNote<=4.5){
    console.log(endNote);
    console.log("Good grade");
}

if(endNote>=3 && endNote<3.5){
    console.log(endNote);
    console.log("Average grade");

}else{
    console.log(endNote);
    console.log("Bad grade");
}