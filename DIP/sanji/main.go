package main

import "fmt"

func main(){
	fmt.Println("================ Entorno Real ====================")
	pasarelaReal := &AdaptadorMercadoPago{TokenAccess: "123456"}
	emisorReal := &AdaptadorTwilio{IdentificadorCuenta: "54321"}

	servicioReal := NuevoServicioPago(pasarelaReal, emisorReal)
	_ = servicioReal.ProcesarPago("omar@gmail.com", 1500.00)

	fmt.Println("================ Entorno de pruebas ===============")

	pasarelaMock := &SimuladorPasarela{DebeFallar: false}	
	emisorMock := &SimuladorEmisor{}

	servicioMock := NuevoServicioPago(pasarelaMock, emisorMock)
	_ = servicioMock.ProcesarPago("omar@gmail.com", 3000.00)
}
