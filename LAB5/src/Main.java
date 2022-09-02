import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lect= new Scanner(System.in);
        BST<Citizen>arbol=new BST<>();
        boolean entry=false;
        int answEntry;
        while(!entry){
            System.out.println("***************************");
            System.out.println("Registro DANE");
            System.out.println("***************************");
            System.out.println("1. Inscribir a un ciudadano");
            System.out.println("2. Consultar por cedula");
            System.out.println("3. Eliminar a un ciudadano por cedula");
            System.out.println("4. Salir");
            answEntry= lect.nextInt();
            lect.nextLine();

            switch (answEntry){
                case 1:
                    System.out.println("Enter the id of the citizen");
                    int id= lect.nextInt();
                    lect.nextLine();
                    System.out.println("Enter the full name of the citizen");
                    String completeName= lect.nextLine();
                    System.out.println("Fecha de nacimiento");
                    String birthDate=lect.nextLine();
                    System.out.println("Lugar de nacimiento");
                    String birthCity= lect.nextLine();
                    arbol.registerCitizen(new Node (id,completeName,birthDate,birthCity));
                    System.out.println("registered id :"+id);

                    break;
                case 2:
                    System.out.println("Enter the id of the citizen you want to search");
                    int idG=lect.nextInt();
                    lect.nextLine();
                    Node pers= arbol.search(idG);
                    if(pers==null){
                        System.out.println("No se encuentra");
                    }
                    else {
                        System.out.println(arbol.search(idG));
                        System.out.println("***************************");
                        System.out.println(pers.getId());
                        System.out.println(pers.getPerson().getCompleteName());
                        System.out.println(pers.getPerson().getBirthDate());
                        System.out.println(pers.getPerson().getBirthCity());
                        System.out.println("***************************");
                        System.out.println("Encontrado en :" + arbol.contador());
                        System.out.println("***************************");
                    }

                    break;
                case 3:
                    System.out.println("Enter the id you want to eliminate");
                    int idE=lect.nextInt();
                    arbol.delete(idE);
                    break;
                case 4:
                    entry=false;
                    break;

            }
        }
    }
}
