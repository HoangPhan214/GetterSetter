package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Student[] st = new Student[3];
		input(st);
		print(st);
		sort(st);
	}
		private static void sort(Student[] st) {
			for (int i = 0; i < st.length -1; i++) {
			for (int j = i + 1; j < st.length; j++) {
					if (st[i].getDiemTrungBinh() > st[j].getDiemTrungBinh()) {
						Student diemTrungBinh = st[i];
						st[i] = st[j];
						st[j] = diemTrungBinh;
					}
		}
}
	}
		private static void print(Student[] st) {
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i].toString());
		}
	}
		private static void input(Student[] st) {
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < st.length; i++) {
				System.out.format("Person a[%d]",i);
				System.out.println("Nhap ten: ");
				String name = sc.next();
				System.out.println("Nhap tuoi: ");
				int age = sc.nextInt();
				System.out.println("Nhap dia chi: ");
				String diaChi = sc.next();
				System.out.println("Nhap sdt: ");
				String soDienThoai = sc.next();
				System.out.println("Nhap diemTB: ");
				double diemTrungBinh = sc.nextDouble();
				st[i] = new Student(name, age, diaChi, soDienThoai, diemTrungBinh);
			}
			sc.close();
		}
	}
