package RegistroInterfaz;
    /*
Ejercicio de registro de estudiantes: Crea una aplicación en Java que permita registrar estudiantes.
La aplicación debe tener una interfaz gráfica de usuario con campos para ingresar el nombre, 
el apellido, la edad y el correo electrónico del estudiante. Además, debe tener un botón para 
agregar el estudiante a una lista y otro para eliminar un estudiante seleccionado de la lista. 
La aplicación debe mostrar una tabla con todos los estudiantes registrados y permitir la búsqueda 
de un estudiante por su nombre o correo electrónico.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
public class RegistroInterfaz extends JFrame implements ActionListener{
    private JTextField txtNombre, txtApellido, txtEdad, txtCorreo;
    private JTable tablaEstudiantes;
    private DefaultTableModel modeloTabla;
    private JButton btnAgregar, btnEliminar, btnBuscar;
    
    public RegistroInterfaz() {
        // Configuración básica de la ventana
        setTitle("Registro de Estudiantes");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        
         // Creamos un panel para colocar los elementos
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
         // Creamos los campos de texto para ingresar los datos del estudiante
        JPanel panelCampos = new JPanel();
        panelCampos.setLayout(new GridLayout(4, 2));
        panelCampos.setBorder(BorderFactory.createTitledBorder("Ingresar Estudiante"));
        JLabel lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField(10);
        JLabel lblApellido = new JLabel("Apellido:");
        txtApellido = new JTextField(10);
        JLabel lblEdad = new JLabel("Edad:");
        txtEdad = new JTextField(10);
        JLabel lblCorreo = new JLabel("Correo Electrónico:");
        txtCorreo = new JTextField(10);
        panelCampos.add(lblNombre);
        panelCampos.add(txtNombre);
        panelCampos.add(lblApellido);
        panelCampos.add(txtApellido);
        panelCampos.add(lblEdad);
        panelCampos.add(txtEdad);
        panelCampos.add(lblCorreo);
        panelCampos.add(txtCorreo);
        panel.add(panelCampos, BorderLayout.NORTH);
        
        
         // Creamos la tabla donde se mostrarán los estudiantes registrados
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Edad");
        modeloTabla.addColumn("Correo Electrónico");
        tablaEstudiantes = new JTable(modeloTabla);
        JScrollPane scrollTabla = new JScrollPane(tablaEstudiantes);
        panel.add(scrollTabla, BorderLayout.CENTER);

        // Creamos los botones para agregar, eliminar y buscar estudiantes
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());
        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(this);
        panelBotones.add(btnAgregar);
        btnEliminar = new JButton("Eliminar");
        btnEliminar.addActionListener(this);
        panelBotones.add(btnEliminar);
        btnBuscar = new JButton("Buscar");
        btnBuscar.addActionListener(this);
        panelBotones.add(btnBuscar);
        panel.add(panelBotones, BorderLayout.SOUTH);

        // Agregamos el panel a la ventana
        add(panel);

        // Hacemos visible la ventana
        setVisible(true);
    }

    public static void main(String[] args) {
        new RegistroInterfaz();
    }

    @Override
   
         public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAgregar) {
            // Agregar un nuevo estudiante a la tabla
            String[] datos = {txtNombre.getText(), txtApellido.getText(), txtEdad.getText(), txtCorreo.getText()};
            modeloTabla.addRow(datos);
            // Limpiar los campos de texto
            txtNombre.setText("");
            txtApellido.setText("");
            txtEdad.setText("");
            txtCorreo.setText("");
        } else if (e.getSource() == btnEliminar) {
             // Eliminar el estudiante seleccionado de la tabla
            int filaSeleccionada = tablaEstudiantes.getSelectedRow();
            if (filaSeleccionada != -1) {
                modeloTabla.removeRow(filaSeleccionada);

            } else if (e.getSource() == btnBuscar) {
            // Buscar un estudiante por nombre o correo electrónico
            String terminoBusqueda = JOptionPane.showInputDialog(this, "Ingrese el nombre o correo electrónico del estudiante a buscar:");
            if (terminoBusqueda != null && !terminoBusqueda.isEmpty()) {
                boolean encontrado = false;
                for (int i = 0; i < modeloTabla.getRowCount(); i++) {
                        String nombre = (String) modeloTabla.getValueAt(i, 0);
                        String correo = (String) modeloTabla.getValueAt(i, 3);
                    if (nombre.equalsIgnoreCase(terminoBusqueda) || correo.equalsIgnoreCase(terminoBusqueda)) {
                            tablaEstudiantes.setRowSelectionInterval(i, i);
                                encontrado = true;
                                break;
                        }
                    }
            if (!encontrado) {
                JOptionPane.showMessageDialog(this, "No se encontró ningún estudiante con el nombre o correo electrónico ingresado.");
         }
            }
            }
        }
         }
}
         



