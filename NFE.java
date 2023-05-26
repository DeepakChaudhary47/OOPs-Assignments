class NFE{
    public static void main(String []args) {
        String str ="Deepak";

       try{
            int a=Integer.parseInt(str);
            System.out.println(a);
            //System.out.println("String NumberFormatException");
       } 
       catch(NumberFormatException e){
         System.out.println("String "+str+" Can't be Converted to Integer.");
    }
    System.out.println("Main Method Ended");
}
}