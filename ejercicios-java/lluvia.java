/*3. Desarrollar un programa en Java que analice datos climáticos anuales 
utilizando arrays. 
Este ejercicio te permitirá practicar con conceptos básicos 
de arrays, como la creación, inicialización y manipulación de estos.
Se te proporcionan dos conjuntos de datos climáticos correspondientes a un 
año específico. El primero es un array de temperaturas promedio mensuales, 
y el segundo es un array que representa la probabilidad de lluvia para cada 
mes. Ambos arrays contienen 12 elementos, uno por cada mes del año.
Requisitos:
1. Inicialización de Arrays:
• Crea un array de double llamado temperaturas, donde cada 
elemento representará la temperatura promedio de cada mes.
• Crea un array de double llamado probabilidadesLluvia, donde 
cada elemento indicará la probabilidad de lluvia de cada mes, 
expresada en porcentaje (p. ej., 0.3 para un 30%).
2. Análisis de Datos:
• Mes Más Lluvioso: Determina cuál es el mes con la mayor 
probabilidad de lluvia. Ten en cuenta que los meses se numeran 
de 0 a 11, donde 0 representa enero y 11 diciembre. Deberás 
convertir este número a un nombre de mes para mostrar el 
resultado.
• Media de Temperatura: Calcula la temperatura media del año y 
muéstrala. */
public class lluvia {
    public static void main(String[] args) {
        double[] temperaturas = {10.5, 12.0, 15.2, 18.4, 22.5, 25.7, 27.8, 27.0, 24.3, 20.1, 15.4, 11.2};
        double[] probabilidadesLluvia = {0.2, 0.15, 0.25, 0.3, 0.2, 0.1, 0.05, 0.07, 0.15, 0.25, 0.3, 0.4};

        int mesMasLluvioso = encontrarMesLluvioso(probabilidadesLluvia);
        double temperaturaMedia = calcularTemperaturaMedia(temperaturas);

        String[] nombreMeses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        String nombreMesMasLluvioso = nombreMeses[mesMasLluvioso];
        System.out.println("Mes mas lluvioso: " + nombreMesMasLluvioso);
        System.out.println("Temperatura media anual: " + temperaturaMedia + "°C");
    }

    public static int encontrarMesLluvioso(double[] probabilidadesLluvia){
        int indiceMaximo = 0;
        for(int i=0; i < probabilidadesLluvia.length; i++){
            if(probabilidadesLluvia[i] > probabilidadesLluvia[indiceMaximo]){
                indiceMaximo = i;
            }
        }
        return indiceMaximo;
    }

    public static double calcularTemperaturaMedia(double[] temperaturas){
        double suma =0;
        double media;
        for(int i=0; i<temperaturas.length;i++){
            suma+=temperaturas[i];
        }
        media = suma / temperaturas.length;
        return media;
    }
}
