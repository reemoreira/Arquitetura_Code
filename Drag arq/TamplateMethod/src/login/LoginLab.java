package login;

public class LoginLab extends Autenticacao{	
	public abstract boolean validar(String user , String password){
		if(user.toLowerCase().equals("bibADM")&& senha.equals("ADM123"))
	return true;
	}
}
