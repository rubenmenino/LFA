import java.util.*;
import java.io.*;

public class ex1_6 {
	
	static Map<String,String> translacao = new HashMap<>();
	
	public static void main (String[] args) {
		System.out.println("..............");
		initializeTranslationMap("/home/utilizador/Desktop/LFA/Aula1/bloco1 + args[0]");
		
		for (int i = 1; i < args.length ; i++){
			System.out.println("Translating" + args[i] + "..");
			translateFile("/home/utilizador/Desktop/LFA/Aula1/bloco1 + args[i]");
			System.out.println("\n");
		}
		
	}
	
	public static void translateFile(String filepath){
		
		try{ 
		FileReader fileReader = new FileReader(filepath);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		String line;
		
		while ((line = bufferedReader.readLine()) != null){
			String[] lineParts = line.split(" ");
			for (int i = 0; i < lineParts.length ; i++){
				if (translacao.containsKey(lineParts[i])){
					System.out.print(translacao.get(lineParts[i]) + " ");
				}else{
					System.out.print(lineParts[i] + " ");
				}
			}
			
		}
		bufferedReader.close();
	}
	
	catch(Exception e){
		e.printStackTrace();
	}
	
	}

	public static void initializeTranslationMap(String filepath){
		try{
			
			FileReader fileReader = new FileReader(filepath);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
		
			String line;
			
			while ((line = bufferedReader.readLine()) != null){
				String[] lineParts = line.trim().split(" ",2);
				if (!lineParts[1].trim().isEmpty()){
					translacao.put(lineParts[0], lineParts[1].trim());
				}
			}
			bufferedReader.close();
		}
		catch (Exception e){
			e.printStackTrace();
		}	
		}	
}

