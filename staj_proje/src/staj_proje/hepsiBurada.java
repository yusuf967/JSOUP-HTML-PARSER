package staj_proje;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class hepsiBurada {

    static int sayac = 1;

    public void hepsiburadaBaglanEkranKart(String url) {
        for (int j = 1; j < 1000; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {
                Document doc = Jsoup.connect(url + j).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();
                String urun_cinsi = "Ekran Kart";
                if (doc.location().contains("&sayfa=")) {

                    Elements kartlar = doc.getElementsByClass("search-item col lg-1 md-1 sm-1  custom-hover not-fashion-flex");
//                    System.out.println("doc.location() = " + doc.location());

                    for (Element kart : kartlar) {
                        String link = kart.getElementsByTag("a").get(0).attr("abs:href");
//                    System.out.println(link);
                        hepsiburadaUrunDetay(link, urun_cinsi);
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

    public void hepsiburadaBaglanRam(String url) {
        for (int j = 1; j < 1000; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {

                Document doc = Jsoup.connect(url + j).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();

                String urun_cinsi = "Ram";
                if (doc.location().contains("&sayfa=")) {

                    Elements ramler = doc.getElementsByClass("search-item col lg-1 md-1 sm-1  custom-hover not-fashion-flex");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element ram : ramler) {
                        String link1 = ram.getElementsByTag("a").get(0).attr("abs:href");
//                    System.out.println(link1);
                        hepsiburadaUrunDetay(link1, urun_cinsi);
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

    public void hepsiburadaBaglanIslemci(String url) {
        for (int j = 1; j < 1000; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {

                Document doc = Jsoup.connect(url + j).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();

                String urun_cinsi = "İşlemci";
                if (doc.location().contains("&sayfa=")) {

                    Elements islemciler = doc.getElementsByClass("search-item col lg-1 md-1 sm-1  custom-hover not-fashion-flex");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element islemci : islemciler) {
                        String link2 = islemci.getElementsByTag("a").get(0).attr("abs:href");
//                    System.out.println(link2);
                        hepsiburadaUrunDetay(link2, urun_cinsi);
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

    public void hepsiburadaBaglanAnakart(String url) {
        for (int j = 1; j < 1000; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {

                Document doc = Jsoup.connect(url + j).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();

                String urun_cinsi = "Anakart";
                if (doc.location().contains("&sayfa=")) {

                    Elements kartlar = doc.getElementsByClass("search-item col lg-1 md-1 sm-1  custom-hover not-fashion-flex");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element kart : kartlar) {
                        String link2 = kart.getElementsByTag("a").get(0).attr("abs:href");
//                    System.out.println(link2);
                        hepsiburadaUrunDetay(link2, urun_cinsi);
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

    public void hepsiburadaBaglanHarddisk(String url) {
        for (int j = 1; j < 1000; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {

                Document doc = Jsoup.connect(url + j).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();

                String urun_cinsi = "Harddisk";
                if (doc.location().contains("&sayfa=")) {

                    Elements diskler = doc.getElementsByClass("search-item col lg-1 md-1 sm-1  custom-hover not-fashion-flex");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element disk : diskler) {
                        String link2 = disk.getElementsByTag("a").get(0).attr("abs:href");
//                    System.out.println(link2);
                        hepsiburadaUrunDetay(link2, urun_cinsi);
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

    public void hepsiburadaBaglanKasa(String url) {
        for (int j = 1; j < 1000; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {

                Document doc = Jsoup.connect(url + j).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();

                String urun_cinsi = "Kasa";
                if (doc.location().contains("&sayfa=")) {

                    Elements kasalar = doc.getElementsByClass("search-item col lg-1 md-1 sm-1  custom-hover not-fashion-flex");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element kasa : kasalar) {
                        String link2 = kasa.getElementsByTag("a").get(0).attr("abs:href");
//                    System.out.println(link2);
                        hepsiburadaUrunDetay(link2, urun_cinsi);
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

    public void hepsiburadaBaglanGucKaynagi(String url) {
        for (int j = 1; j < 1000; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {

                Document doc = Jsoup.connect(url + j).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();

                String urun_cinsi = "Güç Kaynağı";
                if (doc.location().contains("&sayfa=")) {

                    Elements gucler = doc.getElementsByClass("search-item col lg-1 md-1 sm-1  custom-hover not-fashion-flex");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element guc : gucler) {
                        String link2 = guc.getElementsByTag("a").get(0).attr("abs:href");
//                    System.out.println(link2);
                        hepsiburadaUrunDetay(link2, urun_cinsi);
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

    public void hepsiburadaBaglanMonitor(String url) {
        for (int j = 1; j < 1000; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {

                Document doc = Jsoup.connect(url + j).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();

                String urun_cinsi = "Monitör";
                if (doc.location().contains("&sayfa=")) {

                    Elements monitorler = doc.getElementsByClass("search-item col lg-1 md-1 sm-1  custom-hover not-fashion-flex");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element monitor : monitorler) {
                        String link2 = monitor.getElementsByTag("a").get(0).attr("abs:href");
//                    System.out.println(link2);
                        hepsiburadaUrunDetay(link2, urun_cinsi);
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

    public void hepsiburadaBaglanKlavye(String url) {
        for (int j = 1; j < 1000; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {

                Document doc = Jsoup.connect(url + j).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();

                String urun_cinsi = "Klavye";
                if (doc.location().contains("&sayfa=")) {

                    Elements klavyeler = doc.getElementsByClass("search-item col lg-1 md-1 sm-1  custom-hover not-fashion-flex");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element klavye : klavyeler) {
                        String link2 = klavye.getElementsByTag("a").get(0).attr("abs:href");
//                    System.out.println(link2);
                        hepsiburadaUrunDetay(link2, urun_cinsi);
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

    public void hepsiburadaBaglanMouse(String url) {
        for (int j = 1; j < 1000; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {

                Document doc = Jsoup.connect(url + j).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();

                String urun_cinsi = "Mouse";
                if (doc.location().contains("&sayfa=")) {

                    Elements mouselar = doc.getElementsByClass("search-item col lg-1 md-1 sm-1  custom-hover not-fashion-flex");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element mouse : mouselar) {
                        String link2 = mouse.getElementsByTag("a").get(0).attr("abs:href");
//                    System.out.println(link2);
                        hepsiburadaUrunDetay(link2, urun_cinsi);
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

    public void hepsiburadaBaglanSogutmaSistemleri(String url) {
        for (int j = 1; j < 1000; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {

                Document doc = Jsoup.connect(url + j).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();

                String urun_cinsi = "Soğutma Sistemleri";
                if (doc.location().contains("&sayfa=")) {

                    Elements sogutmalar = doc.getElementsByClass("search-item col lg-1 md-1 sm-1  custom-hover not-fashion-flex");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element sogutma : sogutmalar) {
                        String link2 = sogutma.getElementsByTag("a").get(0).attr("abs:href");
//                    System.out.println(link2);
                        hepsiburadaUrunDetay(link2, urun_cinsi);
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

    public void hepsiburadaUrunDetay(String url, String urun_cinsi) {
        try {

            Document doc = Jsoup.connect(url).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();
            int site_id = 1;

            String urun_ad = doc.getElementsByClass("product-name best-price-trick").text();

            String urun_cins = urun_cinsi;

            String urun_fiyat = doc.getElementById("offering-price").text();

            String urun_ozellikler="";
            Elements table = doc.select("table[class=data-list tech-spec]");
            Elements rows = table.select("tr");
            for (Element row : rows) {
                //Bu satira ait kolon elementlerini bul
                Elements columns = row.select("tr");
                //Her kolonun icerigini yazdir
                for (Element column : columns) {
                  urun_ozellikler += column.text() + ";;;;;";
                }
            }

            String urun_marka = doc.getElementsByClass("brand-name").first().text();
            if (urun_marka.isEmpty()) {
                urun_marka = urun_ad.split(" ")[0];
            }

            String urun_resim_link = doc.select("img.product-image").attr("abs:src");
//            saveImage(urun_resim_link, "C:\\Users\\dogan\\OneDrive\\Resimler\\Staj_Proje_Resimler\\hepsiBurada\\" + sayac + ".jpeg");
            String urun_resim = "hepsiburada\\" + sayac + ".jpeg";
            sayac++;

            String urun_link = url;

            String urun_skor = doc.getElementsByClass("hermes-AverageRateBox-module-2ZE5A").text();
            if (urun_skor == null || urun_skor.length() < 2) {
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
            System.out.println("urun_resim:" + urun_resim_link);
            System.out.println("urun_link:" + urun_link);
            System.out.println("ürün skoru:" + urun_skor);
            System.out.println("\n");

//            //database e bu verileri ekleme
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
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            hepsiBurada baglan = new hepsiBurada();
            baglan.hepsiburadaBaglanEkranKart("https://www.hepsiburada.com/ara?filtreler=MainCategory.Id:204&q=ekran+kart%C4%B1&sayfa=");
            baglan.hepsiburadaBaglanRam("https://www.hepsiburada.com/ara?filtreler=MainCategory.Id%3A47&q=ram&sayfa=");
            baglan.hepsiburadaBaglanIslemci("https://www.hepsiburada.com/ara?filtreler=MainCategory.Id:46&q=i%C5%9Flemci&sayfa=");
            baglan.hepsiburadaBaglanAnakart("https://www.hepsiburada.com/ara?filtreler=MainCategory.Id%3A152&q=anakart&sayfa=");
            baglan.hepsiburadaBaglanHarddisk("https://www.hepsiburada.com/ara?filtreler=MainCategory.Id%3A100221%2C114814&q=harddisk&sayfa=");
            baglan.hepsiburadaBaglanKasa("https://www.hepsiburada.com/ara?filtreler=MainCategory.Id%3A1013&q=kasa&sayfa=");
            baglan.hepsiburadaBaglanGucKaynagi("https://www.hepsiburada.com/ara?filtreler=MainCategory.Id:1012&q=g%C3%BC%C3%A7+kayna%C4%9F%C4%B1&sayfa=");
            baglan.hepsiburadaBaglanMonitor("https://www.hepsiburada.com/ara?filtreler=MainCategory.Id:3002879&q=monit%C3%B6rler&sayfa=");
            baglan.hepsiburadaBaglanKlavye("https://www.hepsiburada.com/ara?filtreler=MainCategory.Id%3A51&q=klavye&sayfa=");
            baglan.hepsiburadaBaglanMouse("https://www.hepsiburada.com/ara?filtreler=MainCategory.Id%3A52&q=mouse&sayfa=");
            baglan.hepsiburadaBaglanSogutmaSistemleri("https://www.hepsiburada.com/ara?filtreler=MainCategory.Id:1125&q=so%C4%9Futma+sistemleri&sayfa=");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
