public class LinkedList<E>
{
    Node<E> head;
    void add(E data)
    {
        Node<E> tmp=head;
        Node<E> toadd =new Node<E>(data);
        if(head==null)
        {
            head=toadd;
            return ;
        }
        while(tmp.next!=null)
        {
            tmp=tmp.next;
        }
        tmp.next=toadd;
    }
    ///////////////////////////////////
    
    void addAt(E data,int index)
    {
        Node<E> tmp=head;
        Node<E> toadd=new Node<E>(data);
        if(head==null)
        {
            head=toadd;
        }
        for(int i=0;i<index-1;i++)
        {
            tmp=tmp.next;
        }
        System.out.println("toadd  "+toadd);
        System.out.println("tmp  "+tmp);
        System.out.println("toadd.next  "+toadd.next);
        System.out.println("tmp.next  "+tmp.next);
        toadd.next=tmp.next;
        tmp.next=toadd;       
    }
    ////////////////////////////////
    void addAtLast(E data)
    {
        Node<E> tmp=head;
        Node<E> toadd=new Node<E>(data);
        if(head==null)
        {
            head=toadd;
        }
        while(tmp.next!=null)
        {
            tmp=tmp.next;
        }
        toadd.next=tmp.next;
        tmp.next=toadd;
    }
    //////////////////////////////
    void delet(E no)
    {
        Node<E> tmp=head;
        if(isEmpty())
        {
            return;
        } 
        if(tmp.next==null)
        {
            tmp=null;
        }
        while(tmp.data!=no)
        {
            tmp=tmp.next;
        }
        Node<E> toDelete=tmp;
        tmp.next=toDelete;
        toDelete.next=tmp.next;
        toDelete.next=null;
    }
    ///////////////////////////////
    boolean isEmpty()
    {
        return (head==null);
    } 
    //////////////////////////////////
    void print()
    {
        Node<E> tmp=head;
        while(tmp.next!=null)
        {
            System.out.print(tmp.data+"  ");
            tmp=tmp.next; 
        }
        System.out.println(tmp.data);
    }
    ////////////////////////////////
    public  static class Node<E>
    {
        E data;
        Node<E> next;
        Node<E> prev;   
    public Node(E data2)
    {
        this.data=data2;  
        next=null;
    }
   }
   /////////////////////////////////
   void reverse()
   {
      Node<E> prev=null;
      if(head.next==null || head==null)
      {
          return;
      }
    while(head!=null)
    {
       Node<E> nextNode = head.next;
       head.next=prev;
       prev=head;
       head=nextNode;
    }
    while(prev!=null)
    {
        System.out.print(prev.data+"  ");
        prev=prev.next;
    }
   }
  ////////////////////////////////
    public static void main(String[] args)
    {
        LinkedList<Integer> lst=new LinkedList();
        lst.add(9);
        lst.add(12);
        lst.add(7);
        lst.add(46);
        lst.add(50);
        lst.add(25);
        lst.addAt(63, 2);
       lst.addAtLast(99);
        lst.print();
        lst.reverse();
    }    
}
