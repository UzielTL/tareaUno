
/**
 * Tarea 1 de auxiliatura
 * 
 * @author Uziel Ticona Ledezma 
 * @version 14/04/2021
 */
public class Estudiante{
    private String nombre;
    private String carrera;
    private int    CodSis;
    private int    edad;
    
    public Estudiante(String nombre,String carrera,int CodSis,int edad ){
        this.nombre  = nombre;
        this.carrera = carrera;
        this.CodSis  = CodSis;
        this.edad    = edad;
    }
    
    public String Presentarse(){
        String respuesta= "Hola mi nombre es "+nombre+", estoy en la carrera de "+carrera+" y tengo "+edad+" años";
        return respuesta;
    }
    
    public String Dormir(){
        return "ZZZ"; 
    }
    
    public boolean tieneNovia(){
        boolean res=false;
        int respuesta;
        respuesta=(int)(Math.random()*2);
        System.out.println(respuesta);
        if(respuesta==1){
            res= true;
        }else{
            res=false;
        }
        return res;
    }
    public void setCambiarNombre(String nombre){
        this.nombre= nombre;
    }
    private String gettNombre(){
        return nombre;
    }
    
    public void setCambiarCarrera(String carrera){
        this.carrera= carrera;
    }
    private String getCarrera(){
        return carrera;
    }
    
    public void setCambiarCodSis(int CodSis){
        this.CodSis= CodSis;
    }
    private int getCodSis(){
        return CodSis;
    }
    
    public void setCambiarEdad(int edad){
        this.edad= edad;
    }
    private int getCambiarEdad(){
        return edad;
    }
    
}
