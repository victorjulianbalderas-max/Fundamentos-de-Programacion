Algoritmo EjClaseV2_08_09_26
	Definir puer, proto Como Entero
	Definir acc Como Logico
	
	Escribir "Ingrese el puerto (1-65535) : " Sin Saltar
	Leer puer
	
	Escribir "Ingrese el protocolo (1: TCP, 2: UDP) : " Sin Saltar
	Leer proto
	
	acc <- ((puer = 80 o puer = 443) Y proto = 1) o (puer= 53 Y proto = 2) o (proto = 22)
	
	Si acc Entonces
		Escribir "acceso permitido"
	SiNo
		Escribir "acceso denegado"
	FinSi
	
FinAlgoritmo
