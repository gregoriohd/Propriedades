package br.com.gregoriosantos;

import java.util.Properties;

public class Testar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Propriendade mp =new Propriendade();
		Properties p = mp.getPropriendades();
		System.out.println(p.getProperty("PROP.NOME") + "\n" + p.getProperty("PROP.SENHA"));
		

	}

}
