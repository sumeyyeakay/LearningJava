public class Main {
    public static void main(String[] args)
    {
        // TODO sırasıyla boolean, char, int, long ve double türlerinde değişkenler oluşturun ve konsola yazdırın

        boolean b1 = true;
        char c1 = 'a';
        int deger = 10;
        float f1 = 1.0f;
        double d1 = 3.96;


        System.out.println(b1);
        System.out.println(c1);
        System.out.println(deger);
        System.out.println(f1);
        System.out.println(d1);


        System.out.println("*************************");
        // TODO int türünde bir sabit oluşturun ve konsola yazdırın
        final int sabit = 15;
        System.out.println(sabit);


        System.out.println("*************************");
        // TODO aşağıdaki x değişkenini long türünde bir değişkene dönüştürün ve konsola yazdırın
        int x = 2020;
        float donusum = x;
        System.out.println(donusum);

        System.out.println("*************************");
        // TODO aşağıdaki y değişkenini int türünde bir değişkene dönüştürün ve konsola yazdırın
        long y = 1234L;
        System.out.println(y);
        int degerl = (int) y;
        System.out.println(degerl);

        System.out.println("*************************");
        // TODO 2 tane float türünde değişken oluşturun, bunların toplamını başka bir değişkene aktarın ve konsola yazdırın
        float a = 1.0f;
        float b = 2.0f;
        float c = a + b;
        System.out.println(c);


        System.out.println("*************************");
        // TODO istediğiniz bir sayısal türde 2 değişken oluşturun; bunların 4 işlemini farklı farklı değişkenlerde tutun ve konsola yazdırın
        int deger1 = 50;
        System.out.println("1.Sayi : " + deger1);
        int deger2 = 5;
        System.out.println("2.Sayi : " + deger2);

        int toplam = deger1 + deger2;
        int cikarma = deger1 - deger2;
        int carpma = deger1 * deger2;
        int bolme = deger1 / deger2;

        System.out.println("2 sayinin Toplami :" + toplam);
        System.out.println("2 sayinin Cikarasi :" + cikarma);
        System.out.println("2 sayinin Carpimi :" + carpma);
        System.out.println("2 sayinin Bolumu :" + bolme);
    }


}
