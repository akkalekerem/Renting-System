abstract: Bu, Vehicle sınıfının soyut (abstract) bir sınıf olduğu anlamına gelir.  
Soyut sınıflardan doğrudan nesne (örneğin new Vehicle()) oluşturulamaz.  !!!!!  
Bu sınıftan türetilen (miras alan) alt sınıflar olmalıdır.  
Soyut sınıflar, soyut metotlar içerebilir.

------------------------------------------------------ protected  
protected erişim belirleyicisi, bu özelliğe yalnızca Vehicle sınıfı içinden ve bu sınıftan türetilen alt sınıflar  
(örneğin Car, Motorcycle vb.) içinden erişilebileceği anlamına gelir.

------------------------------------------------------- final  
private *final* String id;  
final: Bu özelliğin değeri bir kere atandıktan sonra bir daha değiştirilemez.  
Bu, her araç nesnesinin oluşturulduğunda benzersiz ve sabit bir ID'ye sahip olacağı anlamına gelir.

------------------------------------------------------- @Override  
Soyut oldukları için, Vehicle sınıfından miras alan tüm somut (concrete)  
alt sınıflar bu metotları zorunlu olarak kendi içlerinde uygulamak (override etmek) zorundadırlar.  
Örneğin, bir Car sınıfı Vehicle'dan miras aldığında, start() ve stop() metotlarını kendine özgü şekillerde (örneğin motoru çalıştırma veya fren yapma) uygulamalıdır.  
Bu, "bir aracın nasıl başlatılıp durdurulacağı" kavramını tanımlar, ancak "nasıl" yapılacağını alt sınıflara bırakır. !!!!!

------------------------------------------------------- HAS-A RELATIONSHIP  
private Engine engine; //CAR SINIFININ İÇİNDE BURASI  
engine adında bir Engine türünde özellik.  
private erişim belirleyicisi, bu özelliğe yalnızca Car sınıfı içinden doğrudan erişilebileceği anlamına gelir.  
Bu, Car sınıfının bir Engine sınıfı içerdiği (has-a relationship) anlamına gelir.  
Bu, OOP'deki kompozisyon (composition) örneğidir. Bir arabanın bir motoru vardır.

------------------------------------------------------- SUPER  
super.toString(): Bu, Vehicle sınıfının toString() metodunu çağırır.  
Bu sayede aracın ID'si, markası ve yılı gibi temel bilgiler alınır (örneğin: [VHC-1] Ford (2020)).

super(brand, year);: Bu, Car sınıfının miras aldığı üst sınıf olan Vehicle sınıfının yapıcı metodunu çağırır.  
brand ve year değerlerini Vehicle sınıfına ileterek, Vehicle sınıfının bu özellikleri ve id'yi başlatmasını sağlar.  
Bu çağrı, yapıcı metodun ilk satırı olmak zorundadır. ***ÇOK ÖNEMLİ***
