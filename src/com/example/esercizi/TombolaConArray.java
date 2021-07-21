package com.example.esercizi;

import java.util.ArrayList;
import java.util.Collections;

public class TombolaConArray {

	public static void main(String[] args) {
		
		int [] array = new int [90];

		ArrayList<Integer> list = new ArrayList<Integer>();
        
	       for (int i = 1; i < 91; i++) {
			  list.add(i);
			}
	        Collections.shuffle(list);
	        for (int i=0; i<array.length; i++) {
	            array[i] = list.get(i);
				System.out.println("Estrazione "+(i+1)+": "+ array[i]);
	        }
	}
}
