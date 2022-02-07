package com.cursosdedesarrollo.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Alumno a = new Alumno();
        a.setDireccion("Atlethic Kalea");
        a.setNombre("Iñaki");
        a.setId(1);
        System.out.println(a);

    }
}
