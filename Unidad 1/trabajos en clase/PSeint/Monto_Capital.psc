Algoritmo Monto_Capital
	Definir capital, interes, monto Como Real
	
	Escribir "Ingrese el capital: "
	Leer capital
	Escribir "Ingrese la tasa de interes: "
	Leer interes
	
	monto <- capital * (1 + (interes / 100))
	
	Escribir "El monto es: ", monto
FinAlgoritmo