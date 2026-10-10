package main
import "fmt"

type ClienteStripe struct{
	ClaveApi string
}

func(s *ClienteStripe) CobrarTarjeta(monto float64) bool{
	fmt.Printf(" [API STRIDE] Enviando $%.2f con la clave %s\n", monto, s.ClaveApi  )
	return true
}

type NotificadorSendgrid struct{
	CorreoRemitente string
}

func(n *NotificadorSendgrid) EnviarReciboCorreo(monto float64, correo string){
	fmt.Printf("[API SENDGRID] Enviando desde %s a %s la cantidad de $%.2f\n", n.CorreoRemitente, correo, monto)
}

type ServicioPago struct{
	clienteStripe *ClienteStripe
	notificador *NotificadorSendgrid
}

func NuevoServicioPago() *ServicioPago{
	return &ServicioPago{
		clienteStripe: &ClienteStripe{ClaveApi: "1"}, 
		notificador: &NotificadorSendgrid{ CorreoRemitente : "magdielito.com" }, 
	}
}

func(s *ServicioPago) ProcesarPago(monto float64, correo string){
	if(s.clienteStripe.CobrarTarjeta(monto)){
		s.notificador.EnviarReciboCorreo(monto, correo)
	}
}

func main(){
	servicio := NuevoServicioPago()
	servicio.ProcesarPago(1500.01, "caballeros@gmail.com")
}
