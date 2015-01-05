/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

import java.io.File;

public class DTEBean
{
  private String rutEmisorDTE;
  private String tipoDTE;
  private String folioDTE;
  private String contenido;
  private File fileXML;
  private String contenidoTXT;
  private String sucursalEmisorDTE;
  
  public void setRutEmisor(String rut)
  {
    this.rutEmisorDTE = rut;
  }
  
  public String getRutEmisor()
  {
    return this.rutEmisorDTE;
  }
  
  public void setTipoDTE(String TipoDTE)
  {
    this.tipoDTE = TipoDTE;
  }
  
  public String getTipoDTE()
  {
    return this.tipoDTE;
  }
  
  public void setFolioDTE(String folio)
  {
    this.folioDTE = folio;
  }
  
  public String getFolioDTE()
  {
    return this.folioDTE;
  }
  
  public void setContendioFile(String Contenido)
  {
    this.contenido = Contenido;
  }
  
  public String getContenido()
  {
    return this.contenido;
  }
  
  public void setFile(File file)
  {
    this.fileXML = file;
  }
  
  public File getFile()
  {
    return this.fileXML;
  }
  
  public void setTXT(String txt)
  {
    this.contenidoTXT = txt;
  }
  
  public String getTXT()
  {
    return this.contenidoTXT;
  }
  
  public void setSucursalEmisorDTE(String sucursal)
  {
    this.sucursalEmisorDTE = sucursal;
  }
  
  public String getSucursalEmisorDTE()
  {
    return this.sucursalEmisorDTE;
  }
}
