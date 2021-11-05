public class Fibonnaci {
    public static void main(String[] args){
        System.out.println("This program aims to print a fibonnaci sequence");
        int result  = 1;
        int prevNumber = 1;
        int nextNumber = 1;
        for (int i = 1; i <=10; i++){
            if(i == 1){
                System.out.print(result);
            }else{
                result = prevNumber + nextNumber;
                System.out.print("," + result);
                prevNumber = nextNumber;
                nextNumber = result;
            }
        }
    }
}
