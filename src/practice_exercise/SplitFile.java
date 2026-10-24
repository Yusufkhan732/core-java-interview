package practice_exercise;

import java.io.BufferedReader; import java.io.BufferedWriter; import java.io.FileReader; import java.io.FileWriter; import java.util.ArrayList; import java.util.List;

public class SplitFile {
	
	    public static void main(String[] args) throws Exception{
	    	
	        String inputFileName = "E:\\Study\\Programs\\Java IO\\Practice.txt";
	        String outputFilePrefix = "E:\\Study\\Programs\\Java IO\\Practice part";  

	        try (BufferedReader in = new BufferedReader(new FileReader(inputFileName))) { 
	        	
	            List<String> f = new ArrayList<>();
	            String line; // stores the line that is read from Practice file
	            int fileIndex = 1;

	            while ((line = in.readLine()) != null) { // used readline function of buffer class
	                f.add(line); // it add the next line in list
	        
	                if (f.size() == 2) {
	                	
	                    writeFile(outputFilePrefix + fileIndex + ".txt", f);
	                    f.clear(); 
	                    fileIndex++;
	                }
	            }

	            System.out.println("File splitting completed successfully.");

	        } 
	    }

	    public static void writeFile(String fileName, List<String> lines) throws Exception {
	    	
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
	            for (String line : lines) {
	                writer.write(line);
	                writer.newLine();
	            }
	        }
	        System.out.println("Created: " + fileName);
	    }
	}