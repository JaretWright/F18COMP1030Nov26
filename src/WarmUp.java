public class WarmUp {
    public static void main(String[] args)
    {
        String[] presents = new String[5];

        presents[0] = "chips";
        presents[1] = "parrot";
        presents[2] = "socks";
        presents[3] = "coal";
        presents[4] = "Subaru WRX STI";

        displayArray(presents);

        System.out.println("Displaying the presents in reverse order:");
        displayReversed(presents);

        System.out.println("Displaying the presents in lowercase:");
        displayArrayLowercase(presents);
    }

    public static void displayReversed(String[] array)
    {
        for (int i=array.length-1;i>=0; i--)
            System.out.printf("element %d: %s%s", i, array[i],(i==0)?"":", ");
    }

    public static void displayArray(String[] array)
    {
        for (String element:array)
            System.out.println(element);
    }

    public static void displayArrayLowercase(String[] array)
    {
        for (String element:array)
            System.out.println(element.toLowerCase());
    }
}
