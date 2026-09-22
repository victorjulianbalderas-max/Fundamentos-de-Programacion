Algoritmo Hexa_Cubo
	Definir lado, aBase, aLado, aTotal, volumen Como Real
	Escribir "Ingrese el lado del cubo: "
	Leer lado
	
	aBase <- lado * lado
	aLado <- 4 * (lado * lado)
	aTotal <- 6 * (lado * lado)
	volumen <- lado * lado * lado
	
	Escribir "El area de la base es: ", aBase
	Escribir "El area lateral es: ", aLado
	Escribir "El area total es: ", aTotal
	Escribir "El volumen es: ", volumen
FinAlgoritmo