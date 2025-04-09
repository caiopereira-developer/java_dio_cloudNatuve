public class SmartTv {
  boolean ligada = false;
  int canal = 1;
  int volume = 0;
  
  public void mudarCanal(int novoCanal){
    canal = novoCanal;
  }
  
  
  public void aumentarCanal(){
    canal++;
    System.out.println("Aumentando canal..." +canal);
  }

  public void diminuirCanal(){
    canal--;
    System.out.println("Diminuindo canal..." +canal);
  }

  public void ligar(){
    ligada = true;
    System.out.println("ligando...");
  }

  public void desligar(){
    ligada = false;
    System.out.println("desligando...");
  }

  public void aumentarVolume(){
   volume++;
   System.out.println("Aumentando volume para: "+volume);

 }

  public void diminuirVolume(){
    volume--;
    System.out.println("Diminuindo volume para: "+volume);
  }

}