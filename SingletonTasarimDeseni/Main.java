package com.YazMimTas;

public class Main {

    public static void main(String[] args) {
	    SingletonClass nesne1 = SingletonClass.nesneOlustur();
        SingletonClass nesne2 = SingletonClass.nesneOlustur();
        yazdir("1.Nesne",nesne1);
        yazdir("2.Nesne",nesne2);
    }

    public static void yazdir(String ad, Object nesne){
        System.out.println(String.format("%s Hashcode %d",ad,nesne.hashCode()));
        //İki nesnenin de hash kodlarının aynı olduğuna dikkat ediniz.
    }

}
