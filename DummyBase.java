package com.escuela.usuario.valido;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class DummyBase {
	@Autowired
	private static Map<String, String>usuarios;
	static {
	usuarios = new HashMap<String, String>();
	usuarios.put("lorefior", "12345678");
	usuarios.put("mario", "22");
	usuarios.put("alantafel", "121212");
	
	}
	public static Map<String, String> getUsuarios() {
		return usuarios;
	}
	public static Object getMap() {
		return null;
	}

	}
