import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class b1_3
{
  private static Scanner a = new Scanner(System.in);
  
  public b1_3() {}
  
  public static void main(String[] paramArrayOfString)
  {
    paramArrayOfString = a("numbers.txt");
    while (a.hasNextLine())
    {
      Object localObject = a.nextLine().replace('-', ' ');
      localObject = new Scanner((String)localObject);
      for (int i = 1; ((Scanner)localObject).hasNext(); i = 0)
      {
        String str1;
        String str2 = (str1 = ((Scanner)localObject).next()).toLowerCase();
        if (i == 0) {
          System.out.print(" ");
        }
        if (paramArrayOfString.containsKey(str2)) {
          str1 = ((Integer)paramArrayOfString.get(str2)).toString();
        }
        System.out.print(str1);
      }
      System.out.println();
    }
  }
  
  private static Map a(String paramString)
  {
    HashMap localHashMap = new HashMap();
    try
    {
      paramString = new Scanner(new File(paramString));
      while (paramString.hasNextLine())
      {
        Object localObject;
        if ((localObject = paramString.nextLine().trim()).length() > 0)
        {
          if ((localObject = ((String)localObject).split(" - ")).length != 2)
          {
            System.err.println("ERROR: syntax error in number file!");
            System.exit(1);
          }
          String str = localObject[1].toLowerCase();
          if (localHashMap.containsKey(str))
          {
            System.err.println("ERROR: repeated number \"" + str + "\" in number file!");
            System.exit(1);
          }
          try
          {
            localHashMap.put(str, Integer.valueOf(Integer.parseInt(localObject[0])));
          }
          catch (NumberFormatException localNumberFormatException)
          {
            System.err.println("ERROR: invalid number \"" + localObject[0] + "\" in number file!");
            System.exit(1);
          }
        }
      }
      paramString.close();
    }
    catch (IOException localIOException)
    {
      System.err.println("ERROR: reading number file!");
      System.exit(2);
    }
    return localHashMap;
  }
}
