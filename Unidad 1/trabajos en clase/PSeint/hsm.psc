Algoritmo hsm
	Definir seg, hrs, minrest, segrest Como Entero
	
	Escribir "Ingrese la cantidad de segundos: " Sin Saltar
	Leer seg
	
	hrs <- 0
	Mientras seg >= 3600 Hacer
		seg <- seg - 3600
		hrs <- hrs + 1
	FinMientras
	
	minrest <- 0
	Mientras seg >= 60 Hacer
		seg <- seg - 60
		minrest <- minrest + 1
	FinMientras
	
	segrest <- seg
	
	Escribir "horas: ", hrs
	Escribir "minutos: ", minrest
	Escribir "segundos: ", segrest
FinAlgoritmo