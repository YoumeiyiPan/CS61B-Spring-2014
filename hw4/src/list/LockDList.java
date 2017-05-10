package list;


public class LockDList extends DList{
	protected LockDListNode newNode(Object item, DListNode prev, DListNode next) {
	    return new LockDListNode(item, prev, next);
	    }
	  public void lockNode(DListNode node) {
		 ((LockDListNode)node).lock=true;
      }
	  
	  public void remove(DListNode node){
		    if (((LockDListNode)node).lock == false) {
		        super.remove(node);
		    }
	  }
}
