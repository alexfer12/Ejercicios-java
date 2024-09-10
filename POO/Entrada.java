package POO;
import java.util.Scanner;
public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base, altura, radio;
        int opcion = 0;
        System.out.println("Bienvenido a la calculadora trigonométrica");
        do {
            System.out.println("Las opciones que existen son");
            System.out.println("1. trabajar con triángulos");
            System.out.println("2. trabajar con rectángulos");
            System.out.println("3. trabajar con ciruculos");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Triángulos");
                    System.out.println("Introduce base");
                    base = scanner.nextInt();
                    System.out.println("Introduce altura");
                    altura = scanner.nextInt();
                    Triangulo triangulo = new Triangulo(base, altura);
                    System.out.println("Sus datos son");
                    System.out.println("Area: " + triangulo.calcularArea());

                    break;
                case 2:
                    System.out.println("Rectángulos");
                    System.out.println("Introduce base");
                    base = scanner.nextInt();
                    System.out.println("Introduce altura");
                    altura = scanner.nextInt();
                    Rectangulo rectangulo = new Rectangulo(base, altura);
                    System.out.println("Sus datos son");
                    System.out.println("Area: " + rectangulo.calcularArea());
                    System.out.println("Perímetro: " + rectangulo.calcularPerimetro());

                    break;
                case 3:
                    System.out.println("Circulos");
                    System.out.println("Introduce radio");
                    radio = scanner.nextInt();
                    Circulo circulo = new Circulo(radio);
                    System.out.println("Sus datos son");
                    System.out.println("Area: " + circulo.calcularArea());
                    System.out.println("Area: " + circulo.calcularDiametro());
                    break;
                default:
                    System.out.println("Opción no contemplada");
                    break;
            }
        } while (opcion != 0);

    }
}
