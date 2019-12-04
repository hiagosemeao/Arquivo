package arquivo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Execucao {

		public static void main(String[] args) {
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
			JOptionPane.showMessageDialog(null, "qualquer coisa");
			}
			finally {
			if (fis != null) {
			try{
			fis.close();
			}
			catch(Exception e){
			}
			}
			if (fos != null) {
			try{
			fos.close();
			}
			catch(Exception e){
			}
			}
			}
			}
			}