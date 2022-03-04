package logfile;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LogFileReader {

	public static void main(String[] args) {
		logReader();

	}

	private static void logReader() {
		try {
	        FileInputStream file = new FileInputStream("C:\\Users\\Equipo\\Documents\\workspace-spring-tool-suite-4-4.12.1.RELEASE\\Java8_Excercises\\src\\logfile\\loger\\logfile.log");
	        BufferedReader buffered = new BufferedReader(new InputStreamReader(file));
	        String logLines, comparer;
	        String key = "VISITID";
	        int bigestLID = 0, currentHour=0, countAux=0, hr=0;
	        boolean start = false;
	        StringTokenizer st;
	        while ((logLines = buffered.readLine()) != null) {
	            if (logLines.contains(key)) 
	                start = true;
	            else
               {
	            	start=false;
                  if(countAux>bigestLID)
                     {
	                  bigestLID=countAux;
	                  hr=currentHour;
                     }
                  }
               if (start) {
	                st = new StringTokenizer(logLines," ");
	                while (st.hasMoreElements())   
	                {    
	                	comparer=st.nextToken();
	                    if(comparer.contains("HRS"))
	                    {
	                    	String[] C= comparer.split(":");
	                    	if(Integer.parseInt(C[1])!=currentHour)
	                    	{
	                    		currentHour=Integer.parseInt(C[1]);
	                    		if(countAux>bigestLID)
	                    			bigestLID=countAux;
	                    		countAux=1;
	                    	}
	                    	else
	                    		countAux++;
	                    }
	                }    
	            }
	        }
	            System.out.println("The most concurred hour was at: " +hr+" hours with "+bigestLID+" visits");
	    } catch (IOException ex) {
	        //throw exception
	    	System.out.println(ex);
	    }
		
	}
	

}
