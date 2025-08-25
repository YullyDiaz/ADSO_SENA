/*
	Name exercise: table five
	Description: Realizar la tabla de multiplicar de 5 hasta 5 y mostrar los resultados.
	Autor: Yully Diaz
	Date: march 15th 2025
*/

let result;

let number=5;
let counter=0;

for(counter=0; counter<number; counter++){
    result=number*counter;
    console.log(number+ "x" +counter+ "=" +result);
}
console.log(result);