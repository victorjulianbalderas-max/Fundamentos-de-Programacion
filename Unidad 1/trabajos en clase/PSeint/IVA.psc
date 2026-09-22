Algoritmo IVA
	Definir pconiva, ptdescuento, precsiniva, preciof Como Real
	
	Escribir "Ingrese el precio del producto con IVA: "
	Leer pconiva
	
	Escribir "Ingrese el porcentaje de descuento: " Sin Saltar
	Leer ptdescuento
	
	precsiniva <- pconiva / 1.16
	preciof <- precsiniva - (precsiniva * ptdescuento / 100)
	
	Escribir "el precio sin iva y con descuento es: ", preciof
FinAlgoritmo