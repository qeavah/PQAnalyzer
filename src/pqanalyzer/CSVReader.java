/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pqanalyzer;


import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVReader {
	
	Object wczytajCSV(String adres) {

		System.out.println("Konstruktor CSVReader");

		String line="";
		String csvSplitBy=";";
		Object[][] data = new Object[1000][1000];
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(adres));
			System.out.println("tried!!");
			int i=0;
			String[] dane = null;
			while((line=br.readLine()) !=null){
				dane = line.split(csvSplitBy);
				for (int j=0; j<dane.length;j++) {
					data[i][j]=dane[j];
				}
				i++;
			}
			System.out.println(data[0][0]);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error1");
			return null;
		}
		
		
		System.out.println("Gogogo");
		return data;	
	}
	
	void WyswietlCSV(Object[][] data) {
		int i=0;
		while (data[i][0]!=null) {
			i++;
		}	
		int k=0;
		while (data[0][k]!=null) {
			k++;
		}
		System.out.println("Wys. wynosi: "+i);
		System.out.println("Szer wynosi: "+k);
	
		for (int m=0;m<i;m++)	{	
			for (int n=0;n<k;n++) {
				System.out.print(data[m][n]+" ");
			}
			System.out.println("\n");
		}
		}
	}