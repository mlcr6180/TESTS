package com.test.ec.utilities.credenciales;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CredencialesIncorrectas {
    private static final Map<String, String> credentialsMap = new HashMap<>();
    static {

        String defaultPassword = "123456";

        credentialsMap.put("jamaldon", defaultPassword);
        credentialsMap.put("jmeras", defaultPassword);
        credentialsMap.put("tcsmonitor", defaultPassword);
        credentialsMap.put("jahaira2000", defaultPassword);
        credentialsMap.put("MASGAS1", defaultPassword);
    }

    public static String obtenerContrasenaIncorrectaParaUsuario(String username) {
        return credentialsMap.get(username);
    }
}
