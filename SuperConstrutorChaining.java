public class SuperConstrutorChaining {
    private int id;

    SuperConstrutorChaining(int i)
    {
        this.id=i;
    }    


    public void setid(int id){
        this.id=id;
    }

    public int getid()
    {
        return id;
    }


}

 class Subclass extends SuperConstrutorChaining{
    private String name ;

     Subclass(String n,int id)
    {
        super(id);
        this.name=n;
    }

    public void show()
    {
        System.out.println(getid() +""+name);
    }

    public static void main(String[] args) {
        Subclass s=new Subclass("saud", 1);
        s.show();
    }

}
