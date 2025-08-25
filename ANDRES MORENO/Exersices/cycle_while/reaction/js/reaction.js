/*
	Name exercise: force applied
	Description:Dado que: 
Faccio ˊn=−FreaccioˊnF_{\text{acción}} = -F_{\text{reacción}} 
El programa pedirá una fuerza aplicada (F) y mostrará su fuerza de reacción. 
Condiciones adicionales: 
 Se debe acumular la suma total de todas las fuerzas aplicadas. 
 Se debe contar cuántas veces se ha ingresado una fuerza. 
 El programa finaliza cuando el usuario ingresa una fuerza de 0. 


	Autor: Yully Diaz
	Date: march 15th 2025
*/

let appliedForce;

let counter=0;
let appliedForceTotal=0;
let forceReaction=6;

while(forceReaction>=0){
    appliedForce=forceReaction*(-1);
    appliedForceTotal=appliedForceTotal+appliedForce;
    counter=counter+1;
    console.log(appliedForce);
}
console.log(appliedForceTotal);
console.log(counter);