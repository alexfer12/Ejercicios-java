package POO3;

public class Lavadora extends Electrodomestico {
    private final int carga_default = 5;
    private int carga;

    
    public Lavadora(double precioBase,String color,char consumoEnergetico,double peso, int carga) {
        super(precioBase,color,consumoEnergetico,peso);
        carga = carga_default;
    }
    public Lavadora(){
        
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        carga = carga_default;
    }

    public Lavadora(int carga, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }
//setter y getter de carga
    public int getCarga() {
        return carga;
    }
    public void setCarga(int carga) {
        this.carga = carga;
    }
    

    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (carga > 30) {
            precio += 50;
        }
        return precio;
    }
}
