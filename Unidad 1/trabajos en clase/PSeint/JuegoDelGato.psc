Algoritmo JuegoDelGato
	Definir L11, L112, L13, L114, L115, L116, L117, L118, L119 Como Caracter
	Definir jugador Como Caracter
	Definir casilla Como Entero
	Definir turno, ganador, empate Como Logico
	
	L11  <- "1"
	L112 <- "2"
	L13  <- "3"
	L114 <- "4"
	L115 <- "5"
	L116 <- "6"
	L117 <- "7"
	L118 <- "8"
	L119 <- "9"
	
	jugador <- "X"
	ganador <- Falso
	empate <- Falso
	turno <- Verdadero
	
	Mientras turno Hacer
		
		Escribir ""
		Escribir L11, " | ", L112, " | ", L13
		Escribir "---------"
		Escribir L114, " | ", L115, " | ", L116
		Escribir "---------"
		Escribir L117, " | ", L118, " | ", L119
		Escribir ""
		
		Escribir "Turno del jugador ", jugador
		Escribir "Elige una casilla (1-9): "
		Leer casilla
		
		Segun casilla Hacer
			1:
				Si L11 <> "X" Y L11 <> "O" Entonces
					L11 <- jugador
				SiNo
					Escribir "Casilla ocupada"
				FinSi
			2:
				Si L112 <> "X" Y L112 <> "O" Entonces
					L112 <- jugador
				SiNo
					Escribir "Casilla ocupada"
				FinSi
			3:
				Si L13 <> "X" Y L13 <> "O" Entonces
					L13 <- jugador
				SiNo
					Escribir "Casilla ocupada"
				FinSi
			4:
				Si L114 <> "X" Y L114 <> "O" Entonces
					L114 <- jugador
				SiNo
					Escribir "Casilla ocupada"
				FinSi
			5:
				Si L115 <> "X" Y L115 <> "O" Entonces
					L115 <- jugador
				SiNo
					Escribir "Casilla ocupada"
				FinSi
			6:
				Si L116 <> "X" Y L116 <> "O" Entonces
					L116 <- jugador
				SiNo
					Escribir "Casilla ocupada"
				FinSi
			7:
				Si L117 <> "X" Y L117 <> "O" Entonces
					L117 <- jugador
				SiNo
					Escribir "Casilla ocupada"
				FinSi
			8:
				Si L118 <> "X" Y L118 <> "O" Entonces
					L118 <- jugador
				SiNo
					Escribir "Casilla ocupada"
				FinSi
			9:
				Si L119 <> "X" Y L119 <> "O" Entonces
					L119 <- jugador
				SiNo
					Escribir "Casilla ocupada"
				FinSi
			De Otro Modo:
				Escribir "Casilla invalida"
		FinSegun
		
		Si (L11 = jugador Y L112 = jugador Y L13 = jugador) O (L114 = jugador Y L115 = jugador Y L116 = jugador) O (L117 = jugador Y L118 = jugador Y L119 = jugador) O (L11 = jugador Y L114 = jugador Y L117 = jugador) O (L112 = jugador Y L115 = jugador Y L118 = jugador) O (L13 = jugador Y L116 = jugador Y L119 = jugador) O (L11 = jugador Y L115 = jugador Y L119 = jugador) O (L13 = jugador Y L115 = jugador Y L117 = jugador) Entonces
			ganador <- Verdadero
			turno <- Falso
		FinSi
		
		Si NO ganador Entonces
			Si L11<>"1" Y L112<>"2" Y L13<>"3" Y L114<>"4" Y L115<>"5" Y L116<>"6" Y L117<>"7" Y L118<>"8" Y L119<>"9" Entonces
				empate <- Verdadero
				turno <- Falso
			FinSi
		FinSi
		
		Si turno Entonces
			Si jugador = "X" Entonces
				jugador <- "O"
			SiNo
				jugador <- "X"
			FinSi
		FinSi
		
	FinMientras
	
	Escribir ""
	Escribir L11, " | ", L112, " | ", L13
	Escribir "---------"
	Escribir L114, " | ", L115, " | ", L116
	Escribir "---------"
	Escribir L117, " | ", L118, " | ", L119
	Escribir ""
	
	Si ganador Entonces
		Escribir "¡Felicidades! El jugador ", jugador, " ha ganado."
	SiNo
		Si empate Entonces
			Escribir "¡Empate! Nadie gano."
		FinSi
	FinSi
	
FinAlgoritmo