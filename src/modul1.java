import java.util.Scanner;

class modul1 {

    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin487";

//    private static final String[] MAHASISWA_NIM = {"202310370311487"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("==== Selamat datang di milab ! ====");

        boolean isLoggedIn = false;
        while (!isLoggedIn) {
            System.out.println("\nSilakan pilih jenis user:");
            System.out.println("1. Mahasiswa");
            System.out.println("2. Admin");
            System.out.println("3. Keluar");
            System.out.print("Login Sebagai: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    isLoggedIn = mahasiswaLogin(scanner);
                    break;
                case 2:
                    isLoggedIn = adminLogin(scanner);
                    break;
                case 3:
                    System.out.println("Terima kasih telah mengakses milab .");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }

    private static boolean mahasiswaLogin(Scanner scanner) {
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();
        if (nim.length() == 15) {
            System.out.println("login mahasiswa berhasil");
            return false;
        }else {
            System.out.println("Panjang NIM harus tepat 15 karakter.");
        }
//        for (String validNim : MAHASISWA_NIM) {
//            if (validNim.equals(nim)) {
//                System.out.println("Anda Mahasiswa Kami");
//                return true;
//            }
//        }
        System.out.println("NIM tidak valid.");
        return true;
    }

    private static boolean adminLogin(Scanner scanner) {
        System.out.print("Masukkan username admin: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password admin: ");
        String password = scanner.nextLine();
        if (ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password)) {
            System.out.print("Anda Login Sebagai Admin");
            return true;
        } else {
            System.out.print("username atau password anda salah");
        }
        return false;
    }
}