import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args)
    {
        Random random = new Random();
        int randomNumber = random.nextInt(99);

        // TODO yukarıdaki kod 0'dan 99'a kadar rastgele bir tamsayı üretmektedir.
        // Üretilen bu sayı 50'den küçük ise konsola "küçük", 50 veya 50'den büyükse "büyük" yazdırın.
        // Ayrıca, üretilen bu sayı çift ise konsola "çift", tek ise "tek" yazdırın

        System.out.println("Sayi : " + randomNumber);
        if (randomNumber < 50 )
        {
            System.out.println("Sayi 50'den kucuktur.");
        } else{
            System.out.println("Buyuktur");
        }
        if(randomNumber%2 == 1){
            System.out.println("Sayi TEK");
        }else{
            System.out.println("Sayi CIFT");
        }


        System.out.println("*************GRADE STUDENT************");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Notunuz :");
        int grade = scanner.nextInt();
        gradeStudent(grade);

        System.out.println("*************PRIME NUMBER************");
        System.out.print("Bir Sayi giriniz: :");
        int number = scanner.nextInt();
        isPrimeNumber(number);

        System.out.println("*************TraverseArray************");
        int[] array = {1,2,3,4,5,6,7,8,9,14,16,18};
        traverseArray(array);
    }

    private static void gradeStudent(int grade)
    {
        // TODO bu metot parametre olarak 0'dan 100'e kadar bir tamsayı alır.
        // Bu değer bir öğrencinin notudur.
        // Bu not;
        //      - 85 veya daha yüksekse karne notu 5,
        //      - 70 veya daha yüksekse karne notu 4,
        //      - 55 veya    daha yüksekse karne notu 3,
        //      - 45 veya daha yüksekse karne notu 2,
        //      - 25 veya daha yüksekse karne notu 1,
        //      - 25'ten küçükse karne notu 0'dır.
        // Öğrencinin karne notunu hesaplayan ve konsola yazdıran bir kod yazın.

        if(  grade < 25){
            System.out.println("Notunuz: 0");
        }
        else if (grade <= 25) {
            System.out.println("Notunuz: 1");

        }
        else if (grade <= 45)
        {
            System.out.println("Notunuz: 2");

        } else if (grade <= 55)
        {
            System.out.println("Notunuz: 3");
        } else if (grade <= 70)
        {
            System.out.println("Notunuz: 4");
        } else if (grade <= 85 || grade <100)
        {
            System.out.println("Notunuz: 5");
        }
        else {
            System.out.println("Gecersiz Not");
        }


    }

    private static void isPrimeNumber(int number)
    {
        // TODO parametre olarak verilen number sayısının asal sayı olup olmadığını hesaplayan bir kod yazın.
        // Eğer asal sayı ise konsola "Asal", değilse "Asal değil" yazdırın.
        int count = 0;
        if (number < 1){
            System.out.println("1'den buyuk sayilar asal sayi olabilir.");
        } else {

            for(int i=1; i <= number; i++)
            {
                int kalan = number%i;
                if(kalan == 0)
                {
                    count++;
                }
            }
            if(count == 2)
            {
                System.out.println("Sayi asaldir");
            }
            else{
                System.out.println("Sayi asal degildir");
            }
        }
    }

    private static void traverseArray(int[] array)
    {
        // TODO parametre olarak verilen array dizisinin elemanlarını while döngüsüyle gezin.
        // Elemanları konsola yazdırın.
        // Eğer 7 ile bölünebilen bir sayıyla karşılaşırsanız döngüyü sonlandırın.

        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            while ( array[i] % 7 == 0){
                System.out.println("7 ile bolunebilen bir sayidir.");
                break;
            }
        }
    }

    private static void printArray(int[] array)
    {
        // TODO parametre olarak verilen array dizisinin elemanlarını for-each döngüsüyle gezin.
        // Eğer sayı çift ise sayının karesini konsola yazdırın.
        // Eğer sayı tek ise sayının karekökünü konsola yazdırın.
        // Not: Sayının karekökünü Math.sqrt() metoduyla alabilirsiniz.
    }

}
