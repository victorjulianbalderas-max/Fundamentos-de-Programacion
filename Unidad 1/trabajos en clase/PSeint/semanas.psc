Algoritmo semanas
	Definir d, sem, drest Como Entero
	
	Escribir "Ingrese la cantidad de días: " Sin Saltar
	Leer d
	
	sem <- 0
	Mientras d >= 7 Hacer
		d <- d - 7
		sem <- sem + 1
	FinMientras
	
	drest <- d
	
	Escribir "semanas: ", sem
	Escribir "días que sobraron: ", drest
FinAlgoritmo