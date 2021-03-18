import javax.swing.JOptionPane;
public class MyCalculator {
    public static void main(String []args){
        String input;

        input=JOptionPane.showInputDialog(null,"1.Penambahan\n\n2.Pengurangan\n\n3.Perkalian\n\n4.Pembagian\n\n5.EXIT\n\nPilih Nomor yang anda inginkan");
        float pilih;
        pilih=Integer.parseInt(input);
        if (pilih==1) {
            float n1,n2,hasil;
            input=JOptionPane.showInputDialog("Masukan angka Pertama : ");
            n1=Integer.parseInt(input);
            input=JOptionPane.showInputDialog("Masukan angka Kedua");
            n2=Integer.parseInt(input);
            hasil=n1+n2;
            JOptionPane.showMessageDialog(null,"Hasilnya :"+hasil);
        }
        else if (pilih==2) {
            float n1,n2,hasil;
            input=JOptionPane.showInputDialog("Masukan angka Pertama : ");
            n1=Integer.parseInt(input);
            input=JOptionPane.showInputDialog("Masukan angka Kedua");
            n2=Integer.parseInt(input);
            hasil=n1-n2;
            JOptionPane.showMessageDialog(null,"Hasilnya : "+hasil);
        }
        else if (pilih==3) {
            float n1,n2,hasil;
            input=JOptionPane.showInputDialog("Masukan angka Pertama : ");
            n1=Integer.parseInt(input);
            input=JOptionPane.showInputDialog("Masukan angka Kedua");
            n2=Integer.parseInt(input);
            hasil=n1*n2;
            JOptionPane.showMessageDialog(null,"Hasilnya : "+hasil);
        }
        else if (pilih==4) {
            float n1,n2,hasil;
            input=JOptionPane.showInputDialog("Masukan angka Pertama : ");
            n1=Integer.parseInt(input);
            input=JOptionPane.showInputDialog("Masukan angka Kedua");
            n2=Integer.parseInt(input);
            hasil=n1/n2;
            JOptionPane.showMessageDialog(null,"Hasilnya : "+hasil);
        }
        else if(pilih==5){
            JOptionPane.showMessageDialog(null,"Terima Kasih Telah menggunakan Program\nyang telah saya buat\n\n\n\n\n\n\n\n\n\n\n\nCreated by Andhika a.k.a SAM/Zerogride");
            System.exit(0);
        }
        else{
            JOptionPane.showInputDialog(null,"Wrong Code pls Enter a correct Code","Error Error!!",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
