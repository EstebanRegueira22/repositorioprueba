
package ejerciciohumano;


public class Humano {
    
    private String nombre;
    private String apellido;
    private int edad;    
    private String fechaDeNacimiento;
    private String sexo;
    
    public Humano (){
        
    }
    
    public Humano (String nombre, String apellido, int edad){
        
        this.nombre = nombre;
        this.apellido = apellido;
        if (edad<0 || edad > 160){
            System.out.println("Ha ingresado una edad incorrecta");
        }
        else if (edad<18){
            System.out.println("Usted es menor de edad");        
        }
        else {
            System.out.println(this.nombre +" "+ this.apellido + " usted es mayor de edad");
        }
        
    }
    
    public Humano (String nombre, String apellido, int edad, String fechaDeNacimiento){
        
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.apellido = apellido;
        if (edad<0 || edad > 160){
            System.out.println("Ha ingresado una edad incorrecta");
        }
        else if (edad<18){
            System.out.println("Usted es menor de edad");        
        }
        else {
            System.out.println(this.nombre +" "+ this.apellido + " usted es mayor de edad y ha nacido el "+this.fechaDeNacimiento);
        }
        
    }
    
    public Humano (String nombre, String apellido, int edad, String fechaDeNacimiento, String sexo){
        
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.apellido = apellido;
        
        if (edad<0 || edad > 160){
            System.out.println("Ha ingresado una edad incorrecta");
        }
        else if (edad<18){
            System.out.println("Usted es menor de edad");        
        }
        else {
            System.out.print(this.nombre +" "+ this.apellido + " usted es mayor de edad y ha nacido el "+this.fechaDeNacimiento +" ");
        }
        
        if ("femenino".equals(sexo) || "masculino".equals(sexo) || "Femenino".equals(sexo) || "Masculino".equals(sexo)){
            this.sexo = sexo;
            System.out.println(this.sexo);
        }
        else {
            System.out.println("Sexo ingresado incorrecto. Por favor ingrese 'Masculino' o 'Femenino'");
        }
            
        
    }
    

   
    public static void main(String[] args) {
        
        Humano h1 = new Humano("Maria", "Perez", 20);
        
        Humano h2 = new Humano ("Sergio", "Martinez", 29, "20  de Enero de 1989");
        
        Humano h3 = new Humano ("Juan", "Di Paolo", 30, "25 de Junio de 1988", "Masculino");
        
        Humano h4 = new Humano ("Miriam", "Gonzalez", 15);
        
    }
    
}
