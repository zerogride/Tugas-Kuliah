import javax.swing.JOptionPane;
public class TugasPemogramanPertemuan3{
 public static void main(String [] args){
 String nama="";
 nama = JOptionPane.showInputDialog("Ketik nama anda : ");
 String msg = "Hello"+ nama +"\nSilahkan Gunakan Kalkulatornya Penjumlahann
ya !";
 JOptionPane.showMessageDialog(null,msg);
 String input;
 float n1,n2,hasil;
 input=JOptionPane.showInputDialog("Masukkan Angka");
 n1=Integer.parseInt(input);
 input=JOptionPane.showInputDialog("Masukkan Angka");
 n2=Integer.parseInt(input);
 {
 hasil=n1+n2;
 String cuk="Hasil dari "+ n1 +"+"+ n2 +" Adalah : Rp."+hasil+"\n\n
\nCredit by: Andhika a.k.a SAM";
 JOptionPane.showMessageDialog(null,cuk);
 }
}
}
