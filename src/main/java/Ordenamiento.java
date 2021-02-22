import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenamiento {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String [] nombres=new String[5];
	    nombres[0]="ana";
	      nombres[1]="lisa";
	      nombres[2]="dani";
	      nombres[3]="linda";
	      nombres[4]="lucy";

	    for(int i = 0; i < nombres.length - 1; i++)
	        {
	            for(int j = 0; j < nombres.length - 1; j++)
	            {
	                if (nombres[j].compareTo( nombres[j + 1])<0)
	                {
	                    String tmp = nombres[j+1];
	                    nombres[j+1] = nombres[j];
	                    nombres[j] = tmp;
	                }
	            }
	        }
	   for(int i = 0;i < nombres.length; i++)
	        {
	            System.out.print(nombres[i]+"\n");
	        }

		/*ArrayList<String> theList = new ArrayList<String>();
		        theList.add("xxx");
		        theList.add("AB");
		        theList.add("Abc");

		        System.out.println("Lista original:");
		        showList(theList);

		        Collections.sort(theList);

		        System.out.println("Lista ordenada:");
		        showList(theList);
		    }

		    private static void showList(List theList) {
		        int size = theList.size();
		        for(int i=0; i<size; i++){
		            System.out.println(theList.get(i));
		        }*/
		    }

}
