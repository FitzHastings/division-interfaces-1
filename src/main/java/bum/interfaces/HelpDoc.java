package bum.interfaces;

import mapping.MappingObject;

import java.rmi.RemoteException;

public interface HelpDoc extends MappingObject {
  public String getDoc() throws RemoteException;
  public void setDoc(String doc) throws RemoteException;
}
