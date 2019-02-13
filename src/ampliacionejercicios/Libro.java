package ampliacionejercicios;
import java.util.Scanner;
public class Libro {

   private int ISBN;
    private String Titulo;
    private String Autor;
    private int nPaginas;
    
    public Libro(String Titulo,int ISBN, String Autor, int nPaginas){
    this.Titulo=Titulo;
    this.ISBN=ISBN;
    this.Autor=Autor;
    this.nPaginas=nPaginas;
    }
    
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }


    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }


    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getnPaginas() {
        return nPaginas;
    }
    
    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }
 

    public String  toString(){
     String mensaje =  "El libro con el ISBN " +  getISBN() + " creado por " +  getAutor() + " tiene " +  getnPaginas() +" páginas";
     System.out.println(mensaje);
     return mensaje;
}
    
    public static void main (String[] args){
    
        Scanner sc= new Scanner(System.in);
         System.out.println("Introduzca el título del primer libro");
        String Titulo=sc.nextLine();
      System.out.println("Introduzca el ISBN del primer  libro");
        int ISBN=sc.nextInt();
        System.out.println("Introduzca el autor del primer libro");
        String Autor= sc.next();
        System.out.println("Introduzca el nº de páginas  del primer libro");
        int nPaginas=sc.nextInt();
        Libro book= new Libro(Titulo, ISBN, Autor, nPaginas);
       
       System.out.println("Introduzca el título del segundo libro");
       String Titulo1=sc.next();
       System.out.println("Introduzca el ISBN del segundo libro");
       int ISBN1=sc.nextInt();
       System.out.println("Introduzca el autor del segundo  libro");
       String Autor1= sc.next();
       System.out.println("Introduzca el nº de páginas  del segundo libro");
       int nPaginas1=sc.nextInt();
       
        Libro book1= new Libro(Titulo1, ISBN1, Autor1, nPaginas1);
        
        book.toString();
        book1.toString();
        
        if (book.nPaginas>book1.nPaginas){
        System.out.println("El libro 1 tiene más páginas");
        }else if (book1.nPaginas>book.nPaginas){
        System.out.println("El libro 2 tiene más páginas");
        }else{
            System.out.println("Tienen el mismo níumero de páginas");
        }
     
        
        
   
        
        
    }
    
}
