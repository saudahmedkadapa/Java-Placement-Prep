public class ThisConstructorChain {
    private int id;
    private String name;

    ThisConstructorChain()
    {
        this(1, "Saud");     //Default Construtor 

    }
    ThisConstructorChain(String naam)
    {
        this(0,naam);    //parameterized 
    }
    public ThisConstructorChain(int i,String n)
    {
        this.id=i;
        this.name=n;
    }

    public void show()
    {
        System.out.println(id+" "+name );
    }

    public static void main(String[] args) {
        ThisConstructorChain tc=new ThisConstructorChain();
        tc.show();
        ThisConstructorChain tc1=new ThisConstructorChain("Ahmed");
        tc1.show();
        ThisConstructorChain tc2=new ThisConstructorChain(1,"Kadapa");
        tc2.show();
        
    }
    
}
