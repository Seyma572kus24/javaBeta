public class OgrenciYonetici {
    Ogrenci ogrenci=new Ogrenci("Şeyma","Akkuş",25,"Çorum",true,false);
    Ogrenci ogrenci1=new Ogrenci("Emine","Fıstık",19,"Gaziantep",false,false);
    Ogrenci ogrenci2=new Ogrenci("Yunus Emre","Akgül",23,"Giresun ",true,true);

    public  void ogrenciYazdir(){
        System.out.println("Öğrencinin adı : "+ogrenci.getAd());
        System.out.println("Öğrencinin soyadı : "+ogrenci.getSoyad());
    }
}