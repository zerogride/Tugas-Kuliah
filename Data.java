import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Data {
 public static void main(String []args){
 Scanner scan = new Scanner(System.in);
 String input;
 int i=0;
 while(i<2){
 String nama =
 JOptionPane.showInputDialog(null,"Nim : ");
 String nim =
 JOptionPane.showInputDialog(null,"Nama : ");
 String alamat =
 JOptionPane.showInputDialog(null,"Alamat : ");
 String jurusan =
 input=JOptionPane.showInputDialog(null,"Jurusan :\n61 = Matematika\n62 = 
Biologi\n63 = Kimia\n64 = Fisika\n65 = Teknik Informatika\n66 = Teknik Arsitektur");
 float pilih;
 pilih=Integer.parseInt(input);
 if (pilih==61){
 String cetak="Unpam\n--------------------\n"+"Nim : "+nama+"\n"+"Nama : 
"+nim+"\n"+"Alamat : "+alamat+"\n"+"Jurusan : Matematika";
 JOptionPane.showMessageDialog(null,cetak);
 }
 else if(pilih==62){
 String cetak="Unpam\n--------------------\n"+"Nim : "+nama+"\n"+"Nama : 
"+nim+"\n"+"Alamat : "+alamat+"\n"+"Jurusan : Biologi";
 JOptionPane.showMessageDialog(null,cetak);
 }
 else if(pilih==63){
 String cetak="Unpam\n--------------------\n"+"Nim : "+nama+"\n"+"Nama : 
"+nim+"\n"+"Alamat : "+alamat+"\n"+"Jurusan : Kimia";
 JOptionPane.showMessageDialog(null,cetak);
 }
 else if(pilih==64){
 String cetak="Unpam\n--------------------\n"+"Nim : "+nama+"\n"+"Nama : 
"+nim+"\n"+"Alamat : "+alamat+"\n"+"Jurusan : Fisika";
 JOptionPane.showMessageDialog(null,cetak);
 }
 else if(pilih==65){
 String cetak="Unpam\n--------------------\n"+"Nim : "+nama+"\n"+"Nama : 
"+nim+"\n"+"Alamat : "+alamat+"\n"+"Jurusan : Teknik Informatika";
 JOptionPane.showMessageDialog(null,cetak);
 }
 else if(pilih==66){
 String cetak="Unpam\n--------------------\n"+"Nim : "+nama+"\n"+"Nama : 
"+nim+"\n"+"Alamat : "+alamat+"\n"+"Jurusan : Teknik Arsitektur\n\n\n";
 JOptionPane.showMessageDialog(null,cetak);
 }
 String ketik;
 JOptionPane.showInputDialog(null,"Apa anda ingin melanjutkan pembuatan data\nKetik 
[1] untuk melanjutkan\nKetik [2] untuk tidak melanjutkan\n\n ");
 if(i>=2){
 System.exit(1);
 }
 }
 }
}
