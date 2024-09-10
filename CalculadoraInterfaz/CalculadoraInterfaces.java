package CalculadoraInterfaz;

/*
Ejercicio de calculadora: Crea una aplicación de calculadora en Java que tenga 
una interfaz gráfica de usuario con botones numéricos y de operación. 
La calculadora debe ser capaz de realizar operaciones básicas como suma, resta, 
multiplicación y división. Además, debe tener un botón para borrar el último carácter 
y otro para borrar toda la pantalla. La calculadora debe mostrar los resultados de las operaciones 
en tiempo real.
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CalculadoraInterfaces extends JFrame implements ActionListener {
    // Componentes de la calculadora
    private JTextField pantalla;
    private JButton botonSuma, botonResta, botonMultiplicacion, botonDivision, botonIgual,
        botonPunto, botonBorrar, botonBorrarTodo;
    private JButton[] botonesNumeros;

    // Variables para la operación
    private double numero1, numero2;
    private String operacion;

    public CalculadoraInterfaces() {
        // Configuración de la ventana
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250, 300);
        setResizable(true);

        // Configuración de la pantalla
        pantalla = new JTextField();
        pantalla.setEditable(false);
        pantalla.setHorizontalAlignment(JTextField.RIGHT);

        // Configuración de los botones de número
        botonesNumeros = new JButton[10];
        for (int i = 0; i < 10; i++) {
            botonesNumeros[i] = new JButton(String.valueOf(i));
            botonesNumeros[i].addActionListener(this);
        }

        // Configuración de los botones de operación
        botonSuma = new JButton("+");
        botonSuma.addActionListener(this);
        botonResta = new JButton("-");
        botonResta.addActionListener(this);
        botonMultiplicacion = new JButton("*");
        botonMultiplicacion.addActionListener(this);
        botonDivision = new JButton("/");
        botonDivision.addActionListener(this);
         botonIgual =new JButton("="); //pal =
        botonIgual.addActionListener(this);
        botonPunto = new JButton(".");
        botonPunto.addActionListener(this);
        botonBorrar = new JButton("Borrar");
        botonBorrar.addActionListener(this);
        botonBorrarTodo = new JButton("C");
        botonBorrarTodo.addActionListener(this);

        // Configuración del panel de botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(5, 5));
        panelBotones.add(botonesNumeros[7]);
        panelBotones.add(botonesNumeros[8]);
        panelBotones.add(botonesNumeros[9]);
        panelBotones.add(botonSuma);
        panelBotones.add(botonesNumeros[4]);
        panelBotones.add(botonesNumeros[5]);
        panelBotones.add(botonesNumeros[6]);
        panelBotones.add(botonResta);
        panelBotones.add(botonesNumeros[1]);
        panelBotones.add(botonesNumeros[2]);
        panelBotones.add(botonesNumeros[3]);
        panelBotones.add(botonMultiplicacion);
        panelBotones.add(botonesNumeros[0]);
        panelBotones.add(botonPunto);
        panelBotones.add(botonBorrar);
        panelBotones.add(botonDivision);
        panelBotones.add(botonIgual);

        // Configuración del panel principal
        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BorderLayout());
        panelPrincipal.add(pantalla, BorderLayout.NORTH);
        panelPrincipal.add(panelBotones, BorderLayout.CENTER);
        panelPrincipal.add(botonBorrarTodo, BorderLayout.EAST);
        add(panelPrincipal);

        setVisible(true);
    }
         // Método para manejar los eventos de los botones
    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (comando.equals("Borrar")) {
            String texto = pantalla.getText();
            if (texto.length() > 0) {
                texto = texto.substring(
                         0, texto.length() - 1);
            pantalla.setText(texto);
        } } else if (comando.equals("C")) {
        pantalla.setText("");
        numero1 = 0;
        numero2 = 0;
        operacion = "";
    } else if (comando.equals("+") || comando.equals("-") || comando.equals("*") || comando.equals("/")) {
        operacion = comando;
        numero1 = Double.parseDouble(pantalla.getText());
        pantalla.setText("");
    } else if (comando.equals("=")) {
        numero2 = Double.parseDouble(pantalla.getText());
        double resultado = 0;
        if (operacion.equals("+")) {
            resultado = numero1 + numero2;
        } else if (operacion.equals("-")) {
            resultado = numero1 - numero2;
        } else if (operacion.equals("*")) {
            resultado = numero1 * numero2;
        } else if (operacion.equals("/")) {
            resultado = numero1 / numero2;
        }
        pantalla.setText(String.valueOf(resultado));
    } else {
        pantalla.setText(pantalla.getText() + comando);
    }
}
  
    public static void main(String[] args) {
        CalculadoraInterfaces calculadora = new CalculadoraInterfaces();
    }
    
}

