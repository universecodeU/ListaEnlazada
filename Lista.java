
package listaenlazada;

/**
 *
 * @author I.S.C. Cruz Medinilla Martin codemcmg@gmail.com
 */
public class Lista {
    
    Nodo head;
    
    public Lista(){
        head=null;
    }
    
    
    public void insertarNodo(String dato){
        Nodo n= new Nodo(dato);
        
        if(head!=null){
         n.next=head;
         head=n;
        }else{
            head=n;
        }
    }
    
    
    public String verLista(){
        String milista="Contenido de la lista \n";
        Nodo auxiliar=head;
        if(head==null){
            milista="La lista se encuentra vacia";
        }else{
            
            while(auxiliar!=null){
                milista += auxiliar.dato+"\n";
                auxiliar= auxiliar.next;
            }
        }
        return milista;
    }
    
    
    public String revisarExistencia(String dato){
        String mensaje="";
        Nodo auxiliar=head;
        String encontrado=null;

        while(auxiliar!=null){
           if(auxiliar.dato.equals(dato)){
            encontrado=auxiliar.dato;
            mensaje="El dato que ingreso si se encuentra en la lista";
            break;
               }
           auxiliar=auxiliar.next;
        }
        
        if(encontrado==null)
            mensaje="El dato no fue encontrado";
           
        
        return mensaje;
    }
    
    
    public String borrarDato(String dato){
        String mensaje="";
        Nodo auxiliar=head;
       
        if(head!=null)
        if(head.dato.equals(dato)){
            head=head.next;
        }else{
            
            while(auxiliar.next!=null){
                if(auxiliar.next.dato.equals(dato)){
                    auxiliar.next=auxiliar.next.next;
                    mensaje="se elimino el dato";
                    break;
                }
                auxiliar=auxiliar.next;
            }
        }
        
        if(mensaje.equals(""))
        {
            mensaje="El dato no se encontraba en la lista";
        }
        
        
        
        return mensaje;
    }
    
}
