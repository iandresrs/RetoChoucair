package com.orangehrm.utils;

import static com.orangehrm.utils.Constantes.HOJA_CREDENCIALES;

public class ObtenerDato {

    private LeerDatosExcel excel = new LeerDatosExcel();

    public String getUsuario(){


        return excel.leerDatos(HOJA_CREDENCIALES,1,0);

    }

    public String getClave(){
        return excel.leerDatos(HOJA_CREDENCIALES,1,1);
    }

    public void cerrarExcel(){
        excel.close();
    }
}
