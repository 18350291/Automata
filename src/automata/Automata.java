
package automata;

public class Automata {
    public static String cadenaOrig, cadenaAux;

    public static void main(String[] args) {
        Automata obj = new Automata();
        cadenaOrig = "101";
        cadenaAux = cadenaOrig;
        
        obj.Estado1(cadenaAux);
        
    }
    
    public void Estado1(String cadena){
        Automata obj1 = new Automata();
        
        cadena = cadena.startsWith("101") ? cadena.substring(3) : cadena; //Evalúa 1010*
        //cadena = cadena.startsWith("1010") ? cadena.substring(3) : cadena; //Evalúa 1010+
        
        if (cadenaAux.equals(cadena)){ // Se compara el valor de la cadena auxiliar y la cadena actual
            //Si no sufrió cambios la cadena es inválida
            obj1.Error(); //Se llama al método error y el proceso termina
            
        }else{
            cadenaAux = cadena;
            obj1.Estado2(cadena);
        }
    }
    
    public void Estado2(String cadena){
        Automata obj2 = new Automata();
        
        cadenaAux = cadena;
        
        for (int i = 0; i <= cadenaAux.length()+1; i++){
            cadena = cadena.startsWith("0") ? cadena.substring(1) : cadena;
        }
        
        if (cadena.length()==0){
            obj2.Validacion();
        }else{
            obj2.Error();
        }
                        
    }
    
    public void Error(){
        System.out.println(cadenaOrig + "Es una cadena inválida");
    }
    
    public void Validacion(){
        System.out.println(cadenaOrig + " Es una cadena válida");
    }
    
}
