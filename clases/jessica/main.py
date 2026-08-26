from abc import(ABC), abstractmethod 

class Personaje(ABC): 
    def_init_(self, nombre, vida): 
    self.nombre = nombre
    self.vida = vida

    def recibir_danio(self, cantidad): 
        self.vida -= cantidad
        print("{self.nombre} recibe {cantidad} de daño")
        print("vida restante: {self.vida}")

    @abstractmethod
    def atacar(self): 
        pass 

class Icurable(ABC): 
    @abstractmethod 
    def curar(self, objetivo): 
        pass

class Guerrero(Personaje):
    def atacar(self):
        print(f"{self.nombre} atacar con su espada")

class Mago(Personaje): 
    def atacar(self): 
        print(f"{self.nombre} lanzó una bola de fuego")

    def curar(self, objetivo):
        objetivo.vida += 20
        print(f"{self.nombre} cura a {objetivo.nombre} + 20 de vida")

class Soporte(Personaje): 
    def atacar(self):
        print(f"{self.nombre} ataca con un bastón" )

    def curar(self, objetivo):
            objetivo.vida += 20
            print(f"{self.nombre} cura a {objetivo.nombre} + 20 de vida")


guerrero = Guerrero("Guerrero1", 100)
mago = Mago("Mago1", 100)
soporte = Soporte("Soporte1", 100)

guerrero.atacar()
mago.atacar()
soporte.atacar()

print(f"vida final de {guerrero.nombre}: {guerrero.vida}")

