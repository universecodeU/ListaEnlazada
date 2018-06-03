
package listaenlazada;

import javax.swing.JOptionPane;

/**
 *
 * @author I.S.C. Cruz Medinilla Martin codemcmg@gmail.com
 */
public class Inicio {


    
    public static void main(String[] args) {
    Lista listaNombres= new Lista();
    
    /*
    listaNombres.insertarNodo("Martin");
    listaNombres.insertarNodo("Jose");
    listaNombres.insertarNodo("Teresa");
    listaNombres.insertarNodo("Luis");
    
    
    String datos=listaNombres.verLista();
    System.out.println(datos);
    //System.out.println(" ¿Existe el dato Martin?...");
    //String buscar=listaNombres.revisarExistencia("Martin");
    //System.out.println(buscar);
    listaNombres.borrarDato("Martin");
    listaNombres.borrarDato("Teresa");
    listaNombres.borrarDato("Jose");
    listaNombres.borrarDato("Luis");
    System.out.println("LISTA DESPUES DE BORRAR DATOS...");
    datos=listaNombres.verLista();
    System.out.println(datos);
    
    */
    
    int opc=0;
    String var="";
            do{
              opc=Integer.parseInt(JOptionPane.showInputDialog("1.Agregar dato \n 2.Listar \n 3.Borrar \n4.Existe"));
              
              switch(opc){
                  case 1:
                       var=JOptionPane.showInputDialog("Ingrese un nombre:");
                      listaNombres.insertarNodo(var);
                      break;
                  case 2:
                      JOptionPane.showMessageDialog(null,listaNombres.verLista());
                      break;
                  case 3:
                      var=JOptionPane.showInputDialog("Ingrese un nombre a borrar:");
                      listaNombres.borrarDato(var);
                      
                      break;
                  case 4:
                      var=JOptionPane.showInputDialog("Ingrese un nombre a buscar:");
                      JOptionPane.showMessageDialog(null, listaNombres.revisarExistencia(var));
                      break;
                  case 5:
                      JOptionPane.showMessageDialog(null, "Adios...");
                      break;                      
              }
              
            }while(opc!=5);
    
    
    
    
    
    }
    
}
