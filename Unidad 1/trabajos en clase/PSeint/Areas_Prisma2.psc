Algoritmo Areas_Prisma2
	Definir perimetro, apotema, altura, aBase, aLateral, aTotal Como Real
	
	Escribir "Ingrese el perimetro de la base: "
	Leer perimetro
	Escribir "Ingrese la apotema: "
	Leer apotema
	Escribir "Ingrese la altura: "
	Leer altura
	
	aBase <- (perimetro * apotema) / 2
	aLateral <- (perimetro * altura) / 2
	aTotal <- (2 * aBase) + aLateral
	
	Escribir "El area de la base es: ", aBase
	Escribir "El area lateral es: ", aLateral
	Escribir "El area total es: ", aTotal
FinAlgoritmo