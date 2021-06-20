

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Contenedor extends JComponent{
     static JPanel panel;
     
     static int columnaLobo= 200; 
     static int filaLobo = 245;//195
     static int columnaLoboF = 780;
     
     
    static int columnaOveja = 200; 
    static int filaOveja = 315;
    static int columnaOvejaF = 754;
    
    static int columnaCol = 200;
    static int filaCol = 335;
    static int columnaColF = 780;
    
    static int columnaBote = 400;
    static int filaBote = 435;
    static int columnaBoteF = 800;
    
    public static int columnaGranjero=270;
    public static int filaGranjero = 345;
    public static int columnaGranjeroF=670;
     
     ImageIcon fondo,lobo,oveja,col,bote,granjero;  
  
     
     Contenedor(JPanel panel){
      this.panel = panel;
      
      setBounds(0, 0,panel.getWidth() , panel.getHeight());
         
  }
 
     @Override
    public void paint(Graphics g){
	fondo = new ImageIcon(new ImageIcon(getClass().getResource("imagenes/fondo2.jpg")).getImage());
	
        g.drawImage(fondo.getImage(),0,0,getWidth(),getHeight(),null); 

	lobo =new ImageIcon(new ImageIcon(getClass().getResource("imagenes/1.png")).getImage());
        oveja =new ImageIcon(new ImageIcon(getClass().getResource("imagenes/2.png")).getImage());
        col =new ImageIcon(new ImageIcon(getClass().getResource("imagenes/3.png")).getImage());
        bote =new ImageIcon(new ImageIcon(getClass().getResource("imagenes/4.png")).getImage());
        granjero =new ImageIcon(new ImageIcon(getClass().getResource("imagenes/5.png")).getImage());
    

        g.setColor(Color.WHITE);
        
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.dispose();

        g.drawImage(bote.getImage(), columnaBote, filaBote, -220, 138, null);
        g.drawImage(lobo.getImage(), columnaLobo, filaLobo, -150, 100, null); 
        g.drawImage(oveja.getImage(), columnaOveja, filaOveja, -75, 75, null); 
        g.drawImage(col.getImage(), columnaCol, filaCol, -100, 100, null); 
        g.drawImage(granjero.getImage(), columnaGranjero, filaGranjero, 106, 175, null); 
        
       
       }
    
 ////Movimientos de Izquierda del Rio al Bote
    static Thread hiloOvejaBoteIzqSube = new Thread(){
      
       @Override
        public void run()
        {
            try{
                while(filaOveja!=425 || columnaOveja !=310){
                  panel.repaint();  
                  columnaOveja+=5;
                  filaOveja+=5;
                  this.sleep(100);
                }
                //hiloOvejaBoteGranjero.start();
                //this.stop();
            } 
            catch (java.lang.InterruptedException ex) {
                  System.out.println(ex.getMessage()); 
               }
        }
    };
    static Thread hiloOvejaBoteIzqBaja = new Thread(){
      
       @Override
        public void run()
        {
            try{
                while(filaOveja!=315 || columnaOveja !=200){
                  panel.repaint();  
                  columnaOveja-=5;
                  filaOveja-=5;
                  this.sleep(100);
                }
                //hiloOvejaBoteGranjero.start();
                this.stop();
            } 
            catch (java.lang.InterruptedException ex) {
                  System.out.println(ex.getMessage()); 
               }
        }
    };
    
    static Thread hiloColBoteIzqSube = new Thread(){
      
       @Override
        public void run()
        {
            try{
                while(filaCol!=425 || columnaCol !=320){
                  panel.repaint();  
                  columnaCol+=4;
                  filaCol+=3;
                  this.sleep(100);
                }
                //hiloColBoteGranjero.start();
                this.stop();
            } 
            catch (java.lang.InterruptedException ex) {
                  System.out.println(ex.getMessage()); 
               }
        }
    };
    static Thread hiloColBoteIzqBaja = new Thread(){
      
       @Override
        public void run()
        {
            try{
                while(filaCol!=335 || columnaCol !=200){
                  panel.repaint();  
                  columnaCol-=4;
                  filaCol-=3;
                  this.sleep(100);
                }
                //hiloLoboBoteGranjero.start();
                this.stop();
            } 
            catch (java.lang.InterruptedException ex) {
                  System.out.println(ex.getMessage()); 
               }
        }
    };
  
    static Thread hiloLoboBoteIzqSube = new Thread(){
      
       @Override
        public void run()
        {
            try{
                while(filaLobo!=425 || columnaLobo !=320){
                  panel.repaint();  
                  columnaLobo+=4;
                  filaLobo+=6;
                  this.sleep(100);
                }
                
            } 
            catch (java.lang.InterruptedException ex) {
                  System.out.println(ex.getMessage()); 
               } catch (Throwable ex) {
               Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    };
    static Thread hiloLoboBoteIzqBaja = new Thread(){
      
       @Override
        public void run()
        {
            try{
                while(filaLobo!=245 || columnaLobo !=200){
                  panel.repaint();  
                  columnaLobo-=4;
                  filaLobo-=6;
                  this.sleep(100);
                }
                this.stop();
            } 
            catch (java.lang.InterruptedException ex) {
                  System.out.println(ex.getMessage()); 
               }
        }
    };
  
  ///////Movimientos de un lado del rio al otro
    static Thread hiloBoteGranjeroDerIzq = new Thread(){
       @Override
        public void run()
        {
            try{
                while(columnaBote!=400){
                  panel.repaint();  
                  //columnaLobo+=2;
                  columnaBote-=4;
                  columnaGranjero-=4;
                  //filaLobo-=6;
                  this.sleep(100);
                }
                this.stop();
            } 
            catch (java.lang.InterruptedException ex) {
                  System.out.println(ex.getMessage()); 
               }
        }
    };
    static Thread hiloBoteGranjeroIzqDer = new Thread(){
       @Override
        public void run()
        {
            try{
                while(columnaBote!=800){
                  panel.repaint();  
                  //columnaLobo+=2;
                  columnaBote+=4;
                  columnaGranjero+=4;
                  //filaLobo-=6;
                  this.sleep(100);
                }
                this.stop();
            } 
            catch (java.lang.InterruptedException ex) {
                  System.out.println(ex.getMessage()); 
               }
        }
    };
  
    static Thread hiloLoboBoteGranjeroIzqDer = new Thread(){
       @Override
        public void run()
        {
            try{
                while(columnaBote!=800){
                  panel.repaint();  
                  columnaLobo+=4;
                  columnaBote+=4;
                  columnaGranjero+=4;
                  //filaLobo+=6;
                  this.sleep(100);
                }
                //hiloLoboBoteDerBaja.start();
                this.stop();
            } 
            catch (java.lang.InterruptedException ex) {
                  System.out.println(ex.getMessage()); 
               }
        }
    };
    static Thread hiloLoboBoteGranjeroDerIzq = new Thread(){
       @Override
        public void run()
        {
            try{
                while(columnaBote!=400){
                  panel.repaint();  
                  columnaLobo-=4;
                  columnaBote-=4;
                  columnaGranjero-=4;
                  //filaLobo+=6;
                  this.sleep(100);
                }
                //hiloLoboBoteDerBaja.start();
                this.stop();
            } 
            catch (java.lang.InterruptedException ex) {
                  System.out.println(ex.getMessage()); 
               }
        }
    };
  
    static Thread hiloOvejaBoteGranjeroIzqDer = new Thread(){
       @Override
        public void run()
        {
            try{
                while(columnaBote!=800){
                  panel.repaint();  
                  columnaOveja+=4;
                  columnaBote+=4;
                  columnaGranjero+=4;
                  //filaLobo+=6;
                  this.sleep(100);
                }
                //hiloOvejaBoteDerBaja.start();
                //this.stop();
            } 
            catch (java.lang.InterruptedException ex) {
                  System.out.println(ex.getMessage()); 
               }
        }
    };
    static Thread hiloOvejaBoteGranjeroDerIzq = new Thread(){
       @Override
        public void run()
        {
            try{
                while(columnaBote!=400){
                  panel.repaint();  
                  columnaOveja-=4;
                  columnaBote-=4;
                  columnaGranjero-=4;
                  //filaLobo+=6;
                  this.sleep(100);
                }
                //hiloOvejaBoteDerBaja.start();
                //this.stop();
            } 
            catch (java.lang.InterruptedException ex) {
                  System.out.println(ex.getMessage()); 
               }
        }
    };
  
    static Thread hiloColBoteGranjeroIzqDer = new Thread(){
       @Override
        public void run()
        {
            try{
                while(columnaBote!=800){
                  panel.repaint();  
                  columnaCol+=4;
                  columnaBote+=4;
                  columnaGranjero+=4;
                  //filaLobo+=6;
                  this.sleep(100);
                }
                //hiloColBoteDerBaja.start();
                this.stop();
            } 
            catch (java.lang.InterruptedException ex) {
                  System.out.println(ex.getMessage()); 
               }
        }
    };
    static Thread hiloColBoteGranjeroDerIzq = new Thread(){
       @Override
        public void run()
        {
            try{
                while(columnaBote!=400){
                  panel.repaint();  
                  columnaCol-=4;
                  columnaBote-=4;
                  columnaGranjero-=4;
                  //filaLobo+=6;
                  this.sleep(100);
                }
                //hiloColBoteDerBaja.start();
                this.stop();
            } 
            catch (java.lang.InterruptedException ex) {
                  System.out.println(ex.getMessage()); 
               }
        }
    };
  
  /// Movimientos de subida y bajada de la lancha en el lado derecho del rio
    static Thread hiloLoboBoteDerBaja = new Thread(){
       @Override
        public void run()
        {
            try{
                while(filaLobo!=245){
                  panel.repaint();  
                  columnaLobo+=2;
                  //columnaBote+=4;
                  //columnaGranjero+=4;
                  filaLobo-=6;
                  this.sleep(100);
                }
                System.out.println(""+columnaLobo);
                this.stop();
            } 
            catch (java.lang.InterruptedException ex) {
                  System.out.println(ex.getMessage()); 
               }
        }
    };
    static Thread hiloLoboBoteDerSube = new Thread(){
       @Override
        public void run()
        {
            try{
                while(filaLobo!=425){
                  panel.repaint();  
                  columnaLobo-=2;
                  //columnaBote+=4;
                  //columnaGranjero+=4;
                  filaLobo+=6;
                  this.sleep(100);
                }
                
                this.stop();
            } 
            catch (java.lang.InterruptedException ex) {
                  System.out.println(ex.getMessage()); 
               }
        }
    };
    
    static Thread hiloColBoteDerBaja = new Thread(){
       @Override
        public void run()
        {
            try{
                while(filaCol!=335){
                  panel.repaint();  
                  columnaCol+=2;
                  //columnaBote+=4;
                  //columnaGranjero+=4;
                  filaCol-=3;
                  this.sleep(100);
                }
                System.out.println(""+columnaCol);
                this.stop();
            } 
            catch (java.lang.InterruptedException ex) {
                  System.out.println(ex.getMessage()); 
               }
        }
    };
    static Thread hiloColBoteDerSube = new Thread(){
       @Override
        public void run()
        {
            try{
                while(filaCol!=425){
                  panel.repaint();  
                  columnaCol-=2;
                  //columnaBote+=4;
                  //columnaGranjero+=4;
                  filaCol+=3;
                  this.sleep(100);
                }
                this.stop();
            } 
            catch (java.lang.InterruptedException ex) {
                  System.out.println(ex.getMessage()); 
               }
        }
    };
  
    static Thread hiloOvejaBoteDerBaja = new Thread(){
       @Override
        public void run()
        {
            try{
                while(filaOveja!=315){
                  panel.repaint();  
                  columnaOveja+=2;
                  //columnaBote+=4;
                  //columnaGranjero+=4;
                  filaOveja-=5;
                  this.sleep(100);
                }
                //System.out.println(""+columnaOveja);
                this.join();
            } 
            catch (java.lang.InterruptedException ex) {
                  System.out.println(ex.getMessage()); 
               }
        }
    };
    static Thread hiloOvejaBoteDerSube = new Thread(){
       @Override
        public void run()
        {
            try{
                while(filaOveja!=425){
                  panel.repaint();  
                  columnaOveja-=2;
                  //columnaBote+=4;
                  //columnaGranjero+=4;
                  filaOveja+=5;
                  this.sleep(100);
                }
                //this.stop();
            } 
            catch (java.lang.InterruptedException ex) {
                  System.out.println(ex.getMessage()); 
               }
        }
    };
  
   


    static Thread movLoboGranjeroIzqDer = new Thread(){
            Thread x = hiloLoboBoteIzqSube;
            Thread y = hiloLoboBoteGranjeroIzqDer;
            Thread z = hiloLoboBoteDerBaja;
            
      @Override
      public void run(){
          try {
              x.run();
              x.join();
              y.run();
              y.join();
              z.run();
              z.join();
               
          } catch (InterruptedException ex) {
              Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
};
    static Thread movLoboGranjeroDerIzq = new Thread(){
            Thread x = hiloLoboBoteDerSube;
            Thread y = hiloLoboBoteGranjeroDerIzq;
            Thread z = hiloLoboBoteIzqBaja;
            
      @Override
      public void run(){
          try {
              x.run();
              x.join();
              y.run();
              y.join();
              z.run();
              z.join();
               
          } catch (InterruptedException ex) {
              Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
};
    
    static Thread movColGranjeroIzqDer = new Thread(){
            Thread x = hiloColBoteIzqSube;
            Thread y = hiloColBoteGranjeroIzqDer;
            Thread z = hiloColBoteDerBaja;
            
      @Override
      public void run(){
          try {
              x.run();
              x.join();
              y.run();
              y.join();
              z.run();
              z.join();
               
          } catch (InterruptedException ex) {
              Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
};
    static Thread movColGranjeroDerIzq = new Thread(){
            Thread x = hiloColBoteDerSube;
            Thread y = hiloColBoteGranjeroDerIzq;
            Thread z = hiloColBoteIzqBaja;
            
      @Override
      public void run(){
          try {
              x.run();
              x.join();
              y.run();
              y.join();
              z.run();
              z.join();
               
          } catch (InterruptedException ex) {
              Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
};
   
    static Thread movOvejaGranjeroIzqDer = new Thread(){
            Thread x = hiloOvejaBoteIzqSube;
            Thread y = hiloOvejaBoteGranjeroIzqDer;
            Thread z = hiloOvejaBoteDerBaja;
            
      @Override
      public void run(){
          try {
              x.run();
              x.join();
              y.run();
              y.join();
              z.run();
              //z.join();
               
          } catch (InterruptedException ex) {
              Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
};
    static Thread movOvejaGranjeroDerIzq = new Thread(){
            Thread x = hiloOvejaBoteDerSube;
            Thread y = hiloOvejaBoteGranjeroDerIzq;
            Thread z = hiloOvejaBoteIzqBaja;
            
      @Override
      public void run(){
          try {
              x.run();
              x.join();
              y.run();
              y.join();
              z.run();
              z.join();
               
          } catch (InterruptedException ex) {
              Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
};
    
    static Thread movGranjeroIzqDer = new Thread(){
            Thread x = hiloBoteGranjeroIzqDer;
            
            
      @Override
      public void run(){
          try {
              x.run();
              x.join();
              x.stop();
               
          } catch (InterruptedException ex) {
              Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
};
    static Thread movGranjeroDerIzq = new Thread(){
            Thread x = hiloBoteGranjeroDerIzq;
            
            
      @Override
      public void run(){
          try {
              x.run();
              x.join();
              x.stop();
              
               
          } catch (InterruptedException ex) {
              Logger.getLogger(Contenedor.class.getName()).log(Level.SEVERE, null, ex);
          }
      }
};
   
}










