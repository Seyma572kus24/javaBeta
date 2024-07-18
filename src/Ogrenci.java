public class Ogrenci {
    private String ad;
   private String soyad;
   private int yas;
   private String memleket;
   private boolean uniOkuduMu;
   private boolean javaBiliyorMu;

   public Ogrenci(String ad, String soyad, int yas, String memleket, boolean uniOkuduMu,boolean javaBiliyorMu) {
      this.ad = ad;
      this.soyad=soyad;
      this.memleket=memleket;
      this.yas=yas;
      this.uniOkuduMu=uniOkuduMu;
      this.javaBiliyorMu=javaBiliyorMu;
   }


   public String getAd() {
      return ad;
   }

   public void setAd(String ad) {
      this.ad = ad;
   }

   public String getSoyad() {
      return soyad;
   }

   public void setSoyad(String soyad) {
      this.soyad = soyad;
   }

   public int getYas() {
      return yas;
   }

   public void setYas(int yas) {
      this.yas = yas;
   }

   public String getMemleket() {
      return memleket;
   }

   public void setMemleket(String memleket) {
      this.memleket = memleket;
   }

   public boolean isUniOkuduMu() {
      return uniOkuduMu;
   }

   public void setUniOkuduMu(boolean uniOkuduMu) {
      this.uniOkuduMu = uniOkuduMu;
   }

   public boolean isJavaBiliyorMu() {
      return javaBiliyorMu;
   }

   public void setJavaBiliyorMu(boolean javaBiliyorMu) {
      this.javaBiliyorMu = javaBiliyorMu;
   }
}
