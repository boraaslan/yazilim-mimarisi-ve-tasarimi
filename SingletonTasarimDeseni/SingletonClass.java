package com.YazMimTas;

public class SingletonClass {
    private static SingletonClass nesne;

    private SingletonClass(){
        //boş ve private olarak kalacak
    }

    public static SingletonClass nesneOlustur(){
        //nesneyi bu fonksiyon oluşturacak
        if(nesne==null){
            //eğer nesne ilk defa oluşturuluyor ise
            nesne=new SingletonClass();
        }
        return nesne;
    }

    public void birSeyler(){
        // Nesnenin içerisideki bir yordam
        System.out.println("Nesne Burada....");
    }
}
