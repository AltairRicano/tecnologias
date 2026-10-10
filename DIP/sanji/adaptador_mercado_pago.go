package main

import "fmt"

type AdaptadorMercadoPago struct{
	TokenAccess string 
}

func (mp *AdaptadorMercadoPago) Cobrar(monto float64) error {
	fmt.Printf("[Mercado Pago] Cobro realizado por el monto de %.2f con el token %s", monto, mp.TokenAccess)
	return nil
}
