package staj_proje;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class vatan {

    static int sayac = 1;

    public void vatanBaglanEkranKart(String url) {
        for (int j = 1; j < 8; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {
                Document doc = Jsoup.connect(url + j).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();

                String urun_cinsi = "Ekran Kart";
                if (doc.location().contains("?page=")) {

                    Elements kartlar = doc.getElementsByClass("product-list product-list--list-page");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element kart : kartlar) {
                        String link = kart.getElementsByClass("product-list__link").attr("abs:href");
//                    System.out.println(link);
                        vatanUrunDetay(link, urun_cinsi);
                    }
                } else {
                    System.out.println("sayfa bitti");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Sayfa bitti..");
                break;
            }
        }
    }

    public void vatanBaglanRam(String url) {
        for (int j = 1; j < 17; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {

                Document doc = Jsoup.connect(url + j).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();

                String urun_cinsi = "Ram";
                if (doc.location().contains("?page=")) {

                    Elements ramler = doc.getElementsByClass("product-list product-list--list-page");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element ram : ramler) {
                        String link1 = ram.getElementsByClass("product-list__link").attr("abs:href");
//                    System.out.println(link1);
                        vatanUrunDetay(link1, urun_cinsi);
                    }
                } else {
                    System.out.println("sayfa bitti");
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void vatanBaglanIslemci(String url) {
        for (int j = 1; j < 5; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {

                Document doc = Jsoup.connect(url + j).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();

                String urun_cinsi = "İşlemci";
                if (doc.location().contains("?page=")) {

                    Elements islemciler = doc.getElementsByClass("product-list product-list--list-page");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element islemci : islemciler) {
                        String link2 = islemci.getElementsByClass("product-list__link").attr("abs:href");
//                    System.out.println(link2);
                        vatanUrunDetay(link2, urun_cinsi);
                    }
                } else {
                    System.out.println("sayfa bitti");
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void vatanBaglanAnakart(String url) {
        for (int j = 1; j < 15; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {

                Document doc = Jsoup.connect(url + j).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();

                String urun_cinsi = "Anakart";
                if (doc.location().contains("?page=")) {

                    Elements anakartlar = doc.getElementsByClass("product-list product-list--list-page");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element anakart : anakartlar) {
                        String link2 = anakart.getElementsByClass("product-list__link").attr("abs:href");
//                    System.out.println(link2);
                        vatanUrunDetay(link2, urun_cinsi);
                    }
                } else {
                    System.out.println("sayfa bitti");
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void vatanBaglanHarddisk(String url) {
        for (int j = 1; j < 3; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {

                Document doc = Jsoup.connect(url + j).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();

                String urun_cinsi = "Harddisk";
                if (doc.location().contains("?page=")) {

                    Elements diskler = doc.getElementsByClass("product-list product-list--list-page");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element disk : diskler) {
                        String link2 = disk.getElementsByClass("product-list__link").attr("abs:href");
//                    System.out.println(link2);
                        vatanUrunDetay(link2, urun_cinsi);
                    }
                } else {
                    System.out.println("sayfa bitti");
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void vatanBaglanKasa(String url) {
        for (int j = 1; j < 15; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {

                Document doc = Jsoup.connect(url + j).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();

                String urun_cinsi = "Kasa";
                if (doc.location().contains("?page=")) {

                    Elements kasalar = doc.getElementsByClass("product-list product-list--list-page");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element kasa : kasalar) {
                        String link2 = kasa.getElementsByClass("product-list__link").attr("abs:href");
//                    System.out.println(link2);
                        vatanUrunDetay(link2, urun_cinsi);
                    }
                } else {
                    System.out.println("sayfa bitti");
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void vatanBaglanGucKaynagi(String url) {
        for (int j = 1; j < 9; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {

                Document doc = Jsoup.connect(url + j).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();

                String urun_cinsi = "Güç Kaynağı";
                if (doc.location().contains("?page=")) {

                    Elements gucler = doc.getElementsByClass("product-list product-list--list-page");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element guc : gucler) {
                        String link2 = guc.getElementsByClass("product-list__link").attr("abs:href");
//                    System.out.println(link2);
                        vatanUrunDetay(link2, urun_cinsi);
                    }
                } else {
                    System.out.println("sayfa bitti");
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void vatanBaglanMonitor(String url) {
        for (int j = 1; j < 15; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {

                Document doc = Jsoup.connect(url + j).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();

                String urun_cinsi = "Monitör";
                if (doc.location().contains("?page=")) {

                    Elements monitorler = doc.getElementsByClass("product-list product-list--list-page");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element monitor : monitorler) {
                        String link2 = monitor.getElementsByClass("product-list__link").attr("abs:href");
//                    System.out.println(link2);
                        vatanUrunDetay(link2, urun_cinsi);
                    }
                } else {
                    System.out.println("sayfa bitti");
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void vatanBaglanKlavye(String url) {
        for (int j = 1; j < 11; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {

                Document doc = Jsoup.connect(url + j).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();

                String urun_cinsi = "Klavye";
                if (doc.location().contains("?page=")) {

                    Elements klavyeler = doc.getElementsByClass("product-list product-list--list-page");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element klavye : klavyeler) {
                        String link2 = klavye.getElementsByClass("product-list__link").attr("abs:href");
//                    System.out.println(link2);
                        vatanUrunDetay(link2, urun_cinsi);
                    }
                } else {
                    System.out.println("sayfa bitti");
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void vatanBaglanMouse(String url) {
        for (int j = 1; j < 20; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {

                Document doc = Jsoup.connect(url + j).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();

                String urun_cinsi = "Mouse";
                if (doc.location().contains("?page=")) {

                    Elements mouselar = doc.getElementsByClass("product-list product-list--list-page");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element mouse : mouselar) {
                        String link2 = mouse.getElementsByClass("product-list__link").attr("abs:href");
//                    System.out.println(link2);
                        vatanUrunDetay(link2, urun_cinsi);
                    }
                } else {
                    System.out.println("sayfa bitti");
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void vatanBaglanSogutmaSistemleri(String url) {
        for (int j = 1; j < 11; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {

                Document doc = Jsoup.connect(url + j).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();

                String urun_cinsi = "Soğutma Sistemleri";
                if (doc.location().contains("?page=")) {

                    Elements sogutmalar = doc.getElementsByClass("product-list product-list--list-page");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element sogutma : sogutmalar) {
                        String link2 = sogutma.getElementsByClass("product-list__link").attr("abs:href");
//                    System.out.println(link2);
                        vatanUrunDetay(link2, urun_cinsi);
                    }
                } else {
                    System.out.println("sayfa bitti");
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void vatanUrunDetay(String url, String urun_cinsi) {
        try {

            Document doc = Jsoup.connect(url).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();
            int site_id = 3;

            String urun_ad = doc.getElementsByClass("product-list__content product-detail-big-price").select("h1").text();

            String urun_cins = urun_cinsi;

            String urun_fiyat = doc.getElementsByClass("product-list__cost product-list__description").select("span").get(0).text()+" TL";

            String urun_ozellikler = "";
            Elements table = doc.select("ul.pdetail-property-list");
            Elements rows = table.select("li");
            for (Element row : rows) {
                //Bu satira ait kolon elementlerini bul
                Elements columns = row.select("li");
                //Her kolonun icerigini yazdir
                for (Element column : columns) {
                    urun_ozellikler += column.text() + ";;;;;";
                }
            }

            String urun_marka = urun_ad.split(" ")[0];

            String urun_resim = "";
            String urun_resim_link = "";
            try {
                Document doc_skor = Jsoup.connect(url + "#yorumlar").userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();
                urun_resim_link = doc.getElementsByClass("img-responsive product-list__image product-list--third__image").attr("abs:alt");
//              saveImage(urun_resim_link, "C:\\Users\\dogan\\OneDrive\\Resimler\\Staj_Proje_Resimler\\vatan\\" + sayac + ".jpeg");
                urun_resim = "vatan\\" + sayac + ".jpeg";
                sayac++;
            } catch (NullPointerException e) {

            }

            String urun_link = url;

            String urun_skor = "";
            try {
                Document doc_skor = Jsoup.connect(url + "#yorumlar").userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();
                urun_skor = doc_skor.getElementById("averageRankNum").text();
            } catch (NullPointerException e) {
                urun_skor = "0.0";
            }

            System.out.println("site_id:" + site_id);
            System.out.println("urun_ad:" + urun_ad);
            System.out.println("urun_cins:" + urun_cins);
            System.out.println("urun_fiyat:" + urun_fiyat);
            System.out.println("ürün_özellikler:");
            System.out.println(urun_ozellikler);
            System.out.println("urun_marka:" + urun_marka);
            System.out.println("urun_resim:" + urun_resim);
            System.out.println("urun_resim_link:" + urun_resim_link);//bu sadece görmemiz için
            System.out.println("urun_link:" + urun_link);
            System.out.println("ürün skoru:" + urun_skor);
            System.out.println("\n");

           // database e bu verileri ekleme
//            System.out.println("database e yollanıyor.");
//            Database_Connect con = new Database_Connect();
//            con.insert_Urun(site_id, urun_ad, urun_cins, urun_fiyat, urun_ozellikler, urun_marka, urun_resim, urun_link, urun_skor);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void saveImage(String imageUrl, String destinationFile) {
        try {

            URL url = new URL(imageUrl);
            OutputStream os;
            try ( InputStream is = url.openStream()) {
                os = new FileOutputStream(destinationFile);
                byte[] b = new byte[2048];
                int length;
                while ((length = is.read(b)) != -1) {
                    os.write(b, 0, length);
                }
            }
            os.close();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        try {
            vatan baglan = new vatan();
            baglan.vatanBaglanEkranKart("https://www.vatanbilgisayar.com/arama/EKRAN%20KART/ekran-kartlari/?page=");
            baglan.vatanBaglanRam("https://www.vatanbilgisayar.com/arama/ram/bilgisayar-ram-bellek/?page=");
            baglan.vatanBaglanIslemci("https://www.vatanbilgisayar.com/arama/i%C5%9Flemci/islemciler/?page=");
            baglan.vatanBaglanAnakart("https://www.vatanbilgisayar.com/arama/anakart/anakart/?page=");
            baglan.vatanBaglanHarddisk("https://www.vatanbilgisayar.com/arama/harddisk/hard-disk/?page=");
            baglan.vatanBaglanKasa("https://www.vatanbilgisayar.com/arama/kasa/bilgisayar-kasasi/?page=");
            baglan.vatanBaglanGucKaynagi("https://www.vatanbilgisayar.com/arama/g%C3%BC%C3%A7%20kayna%C4%9F%C4%B1/guc-kaynaklari-power/?page=");
            baglan.vatanBaglanMonitor("https://www.vatanbilgisayar.com/arama/monit%C3%B6r/bilgisayar-monitorleri/?page=");
            baglan.vatanBaglanKlavye("https://www.vatanbilgisayar.com/arama/klavye/klavyeler/?page=");
            baglan.vatanBaglanMouse("https://www.vatanbilgisayar.com/arama/mouse/bilgisayar-mouse/?page=");
            baglan.vatanBaglanSogutmaSistemleri("https://www.vatanbilgisayar.com/arama/so%C4%9Futma%20sistemleri/sogutma-sistemleri/?page=");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
