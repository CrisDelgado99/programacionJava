package tema9ArrayObj.ej5;

import java.util.Scanner;
import tema9ArrayObj.ej5.articulos.Articulo;
import tema9ArrayObj.ej5.funcionesArticulos.FuncionesArticulos;
import java.text.DecimalFormat;

public class Gestisimal {
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);

        Articulo[] articulo = new Articulo[100];

        int opcion;
        int opcionModif;
        int posicion;

        int cod;
        int stock;
        int unidades;

        double precioCompra;
        double precioVenta;

        String desc;

        articulo[0] = new Articulo(0, 10, 10, 20, "Chanclas de la playa");
        articulo[1] = new Articulo(1, 15, 20, 25, "Esterilla");

        System.out.println("¡Bienvenido al programa GESTISIMAL!");
    
        do{
            
            System.out.println("¿Qué operación desea realizar?: (1-7)");
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificación");
            System.out.println("5. Entrada de mercancía");
            System.out.println("6. Salida de mercancía");
            System.out.println("7. Salir");
            opcion = sc.nextInt();

            while(opcion < 1 || opcion > 7){
                System.out.println("Lo siento, ese valor no es una de las opciones.");
                System.out.print("Por favor, introduzca un número del 1 al 7: ");
                opcion = sc.nextInt();
            }

            switch(opcion){
                case 1:
                    System.out.println("Los artículos con los que contamos ahora mismo son:");
                    FuncionesArticulos.imprimirArticulos(articulo);
                    break;
                case 2:
                    posicion = FuncionesArticulos.conseguirSiguienteVacio(articulo);
                    cod = posicion+1;

                    System.out.print("Introduzca las unidades de este artículo que hay en stock: ");
                    stock = sc.nextInt();
                    while(stock < 0){
                        System.out.print("El stock no puede ser negativo: ");
                        stock = sc.nextInt();
                    }

                    System.out.print("Introduzca el precio de compra de este artículo: ");
                    precioCompra = sc.nextDouble();
                    while(precioCompra < 0){
                        System.out.print("El precio no puede ser negativo: ");
                        precioCompra = sc.nextDouble();
                    }

                    System.out.print("Introduzca el precio de venta de este artículo: ");
                    precioVenta = sc.nextDouble();
                    while(precioVenta < 0){
                        System.out.print("El precio no puede ser negativo: ");
                        precioVenta = sc.nextDouble();
                    }

                    System.out.print("Introduzca la descripción de este artículo: ");
                    desc = System.console().readLine();

                    articulo[posicion] = new Articulo(posicion, stock, precioCompra, precioVenta, desc);

                    System.out.println("Ha creado el siguiente artículo:");
                    System.out.println(articulo[posicion]);
                    
                    break;
                case 3:
                    System.out.print("¿Qué artículo desea dar de baja? (Introduzca el código): ");
                    cod = sc.nextInt();
                    while(cod < 1 || cod-1 > articulo.length || articulo[cod-1] == null){
                        System.out.print("No existe un artículo con ese código. Introduzca un código válido: ");
                        cod = sc.nextInt();
                    }

                    if(cod > 0 && cod < (articulo.length)-1){
                        System.out.println("Hemos borrado con éxito el artículo \"" + articulo[cod-1].getDescripcion() + "\", con código " + cod + ".\n");
                        articulo[cod-1] = null;
                    }
                    break;
                case 4:
                    System.out.print("¿De qué artículo desea modificar sus datos? (Introduzca el código): ");
                    cod = sc.nextInt();
                    while(cod < 1 || cod-1 > articulo.length || articulo[cod-1] == null){
                        System.out.print("No existe un artículo con ese código. Introduzca un código válido: ");
                        cod = sc.nextInt();
                    }

                    do{
                        System.out.println("¿Qué desea modificar?");
                        System.out.println("1. Descripción");
                        System.out.println("2. Stock");
                        System.out.println("3. Precio de compra");
                        System.out.println("4. Precio de venta");
                        System.out.println("5. salir");
                        opcionModif = sc.nextInt();
                        while(opcionModif < 1 || opcionModif > 5){
                            System.out.print("Esa no es una de las opciones, introduzca una opción válida: ");
                            opcionModif = sc.nextInt();
                        }

                        switch(opcionModif){
                            case 1:
                                System.out.print("Introduzca la descripción que desea: ");
                                desc = System.console().readLine();
                                articulo[cod-1].setDescripcion(desc);
                                break;
                            case 2:
                                System.out.print("Introduzca el stock actual: ");
                                stock = sc.nextInt();
                                while(stock < 0){
                                    System.out.println("El stock debe ser positivo: ");
                                    stock = sc.nextInt();
                                }
                                articulo[cod-1].setStock(stock);
                                break;
                            case 3:
                            System.out.print("Introduzca el nuevo precio de compra: ");
                                precioCompra = sc.nextDouble();
                                while(precioCompra < 0){
                                    System.out.println("El precio debe ser positivo: ");
                                    precioCompra = sc.nextDouble();
                                }
                                articulo[cod-1].setPrecioCompra(precioCompra);
                                break;
                            case 4:
                                System.out.print("Introduzca el nuevo precio de venta : ");
                                precioVenta = sc.nextDouble();
                                while(precioVenta < 0){
                                    System.out.println("El precio debe ser positivo: ");
                                    precioVenta = sc.nextDouble();
                                }
                                articulo[cod-1].setPrecioVenta(precioVenta);
                                break;
                            default:
                        }
                    }while(opcionModif != 5);
                    break;
                case 5:
                    System.out.print("¿De qué artículo desea añadir existencias? (Introduzca el código): ");
                    cod = sc.nextInt();
                    while(cod < 1 || cod-1 > articulo.length || articulo[cod-1] == null){
                        System.out.print("No existe un artículo con ese código. Introduzca un código válido: ");
                        cod = sc.nextInt();
                    }
                    System.out.print("¿Cuántas unidades quiere añadir al inventario?: ");
                    unidades = sc.nextInt();
                    while(unidades < 0){
                        System.out.println("El número introducido debe ser positivo: ");
                        unidades = sc.nextInt();
                    }

                    articulo[cod-1].recibirMercancia(unidades);
                    break;
                case 6:
                    System.out.print("¿De qué artículo desea enviar existencias? (Introduzca el código): ");
                    cod = sc.nextInt();
                    while(cod < 1 || cod-1 > articulo.length || articulo[cod-1] == null){
                        System.out.print("No existe un artículo con ese código. Introduzca un código válido: ");
                        cod = sc.nextInt();
                    }
                    System.out.print("¿Cuántas unidades quiere enviar?: ");
                    unidades = sc.nextInt();
                    while(unidades < 0){
                        System.out.println("El número introducido debe ser positivo: ");
                        unidades = sc.nextInt();
                    }

                    articulo[cod-1].enviarMercancia(unidades);
                    break;
                default:
                System.out.println("Saliendo. Gracias por usar Gestisimal.");
            }

            System.out.println("");
    
        } while(opcion != 7);
    }

}
