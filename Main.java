public class Main {

    public static void main(String[] args) {
        String nombre = "Carolina Cornejo";
        System.out.println("Nombre del estudiante: " + nombre);

        int suma = 0;
        double promedio;

        int[] calificaciones = new int[5];

        calificaciones[0] = 98;
        System.out.println("Calificacion 1: " + calificaciones[0]);

        calificaciones[1] = 99;
        System.out.println("Calificacion 2: " + calificaciones[1]);

        calificaciones[2] = 93;
        System.out.println("Calificacion 3: " + calificaciones[2]);

        calificaciones[3] = 81;
        System.out.println("Calificacion 4: " + calificaciones[3]);

        calificaciones[4] = 83;
        System.out.println("Calificacion 5: " + calificaciones[4]);

        for (int i = 0; i < calificaciones.length; i++)
        {
            suma = suma + calificaciones[i];
        }

        promedio = suma / calificaciones.length;
        System.out.println("Promedio: " + promedio);

        if (promedio <= 50) {
            System.out.println("Calificacion: F");
        }

        if ((promedio <= 60) && (promedio >= 51)) {
            System.out.println("Calificacion: E");
        }

        if ((promedio <= 70) && (promedio >= 61)) {
            System.out.println("Calificacion: D");
        }

        if ((promedio <= 80) && (promedio >= 71)) {
            System.out.println("Calificacion: C");
        }

        if ((promedio <= 90) && (promedio >= 81)) {
            System.out.println("Calificacion: B");
        }

        if ((promedio <= 100) && (promedio >= 91)) {
            System.out.println("Calificacion: A");
        }
    }
}