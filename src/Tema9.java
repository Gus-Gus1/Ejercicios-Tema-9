public class Tema9 {
        public static void main(String[] args) {
            Cliente cliente = new Cliente();
            Trabajador trabajador = new Trabajador();

            cliente.nombre = "Gustavo Cardona";
            cliente.telefono = 8843133;
            cliente.edad = 32;
            cliente.credito = 50000;
            System.out.println("Mi nombre es " + cliente.nombre + ", tengo " + cliente.edad +
                    " años y mi telefono es " + cliente.telefono
                    + " y mi credito disponible es " + cliente.credito + " Pesos");

            trabajador.nombre = "Adolfo Quintero";
            trabajador.edad = 22;
            trabajador.telefono = 3504137;
            trabajador.salario = 20000;
            System.out.println("Mi nombre es " + trabajador.nombre + ", tengo "
                    + trabajador.edad + " años y mi telefono es " + trabajador.telefono
                    + " y mi salario es de " + trabajador.salario + " pesos");
        }
    }


class Persona{
    int edad;
    int telefono;
    String nombre;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona {
    double salario;
}

