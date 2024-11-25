package com.orangehrm.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static com.orangehrm.utils.Constantes.RUTA_EXCEL;

public class LeerDatosExcel implements AutoCloseable {

    private XSSFWorkbook libro;

    public LeerDatosExcel() {
        try (FileInputStream archivo = new FileInputStream(new File(RUTA_EXCEL))) {
            libro = new XSSFWorkbook(archivo);
        } catch (IOException e) {
            throw new RuntimeException("Error al leer el archivo " + e.getMessage(), e);
        }
    }

    public String leerDatos(String hoja, int valorFila, int valorColumna) {

        Sheet sheet = libro.getSheet(hoja);
        if (sheet == null) throw new IllegalArgumentException("La hoja " + hoja + " no existe.");

        Row row = sheet.getRow(valorFila);
        if (row == null) throw new IllegalArgumentException("La fila " + valorFila + " no existe.");

        Cell cell = row.getCell(valorColumna);
        if (cell == null) throw new IllegalArgumentException("La celda " + valorColumna + " no existe.");

        return cell.getStringCellValue();
    }

    @Override
    public void close() {
        if (libro != null) {
            try {
                libro.close();
            } catch (IOException e) {
                throw new RuntimeException("Error al cerrar el archivo", e);
            }
        }
    }
}
