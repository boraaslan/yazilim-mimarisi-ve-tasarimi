## Yazılım Mimarisi ve Tasarımı
Yazılım Mimarisi ve Tasarımı Dersi Örnek Ödev Şablonu

## Singleton Tasarım Deseni
Bu tasarım deseninde, bir sınıfın sistem içinde yalnızca bir tane nesnesi oluşturulabilir. Tek bir arayüz sunularak, bu nesneye yalnızca buradan erişim sağlanabilir. Bu desen kullanılarak, sistem içinde değeri değişmeyen, genel değişkenler bu oluşturulan tek nesneye konulabilir. Sistemde tek nesne yaratılabilme, statik değişken ve yordamlar sayesinde olur. Statik değişken ve yordamlar, nesneye dayalı programlanın esnekliğini, dinamik nesne yaratılma özelliklerini engellediği için bazı yazılım mühendisleri tarafından eleştirilebilir.

![Image of Class](https://github.com/boraaslan/YazilimMimarisiVeTasarimi/blob/master/singletonClass.png)

Örnek olarak yukarıda verilen class yapısında oluşturma foksiyonu private olarak ayarlanmıştır. Böylelikle nesne new komutu ile oluşturulamaz. Bu nesneyi oluşturmak için hazırlanan `nesneOlustur()` fonksiyonu sayesinde eğer nesne ilk defa yaratılıyor ise oluşturulur. Eğer daha önceden nesne mevcut ise var olan nesne döndürülür.

```pyhton
public static SingletonClass nesneOlustur(){
        if(nesne==null){
            nesne=new SingletonClass();
        }
        return nesne;
    }
```
Nesne istemci tarafında aşağıdaki kodlar ile oluşturulabilir. 

```java
SingletonClass nesne1 = SingletonClass.nesneOlustur();
```

Yukarıdaki sınıf kullanılarak başka bir nesne oluşturulmaya çalışılırsa nesne zaten var olduğundan dolayı eski nesnenin bilgileri geri döndürülecektir. Örneğin yukarıda `nesne1` adında bir nesne oluşturulmuştur. Aşağıdaki kod satırı çalıştırıldığında `nesne2` adı ile oluşan nesne aslında `nesne1` dir.

```java
SingletonClass nesne2 = SingletonClass.nesneOlustur();
```

Bu durum `nesne1` ve `nesne2`nin hash kodlarından da görülebilir. Bunun izleyebilmek için aşağıdaki `yazdir` fonksiyonu hazırlanmıştır.

```java
public static void yazdir(String ad, Object nesne){
        System.out.println(String.format("%s Hashcode %d",ad,nesne.hashCode()));
    }
```
