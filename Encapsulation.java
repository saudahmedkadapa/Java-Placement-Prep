public class Encapsulation {
    private int id;
    private String name;

    Encapsulation(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    void show()
    {
        System.out.println(id +" "+name);
    }

    public void setid(int id)
    {
        this.id=id;
    }
    public int getid()
    {
        return id;
    }

    public void setname(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return name;
    }

    public static void main(String[] args) {
        Encapsulation e=new Encapsulation(1,"saud");
        e.show();
    //     e.setid(5);
    //    System.out.println( e.getid());
    //     e.setname("saud");
    //     System.out.println(e.getname());
     
    }
    
}
