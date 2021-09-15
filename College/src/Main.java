import java.util.*;

public class Main {

	public static Hosteller getHostellerDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Details:");
		System.out.println("StudentId");
		int id = sc.nextInt();

		System.out.println("Student Name");
		String name = sc.next();

		System.out.println("DepartmentId");
		int did = sc.nextInt();

		System.out.println("Gender");
		String gender = sc.next();

		System.out.println("Phone Number");
		String ph = sc.next();

		System.out.println("Hostel Name");
		String hostel = sc.next();

		System.out.println("Room Number");
		int room = sc.nextInt();

		Hosteller h = new Hosteller();

		h.setDepartmentId(id);
		h.setName(name);
		h.setDepartmentId(did);
		h.setGender(gender);
		h.setPhone(ph);
		h.setHostelName(hostel);
		h.setRoomNumber(room);
		return h;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		Hosteller hosteller = getHostellerDetails();

		System.out.println("Modify Room Number(Y/N)");
		boolean modifyR = s.next().equals("Y");

		if (modifyR) {
			System.out.println("New Room Number");
			int room = s.nextInt();
			hosteller.setRoomNumber(room);
		}

		System.out.println("Modify Phone Number(Y/N)");
		boolean updatePhone = s.next().equals("Y");

		if (updatePhone) {
			System.out.println("New Phone Number");
			String phNo = s.next();
			hosteller.setPhone(phNo);
		}

		StringJoiner stringJoiner = new StringJoiner(" ");
		stringJoiner.add(String.valueOf(hosteller.getStudentId())).add(hosteller.getName())
				.add(String.valueOf(hosteller.getDepartmentId())).add(hosteller.getGender()).add(hosteller.getPhone())
				.add(hosteller.getHostelName()).add(String.valueOf(hosteller.getRoomNumber()));

		System.out.println("The Student Details:");
		System.out.println(stringJoiner.toString());

	}

}
