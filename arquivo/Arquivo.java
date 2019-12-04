package arquivo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Arquivo {
	private File arquivo1;
	private File arquivo2;


	public Arquivo() {
		this.arquivo1 = null;
		this.arquivo2= null;

	}

	public void AbrirArquivo()  {
		try {
			arquivo1 = new File("arquivo1.txt");
			if(!arquivo1.exists())arquivo1.createNewFile();
			FileWriter w = new FileWriter(arquivo1);

			System.out.println("Digite um nome:");
			String ler = new String();
			Scanner n = new Scanner(System.in);
			ler = n.nextLine();
			w.append(ler);
			
			

			arquivo2 = new File("arquivo1.txt");
			if(!arquivo2.exists())arquivo1.createNewFile();



		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "erro interno, falha ao abrir arquivo");

		}

	}

	public void nArquivo(File arquivo1,File arquivo2) {

		try {

			String inFilearquivo1 = null;
			String outFilearquivo2 = null;

			FileInputStream in = new FileInputStream(inFilearquivo1);
			FileOutputStream out = new FileOutputStream(outFilearquivo2);

			byte[] buf = new byte[1024];
			int len;

			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}

			out.close();
			in.close();	

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void CopiarArquivo() {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("arquivo1.txt");
			fos = new FileOutputStream("arquivo2.txt");
			int c; // para armazenar um caractere
			while ((c = fis.read()) != -1) {
				fos.write(c);
			}
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "erro qualquer");
		}
		finally {
			if (fis != null) {
				try{
					fis.close();
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, "erro qualquer");
				}
			}
			if (fos != null) {
				try{
					fos.close();
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, "erro qualquer");

				}

			}
		}

	}

}




