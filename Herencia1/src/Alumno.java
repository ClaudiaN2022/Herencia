public class Alumno extends Persona{



    public Alumno(String nombre) {
        super(nombre);
    }

    @Override
    public void andar() {

        System.out.println( "Estoy corriendo");

    }
}
