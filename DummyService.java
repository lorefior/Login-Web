package com.escuela.usuario.valido;

import org.springframework.stereotype.Service;
import com.escuela.usuario.valido.DummyBase;

@Service
public class DummyService {
	private String usuario;
	private String contrasenia;

	public String getusuario() {
		return usuario;
	}

	public void setusuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setcontrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public boolean getAtribute() {
		return ((String) DummyBase.getMap()).containsKey(usuario) && ((String) DummyBase.getMap()).containsValue(contrasenia);
	}
}