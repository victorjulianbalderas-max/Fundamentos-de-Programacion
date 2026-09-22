Algoritmo Area_Cono
	Definir radio, generatriz, altura, aBase, aLado, aTotal, volumen Como Real

	Escribir "Ingrese el radio: "
	Leer radio
	Escribir "Ingrese la generatriz: "
	Leer generatriz
	Escribir "Ingrese la altura: "
	Leer altura
	
	aBase <- PI * (radio * radio)
	aLado <- PI * radio * generatriz
	aTotal <- aBase + aLado
	volumen <- (aBase * altura) / 3
	
	Escribir "El area de la base es: ", aBase
	Escribir "El area lateral es: ", aLado
	Escribir "El area total es: ", aTotal
	Escribir "El volumen es: ", volumen
FinAlgoritmo