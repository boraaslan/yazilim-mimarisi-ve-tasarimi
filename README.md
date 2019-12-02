## Yazılım Mimarisi ve Tasarımı
Yazılım Mimarisi ve Tasarımı Dersi Örnek Ödev Şablonu

## Singleton Tasarım Deseni
Bu tasarım deseninde, bir sınıfın sistem içinde yalnızca bir tane nesnesi oluşturulabilir. Tek bir arayüz sunularak, bu nesneye yalnızca buradan erişim sağlanabilir. Bu desen kullanılarak, sistem içinde değeri değişmeyen, genel değişkenler bu oluşturulan tek nesneye konulabilir. Sistemde tek nesne yaratılabilme, statik değişken ve yordamlar sayesinde olur. Statik değişken ve yordamlar, nesneye dayalı programlanın esnekliğini, dinamik nesne yaratılma özelliklerini engellediği için bazı yazılım mühendisleri tarafından eleştirilebilir.

![Image of Class](https://github.com/boraaslan/YazilimMimarisiVeTasarimi/blob/master/singletonClass.png)

Örnek olarak yukarıda verilen class yapısında oluşturma foksiyonu private olarak ayarlanmıştır. Böylelikle nesne new komutu ile oluşturulamaz. Bu nesneyi oluşturmak için hazırlanan 'nesneOlustur()' fonksiyonu sayesinde eğer nesne ilk defa yaratılıyor ise oluşturulur. Eğer daha önceden nesne mevcut ise var olan nesne döndürülür.

```java
public static SingletonClass nesneOlustur(){
        if(nesne==null){
            nesne=new SingletonClass();
        }
        return nesne;
    }
```
