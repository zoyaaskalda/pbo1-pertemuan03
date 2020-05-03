package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai='D';
        switch(nilai){
            case 'A':
                System.out.println("Mhs   : \"Terimakasih pak\"");
                System.out.println("Dosen : \"Selamat ya!!\"");
                break;
            case 'B':
                System.out.println("Mhs   : \"Kenapa ulun kada dapat A pak?\"");
                System.out.println("Dosen : \"!!!!!!!!!!\"");
                break;
            case 'C':
                System.out.println("Mhs   : \"ulun turun lawan tugas pul pak\"");
                System.out.println("Dosen : \"Tapi Bisalah menjawab ujian?\"");
                System.out.println("Mhs   : \"hihihih\"");
                break;
            default:
                System.out.println("Mhs   : \"ulun turun lawan tugas pul pak\"");
                System.out.println("Dosen : \"Bujuy juakah?\"");
                System.out.println("Dosen : \"*memeriksa berkas\"");
                System.out.println("Dosen : \"*menceleng\"");
                System.out.println("Mhs   : \"Kabur...\"");
                break;

        }
    }
}
