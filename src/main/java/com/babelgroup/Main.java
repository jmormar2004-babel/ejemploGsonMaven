package com.babelgroup;

import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {

        ClaseInternaSinSentidoAlguno s = new ClaseInternaSinSentidoAlguno(23478, "onjkolf", 237890276);

        Gson sf = new Gson();

        String objeto = sf.toJson(s);

        System.out.println(objeto);

        ClaseInternaSinSentidoAlguno rec = sf.fromJson(objeto, ClaseInternaSinSentidoAlguno.class);

        System.out.println(sf.toJson(rec));


    }

    static class ClaseInternaSinSentidoAlguno{
        private int numeroRandom;
        private String stringRandom;
        private long ahoraUnLongPorqueMeDaLaGana;

        public ClaseInternaSinSentidoAlguno(int n ,String g ,long lnog){
            numeroRandom = n;
            stringRandom = g;
            ahoraUnLongPorqueMeDaLaGana = lnog;
        }
    }

}
