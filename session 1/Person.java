class Person{
    private String name;
    private int age; 
    private String address;


    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(){
        this.name = " ";
        this.age = 0;
        this.address = " ";
    }


    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getAddress(){
        return this.address;
    }

    public void setName(String name){
         this.name = name;
    }
    public void setAge(int age){
         this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }



    public static void main(String[] args){
        System.out.println("Hello World");	
        Person me = new Person();
        
        me.setName("sn3");
        me.setAge(100);
        me.setAddress("45 Main St");

        System.out.println(me.getAddress());

    }
}