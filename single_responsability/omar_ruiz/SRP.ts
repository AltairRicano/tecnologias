//suscripciones de club deportivo. 

type Plan = "basico" | "intermedio" | "pro"

class Cliente{
	constructor(
		public nombre: string, 
		public correo: string, 
		public edad: number, 
		public plan: Plan
	){}

	validarUsuario(): boolean{
		if(this.nombre.length < 2){ 
			console.log("Nombre invalido"); 
			return false; 
		}
		if(this.edad < 16){
			console.log("Debes ser mayor de 15"); 
			return false; 
		}
		if(!this.correo.includes('@')){
			console.log(`El correo ${this.correo} no es valido`); 
			return false; 
		}
		return true; 
	}

	guardarEnBD(): void{
		if(this.validarUsuario()) {
			console.log(`Insertado ${this.nombre}`); 
			console.log(`INSERT INTO clientes (nombre, correo, edad, plan) VALUES('${this.nombre}', '${this.correo}', ${this.edad}, '${this.plan}')`);
		}
	}

	calcularPrecio(): number{
		const precios: Record<string, number> = {"basico" : 299, "intermedio" : 499, "pro": 999}; 
		const precio = precios[this.plan]; 
		return precio; 
	}

	generarFactura(): string{
		const folio = `Britania . ${Date.now()}`; 
		const total = this.calcularPrecio(); 
		const factura = `${folio} \n Cliente: ${this.nombre} | Plan: ${this.plan} | Total: ${total}`; 
		return factura; 
	}

	enviarCorreo(){
		console.log(`Bienvenido ${this.nombre} has sido registrado con el plan ${this.plan}`); 
		console.log(this.generarFactura()); 
	}

	registrarSuscripcion(): boolean {
		if(this.validarUsuario()){
			this.guardarEnBD(); 
			this.enviarCorreo();
			return true;  
		}
		return false; 
	}
}

const angel = new Cliente("Angel rojas", "example@gmail.com", 18, "intermedio"); 

angel.registrarSuscripcion();

export {}
