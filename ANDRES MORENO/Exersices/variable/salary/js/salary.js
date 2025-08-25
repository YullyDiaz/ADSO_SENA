/*
 name exercise: first

 description:
Calcular imprimir el pago total de una persona con descuento se solicitan los días trabajados y el valor de dichos días
Salario : salario * días trabajados
Descuento
salud: salario *  0,12
pensión salario * 0,16
 arl :salario * 0,52
sueldo neto: salario - descuento
 imprimir valores

 author: Yully Diaz
 Date: 15 of march of 2025
*/

let dayWork = 8;
let valueDay = 20000;

let salary;
let health;
let pension:
let arl;
let discount;
let netSalary;

salary = dayWork * valueDay;
health = salary * 0.12;
pension = salary * 0.16;
arl = salary * 0.052;
discount = health + pension + arl;
netSalary = salary - discount;

console.log(salary);
console.log(health);
console.log(pension);
console.log(arl);
console.log(discount);
console.log(netSalary);


