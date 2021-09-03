public class BarkWoof{
    public static String barkWoof(int number) {
        if(number %2 == 0 && number %6 == 0)
            return "BarkWoof";
        if(number % 2 == 0)
            return "Bark";
        if(number % 3 == 0)
            return "Woof";
        return Integer.toString(number);
    }
    public static void BarkWoofTest() {
        for(int i = 0; i <100; i ++){
            String result = barkWoof(i);
            String output = String.format("Number: %d :: Result: %s", i, result);
            System.out.println(output);
        }
    }
}