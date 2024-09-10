
package BBDD;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
public class Registro {
   private static final String driver = "org.sqlite.JDBC";
   private static final String bbdd = "jdbc:sqlite:usuarios.db";
   private static final String usuario = "root";
   private static final String clave = "";
   
   public static boolean checkString (String s){
       return (s.length() > 0) &&(s!=null);
   }
   
   //INTERFAZ
   public static class Ventana extends JFrame{
       public Ventana (Connection con){
           this.setTitle("Registro de ususarios");
           this.setSize(800,800);
           this.setDefaultCloseOperation(EXIT_ON_CLOSE);
           this.setResizable(false);
           
           BoxLayout vertical = new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS);
           this.setLayout(vertical)
                   ;
           JPanel fila1 = new JPanel();
           JPanel fila2 = new JPanel();
           JPanel fila3 = new JPanel();
           BoxLayout hor1 = new BoxLayout(fila1,BoxLayout.X_AXIS);
           BoxLayout hor2 =  new BoxLayout(fila2,BoxLayout.X_AXIS);
           BoxLayout hor3 = new BoxLayout (fila3,BoxLayout.X_AXIS);
           fila1.setLayout(hor1);
           fila2.setLayout(hor2);
           fila3.setLayout(hor3);
           
           fila1.add(new JLabel("Nombre: "));
           fila1.add(Box.createHorizontalStrut(100));
           JTextField campoNombre = new JTextField();
           campoNombre.setMaximumSize(new Dimension(200,30));
           fila1.add(campoNombre);
           
           fila2.add(new JLabel("Email: "));
           fila2.add(Box.createHorizontalStrut(100));
           JTextField campoEmail = new JTextField();
           campoEmail.setMaximumSize(new Dimension(200,30));
           fila2.add(campoEmail);
           
           JButton botonReg = new JButton("Registro");
           fila3.add(botonReg);
           fila3.add(Box.createHorizontalStrut(100));
           JLabel etQuery = new JLabel("");
           fila3.add(etQuery);
           botonReg.addActionListener((e)->{
               try{
                   String insertUsuario = "INSERT INTO datos_usuarios (nombre,email)"
                           +"VALUES (?,?)";
                   PreparedStatement insertSt = con.prepareStatement(insertUsuario);
                   if(checkString(campoNombre.getText()) && checkString(campoEmail.getText())){
                   
                   insertSt.setString(1,campoNombre.getText());
                   insertSt.setString(2,campoEmail.getText());
                   insertSt.executeUpdate();
                   campoNombre.setText("");
                   campoEmail.setText("");
                   etQuery.setText("OK");
                   }else{
                       etQuery.setText("escribe algo");
                   }
                   
                   
               }catch(SQLException ex){
                   etQuery.setText("ha habio un erro: "+ex.getMessage());
                   ex.printStackTrace();
                   
               }
           });
           
           
           this.add(fila1);
           this.add(fila2);
           this.add(Box.createHorizontalStrut(100));
           this.add(fila3);
           
           
       }
   }
   
    public static Connection conexion(){
       Connection con = null;
       
       try{
           Class.forName(driver);
           
           con = DriverManager.getConnection(bbdd,usuario,clave);
           
           //CREACION TABLA DE USUARIOS(NOMBRE,EMAIL)
           String createUsuarios = "CREATE TABLE IF NOT EXISTS datos_usuarios("
                   + "nombre TEXT NOT NULL,"
                   +"email TEXT PRIMARY KEY"
                   +")";
           
                   Statement sentencia = con.createStatement();
                   try{
                       sentencia.executeUpdate(createUsuarios);
                   }catch(SQLException ex){
                       ex.printStackTrace();
                   }
           
           
       }catch(Exception e){
           System.out.println("Error al conectar con la bse de datos.\n"
               + e.getMessage().toString());
           e.printStackTrace();
       }
       return con;
   }
    
    public static void main (String[] args){
        Connection con = null;
       
       con=conexion();
       if(con !=null){
           System.out.println("Conectado correctamente");
           Ventana v= new Ventana(con);
           v.setVisible(true);
       }else{
           System.out.println("No has podido conectarte");
       }
    }
}

