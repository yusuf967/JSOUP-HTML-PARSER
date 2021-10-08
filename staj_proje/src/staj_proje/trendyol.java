package staj_proje;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class trendyol {

    static int sayac = 1;

    public void trendyolBaglanEkranKart(String url) {
        for (int j = 1; j < 1000; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {
                String urun_cinsi = "Ekran Kart";
                Document doc = Jsoup.connect(url + j).timeout(30000).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();
                if (doc.location().contains("&pi=")) {
                    Elements kartlar = doc.getElementsByClass("p-card-wrppr add-to-bs-card");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element kart : kartlar) {
                        String link = kart.getElementsByTag("a").attr("abs:href");
//                    System.out.println(link);
                        trendyolUrunDetay(link, urun_cinsi);
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

    public void trendyolBaglanRam(String url) {
        for (int j = 1; j < 1000; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {
                String urun_cinsi = "Ram";
                Document doc = Jsoup.connect(url + j).timeout(30000).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();
                if (doc.location().contains("&pi=")) {

                    Elements ramler = doc.getElementsByClass("p-card-wrppr add-to-bs-card");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element ram : ramler) {
                        String link1 = ram.getElementsByTag("a").get(0).attr("abs:href");
//                    System.out.println(link1);
                        trendyolUrunDetay(link1, urun_cinsi);
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

    public void trendyolBaglanIslemci(String url) {
        for (int j = 1; j < 1000; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {
                String urun_cinsi = "İşlemci";
                Document doc = Jsoup.connect(url + j).timeout(30000).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();
                if (doc.location().contains("&pi=")) {

                    Elements islemciler = doc.getElementsByClass("p-card-wrppr add-to-bs-card");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element islemci : islemciler) {
                        String link2 = islemci.getElementsByTag("a").get(0).attr("abs:href");
//                    System.out.println(link2);
                        trendyolUrunDetay(link2, urun_cinsi);
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

    public void trendyolBaglanAnakart(String url) {
        for (int j = 1; j < 1000; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {
                String urun_cinsi = "Anakart";
                Document doc = Jsoup.connect(url + j).timeout(30000).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();
                if (doc.location().contains("&pi=")) {

                    Elements kartlar = doc.getElementsByClass("p-card-wrppr add-to-bs-card");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element kart : kartlar) {
                        String link2 = kart.getElementsByTag("a").get(0).attr("abs:href");
//                    System.out.println(link2);
                        trendyolUrunDetay(link2, urun_cinsi);
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

    public void trendyolBaglanHarddisk(String url) {
        for (int j = 1; j < 1000; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {
                String urun_cinsi = "Harddisk";
                Document doc = Jsoup.connect(url + j).timeout(30000).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();
                if (doc.location().contains("&pi=")) {

                    Elements diskler = doc.getElementsByClass("p-card-wrppr add-to-bs-card");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element disk : diskler) {
                        String link2 = disk.getElementsByTag("a").get(0).attr("abs:href");
//                    System.out.println(link2);
                        trendyolUrunDetay(link2, urun_cinsi);
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

    public void trendyolBaglanKasa(String url) {
        for (int j = 1; j < 1000; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {
                String urun_cinsi = "Kasa";
                Document doc = Jsoup.connect(url + j).timeout(30000).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();
                if (doc.location().contains("&pi=")) {

                    Elements kasalar = doc.getElementsByClass("p-card-wrppr add-to-bs-card");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element kasa : kasalar) {
                        String link2 = kasa.getElementsByTag("a").get(0).attr("abs:href");
//                    System.out.println(link2);
                        trendyolUrunDetay(link2, urun_cinsi);
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

    public void trendyolBaglanGucKaynagi(String url) {
        for (int j = 1; j < 1000; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {
                String urun_cinsi = "Güç Kaynağı";
                Document doc = Jsoup.connect(url + j).timeout(30000).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();
                if (doc.location().contains("&pi=")) {

                    Elements gucler = doc.getElementsByClass("p-card-wrppr add-to-bs-card");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element guc : gucler) {
                        String link2 = guc.getElementsByTag("a").get(0).attr("abs:href");
//                    System.out.println(link2);
                        trendyolUrunDetay(link2, urun_cinsi);
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

    public void trendyolBaglanMonitor(String url) {
        for (int j = 1; j < 1000; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {
                String urun_cinsi = "Monitör";
                Document doc = Jsoup.connect(url + j).timeout(30000).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();
                if (doc.location().contains("&pi=")) {

                    Elements monitorler = doc.getElementsByClass("p-card-wrppr add-to-bs-card");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element monitor : monitorler) {
                        String link2 = monitor.getElementsByTag("a").get(0).attr("abs:href");
//                    System.out.println(link2);
                        trendyolUrunDetay(link2, urun_cinsi);
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

    public void trendyolBaglanKlavye(String url) {
        for (int j = 1; j < 1000; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {
                String urun_cinsi = "Klavye";
                Document doc = Jsoup.connect(url + j).timeout(30000).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();
                if (doc.location().contains("&pi=")) {

                    Elements klavyeler = doc.getElementsByClass("p-card-wrppr add-to-bs-card");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element klavye : klavyeler) {
                        String link2 = klavye.getElementsByTag("a").get(0).attr("abs:href");
//                    System.out.println(link2);
                        trendyolUrunDetay(link2, urun_cinsi);
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

    public void trendyolBaglanMouse(String url) {
        for (int j = 1; j < 1000; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {
                String urun_cinsi = "Mouse";
                Document doc = Jsoup.connect(url + j).timeout(30000).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();
                if (doc.location().contains("&pi=")) {

                    Elements mouselar = doc.getElementsByClass("p-card-wrppr add-to-bs-card");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element mouse : mouselar) {
                        String link2 = mouse.getElementsByTag("a").get(0).attr("abs:href");
//                    System.out.println(link2);
                        trendyolUrunDetay(link2, urun_cinsi);
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

    public void trendyolBaglanSogutmaSistemleri(String url) {
        for (int j = 1; j < 1000; j++) {
            System.out.println("şuanki  sayfa= " + j);
            try {
                String urun_cinsi = "Soğutma Sistemleri";
                Document doc = Jsoup.connect(url + j).timeout(30000).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();
                if (doc.location().contains("&pi=")) {

                    Elements sogutmalar = doc.getElementsByClass("p-card-wrppr add-to-bs-card");
                    System.out.println("doc.location() = " + doc.location());

                    for (Element sogutma : sogutmalar) {
                        String link2 = sogutma.getElementsByTag("a").get(0).attr("abs:href");
//                    System.out.println(link2);
                        trendyolUrunDetay(link2, urun_cinsi);
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

    public void trendyolUrunDetay(String url, String urun_cinsi) {
        try {

            Document doc = Jsoup.connect(url).timeout(30000).userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36").get();

            int site_id = 2;

            String urun_ad = doc.getElementsByClass("pr-new-br").text();

            String urun_cins = urun_cinsi;

            String urun_fiyat = doc.getElementsByClass("prc-slg").get(0).text();

            String urun_ozellikler = "";
            Elements table = doc.getElementsByClass("pr-in-dt-cn").select("span");
            Elements rows = table.select("li");
            for (Element row : rows) {
                //Bu satira ait kolon elementlerini bul
                Elements columns = row.select("li");
                //Her kolonun icerigini yazdir
                for (Element column : columns) {
                    urun_ozellikler += column.text() + ";;;;;";
                }
            }

            String urun_marka = doc.getElementsByClass("pr-new-br").select("a").text();
            if (urun_marka.isEmpty()) {
                urun_marka = urun_ad.split(" ")[0];
            }

            String urun_resim_link = doc.getElementsByClass("ph-gl-img").attr("abs:src");
            String urun_resim = "";
//            saveImage(urun_resim_link, "C:\\Users\\dogan\\OneDrive\\Resimler\\Staj_Proje_Resimler\\trendyol\\" + sayac + ".jpeg");
            urun_resim = "trendyol\\" + sayac + ".jpeg";
            sayac++;

            String urun_link = url;

            String urun_skor = "";
            try {
                urun_skor = doc.getElementsByClass("ttl").select("span").first().text();
            } catch (NullPointerException e) {
                urun_skor = "0.0";
            }

            System.out.println("site_id:" + site_id);
            System.out.println("urun_ad:" + urun_ad);
            System.out.println("urun_cins = " + urun_cins);
            System.out.println("urun_fiyat:" + urun_fiyat);
            System.out.println("ürün özellikler:");
            System.out.println(urun_ozellikler);
            System.out.println("urun_marka:" + urun_marka);
            System.out.println("urun_resim = " + urun_resim);
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
            InputStream is = url.openStream();
            OutputStream os = new FileOutputStream(destinationFile);

            byte[] b = new byte[2048];
            int length;

            while ((length = is.read(b)) != -1) {
                os.write(b, 0, length);
            }

            is.close();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            trendyol baglan = new trendyol();
            baglan.trendyolBaglanEkranKart("https://www.trendyol.com/sr?q=ekran+kart&qt=ekran+kart&st=ekran+kart&os=1&pi=");
            baglan.trendyolBaglanRam("https://www.trendyol.com/sr?q=ram&qt=ram&st=ram&os=1&pi=");
            baglan.trendyolBaglanIslemci("https://www.trendyol.com/sr?q=i%C5%9Flemci&qt=i%C5%9Flemci&st=i%C5%9Flemci&os=1&pi=");
            baglan.trendyolBaglanAnakart("https://www.trendyol.com/sr?q=anakart&qt=anakart&st=anakart&os=1&pi=");
            baglan.trendyolBaglanHarddisk("https://www.trendyol.com/sr?q=harddisk&qt=harddisk&st=harddisk&os=1&pi=");
            baglan.trendyolBaglanKasa("https://www.trendyol.com/sr?q=bilgisayar+kasas%C4%B1&qt=bilgisayar+kasas%C4%B1&st=bilgisayar+kasas%C4%B1&os=1&sk=1&pi=");
            baglan.trendyolBaglanGucKaynagi("https://www.trendyol.com/sr?q=g%C3%BC%C3%A7+kayna%C4%9F%C4%B1&qt=g%C3%BC%C3%A7+kayna%C4%9F%C4%B1&st=g%C3%BC%C3%A7+kayna%C4%9F%C4%B1&os=1&sk=1&pi=");
            baglan.trendyolBaglanMonitor("https://www.trendyol.com/sr?q=monit%C3%B6r&qt=monit%C3%B6r&st=monit%C3%B6r&os=1&pi=");
            baglan.trendyolBaglanKlavye("https://www.trendyol.com/sr?q=klavye&qt=klavye&st=klavye&os=1&pi=");
            baglan.trendyolBaglanMouse("https://www.trendyol.com/sr?q=mouse&qt=mouse&st=mouse&os=1&pi=");
            baglan.trendyolBaglanSogutmaSistemleri("https://www.trendyol.com/sr?wc=103666&q=bilgisayar+so%C4%9Futma&qt=bilgisayar+so%C4%9Futma+&st=bilgisayar+so%C4%9Futma&pi=");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
