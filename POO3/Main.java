package POO3;

public class Main {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        electrodomesticos[0] = new Lavadora(200, 60);
        electrodomesticos[1] = new Television(500,40);
        electrodomesticos[2] = new Electrodomestico();
        electrodomesticos[3] = new Lavadora();
        electrodomesticos[4] = new Television();
        electrodomesticos[5] = new Electrodomestico(150,"azul", 'D',30  );
        electrodomesticos[6] = new Lavadora(300, 50, "negro", 'A', 8);
        electrodomesticos[7] = new Television(700,true, 50, "gris", 'B', 50);
        electrodomesticos[8] = new Lavadora(250, 40, "blanco", 'C', 6);
        electrodomesticos[9] = new Television(800,true, 60, "rojo", 'E', 70);

        double precioElectrodomesticos = 0;
        double precioLavadoras = 0;
        double precioTelevisiones = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Lavadora) {
                precioLavadoras += electrodomestico.precioFinal();
            } else if (electrodomestico instanceof Television) {
                precioTelevisiones += electrodomestico.precioFinal();
            } else {
                precioElectrodomesticos += electrodomestico.precioFinal();
            }
        }

        System.out.println("Precio total Electrodomesticos: " + precioElectrodomesticos);
        System.out.println("Precio total Lavadoras: " + precioLavadoras);
        System.out.println("Precio total Televisiones: " + precioTelevisiones);
    }
}
