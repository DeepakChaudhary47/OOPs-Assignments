import java.io.*;
public class CreateFile 
{
public static void main (String[]args) throws IOException
        {
          File f=new File("C:\\.vscode\\JAVA Codes\\Deepu.txt");
          if(f.createNewFile())
          {
            System.out.println("File Succesfully Created........ ");

            //Using FileWriter for Write something in That Created File...

             FileWriter writer = new FileWriter("C:\\.vscode\\JAVA Codes\\Deepu.txt");
              writer.write("Good Morning Maam................");
              writer.close();

              //Using FileReader for Read the Content in That File...
              FileReader reader=new FileReader(f);
               int data;
               while((data = reader.read()) != -1)
               {
                System.out.print((Char) data);
              }
               reader.close();

           }
          
          else
             {
               System.out.println("File Already Exits...... ");
             }
    }  
}            
            
         
