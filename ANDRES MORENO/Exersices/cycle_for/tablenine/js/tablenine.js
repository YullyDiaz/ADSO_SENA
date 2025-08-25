/*
	Name exercise: table of 9
	Description: Realiza la tabla de multiplicar del 9 imprime los resultados que diga para el impar.
	Autor: Yully Diaz
	Date: march 15th 2025
*/

let result;

let number=9;
let counter=0;

for(counter=0; counter<number; counter++){
    result=number*counter;
    console.log(number+ "x" +counter+ "=" +result);

    if(result %2 ==0){
        console.log("add");
    }
    else{
        console.log("even");
    }
}
