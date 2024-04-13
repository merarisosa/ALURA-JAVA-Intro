package Clase03;

public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        if(fechaDeLanzamiento >= 2022){
            System.out.println("Películas más populares");
        }else{
            System.out.println("Película reto que aun vale la pena ver");
        }

        if (incluidoEnElPlan || tipoPlan.equals("plus") ) {
            System.out.println("Disfrute de la película");
        }else{
            System.out.println("Película ni disponible para su plan actual");
        }
    }
}
