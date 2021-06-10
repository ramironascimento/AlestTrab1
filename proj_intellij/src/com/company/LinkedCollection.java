package com.company;

public class LinkedCollection<T> {
    //region Attributes
    protected Node<T> tail; // begin
    protected Node<T> head; // end
    protected int qtdElem = 0;
    //endregion

    //region Subclass
    protected class Node<E> {

        //region Attributes
        private final LinkedCollection<Integer> pages; // collection of the pages of each word
        private Node<E> refPrev;
        private Node<E> refNext;
        private final E item;
        //endregion

        //region Constructor
        public Node(E item){
            this.item = item;
            this.pages = new LinkedCollection<>();
        }
        //endregion

        //region Methods
        public LinkedCollection<Integer> getPages() {
            return pages;
        }

    }
    //endregion

    //region Constructor
    public LinkedCollection(){
        tail = head = null;
    }
    //endregion

    //region Methods

    //region Test Methods
    protected T getTail() {
        if(tail == null) return null;
        return tail.item;
    }

    protected T getHead() {
        if(head == null) return null;
        return head.item;
    }
    //endregion

    //region Get Methods
    public T get(int pos){
        if(qtdElem <= pos) return null;
        Node<T> return_node = findNext(tail, pos);
        return return_node.item;
    }

    public Node<T> getWord(String word) {
        int low  = 0;
        int high = qtdElem-1;
        int mid = ((high-low)/2) + low;
        while(low <= high){
            if (word.compareToIgnoreCase(this.get(mid).toString())==0){
                return findNext(tail,mid);
            }
            else{
                if (word.compareToIgnoreCase(this.get(mid).toString())<0){ // word is after the stopWord searched
                    high = mid-1;
                }
                else
                {
                    low = mid +1;
                }
                mid = low + ((high-low)/2);
            }
        }
        return null;
    }

    private Node<T> findPrev(Node<T> previous_node, int head_jump){
        if(head_jump == 0) {
            return previous_node;
        }
        return findPrev(previous_node.refPrev, --head_jump);
    }

    private Node<T> findNext(Node<T> next_node, int tail_jump){
        if(tail_jump == 0) {
            return next_node;
        }
        return findNext(next_node.refNext, --tail_jump);
    }
    //endregion

    //region Add Methods

    public boolean add(int pos,T item){
        if(tail == null){ // if it's the first time you are inserting an Node to the LinkedCollection
            addFirst(item);
            return true;
        }
        else if (pos <qtdElem){
            Node<T> occupant=findNext(tail, pos),
                    previous=findPrev(occupant, 1);
            if(previous == null){
                addFirst(item);
            }
            else{
                Node<T> new_node = new Node<>(item);
                previous.refNext = new_node;
                new_node.refPrev = previous;
                new_node.refNext = occupant;
                occupant.refPrev = new_node;
                qtdElem++;
            }
            return true;
        }
        else if (pos == qtdElem){
            addLast(item);
            return true;
        }
        else{
            return false;
        }
    }

    public void addFirst(T item){
        Node<T> new_node = new Node<>(item);
        if(tail == null){
            head = tail = new_node;
        }
        else {
            tail.refPrev = new_node;
            new_node.refNext = tail;
            tail = new_node;
        }

        qtdElem++;

    }

    public boolean addLast(T item){
        Node<T> new_node = new Node<>(item);
        if(this.head == null){
            tail = head = new_node;
        }
        else {
            new_node.refPrev = this.head;
            this.head.refNext = new_node;
            this.head = new_node;
        }
        qtdElem++;
        return true;
    }

    public void addPage(String word,int page){
        if (!this.existPage(word,page)) {
            this.getWord(word).getPages().addLast(page);
        }
    }

    //endregion

    //region Remove Methods
    public T remove(int pos){
        if (pos <=qtdElem){
            Node<T> removed=findNext(this.tail, pos),
                    previous=findPrev(removed,1);
            if(previous != null) {
                previous.refNext = null;
                if (removed == head){
                    this.head = previous;
                }
            }
            else{
                head = tail = null;
            }
            qtdElem--;
            return removed.item;
        }
        else{
            return null;
        }
    }

    public T removeLast(){
        if(head != null) {
            Node<T> last_but_one = findPrev(head,2);
            T return_item = last_but_one.refNext.item;
            last_but_one.refNext = null;
            qtdElem--;
            return return_item;
        }
            else {
            return null;
        }
    }
    //endregion

    //region Misc Methods
    public int newNodePosition(String word){
        if(this.qtdElem==0){
            return 0;
        }
        int low  = 0;
        int high = qtdElem-1;
        int mid = ((high-low)/2) + low;
        int currentVal;
        int closestToZero = word.compareToIgnoreCase(this.get(mid).toString()) * word.compareToIgnoreCase(this.get(mid).toString());
        while(low <= high){
            currentVal = word.compareToIgnoreCase(this.get(mid).toString()) * word.compareToIgnoreCase(this.get(mid).toString());
            if(currentVal <= word.compareToIgnoreCase(this.get(mid).toString())*word.compareToIgnoreCase(this.get(mid).toString()) ){
                closestToZero = word.compareToIgnoreCase(this.get(mid).toString());
            }
            if (word.compareToIgnoreCase(this.get(mid).toString())<0){ // word is after the stopWord searched
                high = mid-1;
            }
            else
            {
                low = mid +1;
            }
            mid = low + ((high-low)/2);
        }
        return mid;
    }

    public boolean existWord(String word) {
        int low  = 0;
        int high = qtdElem-1;
        int mid = ((high-low)/2) + low;
        while(low <= high){
            if (word.compareToIgnoreCase(this.get(mid).toString())==0){
                return true;
            }
            else{
                if (word.compareToIgnoreCase(this.get(mid).toString())<0){ // word is after the stopWord searched
                    high = mid-1;
                }
                else
                {
                    low = mid +1;
                }
                mid = low + ((high-low)/2);
            }
        }
        return false;
    }

    public boolean existPage(String word,int page) {
        LinkedCollection<Integer> pageCollection = this.getWord(word).getPages();
        if (pageCollection == null){
            return false;
        }
        LinkedCollection<Integer>.Node<Integer> pageNode = pageCollection.tail;
        if(pageNode==null){
            return false;
        }
        while(true){
            if(pageNode.item == page){
                return true;
            }
            if((pageNode.refNext==null)){
                break;
            }
            pageNode = pageNode.refNext;
        }
        return false;
    }

    public void printLinkedCollection(String type){

        Node<T> node = this.tail;
        if(type.equals("word")){
            int wordCounter = 1;
            while(true){
                System.out.println(" ");
                System.out.println("[ "+ wordCounter +" ] - " + node.item);
                if (node.getPages().tail!=null){
                    node.getPages().printLinkedCollection("page");
                }
                if(node.equals(head)){
                    break;
                }
                node = node.refNext;
                wordCounter++;
            }
        }
        else if(type.equals("page")){
            int pageCounter=1;
            if(!(node == null)) {
                System.out.print(" Pages: ");
                while (true) {
                    System.out.print(" [ " + node.item + " ] ");
                    if (node.equals(head)) {
                        break;
                    }
                    node = node.refNext;
                    pageCounter++;
                }
            }
        }
        else{
            System.out.println("!Error: Invalid option to print");
        }

    }
    //endregion



    //endregion

}
