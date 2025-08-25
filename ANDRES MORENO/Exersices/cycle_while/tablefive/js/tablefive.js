/*
	Name exercise: Table of 5
	Description: 1. Realizar la tabla de multiplicar de 5 que multiplique hasta 5 y debe imprimir los siguientes resultados.
5x1=5
5x2=10
...
	Autor: Yully Diaz
	Date: march 15th 2025
*/

let result;

let number=5;
let counter=0;

while(counter<number){
    counter=counter+1;
    result=counter*number;
    console.log(number+ "x" +counter+ "=" +result);
}