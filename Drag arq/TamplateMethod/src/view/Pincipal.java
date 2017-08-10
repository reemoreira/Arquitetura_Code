package view;

import login.LoginBlibioteca;

public class Pincipal {

	public static void main(String[] args) {
		loginBiblioteca login = new LoginBlibioteca();
		if(login.validar("adm","123")){
			Login.autorizar();
		}
}

}
