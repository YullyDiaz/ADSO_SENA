/*
	Name exercise: table of 1 at 5
	Description: Realiza las tablas de multiplicar de 1 a 5 y multiplique hasta 5, debe imprimir los siguientes resultados:

Cuando los resultados sean pares debe imprimir buzz y si son pares bass
debe imprimir cuantos numeros son pares e impares.
	Autor: Yully Diaz
	Date: march 15th 2025
*/

let result;

let even=0;
let odd=0;
let number=5;
let multiply=0;

while(multiply<number){
    multiply=multiply+1;
    counter=0;

    while(counter<number){
        counter=counter+1;
        result=multiply*counter;
        console.log(result);

        if(result %2 ==0){
            even=even+1;
        }
        else{
            odd=odd+1;
        }
    }
}
console.log(odd+ " bass");
console.log(even+ " buzz");