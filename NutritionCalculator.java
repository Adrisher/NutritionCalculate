import java.util.Scanner;


public class NutritionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        double totalCalorias = 0, totalProteinas = 0, totalGrasas = 0, totalCarbohidratos = 0;

       
        final double CALORIAS_POR_GRAMO = 4;  
        final double GRASAS_POR_GRAMO = 9;    

        System.out.println("Ingrese la cantidad de ingredientes a evaluar:");
        int cantidadIngredientes = scanner.nextInt();

        for (int i = 0; i < cantidadIngredientes; i++) {
            System.out.println("\nIngrediente #" + (i + 1));
            System.out.print("Ingrese la cantidad en gramos: ");
            double gramos = scanner.nextDouble();

            System.out.println("Seleccione el grupo nutricional:");
            System.out.println("1. Calorías");
            System.out.println("2. Proteínas");
            System.out.println("3. Grasas");
            System.out.println("4. Carbohidratos");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    totalCalorias += gramos * CALORIAS_POR_GRAMO;
                    break;
                case 2:
                    totalProteinas += gramos * CALORIAS_POR_GRAMO;
                    break;
                case 3:
                    totalGrasas += gramos * GRASAS_POR_GRAMO;
                    break;
                case 4:
                    totalCarbohidratos += gramos * CALORIAS_POR_GRAMO;
                    break;
                default:
                    System.out.println("Opción inválida, no se registrará este ingrediente.");
            }
        }

       
        double totalNutricional = totalCalorias + totalProteinas + totalGrasas + totalCarbohidratos;

     
        System.out.println("\nResumen Nutricional:");
        System.out.println("Total Calorías: " + totalCalorias + " kcal");
        System.out.println("Total Proteínas: " + totalProteinas + " kcal");
        System.out.println("Total Grasas: " + totalGrasas + " kcal");
        System.out.println("Total Carbohidratos: " + totalCarbohidratos + " kcal");
        System.out.println("Total Nutricional: " + totalNutricional + " kcal");

        
        if (totalNutricional < 500) {
            System.out.println(" La comida es baja en calorías.");
        } else if (totalNutricional >= 500 && totalNutricional <= 800) {
            System.out.println(" La comida tiene un valor nutricional aceptable.");
        } else {
            System.out.println(" La comida tiene un exceso de calorías.");
        }

        scanner.close();
    }
}


/*
Ejemplo de ejecución del programa:

Ingrese la cantidad de ingredientes a evaluar:
3

Ingrediente #1
Ingrese la cantidad en gramos: 50
Seleccione el grupo nutricional:
1. Calorías
2. Proteínas
3. Grasas
4. Carbohidratos
2

Ingrediente #2
Ingrese la cantidad en gramos: 30
Seleccione el grupo nutricional:
3

Ingrediente #3
Ingrese la cantidad en gramos: 70
Seleccione el grupo nutricional:
4

Resumen Nutricional:
Total Calorías: 0.0 kcal
Total Proteínas: 200.0 kcal
Total Grasas: 270.0 kcal
Total Carbohidratos: 280.0 kcal
Total Nutricional: 750.0 kcal
La comida tiene un valor nutricional aceptable.
*/
