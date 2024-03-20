package com.test.ec.utilities.credenciales;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CredencialesCorrectas {
    private static final Map<String, List<String>> credentialsMap = new HashMap<>();

    static {
        List<String> credentials1 = new ArrayList<>();
        credentials1.add("jmaldon9");
        credentials1.add("Ruminahui0324*");
        credentialsMap.put("jamaldon", credentials1);

        List<String> credentials2 = new ArrayList<>();
        credentials2.add("Banco10");
        credentialsMap.put("jmeras", credentials2);

        List<String> credentials3 = new ArrayList<>();
        credentials3.add("123*abcD");
        credentialsMap.put("tcsmonitor", credentials3);

        List<String> credentials4 = new ArrayList<>();
        credentials4.add("Consultec22.");
        credentialsMap.put("jahaira2000", credentials4);

        List<String> credentials5 = new ArrayList<>();
        credentials5.add("banco*BGR001");
        credentialsMap.put("MASGAS1", credentials5);
    }

    public static String obtenerContrasenaCorrectaParaUsuario(String username, int index) {
        List<String> passwords = credentialsMap.get(username);
        if (passwords != null && index >= 0 && index < passwords.size()) {
            return passwords.get(index);
        }
        return null;
    }
}
