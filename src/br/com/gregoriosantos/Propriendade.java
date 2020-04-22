package br.com.gregoriosantos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propriendade {

	private Properties propriendades;

	private FileInputStream arquivo;

	private File diretorio;

	public Propriendade() {

		this.propriendades = new Properties();

		this.diretorio = new File("./propriedades/");

		this.diretorio.mkdir();

		File arquivo = new File(diretorio, "dados.properties");

		try {
			this.arquivo = new FileInputStream("./propriedades/dados.properties");

			propriendades.load(this.arquivo);

			arquivo.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public Properties getPropriendades() {
		return propriendades;
	}

	public void setPropriendades(Properties propriendades) {
		this.propriendades = propriendades;
	}

	public FileInputStream getArquivo() {
		return arquivo;
	}

	public void setArquivo(FileInputStream arquivo) {
		this.arquivo = arquivo;
	}

	public File getDiretorio() {
		return diretorio;
	}

	public void setDiretorio(File diretorio) {
		this.diretorio = diretorio;
	}

}
