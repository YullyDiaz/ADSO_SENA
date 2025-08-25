/*
	Name exercise: Salary
Description: 3. Cálculo de Salario Neto con Deducciones
Enunciado: Diseñar un diagrama de flujo que calcule el salario total de una persona,
aplicando las siguientes reglas:
- Si el salario es menor a dos salarios mínimos, sumar el subsidio de transporte de $114,000.
- Aplicar los siguientes descuentos:
- Salud = salario × 0.12
- Pensión = salario × 0.16
- ARL = salario × 0.052
- Si el salario es mayor a cuatro salarios mínimos, restar una retención del 0.04.
- Calcular e imprimir el total a pagar después de los descuentos.
	Autor: Yully Diaz
	Date: march 15th 2025
*/

let salary;
let health;
let pension;
let arl;
let netSalary;
let discount;
let totalSalary;

salary=1423500;

health=salary*0.12;
pension=salary*0.16;
arl=salary*0.052;
discount=health+pension+arl;
netSalary=salary-discount;

if(netSalary<(salary*2)){
    totalSalary=netSalary+114000;
    console.log(totalSalary);

} else if(netSalary>(salary*4)){
    totalSalary=netSalary-(netSalary*0.04);
    console.log(totalSalary);
}