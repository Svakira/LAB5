public class Node <C>{

    private int id;
    private int value;
    private Citizen person;

   private Node<C>left;
   private Node<C>rigth;


    public Node(int id, String completeName, String birthDate, String birthCity) {
        this.id=id;
        this.value=id;
       person=new Citizen(id, completeName, birthDate, birthCity) ;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node<C> getLeft() {
        return left;
    }

    public void setLeft(Node<C> left) {
        this.left = left;
    }

    public Node<C> getRigth() {
        return rigth;
    }

    public void setRigth(Node<C> rigth) {
        this.rigth = rigth;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Citizen getPerson() {
        return person;
    }

    public void setPerson(Citizen person) {
        this.person = person;
    }
}
