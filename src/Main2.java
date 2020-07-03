    import java.util.Arrays;
    import java.util.Scanner;

    public class Main2 {

    public static void main(String[] args)
    {
        // TODO int türünde bir dizi oluşturun ve 1'den 5'e kadar olan rakamları ekleyin
        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));
        System.out.println("*************************");

        // TODO int türünde bir dizi oluşturun ve 1 ile 50 arasındaki (50 dahil) çift sayıları for döngüsü kullanarak diziye ekleyin
        int[] dizi = new int[26];
        int number = 0;

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = number;
            System.out.println("Cift Sayilar: " + number);
            number+=2;

        }
        System.out.println("************ axb Matrisi (CreateMatrix) *************");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a:");
        int a = scanner.nextInt();
        System.out.print("b:");
        int b = scanner.nextInt();
        createMatrix(a,b);

        System.out.println("************ (createLadder) *************");
        System.out.print("Rows:");
        int rows = scanner.nextInt();
        createLadder(rows);

        System.out.println("************ (searchInArray) *************");
        System.out.print("Item:");
        int item = scanner.nextInt();
        int[] array = {1,2,3,4,5,6,7,8,9,0,10};
        searchInArray(array,item);


        System.out.println("************ (shiftArray) *************");
        int[] array1 = {1,2,3};
        shiftArray(array1);

    }

    private static void createMatrix(int a, int b)
    {
        // TODO axb boyutunda int türünde bir matris oluşturun ve bütün elemanlarını 1 olarak ayarlayın
        int matrix[][] = new int[a][b];
        matrix[0][0] = 1;
        int number =1;

        for (int row = 0; row < matrix.length; row++) {
            int[] array = matrix[row];

            for (int col = 0; col < array.length;col++) {
                matrix[row][col] = number;

            }
        }
        for (int row = 0; row < matrix.length; row++) {
                int[] array = matrix[row];
            System.out.println(Arrays.toString(array));
        }

    }

    private static void createLadder(int rows)
    {
        // TODO rows sayısı kadar satıra sahip bir matris oluşturun.
        // Bu matrisin her satırındaki sütun sayısı farklı olacaktır.
        // Her bir satırda satır numarası neyse sütun sayısı da o kadar olmalıdır.
        // Örnek: İlk satırda 1 sütun bulunur, 6. satırda 6 sütun bulunur.

        int matrix[][] = new int[rows][];
        int number = 1;
        for (rows = 0; rows < matrix.length; rows++) {
            int[] array= new int[rows + 1];
            for (int col = 0; col < array.length;col++) {
                array[col] = number;

            }
            matrix[rows] = array;
            number ++;
        }
        for (rows = 0; rows < matrix.length; rows++) {
            int[] array = matrix[rows];
            System.out.println(Arrays.toString(array));

        }

    }

    private static void searchInArray(int[] array, int item)
    {
        // TODO array dizisi içinde item elemanını arayan bir kod yazın.
        // Eğer bulursanız konsola "Bulundu!", bulamazsanız "Bulunamadı!" yazdırın.
        int i = 0;
        boolean found = false;
        for ( i = 0; i < array.length; i++)
        {
            if (array[i]  == item)
            {
                found = true;
                break;
            }
        }
        if (found)
        {
            System.out.println("Bulundu");
        }
        else
        {
            System.out.println("Yok");
        }

    }

    private static void searchInMatrix(int[][] matrix, int item)
    {
        // TODO matrix adlı matris içinde item elemanını arayan bir kod yazın.
        // Eğer bulamazsanız konsola "Aradığınız eleman bulunamadı." yazdırın.
        // Eğer bulursanız konsola kaçıncı satır ve sütunda bulunduğunu yazın.
        //Örnek: "Aradığınız eleman 3. satır ve 5. sütunda bulunmuştur.
    }

    private static void shiftArray(int[] array1)
    {
        // TODO parametre olarak verilen dizinin elemanlarını birer aşağı kaydırın.
        // Yani, 1. eleman 2. eleman olsun, 2. eleman da 3. eleman olsun.
        // Son elemanı ise ilk eleman olarak ayarlayın.
        // ÖNEMLİ: Bu işlemi başka bir dizi kullanmadan yapın.
        int temp;
        for(int i=0; i < array1.length; i++)
        {
            array1[i]=i;
        }
        for(int i=0; i<array1.length; i++)
        {
            System.out.print(array1[i]+" ");
        }
        temp = array1[array1.length-1];
        for(int i=array1.length-1; i>0; i--)
        {
            array1[i] = array1[i-1];
        }
        array1[0] = temp;
        System.out.print("Sonuc: ");
        for(int i=0; i<array1.length; i++)
        {
            System.out.print(array1[i]+" ");
        }
    }
    }


