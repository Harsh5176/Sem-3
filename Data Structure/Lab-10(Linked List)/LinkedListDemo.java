
class LinkedListDemo 
{
    
    public Node First = null;

        class Node
        {
            int info;
            Node link;
        
            public Node(int info)
            {
                this.info = info;
                this.link = null;
            }
//==============================================insertAtFirst===========================================

        public void insertAtFirst(int data) {
            Node newnode = new Node(data);
            
            if (First == null) {
                First = newnode;
                return;
            }

            newnode.link = First;
            First = newnode; 
        }
//==============================================insertAtLast===========================================

        public void insertAtLast(int data) {
            Node newnode = new Node(data);
            // If list is empty, newNode will be the first Node
            if (First == null) {
                First = newnode;
                return;
            }
            
            Node save = First;
            // until we find the last null whose link poertion is null
            while (save.link != null) {
                save = save.link;
            }
            // link poertion of last node will store the address of the newNode
            save.link = newnode;
        }
//==============================================insertAtAny================================================

        public void insertAtAnyPosition(int i, int data) {
            Node newnode = new Node(data);
            if (First == null) {
                System.out.println("list is empty");
                return;
            }
            Node save = First;
            for (int j = 1; j < i - 1; j++) {
                if (save == null) {
                    System.out.println("Index out of bounds");
                    return;
                }
                save = save.link;
            }
            if (save != null) {
                newnode.link = save.link;
                save.link = newnode;
            }
        }

//==============================================DeleteAtFirst================================================


        public void deleteAtFirst() {
            if (First == null) {
                System.out.println("List is empty");
                return;
            }
// first node delete thase tyare aena pa6ina ne first point karse
            First = First.link;
        }

//==============================================DeleteAtFirst================================================


        public void deleteAtLast() {
            if (First == null) {
                System.out.println("List is empty");
                return;
            }
            if (First.link == null) {
                First = null;
                return;
            }

            Node save = First;
            while (save.link.link != null) {
                save = save.link;
            }
            save.link = null;
        }

//==============================================DeleteAtAny================================================

        public void deleteAtAnyPosition(int p) {
            if (First == null) {
                System.out.println("List is empty");
                return;
            }

            Node save = First;
            Node prev = null;

            if (save.info == p) {
                First = save.link;
                return;
            }
            while (save != null && save.info != p) {
                prev = save;
                save = save.link;
            }
            if (save == null) {
                System.out.println("Node not found");
                return;
            }
            prev.link = save.link;
        }


//==============================================Display Method==============================================

        public void display() {
            if (First == null) {
                System.out.println("List is empty");
                return;
            }
            Node save = First;
            while (save != null) {
                System.out.print(save.info + " ");
                save = save.link;
            }
            System.out.println("");
        }
//==============================================Count Method==============================================

        public void count(){
            if(First==null){
                System.out.println("List is empty");
                return;
            }

            int count = 0;
            Node save = First;

            while(save != null){
                count++;
                save = save.link;
            }
        }
}

    public static void main(String[] args) {
         
        

        }
}