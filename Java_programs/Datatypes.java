// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class  Datatypes{
 public static class car{
        int num;
        String carName;
//          System.out.println(num+" "+carName); 
    }
    
    public static void main(String[] args) {
        car carry =new car();
                 System.out.println(carry.num+" "+carry.carName); 

       int a =4;
    //   char c =null;   no null by primitive
        String name ="Aman Verma";
       
        System.out.println(a+" "+name);
       //------------------------------------
        // int x;
        // float y;
        // char ch;
        int arr[]={};
        
       // System.out.println(x+ " "+y+" "+ch);// can't bcz it is loacal varibale if it non static or in some class means instance the give default values 
                System.out.println(arr);
            
            
    }
}