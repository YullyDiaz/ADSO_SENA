/*
	Name exercise: table of 9
	Description: Realiza la tabla de 9 que multiplique hasta 5 y de los resultados me imprima los resultados que son pares y resultados son impares.
	Autor: Yully Diaz
	Date: march 15th 2025
*/

let result;

let number=9;
let counter=0;

while(counter<5){
    counter=counter+1;
    result=counter*number;

    if(result %2 ==0){
        console.log(result+ " is even");
    }
    else{
        console.log(result+ " is odd");
    }
}