Algoritmo Ejclase_02_09
	Definir num, c1, c2, c3, suma Como Entero
	Escribir "pon un numero de 3 digitos:" Sin Saltar
	Leer num
	c1 <- 0
	
	Mientras num >= 100 Hacer
		num <- num - 100
		c1 <- c1 + 1
	FinMientras
	c2 <- 0
	Mientras num >= 10 Hacer
		num <- num - 10
		c2 <- c2 + 1
	FinMientras
	c3 <- num
	Si (c1 MOD 2 = 0) Y (c2 MOD 2 = 0) Y (c3 MOD 2 = 0) Entonces
		suma <- c1 + c2 + c3
		Escribir "suma de los numero par es: ", suma
	SiNo
		Escribir "el numero que pusiste no es par, intenta con otro xd"
	FinSi
FinAlgoritmo 