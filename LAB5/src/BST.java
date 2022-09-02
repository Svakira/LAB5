public class BST <C> {
    private Node<C> root;
public static int cont;



    public void registerCitizen(Node node) {
        if (root == null) {
            root = node;
        } else {
            registerCitizen(node, root);
        }
    }
    private void registerCitizen(Node node, Node current) {
        if (node.getValue()<current.getValue()) {
            if (current.getLeft() == null) {
                current.setLeft(node);
            } else {
                System.out.println("Registrado left");
                registerCitizen(node,current.getLeft());

                return;
            }
        } else if (node.getValue()> current.getValue()) {
            if (current.getRigth() == null) {
                current.setRigth(node);
            } else {
                System.out.println("Registrado RIGTH");
                registerCitizen(node,current.getRigth());
            }
        } else {

        }
    }

    public Node search(int id){
        cont=1;
        return search(id, root);
    }

    private Node search(int id, Node current){
        if(current == null){
            return null;
        }
        if(id == current.getValue()){
            return current;
        }
        else if(id== current.getValue()){
            cont++;
            return search(id, current.getLeft());
        } else{
            cont++;
            return search(id, current.getRigth());
        }
    }
    public int contador(){
        return cont;
    }

    public Node delete(int id){
        return delete(id, root);
    }
    private Node delete(int id, Node current){
        if(current == null){
            return null;
        }
        if(id == current.getValue()){
            //1. Nodo Hoja
            if(current.getLeft() == null && current.getRigth() == null){
                if(current == root){
                    root = null;
                }else{

                }
                return null;
            }
            //2. Nodo solo hijo izquierdo
            else if (current.getRigth() == null){
                if(current == root){
                    root = current.getLeft();
                }
                return current.getLeft();
            }
            //3. Nodo solo hijo derecho
            else if(current.getLeft() == null){
                if(current == root){
                    root = current.getRigth();
                }
                return current.getRigth();
            }
            //4. Nodo con dos hijos
            else{
                Node min = getMin(current.getRigth());
                current.setValue(min.getValue());
                Node subarbolDER = delete(min.getValue(), current.getRigth());
                current.setRigth( subarbolDER );
                return current;
            }


        }else if(id== current.getValue()){
            Node subArbolIzquierdo = delete(id, current.getLeft());
            current.setLeft(subArbolIzquierdo);
            return current;
        }else{
            Node subArbolDerecho = delete(id, current.getRigth());
            current.setRigth(subArbolDerecho);
            return current;
        }
    }
    public Node getMin(Node current){
        if(current.getLeft() == null){
            return current;
        }
        return getMin(current.getLeft());
    }

}



