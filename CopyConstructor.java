public class CopyConstructor {
    private int id;
    private String name;
    private String address;

    CopyConstructor(int id,String name, String address)
    {
        this.id=id;
        this.name=name;
        this.address =address;
    }

    CopyConstructor(CopyConstructor ref)
    {
        this.id=ref.id;
        this.name=ref.name;
        this.address=ref.address;
    }

    void show()
    {
        System.out.println("name="+name +" "+"id="+id + address);
    }
    
    public static void main(String[] args) {
        CopyConstructor c=new CopyConstructor(1,"saud", "kolhapur");
        CopyConstructor cp=new CopyConstructor(c);
        cp.show();
    }
}
