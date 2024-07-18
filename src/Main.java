// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci=new Ogrenci("Şeyma","Akkuş",25,"Çorum",true,false);
        Ogrenci ogrenci1=new Ogrenci("Emine","Fıstık",19,"Gaziantep",false,false);
        Ogrenci ogrenci2=new Ogrenci("Yunus Emre","Akgül",23,"Giresun ",true,true);
        System.out.println(ogrenci.getAd()+" "+ogrenci.getSoyad());
    }
}