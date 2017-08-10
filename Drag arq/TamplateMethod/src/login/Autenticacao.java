package login;

public abstract class Autenticacao {
	public void autorizar(String login,String senha){
		System.out.println("Autorização Confirmada");
	}
	public abstract boolean validar(String user , String password){
				return true;
	}
}
