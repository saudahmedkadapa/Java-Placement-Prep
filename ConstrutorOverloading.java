public class ConstrutorOverloading {
    private int id;
    private String name;
    private String add;

    ConstrutorOverloading()
    {
        // this.id=0;
        // this.name=null;
        // this.add=null;
    }

    ConstrutorOverloading (int i,String n)
    {
        this.id=i;
        this.name=n;
    }

    ConstrutorOverloading(String a)
    {
        this.add=a;
    }
    ConstrutorOverloading(ConstrutorOverloading c)
    {
        this.id=c.id;
        this.name=c.name;
        this.add=c.add;
    }

    public void show()
    {
        System.out.println(id  +" " +name +" "+add);
    }

    public static void main(String[] args) {
        ConstrutorOverloading co=new ConstrutorOverloading();
        ConstrutorOverloading co1=new ConstrutorOverloading(1,"saud");
        ConstrutorOverloading co2=new ConstrutorOverloading("chiplun");
        ConstrutorOverloading cp=new ConstrutorOverloading(co2);
        cp.show();
    }
    
}
