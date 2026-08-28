#include <iostream>
using namespace std; 

class Animal {
	public: 
		string nombre; 

		Animal(string nombre): nombre(nombre){
			cout << "Constructor" << endl ; 
		}
		void virtual andar(){
			cout << nombre << " está andando" << endl;  
		}
};

class Perro : public virtual Animal{
	public: 
		Perro(string nombre) : Animal(nombre){}

	void ladrar(){
		cout << nombre << " está ladrando" << endl; 
	}
	void andar(){
		cout << nombre << " está corriendo" << endl; 
	}
};

class Volador : public virtual Animal{
	public: 
		Volador(string nombre) : Animal(nombre){}
		
		void andar(){
			cout << nombre << " está volando " << endl; 
		}
};


class Nadador : public virtual Animal{
	public: 
		Nadador(string nombre) : Animal(nombre){}
		void andar(){
			cout << nombre << " está nadando" << endl; 
		}
		
};

class Pato: public Volador, public Nadador{
	public:
		Pato(string nombre): Animal(nombre), Volador(nombre),Nadador(nombre){}
		void graznar(){
			cout << nombre << " está graznando" << endl; 
		}

		void andar() {
			cout << nombre << " camina" << endl; 
		}
};

int main(){
	Perro perro1("Pako");
	perro1.ladrar();  
	perro1.andar(); 

	Pato pato1("justin"); 
	pato1.andar(); 

	Volador volador1("vane"); 
	Nadador nadador1("alexa"); 

	volador1.andar(); 
	nadador1.andar(); 
}
