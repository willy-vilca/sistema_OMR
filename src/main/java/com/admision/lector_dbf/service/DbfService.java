package com.admision.lector_dbf.service;

import com.linuxense.javadbf.DBFReader;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class DbfService {

    public List<String> leerIdentifi(MultipartFile file)
            throws Exception {

        List<String> datos = new ArrayList<>();

        InputStream is = file.getInputStream();

        DBFReader reader = new DBFReader(is);

        Object[] row;

        int contador = 0;

        while ((row = reader.nextRecord()) != null
                && contador < 100) {

            String litho = String.valueOf(row[0]);
            String tema = String.valueOf(row[1]);
            String codigo = String.valueOf(row[2]);

            datos.add(
                    "LITHO: " + litho
                            + " | TEMA: " + tema
                            + " | CODIGO: " + codigo
            );

            contador++;
        }

        return datos;
    }

    public List<String> leerRespuest(MultipartFile file)
            throws Exception {

        List<String> datos = new ArrayList<>();

        InputStream is = file.getInputStream();

        DBFReader reader = new DBFReader(is);

        Object[] row;

        int contador = 0;

        while ((row = reader.nextRecord()) != null
                && contador < 100) {

            String litho = String.valueOf(row[0]);
            String tema = String.valueOf(row[1]);

            String p1 = String.valueOf(row[3]);
            String p2 = String.valueOf(row[4]);
            String p3 = String.valueOf(row[5]);

            datos.add(
                    "LITHO: " + litho
                            + " | TEMA: " + tema
                            + " | P1: " + p1
                            + " | P2: " + p2
                            + " | P3: " + p3
            );

            contador++;
        }

        return datos;
    }
}
