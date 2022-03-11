package tarea2;

import javax.swing.JOptionPane;

public class tarea2 {
	public static void main(String[] args) {

		String bi, cod = "", a = "";
		String hex = JOptionPane.showInputDialog("Ingresa codigo hexadecimal: ");
		int w = 1, num, con;
		bi = Integer.toBinaryString(Integer.parseInt(hex, 16));
		w = w << bi.length() - 1;
		con = 0;
		for (int i = 0; i < bi.length(); i++) {

			if (con == 4) {
				con = 0;
				cod += "U";
			}
			num = Integer.parseInt(hex, 16) & w;

			if (num != 0 || con == 4) {

				switch (con) {
				case 0:
					a = "A";
					break;
				case 1:
					a = "E";
					break;
				case 2:
					a = "I";
					break;
				case 3:
					a = "O";
				}

				con = 0;
				cod += "" + a;
			} else {
				con += 1;
			}
			w >>= 1;
		}
		JOptionPane.showMessageDialog(null, "Descompresión: \n" + cod, "", JOptionPane.PLAIN_MESSAGE);

	}
}
