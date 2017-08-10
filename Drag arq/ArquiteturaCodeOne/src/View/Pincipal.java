package View;

import Banco.Conexaobanco;

public class Pincipal {
	public static void main(String[]args){
		Conexaobanco.getInstance().conectar();
		Conexaobanco.getInstance().desconectar();
	}
}
