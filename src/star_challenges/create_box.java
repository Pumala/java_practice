package star_challenges;

public class create_box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printBox(8);
		leftHalfTri(7);
		rightHalfTri(7);
	}

	public static void printBox(int num) {
		if (num < 1) {
			System.out.println("Only numbers 1 and above please!");
		} else if (num == 1) {
			System.out.println("*");
		} else {
			String bun = new String(new char[num]).replace("\0", "*");
			String sides = "*" + new String(new char[num - 2]).replace("\0", " ") + "*";
			System.out.println(bun);
			int sidesHeight = num - 2;
			
			while (sidesHeight != 0) {
				System.out.println(sides);
				sidesHeight -= 1;
			}
			System.out.println(bun);
		}
	}
	
	public static void leftHalfTri(int num) {
		if (num < 1) {
			System.out.println("Only numbers 1 and above please!");
		} else {
			for (int i = 1; i <= num; i++) {
				String line = new String(new char[i]).replace("\0", "*");
				System.out.println(line);
			}
		}
	}
	
	public static void rightHalfTri(int num) {
		if (num < 1) {
			System.out.println("Only numbers 1 and above please!");
		} else {
			for (int i = num; i > 0; i--) {
				String line = new String(new char[num - i]).replace("\0", " ");
				line = line + new String(new char[i]).replace("\0", "*");
				System.out.println(line);
			}
		}
	}
	
}
