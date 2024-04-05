package Clase02;

public class ValoresPeliculas {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Película: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.8 + 9.0)/3;
        System.out.println(media);

        //Uso de Text Blocks
        String sinopsis = """
                Matrix es una paradoja
                La mejor pelicula del din del milenio
                Fue lanzada en: 
                """ +fechaDeLanzamiento;
        System.out.println(sinopsis);

        //Casting
        int clasificacion = (int) (media /2);
        System.out.println(clasificacion);
    }
}
