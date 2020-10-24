package com.company;

public   class Dog extends  Wolf  {

    private String name = "Dog ";

    public Dog(int size, String fang, String name) {
        super(size, fang);
        this.name=name;
    }

    public String getName(){
        return name;
    }


    public  void   kok(String name, int speed){
        System.out.println();
    }


    public void  getInfo(){
        super.getInfo();
        System.out.println("Клык" + super.getFang()+
                "\n name" + name+


                "\n size " + super.getSize());









    }
}