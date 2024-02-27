import java.util.LinkedList;

public class LinkedListsPractice {

    /*
    Run on the main method:

        LinkedListsPractice addingCheck = new LinkedListsPractice();
        addingCheck.addElementsToLinkedList();
    }

     */
    public LinkedList<String> mylinkedLists = new LinkedList<String>();

    public void addElementsToLinkedList(){
        mylinkedLists.push("A");
        mylinkedLists.push("B");
        mylinkedLists.push("C");
        mylinkedLists.push("D");
        mylinkedLists.push("E");

        System.out.println(mylinkedLists);
    }
}
