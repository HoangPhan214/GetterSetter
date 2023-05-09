package advance.dev;

public class Student {
	private String name;
	private int age;
	private String diaChi;
	private String soDienThoai;
	private double diemTrungBinh;
	
	public Student(String name, int age, String diaChi, String soDienThoai, double diemTrungBinh) {
		super();
		this.name = name;
		this.age = age;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
		this.diemTrungBinh = diemTrungBinh;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	@Override
	public String toString() {
		return "Person [ten=" + name + ", tuoi=" + age + ", diaChi=" + diaChi + ", sdt=" + soDienThoai + ", diemTB=" + diemTrungBinh
				+ "]";
		}
}
