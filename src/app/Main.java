
package app;


public class Main {

    
    public static void mostrar(Ventas [][] g)
    {
        int total = 0;
        
        for(int i = 0; i < g.length; i++)
        {
            int totalVendedor = 0;
            for(int j= 0; j < g[i].length; j++)
            {
                if(j == 0)
                    System.out.println("Vendedor: " + g[i][j].vendedor);
                
                System.out.println("");
                System.out.println("Descripción: " + g[i][j].descri);
                System.out.println("Venta: " + g[i][j].costo);
                System.out.println("Fecha: " + g[i][j].fecha);
                System.out.println("---------------");
                
                totalVendedor += g[i][j].costo;
                
                if(j == g[i].length - 1)
                {
                    System.out.println(" Total: " + totalVendedor);
                    total += totalVendedor;
                    System.out.println("---------------");
                }
            } // segundo for
            System.out.println("");
            System.out.println("");
            
            
        }// primer for
        
            System.out.println("------------->>><<<-------------");
            System.out.println("Gran Total: " + total);
            System.out.println("------------->>><<<-------------");
        
    }
    
    public static void main(String args[])
    {
        Ventas grafica [][];
        
        grafica = new Ventas[3][];
        
        
        grafica[0] = new Ventas[2];
        grafica[1] = new Ventas[5];
        grafica[2] = new Ventas[3];
        
        
        grafica[0][0] = new Ventas("Oscar", "hoy", 300, "ropa");
        grafica[0][1] = new Ventas("Oscar", "hoy", 500, "electronica");
        
        
        grafica[1][0] = new Ventas("Ceci", "hoy", 300, "zapatos");
        grafica[1][1] = new Ventas("Ceci", "hoy", 800, "ropa");
        grafica[1][2] = new Ventas("Ceci", "hoy", 100, "ropa");
        grafica[1][3] = new Ventas("Ceci", "hoy", 300, "comida");
        grafica[1][4] = new Ventas("Ceci", "hoy", 200, "gorras");
        
        
        grafica[2][0] = new Ventas("Mayra", "hoy", 300, "revistas");
        grafica[2][1] = new Ventas("Mayra", "hoy", 100, "libros");
        grafica[2][2] = new Ventas("Mayra", "hoy", 100, "lentes");
        
        
        mostrar(grafica);
        
//        System.out.println("Vendedor: Oscar");
//        for (int i = 0; i < grafica[0].length; i++) {
//            System.out.println("Venta: " + grafica[0][i].costo);
//            
//        }
//        
//        System.out.println("");
//        System.out.println("Vendedor: Ceci");
//        for (int i = 0; i < grafica[1].length; i++) {
//            System.out.println("Venta: " + grafica[1][i].costo);
//            
//        }
        
//        System.out.println("");
//        System.out.println("Vendedor: Mayra");
//        for (int i = 0; i < grafica[2].length; i++) {
//            System.out.println("Venta: " + grafica[2][i].costo);
//            
//        }
        
    }
    
    
    
    
}
