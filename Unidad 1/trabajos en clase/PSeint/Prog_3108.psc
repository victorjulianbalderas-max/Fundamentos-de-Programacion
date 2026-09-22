Algoritmo Prog_3108
	Definir num, M, C, D, U, sum Como Entero
	Escribir ' ingrese un numero de cuatro digitos'Sin Saltar
	Leer num
	M<- REDON (num/1000)
	c<- num MOD 1000
	d<- num MOD 100
	u <- num MOD 10
	Escribir ' Millares (m):', M
	Escribir ' Centnas (c):', C
	Escribir ' Decenas (d):', D
	Escribir ' Unidades (u):', U
	sum <- M+U
	Escribir ' la suma del primer digito con el 3ro es:', sum
FinAlgoritmo
