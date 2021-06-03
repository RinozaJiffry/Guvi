class Main{
  public static void main (String[] args)
    {
        int a = 5, b = 6;
        coprime(a, b);
    }
  
    static int x(int a, int b)
    {
        if (a == 0 || b == 0)
            return 0;
         
        if (a == b)
            return a;
         
        if (a > b)
            return x(a-b, b);
                 
        return x(a, b-a);
    }
     
    static void coprime(int a, int b) {
         
        if ( x(a, b) == 1)
            System.out.println("1");
        else
            System.out.println("0");    
    }
    
}
