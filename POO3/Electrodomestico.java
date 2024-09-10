package POO3;

public class Electrodomestico {
    private  double precioBase = 100;
    private  String color = "blanco";
    private  char consumoEnergetico = 'F';
    private  double peso = 5;

    //CONSTRUCTOR VACIO
  public Electrodomestico(){
      
  }

  //CONSTRUCTOR POR DEFECTO
  public Electrodomestico(double precioBase,String color,char consumoEnergetico,double peso){
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    } 
   
  
//CONSTRUCTOR CON PRECIOBASE Y PESO
    public Electrodomestico(double precioBase, double peso) {
        this();
        this.precioBase = precioBase;
        this.peso = peso;
    }

//CONSTRUCOTR CON TODO LOS SETTER
    
   /* public void Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.setPrecioBase(precioBase);
        this.setColor(comprobarColor(color));
        this.setConsumoEnergetico(comprobarConsumoEnergetico(consumoEnergetico));
        this.setPeso(peso);
    }*/


//METODO COMPROBAR CONSUMO ENERGETICO
    private char comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);
        if (letra >= 'A' && letra <= 'F') {
            return letra;
        } else {
            return getConsumoEnergetico();
        }
    }
//METODO COMPROBAR EL COLOR
    
    private String comprobarColor(String color) {
        color = color.toLowerCase();
        switch (color) {
            case "blanco":
            case "negro":
            case "rojo":
            case "azul":
            case "gris":
                return color;
            default:
                return color;
        }
    }
//METODO PRECIO FINAL
    public double precioFinal() {
        double precioFinal = getPrecioBase();
        switch (getConsumoEnergetico()) {
            case 'A':
                precioFinal += 100;
                break;
            case 'B':
                precioFinal += 80;
                break;
            case 'C':
                precioFinal += 60;
                break;
            case 'D':
                precioFinal += 50;
                break;
            case 'E':
                precioFinal += 30;
                break;
            case 'F':
                precioFinal += 10;
                break;
        }
        if (getPeso() >= 0 && getPeso() < 20) {
            precioFinal += 10;
        } else if (getPeso() >= 20 && getPeso() < 50) {
            precioFinal += 50;
        } else if (getPeso() >= 50 && getPeso() <= 100) {
            precioFinal += 80;
        } else if (getPeso() > 100) {
            precioFinal += 100;
        }
        return precioFinal;
    }
    //GETTER Y SETTER
    public double getPrecioBase() {
        return precioBase;
    }
    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
}
