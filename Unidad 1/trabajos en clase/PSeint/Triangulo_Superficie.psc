Algoritmo Triangulo_Superficie
	Definir x1, x2, x3, y1, y2, y3, area Como Real
	
	Escribir "Ingrese x1: "
	Leer x1
	Escribir "Ingrese x2: "
	Leer x2
	Escribir "Ingrese x3: "
	Leer x3
	Escribir "Ingrese y1: "
	Leer y1
	Escribir "Ingrese y2: "
	Leer y2
	Escribir "Ingrese y3: "
	Leer y3
	
	area <- ((x1*y2 + x2*y3 + x3*y1) - (x1*y3 + x3*y2 + x2*y1)) / 2
	
	Escribir "El area del triangulo es: ", area
FinAlgoritmo