package com.example.linguaggio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ListDemo {

	private static final Logger log = LogManager.getLogger(ListDemo.class);
	
	public static void main(String[] args) {
		Random rnd = new Random();
		List<Integer> lista = new ArrayList<>();

		System.out.println("numero elementi in lista ? "+lista.size());
		for(Integer i=0; i<1000; i++) {
			lista.add(rnd.nextInt());
			System.out.println("numero elementi in lista ? "+lista.size());
		}
		System.out.println("numero elementi in lista alla fine ? "+lista.size());
		
	}

}