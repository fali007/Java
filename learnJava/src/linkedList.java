public class linkedList {
    public node root;
    public void addElement(int value){
        if(root==null){
            root=new node();
            root.data=value;
        }
        else{
            node elem=new node();
            elem.data=value;
            node temp=root;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=elem;
        }
    }
    public void showList(){
        node temp=root;
        while(temp.next!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
}
