Algoritmo Clase_07_09_26
	Definir numero, i, pares, impares Como Entero
	pares <- 0
	impares <- 0
	
	Para i <- 1 Hasta 5 Con Paso 1 Hacer
		Escribir "Ingrese el número ", i, ":"
		Leer numero
		
		Si numero MOD 2 = 0 Entonces
			pares <- pares + 1
		SiNo
			impares <- impares + 1
		FinSi
	FinPara
	
	Escribir "Cantidad de números pares: ", pares
	Escribir "Cantidad de números impares: ", impares
FinAlgoritmo