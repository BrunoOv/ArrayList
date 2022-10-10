import oop.collections.list.arraylist.ArrayList;
import oop.collections.list.arraylist.ArrayListIterator;

public class Main {
    public static void main(String[] args){
        ArrayList datos = new ArrayList();
        datos.addAtFront("primero");
        datos.addAtFront("primero");
        datos.addAtFront("segundo");
        datos.addAtFront("cuarto");
        datos.addAtFront("primero");
        datos.addAtTail("tercero");
        datos.addAtTail("tercero");
        datos.addAtTail("tercero");
        //datos.removeAll();
        datos.removeAllWithValue("primero");
        datos.setAt(1,"new");
        ArrayListIterator iterator = datos.getIterator();

        while(iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }
    }
}
