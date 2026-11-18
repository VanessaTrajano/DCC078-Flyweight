package org.example;

import java.util.HashMap;
import java.util.Map;

public class EditoraFactory {
    private static Map<String, Editora> editoras = new HashMap<>();

    public static Editora getEditora(String nome, String cidadeSede) {
        Editora editora = editoras.get(nome);
        if (editora == null) {
            editora = new Editora(nome, cidadeSede);
            editoras.put(nome, editora);
        }
        return editora;
    }

    public static int getTotalEditoras() {
        return editoras.size();
    }
}