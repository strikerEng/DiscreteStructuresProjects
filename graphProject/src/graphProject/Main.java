package graphProject;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		System.out.println("Input the number of vertices from your file");
		Scanner scan = new Scanner(System.in);
	
		Graph myGraph = AbstractGraph.createGraph(scan, false, "List");
		
		System.out.println("Iter Started");
		
		Iterator<Edge> iter = myGraph.edgeIterator(0);
		while(iter.hasNext()){
			System.out.println(iter.next().toString());
		}
		
		System.out.println("Get Edge");
		String test1 = myGraph.getEdge(1, 4).toString();
		String test2 = myGraph.getEdge(4, 1).toString();
		
		System.out.println("Test1 " + test1);
		System.out.println("Test2 " + test2);
		
		
		
		
		
	}
	
}