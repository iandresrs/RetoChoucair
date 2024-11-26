package com.orangehrm.utils;

import static com.orangehrm.utils.Constantes.*;

public class ObtenerDato {

    private LeerDatosExcel excel = new LeerDatosExcel();

    public String getUsuario(){


        return excel.leerDatos(HOJA_CREDENCIALES,1,0);

    }

    public String getClave(){
        return excel.leerDatos(HOJA_CREDENCIALES,1,1);
    }


    public String getPrimerNombre(){
        return excel.leerDatos(HOJA_DATOS_CANDIDATO,1,0);
    }

    public String getSegundoNombre(){
        return excel.leerDatos(HOJA_DATOS_CANDIDATO,1,1);
    }

    public String getApellido(){
        return excel.leerDatos(HOJA_DATOS_CANDIDATO,1,2);
    }

    public String getVacante(){
        return excel.leerDatos(HOJA_DATOS_CANDIDATO,1,3);
    }

    public String getEmail(){
        return excel.leerDatos(HOJA_DATOS_CANDIDATO,1,4);
    }

    public String getNumeroContacto(){
        return excel.leerDatos(HOJA_DATOS_CANDIDATO,1,5);
    }

    public String getPalabraClave(){
        return excel.leerDatos(HOJA_DATOS_CANDIDATO,1,6);
    }

    public String getFechaAplicacion(){
        return excel.leerDatos(HOJA_DATOS_CANDIDATO,1,7);
    }

    public String getNota(){
        return excel.leerDatos(HOJA_DATOS_CANDIDATO,1,8);
    }


    public String getEntrevistador(){
        return excel.leerDatos(HOJA_DATOS_ENTREVISA,1,0);
    }

    public String getFechaEntrevista(){
        return excel.leerDatos(HOJA_DATOS_ENTREVISA,1,1);
    }

    public String getHoraEntrevista(){
        return excel.leerDatos(HOJA_DATOS_ENTREVISA,1,2);
    }

    public void cerrarExcel(){
        excel.close();
    }
}
