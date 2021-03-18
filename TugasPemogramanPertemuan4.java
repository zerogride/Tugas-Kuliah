import javax.swing.JOptionPane;
public class TugasPertemuan4{
 public static void main(String [] args){
 String nama="";
 nama = JOptionPane.showInputDialog("Ketik nama anda : ");
 String msg = "Hello"+ nama +"\nSilahkan Gunakan Program ini untuk melihat
Grade nilai kamu !";
 JOptionPane.showMessageDialog(null, msg);
 int
 hasil=Integer.parseInt(JOptionPane.showInputDialog("Masukan nilai Anda :")
);
 {
 if (hasil>=80) {
 JOptionPane.showMessageDialog(null,"Anda mendapatkan Grade A");
 }
 else if(hasil<=80&& hasil>70){
 JOptionPane.showMessageDialog(null,"Anda mendapatkan Grade B");
 }
 else if(hasil<=70&& hasil>60){
 JOptionPane.showMessageDialog(null,"Anda mendapatkan Grade C");
 }
 else if(hasil<=60&& hasil>50){
 JOptionPane.showMessageDialog(null,"Anda mendapatkan Grade D");
 }
 else if(hasil<=50){
 JOptionPane.showMessageDialog(null,"Anda mendapatkan Grade E");
 }
}
}
}
