package POO3;

    public class Television extends Electrodomestico {
        private int resolucion;
        private boolean sintonizadorTDT;
    
        // Valores por defecto
        private final int resolucion_default = 20;
        private final boolean sintonizador_default = false;
    
        // Constantes de precio según resolución
        private final int precioResolucionMenor_40pulgadas = 30;
        private final int precioResolucionMayor_40pulgadas = 50;
    
        public Television() {
            super();
            resolucion = resolucion_default;
            sintonizadorTDT = sintonizador_default;
        }
    
        public Television(double precioBase, double peso) {
            super(precioBase, peso);
            resolucion = resolucion_default;
            sintonizadorTDT = sintonizador_default;
        }
    
        public Television(int resolucion, boolean sintonizadorTDT, double precioBase, String color, char consumoEnergetico, double peso) {
            super(precioBase, color, consumoEnergetico, peso);
            this.resolucion = resolucion;
            this.sintonizadorTDT = sintonizadorTDT;
        }
    
     
    
        @Override
        public double precioFinal() {
            double precioFinal = super.precioFinal();
    
            // Aumentar precio según resolución
            if (getResolucion() > 40) {
                precioFinal += precioFinal * precioResolucionMayor_40pulgadas / 100.0;
            } else if (getResolucion() >= 32) {
                precioFinal += precioFinal * precioResolucionMenor_40pulgadas / 100.0;
            }
    
            // Aumentar precio si tiene sintonizador TDT
            if (isSintonizadorTDT()) {
                precioFinal += 50;
            }
    
            return precioFinal;
        }
    
     //getter y setter
        public int getResolucion() {
            return resolucion;
        }
        public void setResolucion(int resolucion) {
            this.resolucion = resolucion;
        }
        public boolean isSintonizadorTDT() {
            return sintonizadorTDT;
        }
        public void setSintonizadorTDT(boolean sintonizadorTDT) {
            this.sintonizadorTDT = sintonizadorTDT;
        }
}
