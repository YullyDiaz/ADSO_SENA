/*
	Name exercise: Table of 1 at 5
	Description: Realizar las tablas de multiplicar del 1 al 5 que multiplique hasta 5 debe imprimir los resultados 
	Autor: Yully Diaz
	Date: march 15th 2025
*/

let result;

let counter=0;
let multiply=0;
let number=5;

for(counter=0; counter<number; counter++){
    number=number+1;

    for(counter=0; multiply<=5; counter++){
        multiply=multiply+1;
        result=number*multiply;
        console.log(result);
    }
}