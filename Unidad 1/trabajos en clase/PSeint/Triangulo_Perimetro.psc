Algoritmo Triangulo_Perimetro
	Definir x1, x2, x3, y1, y2, y3 Como Real
	Definir d1, d2, d3, perimetro Como Real
	
	Escribir "Ingrese x1: "
	Leer x1
	Escribir "Ingrese y1: "
	Leer y1
	Escribir "Ingrese x2: "
	Leer x2
	Escribir "Ingrese y2: "
	Leer y2
	Escribir "Ingrese x3: "
	Leer x3
	Escribir "Ingrese y3: "
	Leer y3
	
	d1 <- RAIZ((x1-x2)^2 + (y1-y2)^2)
	d2 <- RAIZ((x2-x3)^2 + (y2-y3)^2)
	d3 <- RAIZ((x3-x1)^2 + (y3-y1)^2)
	perimetro <- d1 + d2 + d3
	
	Escribir "El perimetro del triangulo es: ", perimetro
FinAlgoritmo