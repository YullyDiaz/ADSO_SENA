/*
 name exercise: first

 description:
7. Cálculo del retroceso de un arma tras disparar
-Pedir la masa (kg) del arma
-Pedir la masa (kg) de la bala
Pedir la velocidad (m/s) de la bala
-Calcular la velocidad de retroceso del arma usando:
m_bala * v_bala = m_arma * v_retroceso
-Mostrar el resultado.

 author: Yully Diaz
 Date: 15 of march of 2025
*/

let bulletMass = 7;
let bulletVelocity = 8;
let weaponMass = 5;

let reserveVelocity;

reserveVelocity = (bulletMass * bulletVelocity)/weaponMass;

console.log(reserveVelocity);