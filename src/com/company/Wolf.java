package com.company;

public class Wolf  extends  Animal {

    private String fang = "fang";

    public Wolf(int size, String fang) {
        super(size);
        this.fang=fang;
    }


    public String getFang (){
        return fang;
    }


    public  void   kok(int speed, String name){
        System.out.println();
    }
    public  void   kok(String name, int speed){
        System.out.println();
    }
    public final  void   kok(int speed , String name, int size){
        System.out.println();



        public void getInfo(){
            System.out.println("Клык" + fang+
                    "\n size " + super.getSize()
            );
        }
    }






}
