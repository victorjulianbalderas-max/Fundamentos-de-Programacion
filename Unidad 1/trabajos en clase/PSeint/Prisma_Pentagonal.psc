Algoritmo Prisma_Pentagonal
	Definir perimetro, apotema, altura, aBase, aLado, aTotal, volumen Como Real
	
	Escribir "Ingrese el perimetro de la base: "
	Leer perimetro
	Escribir "Ingrese la apotema: "
	Leer apotema
	Escribir "Ingrese la altura: "
	Leer altura
	
	aBase <- (perimetro * apotema) / 2
	aLado <- perimetro * altura
	aTotal <- (2 * aBase) + aLado
	volumen <- aBase * altura
	
	Escribir "El area de la base es: ", aBase
	Escribir "El area lateral es: ", aLado
	Escribir "El area total es: ", aTotal
	Escribir "El volumen es: ", volumen
FinAlgoritmo